package compiler.models;

abstract public class TableRow {
    protected String name;

    public TableRow(String name) {
        this.name = name;
    }

    abstract public String getText();

    String printKeyValue(String key, String value){
        return " (" + key + ": " + value + ")";
    }
}
