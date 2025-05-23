package Page_step;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class _002_FBN_Search_Step {

    ChromeDriver driver= HOOKS.driver;


    public void Lunch_PLP() {
        driver.get("https://noon-catalog.noon.partners/en/catalog?page=1&project=PRJ9404");

    }

    public void search(String arg0) {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.xpath("//body/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]/span[1]/input[1]")).sendKeys(arg0);
        driver.findElement(By.xpath("//body/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]/span[2]/button[1]/span[1]/span[1]/*[1]")).click();

    }

    public void Fitlered_List(String arg1)
    {
        String expected=arg1;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String actual=driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/a[1]/span[1]")).getText();
        Assert.assertEquals("Both values are not equal", expected, actual);
    }


}
