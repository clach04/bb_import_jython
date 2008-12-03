// Autogenerated AST node
package org.python.antlr.ast;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.python.antlr.AST;
import org.python.antlr.PythonTree;
import org.python.antlr.adapter.AstAdapters;
import org.python.core.AstList;
import org.python.core.Py;
import org.python.core.PyObject;
import org.python.core.PyString;
import org.python.core.PyType;
import org.python.expose.ExposedGet;
import org.python.expose.ExposedMethod;
import org.python.expose.ExposedNew;
import org.python.expose.ExposedSet;
import org.python.expose.ExposedType;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;

@ExposedType(name = "_ast.ImportFrom", base = AST.class)
public class ImportFrom extends stmtType {
public static final PyType TYPE = PyType.fromClass(ImportFrom.class);
    private String module;
    public String getInternalModule() {
        return module;
    }
    @ExposedGet(name = "module")
    public PyObject getModule() {
        if (module == null) return Py.None;
        return new PyString(module);
    }
    @ExposedSet(name = "module")
    public void setModule(PyObject module) {
        this.module = AstAdapters.py2identifier(module);
    }

    private java.util.List<aliasType> names;
    public java.util.List<aliasType> getInternalNames() {
        return names;
    }
    @ExposedGet(name = "names")
    public PyObject getNames() {
        return new AstList(names, AstAdapters.aliasAdapter);
    }
    @ExposedSet(name = "names")
    public void setNames(PyObject names) {
        this.names = AstAdapters.py2aliasList(names);
    }

    private Integer level;
    public Integer getInternalLevel() {
        return level;
    }
    @ExposedGet(name = "level")
    public PyObject getLevel() {
        return Py.newInteger(level);
    }
    @ExposedSet(name = "level")
    public void setLevel(PyObject level) {
        this.level = AstAdapters.py2int(level);
    }


    private final static PyString[] fields =
    new PyString[] {new PyString("module"), new PyString("names"), new PyString("level")};
    @ExposedGet(name = "_fields")
    public PyString[] get_fields() { return fields; }

    private final static PyString[] attributes = new PyString[0];
    @ExposedGet(name = "_attributes")
    public PyString[] get_attributes() { return attributes; }

    public ImportFrom() {
        this(TYPE);
    }
    public ImportFrom(PyType subType) {
        super(subType);
    }
    @ExposedNew
    @ExposedMethod
    public void ImportFrom___init__(PyObject[] args, String[] keywords) {}
    public ImportFrom(PyObject module, PyObject names, PyObject level) {
        setModule(module);
        setNames(names);
        setLevel(level);
    }

    public ImportFrom(Token token, String module, java.util.List<aliasType> names, Integer level) {
        super(token);
        this.module = module;
        this.names = names;
        if (names == null) {
            this.names = new ArrayList<aliasType>();
        }
        for(PythonTree t : this.names) {
            addChild(t);
        }
        this.level = level;
    }

    public ImportFrom(Integer ttype, Token token, String module, java.util.List<aliasType> names,
    Integer level) {
        super(ttype, token);
        this.module = module;
        this.names = names;
        if (names == null) {
            this.names = new ArrayList<aliasType>();
        }
        for(PythonTree t : this.names) {
            addChild(t);
        }
        this.level = level;
    }

    public ImportFrom(PythonTree tree, String module, java.util.List<aliasType> names, Integer
    level) {
        super(tree);
        this.module = module;
        this.names = names;
        if (names == null) {
            this.names = new ArrayList<aliasType>();
        }
        for(PythonTree t : this.names) {
            addChild(t);
        }
        this.level = level;
    }

    @ExposedGet(name = "repr")
    public String toString() {
        return "ImportFrom";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("ImportFrom(");
        sb.append("module=");
        sb.append(dumpThis(module));
        sb.append(",");
        sb.append("names=");
        sb.append(dumpThis(names));
        sb.append(",");
        sb.append("level=");
        sb.append(dumpThis(level));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitImportFrom(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (names != null) {
            for (PythonTree t : names) {
                if (t != null)
                    t.accept(visitor);
            }
        }
    }

    private int lineno = -1;
    @ExposedGet(name = "lineno")
    public int getLineno() {
        if (lineno != -1) {
            return lineno;
        }
        return getLine();
    }

    @ExposedSet(name = "lineno")
    public void setLineno(int num) {
        lineno = num;
    }

    private int col_offset = -1;
    @ExposedGet(name = "col_offset")
    public int getCol_offset() {
        if (col_offset != -1) {
            return col_offset;
        }
        return getCharPositionInLine();
    }

    @ExposedSet(name = "col_offset")
    public void setCol_offset(int num) {
        col_offset = num;
    }

}
