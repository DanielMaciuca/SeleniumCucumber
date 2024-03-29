package concepts.All.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass2 {

    // Static WebDriver for shared browser session
    protected static WebDriver driver;

    // The methods from @BeforeAll need to be static (requirement from junit, not testng)

    @BeforeAll
    public static void setUp() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
            driver.get("https://practicetestautomation.com/");

        }
    }

//    @AfterAll
//    public static void tearDown() {
//        if (driver != null) {
//            driver.quit();
//            driver = null; // Resetting the static WebDriver
//        }
//    }
}
