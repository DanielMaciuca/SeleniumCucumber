package JavaCourse.IncubatorEndv.homework1;

public interface Animal {

    // An interface is a way to achieve abstraction.
    // It declares a set of abstract methods (methods without a body) that must be implemented by any class that implements the interface
    // Interfaces cannot be used to create objects
    // Interface fields and methods are by default public, static and final
    // Default methods can be implemented inside an interface -> they can have a body

    public abstract void Move(); //method that is not implemented only declared. (signature)

    default public void firstMethod() {

        System.out.println("This is a default method that can be implemented -> have body inside an interface");
    }

    public static void main(String[] args) {

    }

}

