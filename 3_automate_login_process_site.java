package hello;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class hello {
    static String drivePath = "D:\\STQA\\Selenium\\geckodriver.exe";
    public static WebDriver driver;
    public static void main(String[] args) {
        System.out.println("Hi.. We are Testing the RC server");
        System.out.println("Selenium Demo");
        System.setProperty("webdriver.gecko.driver", drivePath);
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        driver.quit();
    }
}
