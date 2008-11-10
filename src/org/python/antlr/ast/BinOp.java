// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class BinOp extends exprType {
    public exprType left;
    public operatorType op;
    public exprType right;

    private final static String[] fields = new String[] {"left", "op", "right"};
    public String[] get_fields() { return fields; }

    public BinOp(exprType left, operatorType op, exprType right) {
        this.left = left;
        addChild(left);
        this.op = op;
        this.right = right;
        addChild(right);
    }

    public BinOp(Token token, exprType left, operatorType op, exprType right) {
        super(token);
        this.left = left;
        addChild(left);
        this.op = op;
        this.right = right;
        addChild(right);
    }

    public BinOp(int ttype, Token token, exprType left, operatorType op,
    exprType right) {
        super(ttype, token);
        this.left = left;
        addChild(left);
        this.op = op;
        this.right = right;
        addChild(right);
    }

    public BinOp(PythonTree tree, exprType left, operatorType op, exprType
    right) {
        super(tree);
        this.left = left;
        addChild(left);
        this.op = op;
        this.right = right;
        addChild(right);
    }

    public String toString() {
        return "BinOp";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("BinOp(");
        sb.append("left=");
        sb.append(dumpThis(left));
        sb.append(",");
        sb.append("op=");
        sb.append(dumpThis(op));
        sb.append(",");
        sb.append("right=");
        sb.append(dumpThis(right));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitBinOp(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (left != null)
            left.accept(visitor);
        if (right != null)
            right.accept(visitor);
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
