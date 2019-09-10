package demo1.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demo1.steps.serenity.EndUserSteps;
import net.thucydides.core.annotations.Steps;

public class productPageStep {
	@Steps
	EndUserSteps anna;
	@Then("user buy a product as '(.*)'")
	public void actionChooseProduct(String arg1)
	{
		anna.choosegroup(arg1);
	}
	@When("user enter mount product buy as '(.*)'")
	public void enter_mount(String arg1)
	{
		anna.enterMount(arg1);
	}
	@Then("user click button '(.*)'") 
	public void ActionButton(String arg1)
	{
		anna.clickButton(arg1);
	}
}
