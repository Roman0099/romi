package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

     static WebDriver driver;

    private Driver() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (Config.getProperty("browser")){
                case "chrome":
                     System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\chicagoselenimb14\\src\\drivers\\chromedriver.exe");
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
//                case "firefox":
//                    WebDriverManager.firefoxdriver().setup();
//                    driver = new FirefoxDriver();
//                    break;
            }

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }
        return driver;
    }


    public static void closeDriver(){
        if(driver != null) {
            driver.quit();
            driver = null;
        }

    }
}


