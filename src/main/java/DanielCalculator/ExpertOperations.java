package DanielCalculator;

// ExpertOperations extends BasicOperations -> anyone who wants to implement ExpertOperations it is forced to implement the methods from BasicOperations as well

public interface ExpertOperations extends BasicOperations{

    public abstract long pow(int base, int exponent);
}
