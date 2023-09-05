package Static;

class StaticExample {
    static int staticField;

    public static void main(String[] args) {
        StaticExample instance1 = new StaticExample();
        StaticExample instance2 = new StaticExample();

        // Assign different values to the static field
        instance1.staticField = 20;
        instance2.staticField = 10;

        System.out.println(instance1.staticField);  // Output: 20
        System.out.println(instance2.staticField);  // Output: 20
        System.out.println(StaticExample.staticField);    // Output: 20
    }
}





