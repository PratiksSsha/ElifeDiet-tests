package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class BaseClass {

    private  static WebDriver driver;
    public static WebDriverWait wait;

    @Before
    public void Baseclass() {

//        BaseClass.driver = driver;
//        BaseClass.wait = wait;

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        System.out.println("setting the driver");
         driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://dev.d2huys0vopau8b.amplifyapp.com");

    }


    public static WebDriver getDriver(){
        return driver;
    }


    @After
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        //driver.close();
    }
}