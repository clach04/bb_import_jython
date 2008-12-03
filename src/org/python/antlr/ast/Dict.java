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

@ExposedType(name = "_ast.Dict", base = AST.class)
public class Dict extends exprType {
public static final PyType TYPE = PyType.fromClass(Dict.class);
    private java.util.List<exprType> keys;
    public java.util.List<exprType> getInternalKeys() {
        return keys;
    }
    @ExposedGet(name = "keys")
    public PyObject getKeys() {
        return new AstList(keys, AstAdapters.exprAdapter);
    }
    @ExposedSet(name = "keys")
    public void setKeys(PyObject keys) {
        this.keys = AstAdapters.py2exprList(keys);
    }

    private java.util.List<exprType> values;
    public java.util.List<exprType> getInternalValues() {
        return values;
    }
    @ExposedGet(name = "values")
    public PyObject getValues() {
        return new AstList(values, AstAdapters.exprAdapter);
    }
    @ExposedSet(name = "values")
    public void setValues(PyObject values) {
        this.values = AstAdapters.py2exprList(values);
    }


    private final static PyString[] fields =
    new PyString[] {new PyString("keys"), new PyString("values")};
    @ExposedGet(name = "_fields")
    public PyString[] get_fields() { return fields; }

    private final static PyString[] attributes =
    new PyString[] {new PyString("lineno"), new PyString("col_offset")};
    @ExposedGet(name = "_attributes")
    public PyString[] get_attributes() { return attributes; }

    public Dict() {
        this(TYPE);
    }
    public Dict(PyType subType) {
        super(subType);
    }
    @ExposedNew
    @ExposedMethod
    public void Dict___init__(PyObject[] args, String[] keywords) {}
    public Dict(PyObject keys, PyObject values) {
        setKeys(keys);
        setValues(values);
    }

    public Dict(Token token, java.util.List<exprType> keys, java.util.List<exprType> values) {
        super(token);
        this.keys = keys;
        if (keys == null) {
            this.keys = new ArrayList<exprType>();
        }
        for(PythonTree t : this.keys) {
            addChild(t);
        }
        this.values = values;
        if (values == null) {
            this.values = new ArrayList<exprType>();
        }
        for(PythonTree t : this.values) {
            addChild(t);
        }
    }

    public Dict(Integer ttype, Token token, java.util.List<exprType> keys, java.util.List<exprType>
    values) {
        super(ttype, token);
        this.keys = keys;
        if (keys == null) {
            this.keys = new ArrayList<exprType>();
        }
        for(PythonTree t : this.keys) {
            addChild(t);
        }
        this.values = values;
        if (values == null) {
            this.values = new ArrayList<exprType>();
        }
        for(PythonTree t : this.values) {
            addChild(t);
        }
    }

    public Dict(PythonTree tree, java.util.List<exprType> keys, java.util.List<exprType> values) {
        super(tree);
        this.keys = keys;
        if (keys == null) {
            this.keys = new ArrayList<exprType>();
        }
        for(PythonTree t : this.keys) {
            addChild(t);
        }
        this.values = values;
        if (values == null) {
            this.values = new ArrayList<exprType>();
        }
        for(PythonTree t : this.values) {
            addChild(t);
        }
    }

    @ExposedGet(name = "repr")
    public String toString() {
        return "Dict";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("Dict(");
        sb.append("keys=");
        sb.append(dumpThis(keys));
        sb.append(",");
        sb.append("values=");
        sb.append(dumpThis(values));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitDict(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (keys != null) {
            for (PythonTree t : keys) {
                if (t != null)
                    t.accept(visitor);
            }
        }
        if (values != null) {
            for (PythonTree t : values) {
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
