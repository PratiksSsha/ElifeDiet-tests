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
//
        }



        @Given("user is on login page")
        public void loginPage() {
//
            LoginPage loginPage = new LoginPage(BaseClass.getDriver());
            loginPage.getLoginPageTitle();
//        
        }


    @And("user is able to see {string} option")
    public void userIsAbleToSeeOption(String arg0) {
        LoginPage loginPage = new LoginPage(BaseClass.getDriver());
        loginPage.awsSignIn();

    }
}

