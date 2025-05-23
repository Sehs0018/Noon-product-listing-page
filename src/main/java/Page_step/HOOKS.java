package Page_step;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HOOKS { public static ChromeDriver driver;


    @Before
    public void Lunch_browser()
    {

        ChromeOptions option = new ChromeOptions();
        String profile = "C:\\Users\\hezzat\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 1";
        option.addArguments("user-data-dir=" + profile);
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver(option);
        driver.manage().window().maximize();





    }

    @After

    public void Close_broswer() throws InterruptedException
    {
        Thread.sleep(10000);

        driver.quit();

    }
}
