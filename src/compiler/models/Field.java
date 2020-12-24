package compiler.models;

public class Field extends TableRow {
    String type;

    public Field(String name, String type) {
        super(name);
        this.type = type;
    }

    @Override
    public String getText() {
        return "Field:" + printKeyValue("name", name) + printKeyValue("type", type);
    }
}
