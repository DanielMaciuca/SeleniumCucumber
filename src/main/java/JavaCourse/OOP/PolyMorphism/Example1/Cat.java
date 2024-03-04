package JavaCourse.OOP.PolyMorphism.Example1;

public class Cat extends Animal {

    private String fur;

    public Cat(String name, int age, String fur) {
        super(name, age);
        this.fur = fur;
    }

    public String getFur() {
        return fur;
    }

    public void setFur(String fur) {
        this.fur = fur;
    }

    public void specificCatMethod() {

        System.out.println("Method that is specific to Cat class");
    }

    // If I use this annotation it will not let me to change the parameters of the eat() method to o different type then the ones from the parent class, basically it enforces the overridden concept
    @Override
    public void eat(String food) {

        System.out.println(getName() + " " + "Cat eats" + " " + food);

    }
}
