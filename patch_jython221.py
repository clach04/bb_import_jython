#!/usr/bin/env python
# -*- coding: us-ascii -*-
# vim:ts=4:sw=4:softtabstop=4:smarttab:expandtab
#
"""Takes an existing standalone Jython 2.2.1 jar file, replaces
and injects new files for additional features. Viz.:

  * Windows 7 support
  * Python 2.3 logging support
  * Python 2.3 decimal support
  * Python 2.3 optparse/optik support

NOTE this packaging/patch script currently requires CPython (2.4 works).
If Jython 2.2 is used to inject files (e.g for "import decimal"), get error:

    ImportError: error loading from zipfile

using debug:

    echo import decimal | java -jar patched_jython221.jar -Dpython.verbose=debug -

get:

    import: trying source C:\Users\clach04\decimal
    import: trying precompiled with no sourceC:\Users\clach04\decimal$py.class
    import: trying source entry: decimal.py from jar/zip file C:\jython2.2.1\patched_jython221.jar\Lib
    import: loadFromZipFile exception: java.util.zip.ZipException: invalid stored block lengths
    Traceback (innermost last):
      File "<stdin>", line 1, in ?
    ImportError: error loading from zipfile

"""

import os
import sys
import shutil
import zipfile


def add_to_zip(zf, path, zippath):
    """TODO consider using:
        .writestr()
        zfile in .filelist ... zfile.create_system = 0
        instead
    """
    if os.path.isfile(path):
        zf.write(path, zippath, zipfile.ZIP_DEFLATED)
    elif os.path.isdir(path):
        for nm in os.listdir(path):
            add_to_zip(zf, os.path.join(path, nm), os.path.join(zippath, nm))
    else:
        raise NotImplementedError('missing (or unknown file type for) %s' % path)

def add_to_existing_zip(zipfilename, filelist, dest_dir=''):
    if hasattr(zipfile, 'ZIP64_LIMIT'):
        zf = zipfile.ZipFile(zipfilename, 'a', compression=zipfile.ZIP_DEFLATED, allowZip64=True)
    else:
        # Older version of Python
        zf = zipfile.ZipFile(zipfilename, 'a', compression=zipfile.ZIP_DEFLATED)
    
    for src in filelist:
        add_to_zip(zf, src, os.path.join(dest_dir, os.path.basename(src)))  # FIXME using basename means module dirs won't be supported
    
    zf.close()


def doit(orig_jar, dest_jar):
    """TODO make orig_jar optional - pick up from system if running from jython
    TODO make dest_jar optional
    """
    shutil.copy(orig_jar, dest_jar)
    
    # injext updated files.
    # e.g. Windows 7 support and shlex.split()
    # NOTE this results in duplicate javashell.py entries
    # TODO copy each file from orig zip missing the files to delete/skip
    add_to_existing_zip(dest_jar, [os.path.join('Lib', 'javashell.py')], 'Lib')
    add_to_existing_zip(dest_jar, [os.path.join('lib-python', '2.2', 'shlex.py')], 'Lib')
    
    # Add back ported modules for convenience
    add_to_existing_zip(dest_jar, [os.path.join('lib-python', 'compat', 'logging')], 'Lib')
    add_to_existing_zip(dest_jar, [os.path.join('lib-python', 'compat', 'decimal.py')], 'Lib')
    
    add_to_existing_zip(dest_jar, [os.path.join('lib-python', 'compat', 'optparse.py')], 'Lib')
    add_to_existing_zip(dest_jar, [os.path.join('lib-python', 'compat', 'optik')], 'Lib')


def main(argv=None):
    if argv is None:
        argv = sys.argv
    
    orig_jar, dest_jar = argv[1], argv[2]
    doit(orig_jar, dest_jar)
    
    return 0


if __name__ == "__main__":
    sys.exit(main())
