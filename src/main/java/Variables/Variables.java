package Variables;

class Port{

    String name = "Cici";

    static int ceva;

}

public class Variables {

    public static void main(String[] args) {

        Port myObject1 = new Port();
        Port myObject2 = new Port();

        System.out.println(myObject1.name);

        myObject1.ceva = 55;

        System.out.println(myObject1.ceva);

        myObject2.name = "Sarpe";

        myObject2.ceva = 66;

        System.out.println(myObject1.name);
        System.out.println(myObject2.ceva);
        System.out.println(myObject2.name);
        System.out.println(myObject1.ceva);

    }

}
