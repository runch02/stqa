package CountLink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CountLink {
    static String driverPath = "D:\\STQA\\Selenium\\geckodriver.exe";
    public static FirefoxDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", driverPath);
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);

        driver = new FirefoxDriver();
        driver.get("http://www.wikipedia.com");

        java.util.List<WebElement> Links = driver.findElements(By.tagName("a"));
        System.out.println("Total links are " + Links.size());

        for (int i = 0; i < Links.size(); i++) {
            System.out.println("Links " + i + " Link name " + Links.get(i).getText());
        }
    }
}
