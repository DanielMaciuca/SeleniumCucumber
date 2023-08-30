package Enum;

public enum Keys {

    //Predefined set of values
    AMOUNT("amount"),
    NUMBER("number"),
    DATE("date"),
    PREFUNDED("prefunded"),
    DB_TIMESTAMP("db_timestamp");

     final String keyName; //enums can have fields

    Keys (String key) {

        this.keyName = key;
    }



}
