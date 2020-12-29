package compiler;

import compiler.models.TableRow;

import java.util.ArrayList;
import java.util.Hashtable;

class Scope {
    String name;
    int lineNumber;
    Hashtable<String, TableRow> table = new Hashtable<>();
    Scope parent;
    ArrayList<Scope> children = new ArrayList<>();

    Scope(String name, int lineNumber, Scope parent) {
        this.name = name;
        this.lineNumber = lineNumber;
        this.parent = parent;
        if (parent != null)
            parent.children.add(this);
    }

}
