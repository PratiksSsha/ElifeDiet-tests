package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    // 1. By Locators: OR
    private By emailId = By.id("email");
    private By password = By.id("passwd");
    private By signInButton = By.id("SubmitLogin");
    private By forgotPwdLink = By.linkText("Forgot your password?111");
    private By emailInput = By.xpath("//input[@id=\"username\"]");

    // 2. Constructor of the page class:
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // 3. page actions: features(behavior) of the page the form of methods:

    public String getLoginPageTitle() {
        System.out.println(driver.getTitle());

//        emailInput.sendkeys();

        return driver.getTitle();
    }

    public void awsSignIn() {

    }

}

