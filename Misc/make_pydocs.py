import sys
import __builtin__

def print_doc(out, obj, meth):
    if meth == '__doc__':
        doc = getattr(obj, meth)
        bdname = '%s_doc' % obj.__name__
    else:
        if meth == '__abstractmethods__':
            # getattr(type,'__abstractmethods__') would fail
            doc = ""
        else:
            doc = getattr(obj, meth).__doc__
        bdname = '%s_%s_doc' % (obj.__name__, meth)

    if doc is None:
        doc = ""
    lines = doc.split("\n")
    outstring = '\\n" + \n        "'.join(format(line) for line in lines)
    print >> out, ('    public final static String %s = ' % bdname)
    print >> outfile,  '        "%s";\n' % outstring

format = lambda line: line.replace('\\', '\\\\').replace('"', r'\"')
opt = lambda n: getattr(__builtin__, n, None)

def f(): pass
try:
    raise Exception
except:
    _, _, tb = sys.exc_info() 

class C:
    f = f

m = C.f

types_list = [
object,
type,
unicode,
dict,
list,
slice,
super,
staticmethod,
float,
opt('enumerate'),
#open,
opt('basestring'),
long,
tuple,
str,
property,
int,
xrange,
file,
complex,
opt('bool'),
classmethod,
set,
frozenset,
BaseException,
bytearray,
#buffer,
# +
type(f),
type(m),
type(f.func_code),
type(sys._getframe()),
type(tb),
]

outfile = open("BuiltinDocs.java", "w")
print >> outfile, '// generated by make_pydocs.py\n'
print >> outfile, 'package org.python.core;\n'
print >> outfile, 'public class BuiltinDocs {\n'


for obj in types_list: 
    print >> outfile, '    // Docs for %s' % obj
    for meth in dir(obj):
        print_doc(outfile, obj, meth)

print >> outfile, '}'
