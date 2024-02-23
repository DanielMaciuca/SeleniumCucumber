package DanielCalculator.basic;

public class Basic implements BasicOperations {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public long add(long a, long b) {
        return a + b;
    }

    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public long subtract(long a, long b) {
        return a - b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
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
