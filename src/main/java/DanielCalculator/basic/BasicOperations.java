package DanielCalculator.basic;

public interface BasicOperations {

    // Overloaded add method
    public abstract int add(int a, int b);

    public abstract long add(long a, long b);

    public abstract double add(double a, double b);

    // Overloaded subtract method
    public abstract int subtract(int a, int b);

    public abstract long subtract(long a, long b);

    public abstract double subtract(double a, double b);

    // Overloaded multiply  method
    public abstract long multiply(int a, int b);

    public abstract long multiply(long a, long b);

    public abstract double multiply(double a, double b);

    // Overloaded divide  method
    public abstract double divide(int a, int b);

    public abstract double divide(long a, long b);

    public abstract double divide(double a, double b);
}
