package JavaCourse.OOP.PolyMorphism.Example1;

public class Dog  extends Animal{

    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void specificDogMethod(){

        System.out.println("Method that is specific to Dog class");

    }
    // Method overridden from Animal class

    @Override
    public void eat(String food){

        System.out.println(getName() + " " + "Dog eats" + " " + food);
    }
}
