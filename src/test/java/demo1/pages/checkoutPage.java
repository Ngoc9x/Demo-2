package demo1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class checkoutPage extends PageObject{
	@FindBy(id = "full_name")
	private WebElementFacade Name;
	@FindBy(id =  "telephone")
	private WebElementFacade Telephone;
	@FindBy(id = "region_id")
	private WebElementFacade region_id;
	@FindBy(id = "city_id")
	private WebElementFacade City_id;
	@FindBy(id =  "ward_id")
	private WebElementFacade Ward_id;
	@FindBy(id =  "street")
	private WebElementFacade Street;
	private WebElement typeAddress (String i)
	{
		return getDriver().findElement(By.xpath("//div[@class=\"col-lg-8 input-wrap has-feedback\"]/div["+i+"]"));
	}
	private WebElement btnOrPayment(String s)
	{
		return getDriver().findElement(By.xpath("//*[contains(text(),'"+s+"')]"));
	}
	private void Selectoption(WebElementFacade elementFacade, String text)
	{
		Select se= new Select(elementFacade);
		se.selectByVisibleText(text);
	}
	public void Enter_Infor_add(String name, String telephone, String region, String city, String ward, String street, String ty_add)
	{
		if(getDriver().findElement(By.xpath("//h5[contains(text(),'Chọn địa chỉ giao hàng có sẵn bên dưới:')]")).isDisplayed())
	    {
			btnOrPayment("Giao đến địa chỉ này").click();
	    }
		else {
			Name.type(name);
			Telephone.type(telephone);
			Selectoption(region_id, region);
			Selectoption(City_id, city);
			Selectoption(Ward_id, ward);
			Street.type(street);
			typeAddress(ty_add).click();
			btnOrPayment("Giao đến địa chỉ này").click();
		}
	}
	public void actionbtn(String text)
	{
		btnOrPayment(text).click();
	}
}
