// Autogenerated AST node
package org.python.antlr.ast;
import java.util.ArrayList;
import org.python.antlr.PythonTree;
import org.python.antlr.adapter.AstAdapters;
import org.python.antlr.adapter.ListWrapper;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class FunctionDef extends stmtType {
    private String name;
    public String getInternalName() {
        return name;
    }
    public Object getName() {
        return name;
    }
    public void setName(Object name) {
        this.name = AstAdapters.to_identifier(name);
    }

    private argumentsType args;
    public argumentsType getInternalArgs() {
        return args;
    }
    public Object getArgs() {
        return args;
    }
    public void setArgs(Object args) {
        this.args = AstAdapters.to_arguments(args);
    }

    private java.util.List<stmtType> body;
    public java.util.List<stmtType> getInternalBody() {
        return body;
    }
    public Object getBody() {
        return new ListWrapper(body, AstAdapters.stmtAdapter);
    }
    public void setBody(Object body) {
        this.body = AstAdapters.to_stmtList(body);
    }

    private java.util.List<exprType> decorators;
    public java.util.List<exprType> getInternalDecorators() {
        return decorators;
    }
    public Object getDecorators() {
        return new ListWrapper(decorators, AstAdapters.exprAdapter);
    }
    public void setDecorators(Object decorators) {
        this.decorators = AstAdapters.to_exprList(decorators);
    }


    private final static String[] fields = new String[] {"name", "args",
                                                          "body", "decorators"};
    public String[] get_fields() { return fields; }

    public FunctionDef() {}
    public FunctionDef(Object name, Object args, Object body, Object
    decorators) {
        setName(name);
        setArgs(args);
        setBody(body);
        setDecorators(decorators);
    }

    public FunctionDef(Token token, String name, argumentsType args,
    java.util.List<stmtType> body, java.util.List<exprType> decorators) {
        super(token);
        this.name = name;
        this.args = args;
        this.body = body;
        if (body == null) {
            this.body = new ArrayList<stmtType>();
        }
        for(PythonTree t : this.body) {
            addChild(t);
        }
        this.decorators = decorators;
        if (decorators == null) {
            this.decorators = new ArrayList<exprType>();
        }
        for(PythonTree t : this.decorators) {
            addChild(t);
        }
    }

    public FunctionDef(Integer ttype, Token token, String name, argumentsType
    args, java.util.List<stmtType> body, java.util.List<exprType> decorators) {
        super(ttype, token);
        this.name = name;
        this.args = args;
        this.body = body;
        if (body == null) {
            this.body = new ArrayList<stmtType>();
        }
        for(PythonTree t : this.body) {
            addChild(t);
        }
        this.decorators = decorators;
        if (decorators == null) {
            this.decorators = new ArrayList<exprType>();
        }
        for(PythonTree t : this.decorators) {
            addChild(t);
        }
    }

    public FunctionDef(PythonTree tree, String name, argumentsType args,
    java.util.List<stmtType> body, java.util.List<exprType> decorators) {
        super(tree);
        this.name = name;
        this.args = args;
        this.body = body;
        if (body == null) {
            this.body = new ArrayList<stmtType>();
        }
        for(PythonTree t : this.body) {
            addChild(t);
        }
        this.decorators = decorators;
        if (decorators == null) {
            this.decorators = new ArrayList<exprType>();
        }
        for(PythonTree t : this.decorators) {
            addChild(t);
        }
    }

    public String toString() {
        return "FunctionDef";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("FunctionDef(");
        sb.append("name=");
        sb.append(dumpThis(name));
        sb.append(",");
        sb.append("args=");
        sb.append(dumpThis(args));
        sb.append(",");
        sb.append("body=");
        sb.append(dumpThis(body));
        sb.append(",");
        sb.append("decorators=");
        sb.append(dumpThis(decorators));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitFunctionDef(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (args != null)
            args.accept(visitor);
        if (body != null) {
            for (PythonTree t : body) {
                if (t != null)
                    t.accept(visitor);
            }
        }
        if (decorators != null) {
            for (PythonTree t : decorators) {
                if (t != null)
                    t.accept(visitor);
            }
        }
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
