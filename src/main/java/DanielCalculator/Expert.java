package DanielCalculator;

// Expert class implements ExpertsOperations -> we are forced to implement method from both BasicOperations an ExpertOperations interfaces, because ExpertOperations interface extend BasicOperations interface
// Expert class extends Basic class -> methods from BasicOperations interface are already implemented in Basic class, we don't need to implement them again.

public class Expert extends Basic implements ExpertOperations {

    @Override
    public long pow(int base, int exponent) {
        return 0;
    }
}
