package Page_step.Page_defintion;

import Page_step._001_Setup_page_step;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _001_Setup_Page_def {

    _001_Setup_page_step Setup=new _001_Setup_page_step();

    @Given("Open Sellerlab")


    public void open_browser()
    {

        /**
         * This Function definiton for the Open browser main function
         * Arguments=void
         * Returns=void
         * */

        Setup.Open_Browser();
    }

    @When("User enters \"(.*)\" and click next$")


    public void Enter_email(String email)
    {
        /**
         * This function is used to send the email to email field
         * Argument=email
         * return value=void
         *
         * */

        Setup.Enter_email(email);

    }


    @And("User re-enter \"(.*)\" and next$")

    public void userReEnterEmailPasswordAndNext(String password) {

        /**
         * This function used to send password in password field
         * argument =password
         * return value=void
         *
         * */

        Setup.Email_validation(password);
    }

    @And("Wait for Mobile_auth")


    public void wairForMobile_auth() {

        /**
         * This method is like waiting till mobile-auth is done
         * argument=void
         * return=void
         *
         * */
        Setup.Mobile_auth();

    }

    @Then("User can choose idp")
    public void userCanChooseIdp() {

        /**
         * This method is used to select the idp from landing screen
         * argument: void
         * return: void
         * */
        Setup.Choosing_Idp();
    }
}
