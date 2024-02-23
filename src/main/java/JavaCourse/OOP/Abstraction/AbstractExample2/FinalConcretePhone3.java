package JavaCourse.OOP.Abstraction.AbstractExample2;

public class FinalConcretePhone3 extends MihaiPhone2 {


    // Concrete implementation of the last two methods from DanielPhone1 Abstract class
    @Override
    public void dance() {
        System.out.println("Final phone can dance");
    }

    @Override
    public void cook() {
        System.out.println("Final phone can cook");
    }
}
