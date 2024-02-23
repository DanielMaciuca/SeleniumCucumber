package JavaCourse.OOP.Abstraction.AbstractExample1;

public abstract class Car {

    String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Abstract method without implementation (body)
    abstract void drive(String style);

    // Non-abstract method of an abstract class
    public void playMusic() {

        System.out.println("Play musing from abstract class Car -> Implemented method");
    }

//    abstract void power();
}
