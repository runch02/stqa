<html>
<body>
    <form name="hello" action="" method="POS">
        <div align="center">
            <br>
            <input id="c1" type="checkbox" name="option-1" value="A">Java
            <input id="c1" type="checkbox" name="option-3" value="B">Python
            <input id="c1" type="checkbox" name="option-2" value="C">C++
            <input id="c1" type="checkbox" name="option-4" value="D">PHP
            <input id="c1" type="checkbox" name="option-5" value="E">CSharp
            <input id="c1" type="checkbox" name="option-6" value="F">Ruby
            <input id="c1" type="checkbox" name="option-7" value="G">Perl
        </div>
    </form>
</body>
</html>

package CheckBox;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

class CheckBox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "\filePath");
        WebDriver driver = new FirefoxDriver();
        driver.get("D:\\STQA\\Selenium\\CheckBox.html");
        int chk = 0;
        int unchk = 0;
        List<WebElement> els = driver.findElements(By.id("c1"));
        for (WebElement el : els) {
            if (el.isSelected()) {
                chk++;
            } else {
                unchk++;
            }
        }
        System.out.println("Total Checked : " + chk);
        System.out.println("Total Unchecked : " + unchk);
        driver.quit();
    }
}
