package JavaCourse.OOP.Classes;

public class ClassStructure {

    // Class members:
    // 1. fields (class variables)
    // 2. methods
    // 3. constructors

    String name;

    public ClassStructure(String name) {
        this.name = name;
        System.out.println("This is only a constructor" + " " + name);
    }

    public void firstMethod() {
        System.out.println("This is just a method");
    }
}
