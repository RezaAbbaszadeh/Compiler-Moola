package compiler.models;

public class Class extends TableRow{
    private String parentClass;
    private Boolean isMain;

    public Class(String name, String parentClass, Boolean isMain) {
        super(name);
        this.parentClass = parentClass;
        this.isMain = isMain;
    }

    public String getParentClass() {
        return parentClass;
    }

    @Override
    public String getText() {
        return "Class:"+ printKeyValue("name", name) + printKeyValue("is Entry", String.valueOf(isMain)) + printKeyValue("inherits", parentClass);
    }
}
