package concepts.All.utils;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestClass extends BaseClass2 {

    @Test
    public void testWithStaticDriver() {
        driver.get("https://practicetestautomation.com/");

    //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
    //  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        WebElement element = driver.findElement(By.xpath("(//a[@href='https://practicetestautomation.com/practice/'])[1]"));
        element.click();

       By button = By.id("(//a[@href='https://practicetestautomation.com/practice/'])[1]");

       driver.findElement(By.xpath("(//a[@href='https://practicetestautomation.com/practice/'])[1]")).click();

    }
}
