package compiler;

import java.util.ArrayList;
import java.util.Hashtable;

class Node {
    Hashtable<String, TableRow> table = new Hashtable<>();
    Node parent;
    ArrayList<Node> chilren = new ArrayList<>();

    Node(Node parent) {
        this.parent = parent;
        if (parent != null)
            parent.chilren.add(this);
    }

}
