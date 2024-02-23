package DanielCalculator.basic;

public class Basic implements BasicOperations {

    @Override
    public int add(int... no) {
        int sum = 0;

        for (int n : no) {
            sum = sum + n;
//          sum+=n; same thing as above
        }
        return sum;
    }

    @Override
    public long add(long... no) {
        long sum = 0;

        for (long n : no) {
            sum = sum + n;

        }
        return sum;
    }

    @Override
    public double add(double... no) {
        double sum = 0;

        for (double n : no) {
            sum = sum + n;

        }
        return sum;
    }

    @Override
    public int subtract(int... no) {
        int result = no[0];

        for (int i = 1; i < no.length; i++) {
            result = result - no[i];

        }
        return result;
    }

    @Override
    public long subtract(long... no) {
        long result = 0;

        for (long n : no) {
            result = result - n;
//          sum+=n; same thing as above
        }
        return result;
    }

    @Override
    public double subtract(double... no) {
        double result = 0;

        for (double n : no) {
            result = result - n;
//          sum+=n; same thing as above
        }
        return result;
    }

    @Override
    public long multiply(int a, int b) {
        return ((long) a) * b;
    }

    @Override
    public long multiply(long a, long b) {
        return a * b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(int a, int b) {
        return ((double) a) / b;
    }

    @Override
    public double divide(long a, long b) {
        return ((double) a) / b;
    }

    @Override
    public double divide(double a, double b) {
        return a / b;
    }
}
