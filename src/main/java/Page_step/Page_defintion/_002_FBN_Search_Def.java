package Page_step.Page_defintion;

import Page_step.HOOKS;
import Page_step._002_FBN_Search_Step;
import io.cucumber.core.gherkin.Step;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;

public class _002_FBN_Search_Def {

    _002_FBN_Search_Step step=new _002_FBN_Search_Step();

    @Given("User launch the PLP FBN Tab")
    public void Lunch_PLP()
    {
        step.Lunch_PLP();

    }

    @When("User search \"(.*)\"$")

    public void userSearch(String arg0)
    {
        step.search(arg0);
    }

    @Then("List is filtered based on \"(.*)\"$")

    public void listIsFilteredBasedOnSearchValue(String arg0) {
        step.Fitlered_List(arg0);

    }
}
