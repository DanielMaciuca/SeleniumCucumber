package Enum;

public enum Keys {

    // Elements of an enum are by default 'public static final'

    //Predefined set of values
    AMOUNT("amount"),
    NUMBER("number"),
    DATE("date"),

    PREFUNDED("prefunded"),

    DB_TIMESTAMP("db_timestamp");

    // fields of an enum are by default 'public statis final'
    final String keyName; //enums can have fields - instance variables

    //constructor for the enum
    Keys(String keyName) {

        this.keyName = keyName;
    }

    public String getName() {

        return keyName;
    }


}
