package concepts.All.TestClasses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class justAClass {

    //    WebDriver driver = new ChromeDriver();
    @Test
    public void myMethod() {

        System.out.println("FIRST MESSAGE");

        String actualResult = "test2";
        String expectedResult = "test2";

        Assertions.assertEquals(actualResult,expectedResult);

//        driver.close();
    }

//    @Test
    public void mySecondMethod() {

        System.out.println("SECOND MESSAGE");

    }

}
