package concepts.All.utils;

import org.openqa.selenium.By;

public class pomClassPage1 extends BaseClass2 {

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
