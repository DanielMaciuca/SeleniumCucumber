package Variables;

class StaticVariables {

    String name = "Cici";

    static int ceva;

}

public class Main {

    public static void main(String[] args) {

        StaticVariables myObject1 = new StaticVariables();
        StaticVariables myObject2 = new StaticVariables();

        System.out.println(myObject1.name);

        myObject1.ceva = 55;

        System.out.println(myObject1.ceva);

        myObject2.name = "Sarpe";

        myObject2.ceva = 66;

        System.out.println(myObject1.name);
        //same value is printed (66)
        System.out.println(myObject2.ceva);
        System.out.println(myObject2.name);
        //same value is printed (66)
        System.out.println(myObject1.ceva);

    }

}
