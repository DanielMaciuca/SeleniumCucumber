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
        int sum = 0;

        for (int n : no) {
            sum = sum + n;
//          sum+=n; same thing as above
        }
        return sum;
    }

    @Override
    public long subtract(long... no) {
        long sum = 0;

        for (long n : no) {
            sum = sum + n;
//          sum+=n; same thing as above
        }
        return sum;
    }

    @Override
    public double subtract(double... no) {
        double sum = 0;

        for (double n : no) {
            sum = sum + n;
//          sum+=n; same thing as above
        }
        return sum;
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
