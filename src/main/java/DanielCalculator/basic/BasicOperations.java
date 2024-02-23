package DanielCalculator.basic;

public interface BasicOperations {

    // Overloaded add method
    public abstract int add(int... no);

    public abstract long add(long... no);

    public abstract double add(double... no);

    // Overloaded subtract method
    public abstract int subtract(int... no);

    public abstract long subtract(long... no);

    public abstract double subtract(double... no);

    // Overloaded multiply  method
    public abstract long multiply(int a, int b);

    public abstract long multiply(long a, long b);

    public abstract double multiply(double a, double b);

    // Overloaded divide  method
    public abstract double divide(int a, int b);

    public abstract double divide(long a, long b);

    public abstract double divide(double a, double b);
}
