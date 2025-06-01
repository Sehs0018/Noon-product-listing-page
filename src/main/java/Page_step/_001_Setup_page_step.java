package Page_step;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _001_Setup_page_step {

    ChromeDriver driver = HOOKS.driver;

    //To scroll on the main page so driver can fetch the idp 9404
    JavascriptExecutor js = driver;


    public void Open_Browser() {
        //1.Launch the browser and open seller lab URL

        driver.get("https://noon-catalog.noon.partners/en/catalog?project=PRJ9404");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    public void Enter_email(String email) {

        //1.Entering email field

        WebElement Email_field = driver.findElement(By.xpath("//body/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
        Email_field.sendKeys(email);

        //2.Click next

        driver.findElement(By.xpath("//body/main[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]")).click();

        //3.Wait till page's loading
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //4.Select email field
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[2]/div[2]")).click();
        // wait till page's loading
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public void Email_validation(String password) {


        //1.Send password in password field

        WebElement Password = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/c-wiz[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        Password.sendKeys(password);

        //2.Clicking next
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/c-wiz[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
        //3.wait till page's loading
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }


    public void Mobile_auth() {

        //1.give explicit timing till auth is done

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//body/div[1]/div[9]/div[1]/div[3]"))));


    }


    public void Choosing_Idp() {

        //1.scroll down till u find the idp 9404 card

        js.executeScript("window.scrollBy(0,250)");
        WebElement IDP = driver.findElement(By.xpath("//body/div[1]/div[3]/div[1]"));
        //2.Click on it

        IDP.click();
        //3.wait till page's loading
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
}
