package DanielCalculator.expert;

// ExpertOperations extends BasicOperations -> anyone who wants to implement ExpertOperations interface is forced to implement the methods from BasicOperations as well

import DanielCalculator.basic.BasicOperations;

public interface ExpertOperations extends BasicOperations {

    public abstract long pow(int base, int exponent);
}
