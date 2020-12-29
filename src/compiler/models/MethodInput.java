package compiler.models;

public class MethodInput extends TableRow{

    String type;
    public MethodInput(String name, String type) {
        super(name);
        this.type = type;
    }

    @Override
    public String getText() {
        return "MethodInput:" + printKeyValue("name", name)  + printKeyValue("type", type);
    }
}
