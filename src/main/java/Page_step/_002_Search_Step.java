package Page_step;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class _002_Search_Step {

    ChromeDriver driver = HOOKS.driver;


    public void Lunch_PLP(String URL_tab) {


        /**
         *
         * Here in this function, the passed value is the (URL_Tab)
         * the return value is void
         * switching between tabs
         *
         **/

        //1.Launch the tab, depends on the passed tab URL (FBP,FBN,Supermall)

        driver.get(URL_tab);

    }

    public void search(String input) {

        /**
         *
         * Here in this function_implementation for the Sending input_search Value
         * the passed value is the (URL_Tab)
         * the return value is void
         * switching between tabs
         *
         **/


        //1.giving time till the page loaded
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2.Catch the search field element and pass the input value

        WebElement search_field = driver.findElement(By.xpath("//body/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]/span[1]/input[1]"));
        search_field.sendKeys(input);

        //3.Click on search_button
        driver.findElement(By.xpath("//body/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]/span[2]/button[1]")).click();

    }

    public void Fitlered_List(String sku_example) {
        /**
         *
         * Here in this function_implementation for the comparing search values
         * the passed value is the (sku_example)
         * the return value is void
         *
         **/

        //1.giving timeout and initiate the passed value with expected
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String Expected = sku_example;


        //2.Initiating the actual value
        String actual = driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/a[1]/span[1]")).getText();

        //3.Doing Hard assert so you can terminate the session once it's not passed

        Assert.assertEquals("Both values are not equal", Expected, actual);

    }


}
