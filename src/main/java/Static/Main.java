package Static;

public class Main {

    public static void main(String[] args) {

        StaticVariables myObject1 = new StaticVariables();
        StaticVariables myObject2 = new StaticVariables();

        System.out.println(StaticVariables.comun);//access using the class name -> recommended

        myObject1.comun = 55;

        myObject2.comun = 66;

        myObject2.name = "Sarpe";

        System.out.println(myObject1.name);
        System.out.println(myObject2.name);
        //same value is printed (66)
        System.out.println(myObject1.comun);
        System.out.println(myObject2.comun);

        System.out.println(StaticVariables.comun);//this print 66 now

// static variables can be accessed also from an object, not recommended
// we refer to a static field using the class name
// the idea is NOT to create objects for static but to have a shared value

    }

}
