package Page_step.Page_defintion;

import Page_step._001_Setup_page_step;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Set;

public class _001_Setup_Page_def {

    _001_Setup_page_step Setup=new _001_Setup_page_step();

    @Given("Open Sellerlab")

    public void open_browser()
    {

        Setup.Open_Browser();
    }

    @When ("User enters Email and click next")

    public void Enter_email()
    {
        Setup.Enter_email();

    }


    @And("User re-enter Email, password and next")
    public void userReEnterEmailPasswordAndNext() {

        Setup.Email_validation();
    }

    @And("Wait for Mobile_auth")
    public void wairForMobile_auth() {
        Setup.Mobile_auth();

    }

    @Then("User can choose idp")
    public void userCanChooseIdp() {
        Setup.Choosing_Idp();
    }
}
