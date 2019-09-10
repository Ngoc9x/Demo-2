package demo1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class productPage extends PageObject{
	private WebElement product(String s)
	{
		return getDriver().findElement(By.xpath("//div[@data-title=\""+s+"\"]"));
	}
	@FindBy(id = "qty")
	private WebElementFacade sl;
	private WebElement button(String nameBtn)
	{
		return getDriver().findElement(By.xpath("//*[contains(text(),'"+nameBtn+"')]"));
	}
	public void chooseProduct(String tensp)
	{
		product(tensp).click();
	}
	public void enter_Mount(String SL)
	{
		sl.clear();
		sl.type(SL);
	}
	public void actionBtn(String namebtn)
	{
		button(namebtn).click();
		waitABit(2000);
	}
}
