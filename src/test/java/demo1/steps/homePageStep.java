package demo1.steps;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demo1.steps.serenity.EndUserSteps;

public class homePageStep {

    @Steps
    EndUserSteps anna;
    @Given("^the user is on the Tiki home page$")
    public void the_user_is_on_the_Tiki_home_page()  {
    	anna.is_the_home_page();
    }

    @When("^user navigate to login page$")
    public void user_navigate_to_login_page() {
       anna.navigatesToLogin();
    }

    @Then("^see title '(.*)'$")
    public void see_title(String s) {
       anna.defineText(s);
    }
    @When("user choose group as '(.*)'")
    public void choose_group(String arg1)
    {
    	anna.choosegroup(arg1);
    }
    
    @Given("user navigate product list")
    public void navigate_Product_List()
    {
    	anna.navigateProdcut_List();
    }
}
