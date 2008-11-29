// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.python.antlr.adapter.AstAdapters;
import org.python.antlr.adapter.ListWrapper;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.python.core.Py;
import org.python.core.PyObject;
import org.python.core.PyType;
import org.python.expose.ExposedGet;
import org.python.expose.ExposedMethod;
import org.python.expose.ExposedNew;
import org.python.expose.ExposedSet;
import org.python.expose.ExposedType;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;

@ExposedType(name = "_ast.Ellipsis", base = PyObject.class)
public class Ellipsis extends sliceType {
public static final PyType TYPE = PyType.fromClass(Ellipsis.class);

    public Ellipsis(Token token) {
        super(token);
    }

    public Ellipsis(Integer ttype, Token token) {
        super(ttype, token);
    }

    public Ellipsis(PythonTree tree) {
        super(tree);
    }

    public String toString() {
        return "Ellipsis";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("Ellipsis(");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitEllipsis(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
    }

}
