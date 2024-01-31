package Try;

public class Stuff {
    int a;

    public static void main(String[] args) {

        Stuff object1 = new Stuff();

        int result = object1.myMethod(122);

        System.out.println(result);

    }

    public int myMethod(int number) {

        a = 55;

        int result = number + a;

        return result;

    }
}
