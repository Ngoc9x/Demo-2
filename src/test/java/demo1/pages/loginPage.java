package demo1.pages;

import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class loginPage extends PageObject{
	@FindBy(id ="email" )
	private WebElementFacade userName;
	@FindBy(id  = "password")
	private WebElementFacade passWord;
	@FindBy(xpath = "//button[@class=\"UserModalstyle__RightButton-uq4a18-8 jpHvvv\"]")
	private WebElementFacade btnLogin;
	public void enter_Login(String username, String password)
	{
		userName.type(username);
		passWord.type(password);
		clickOn(btnLogin);
		waitABit(5000);
	}
}
