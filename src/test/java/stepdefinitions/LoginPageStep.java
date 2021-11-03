package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class LoginPageStep {

//    private static String title;
    private LoginPage loginPage = new LoginPage(BaseClass.getDriver());

        public LoginPageStep() throws Exception {
            LoginPage loginPage = new LoginPage(BaseClass.getDriver());
//            PropertiesReader propertiesReader = new PropertiesReader();
//            this.wait = new WebDriverWait(driver, propertiesReader.getTimeout());
        }



        @Given("user is on login page")
        public void loginPage() {
//             WebDriver driver;
//            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//            driver = new ChromeDriver();
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//            driver.manage().window().maximize();
//            driver.get("https://formy-project.herokuapp.com/form");
            LoginPage loginPage = new LoginPage(BaseClass.getDriver());
            loginPage.getLoginPageTitle();
//            HomePage home = new HomePage(driver, wait);
//            home.homePageIsDisplayed();
//            home.clickLoginButton();
        }


    @And("user is able to see {string} option")
    public void userIsAbleToSeeOption(String arg0) {
        LoginPage loginPage = new LoginPage(BaseClass.getDriver());
        loginPage.awsSignIn();

    }
}

