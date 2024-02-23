package JavaCourse.OOP.Abstraction.AbstractExample2;

public class Main {

    public static void main(String[] args) {
        DanielPhone1 myphone = new FinalConcretePhone3();
        myphone.call();
        myphone.move();
        myphone.dance();
        myphone.cook();

    }
}
