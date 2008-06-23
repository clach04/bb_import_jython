// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class ExtSlice extends sliceType {
    public sliceType[] dims;

    public static final String[] _fields = new String[] {"dims"};

    public ExtSlice(Token token, sliceType[] dims) {
        super(token);
        this.dims = dims;
        if (dims != null) {
            for(int idims=0;idims<dims.length;idims++) {
                addChild(dims[idims]);
            }
        }
    }

    public ExtSlice(int ttype, Token token, sliceType[] dims) {
        super(ttype, token);
        this.dims = dims;
        if (dims != null) {
            for(int idims=0;idims<dims.length;idims++) {
                addChild(dims[idims]);
            }
        }
    }

    public ExtSlice(PythonTree tree, sliceType[] dims) {
        super(tree);
        this.dims = dims;
        if (dims != null) {
            for(int idims=0;idims<dims.length;idims++) {
                addChild(dims[idims]);
            }
        }
    }

    public String toString() {
        return "ExtSlice";
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitExtSlice(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (dims != null) {
            for (int i = 0; i < dims.length; i++) {
                if (dims[i] != null)
                    dims[i].accept(visitor);
            }
        }
    }

}
