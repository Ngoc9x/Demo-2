package demo1.steps;

import cucumber.api.java.en.Then;
import demo1.steps.serenity.EndUserSteps;
import net.thucydides.core.annotations.Steps;

public class loginPageStep {
	@Steps
	EndUserSteps anna;
	@Then("user enter username '(.*)' and password '(.*)'")
    public void enterInforLogin(String arg1, String arg2)
    {
    	anna.actionLogin(arg1,arg2);
    }
}
