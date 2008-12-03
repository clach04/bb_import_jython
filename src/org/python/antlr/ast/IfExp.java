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

@ExposedType(name = "_ast.IfExp", base = AST.class)
public class IfExp extends exprType {
public static final PyType TYPE = PyType.fromClass(IfExp.class);
    private exprType test;
    public exprType getInternalTest() {
        return test;
    }
    @ExposedGet(name = "test")
    public PyObject getTest() {
        return test;
    }
    @ExposedSet(name = "test")
    public void setTest(PyObject test) {
        this.test = AstAdapters.py2expr(test);
    }

    private exprType body;
    public exprType getInternalBody() {
        return body;
    }
    @ExposedGet(name = "body")
    public PyObject getBody() {
        return body;
    }
    @ExposedSet(name = "body")
    public void setBody(PyObject body) {
        this.body = AstAdapters.py2expr(body);
    }

    private exprType orelse;
    public exprType getInternalOrelse() {
        return orelse;
    }
    @ExposedGet(name = "orelse")
    public PyObject getOrelse() {
        return orelse;
    }
    @ExposedSet(name = "orelse")
    public void setOrelse(PyObject orelse) {
        this.orelse = AstAdapters.py2expr(orelse);
    }


    private final static PyString[] fields =
    new PyString[] {new PyString("test"), new PyString("body"), new PyString("orelse")};
    @ExposedGet(name = "_fields")
    public PyString[] get_fields() { return fields; }

    private final static PyString[] attributes =
    new PyString[] {new PyString("lineno"), new PyString("col_offset")};
    @ExposedGet(name = "_attributes")
    public PyString[] get_attributes() { return attributes; }

    public IfExp() {
        this(TYPE);
    }
    public IfExp(PyType subType) {
        super(subType);
    }
    @ExposedNew
    @ExposedMethod
    public void IfExp___init__(PyObject[] args, String[] keywords) {}
    public IfExp(PyObject test, PyObject body, PyObject orelse) {
        setTest(test);
        setBody(body);
        setOrelse(orelse);
    }

    public IfExp(Token token, exprType test, exprType body, exprType orelse) {
        super(token);
        this.test = test;
        addChild(test);
        this.body = body;
        addChild(body);
        this.orelse = orelse;
        addChild(orelse);
    }

    public IfExp(Integer ttype, Token token, exprType test, exprType body, exprType orelse) {
        super(ttype, token);
        this.test = test;
        addChild(test);
        this.body = body;
        addChild(body);
        this.orelse = orelse;
        addChild(orelse);
    }

    public IfExp(PythonTree tree, exprType test, exprType body, exprType orelse) {
        super(tree);
        this.test = test;
        addChild(test);
        this.body = body;
        addChild(body);
        this.orelse = orelse;
        addChild(orelse);
    }

    @ExposedGet(name = "repr")
    public String toString() {
        return "IfExp";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("IfExp(");
        sb.append("test=");
        sb.append(dumpThis(test));
        sb.append(",");
        sb.append("body=");
        sb.append(dumpThis(body));
        sb.append(",");
        sb.append("orelse=");
        sb.append(dumpThis(orelse));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitIfExp(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (test != null)
            test.accept(visitor);
        if (body != null)
            body.accept(visitor);
        if (orelse != null)
            orelse.accept(visitor);
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
