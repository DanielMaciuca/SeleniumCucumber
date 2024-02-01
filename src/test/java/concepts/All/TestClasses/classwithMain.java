package concepts.All.TestClasses;

import org.junit.jupiter.api.Assertions;

public class classwithMain {

    public static void main(String[] args) {
        String actualResult = "test1";
        String expectedResult = "test2";

        // Assertions will be executed even if the method is not marked with @test
        Assertions.assertEquals(actualResult,expectedResult);
    }
}
