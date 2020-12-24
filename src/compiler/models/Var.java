package compiler.models;

public class Var extends TableRow{

    public Var(String name) {
        super(name);
    }

    @Override
    public String getText() {
        return "Var:" + printKeyValue("name", name);
    }
}
