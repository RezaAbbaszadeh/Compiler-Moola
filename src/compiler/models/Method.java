package compiler.models;

import java.util.ArrayList;

public class Method extends TableRow {
    String name;
    String returnType;
    String accessModifier;
    ArrayList<String> parametersType;

    public ArrayList<String> getParametersType() {
        return parametersType;
    }

    public Method(String name, String returnType, String accessModifier, ArrayList<String> parametersType) {
        super(name);
        this.returnType = returnType;
        this.accessModifier = accessModifier;
        this.parametersType = parametersType;
    }

    @Override
    public String getText() {
        StringBuilder params = new StringBuilder();
        for (String param:
             parametersType) {
            params.append(param).append(",");
        }
        if(params.length() > 0)
            params.deleteCharAt(params.length()-1);

        return "Method:" + printKeyValue("name", name) +
                printKeyValue("return type", returnType) + printKeyValue("accessModifier", accessModifier) +
                printKeyValue("parameters type", params.toString());
    }
}
