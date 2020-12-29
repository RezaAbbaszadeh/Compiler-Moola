package compiler.models;

public class Field extends TableRow {
    String type;
    String accessModifier;

    public Field(String name, String type, String accessModifier) {
        super(name);
        this.type = type;
        this.accessModifier = accessModifier;
    }

    @Override
    public String getText() {
        return "Field:" + printKeyValue("name", name) +
                printKeyValue("type", type) + printKeyValue("accessModifier", accessModifier);
    }
}
