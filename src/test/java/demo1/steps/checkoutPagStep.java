package demo1.steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demo1.steps.serenity.EndUserSteps;
import net.thucydides.core.annotations.Steps;

public class checkoutPagStep {
	@Steps
	EndUserSteps anna;
	@When ("user enter infor ship as '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)'")
	public void enter_shipment(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7)
	{
		anna.enter_Info_Ship(arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}
	@Then ("user choose payment method as '(.*)'")
	public void ChoosePaymentMethod(String payment)
	{
		anna.choosePayment(payment);
	}
	@And("user click button order '(.*)'")
	public void actionOrder(String nameBtn)
	{
		anna.actionOrder(nameBtn);
	}
}
