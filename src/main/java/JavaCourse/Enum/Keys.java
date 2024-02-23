package JavaCourse.Enum;

public enum Keys {

    // Special data type that represents a fixed set of constants or values
    // Enums cannot be instantiated with 'new' keyword, however you CAN create instances
    // Elements (fields) of an enum are by default 'public static final' (because a constant is a variable whose value cannot change after was assigned once
    // Elements of the enum are treated as constants, making them unchangeable after they are initialized

    //Predefined set of values

    AMOUNT("amount"),
    NUMBER("number"),
    DATE("date"),

    DB_TIMESTAMP("db_timestamp");

    final String keyName; // Enums can have fields - instance variables

    // Constructor for the enum

    Keys(String keyName) {

        this.keyName = keyName;
    }

    // Method of the enum

    public String getName() {

        return keyName;
    }


}
