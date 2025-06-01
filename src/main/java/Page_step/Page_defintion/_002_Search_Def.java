package Page_step.Page_defintion;

import Page_step._002_Search_Step;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _002_Search_Def {

    _002_Search_Step step = new _002_Search_Step();


    @Given("User launch the PLP \"(.*)\"$")

    /**
     * Function definition for directing to PDP page
     * Passed values (Tab) value
     * Return value void
     */

    public void Lunch_PLP(String URL_TAB) {


        step.Lunch_PLP(URL_TAB);

    }

    @When("User search \"(.*)\"$")

    /**
     * Function definition for entering the input to PDP page
     * Passed values (Search_input) value
     * Return value void
     */

    public void userSearch(String input)

    {

        step.search(input);
    }

    @Then("List is filtered based on \"(.*)\"$")

    /**
     * Function comparing the actual value and expected
     * Passed values (sku_example) value
     * Return value void
     */

    public void listIsFilteredBasedOnSearchValue(String sku_exampe) {
        step.Fitlered_List(sku_exampe);

    }
}
