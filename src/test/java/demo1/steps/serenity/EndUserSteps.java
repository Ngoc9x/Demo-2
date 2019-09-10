package demo1.steps.serenity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import demo1.pages.checkoutPage;
import demo1.pages.homePage;
import demo1.pages.loginPage;
import demo1.pages.productPage;
import net.thucydides.core.annotations.Step;

public class EndUserSteps {
    homePage home;
    loginPage login;
    productPage product;
    checkoutPage checkout;
    @Step
    public void navigatesToLogin() 
    {
    	home.action1();
    }
    @Step
    public void defineText(String s)
    {
    	assertThat(home.GetText(), containsString(s));
    }
    @Step
    public void is_the_home_page()
    {	
      home.openBrowser();
	}
    @Step
    public void actionLogin(String username, String password)
    {
    	login.enter_Login(username,password);
    }
    @Step
    public void choosegroup(String s)
    {
    	home.choose_Group(s);
    }
    @Step
    public void ChooseProduct(String tenSP)
    {
    	product.chooseProduct(tenSP);
    }
    @Step
    public void enterMount(String sl)
    {
    	product.enter_Mount(sl);
    }
    @Step
    public void clickButton(String Btn)
    {
    	product.actionBtn(Btn);
    }
    @Step
    public void enter_Info_Ship(String name, String telephone, String region, String city, String ward, String street, String ty_add)
    {
    	checkout.Enter_Infor_add(name, telephone, region, city, ward, street, ty_add);
    }
    @Step
    public void choosePayment(String payment)
    {
    	checkout.actionbtn(payment);
    }
    @Step
    public void actionOrder(String btnorder)
    {
    	checkout.actionbtn(btnorder);
    }
    @Step
    public void navigateProdcut_List()
    {
    	home.navigateProductlist();
    }
}