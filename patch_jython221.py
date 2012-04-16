#!/usr/bin/env python
# -*- coding: us-ascii -*-
# vim:ts=4:sw=4:softtabstop=4:smarttab:expandtab
#
"""Takes an existing standalone Jython 2.2.1 jar file, replaces
and injects new files for additional features. Viz.:

  * Windows 7 support
  * Python 2.3 logging support

NOTE this packaging/patch script currently requires CPython.
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
        raise NotImplementedError('unknown file type')

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
    
    # patch Windows 7 support.
    # NOTE this results in duplicate javashell.py entries
    # TODO copy each file from orig zip missing the files to delete/skip
    add_to_existing_zip(dest_jar, [os.path.join('Lib', 'javashell.py')], 'Lib')
    
    # Add back ported modules for convenience
    add_to_existing_zip(dest_jar, [os.path.join('lib-python', 'compat', 'logging')], 'Lib')


def main(argv=None):
    if argv is None:
        argv = sys.argv
    
    orig_jar, dest_jar = argv[1], argv[2]
    doit(orig_jar, dest_jar)
    
    return 0


if __name__ == "__main__":
    sys.exit(main())
