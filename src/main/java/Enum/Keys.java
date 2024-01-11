package Enum;

public enum Keys {

    // Special data type that represents a fixed set of constants or values
    // Elements of an enum are by default 'public static final' (because a constant is a variable whose value cannot change after was assigned once
    // Are treated as constants, making them unchangeable after they are initialized

    //Predefined set of values
    AMOUNT("amount"),
    NUMBER("number"),
    DATE("date"),

    DB_TIMESTAMP("db_timestamp");

    // fields of an enum are by default 'public static final' (constants of the class)

    final String keyName; //enums can have fields - instance variables

    //constructor for the enum

    Keys(String keyName) {

        this.keyName = keyName;
    }

    public String getName() {

        return keyName;
    }


}
