package Static;

class StaticVariables {

    String name = "Cici";

    static int comun;

}

public class Main {

    public static void main(String[] args) {

        StaticVariables myObject1 = new StaticVariables();
        StaticVariables myObject2 = new StaticVariables();

        myObject1.comun = 55;

        myObject2.comun = 66;

        myObject2.name = "Sarpe";

        System.out.println(myObject1.name);
        System.out.println(myObject2.name);
        //same value is printed (66)
        System.out.println(myObject1.comun);
        System.out.println(myObject2.comun);


    }

}
