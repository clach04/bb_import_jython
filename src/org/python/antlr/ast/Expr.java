// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.python.antlr.ListWrapper;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class Expr extends stmtType {
    private exprType value;
    public exprType getInternalValue() {
        return value;
    }
    public Object getValue() {
        return value;
    }
    public void setValue(Object value) {
        this.value = (exprType)value;
    }


    private final static String[] fields = new String[] {"value"};
    public String[] get_fields() { return fields; }

    public Expr(exprType value) {
        this.value = value;
        addChild(value);
    }

    public Expr(Token token, exprType value) {
        super(token);
        this.value = value;
        addChild(value);
    }

    public Expr(Integer ttype, Token token, exprType value) {
        super(ttype, token);
        this.value = value;
        addChild(value);
    }

    public Expr(PythonTree tree, exprType value) {
        super(tree);
        this.value = value;
        addChild(value);
    }

    public String toString() {
        return "Expr";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("Expr(");
        sb.append("value=");
        sb.append(dumpThis(value));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitExpr(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (value != null)
            value.accept(visitor);
    }

    private int lineno = -1;
    public int getLineno() {
        if (lineno != -1) {
            return lineno;
        }
        return getLine();
    }

    public void setLineno(int num) {
        lineno = num;
    }

    private int col_offset = -1;
    public int getCol_offset() {
        if (col_offset != -1) {
            return col_offset;
        }
        return getCharPositionInLine();
    }

    public void setCol_offset(int num) {
        col_offset = num;
    }

}
