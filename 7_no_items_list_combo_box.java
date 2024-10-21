<html> 
    <body> 
        <select id='combo'> 
            <option>A</option> 
            <option>B</option> 
            <option>C</option> 
            <option>D</option> 
        </select>
    </body> 
</html> 

package ComboBox;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class ComboBox {

    static String driverpath = "D:\\STQA\\Selenium\\geckodriver.exe";
    public static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", driverpath);
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);

        driver = new FirefoxDriver(capabilities);
        driver.get("D:\\STQA\\Selenium\\ComboDemo.html");

        Select oSelect = new Select(driver.findElement(By.id("combo")));
        List<WebElement> oSize = oSelect.getOptions();
        int iListSize = oSize.size();

        for (int i = 0; i < iListSize; i++) {
            String sValue = oSelect.getOptions().get(i).getText();
        }

        System.out.println("Total No. of Items in Dropdown : " + iListSize);
    }
}
