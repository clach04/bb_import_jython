// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class Suite extends modType {
    public java.util.List<stmtType> body;

    private final static String[] fields = new String[] {"body"};
    public String[] get_fields() { return fields; }

    public Suite(java.util.List<stmtType> body) {
        this.body = body;
        if (body != null) {
            for(PythonTree t : body) {
                addChild(t);
            }
        }
    }

    public Suite(Token token, java.util.List<stmtType> body) {
        super(token);
        this.body = body;
        if (body != null) {
            for(PythonTree t : body) {
                addChild(t);
            }
        }
    }

    public Suite(int ttype, Token token, java.util.List<stmtType> body) {
        super(ttype, token);
        this.body = body;
        if (body != null) {
            for(PythonTree t : body) {
                addChild(t);
            }
        }
    }

    public Suite(PythonTree tree, java.util.List<stmtType> body) {
        super(tree);
        this.body = body;
        if (body != null) {
            for(PythonTree t : body) {
                addChild(t);
            }
        }
    }

    public String toString() {
        return "Suite";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("Suite(");
        sb.append("body=");
        sb.append(dumpThis(body));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitSuite(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (body != null) {
            for (PythonTree t : body) {
                if (t != null)
                    t.accept(visitor);
            }
        }
    }

}
