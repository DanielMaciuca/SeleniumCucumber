package concepts.All.utils;

import org.openqa.selenium.By;

public class pomClassPage1 extends BaseClass2 {

    // If I don't extend the BaseClass 2, @BeforeAll annotation will not be executed (same in both junit and testng)
    // So basically, @BeforeAll will be executed only if is in the class with the test method, meaning @Test
    // OR only if it is in the Parent class -> meaning the test class (with @Test method) needs to inherit it
    // In my cases: If I don't extend the BaseClass, then @BeforeAll will not be executed and the driver will not be initialized with chrome driver
    By button = By.xpath("(//a[@href='https://practicetestautomation.com/practice/'])[1]");

    public void click2() {

        driver.findElement(button).click();

    }

//    @Test
//    public void testWithStaticDriver() {
////        driver.get("https://practicetestautomation.com/");
//
////      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
////      driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
////
////        WebElement element = driver.findElement(By.xpath("(//a[@href='https://practicetestautomation.com/practice/'])[1]"));
////        element.click();
//
//
//
////        driver.findElement(By.xpath("(//a[@href='https://practicetestautomation.com/practice/'])[1]")).click();
//    }
}
