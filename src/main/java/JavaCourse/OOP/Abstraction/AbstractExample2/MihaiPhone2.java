package JavaCourse.OOP.Abstraction.AbstractExample2;

public abstract class MihaiPhone2 extends DanielPhone1 {

    // When you extend an abstract class it is mandatory to implement the abstract methods (in the subclass). This makes overriding somehow mandatory

    @Override
    public void move() {
        System.out.println("Mihai Phone can move");
    }
}
