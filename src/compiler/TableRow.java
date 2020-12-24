package compiler;

class TableRow {
    String kind, type, properties;

    TableRow(String kind, String type){
        this.kind = kind;
        this.type = type;
    }

    TableRow(String kind, String type, String properties){
        this.kind = kind;
        this.type = type;
        this.properties = properties;
    }
}
