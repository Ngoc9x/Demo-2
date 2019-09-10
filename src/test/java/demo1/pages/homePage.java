package demo1.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.pages.WebElementFacade;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;
public class homePage extends PageObject {

//	WebDriver driver;
	public homePage(WebDriver driver) {
		super(driver);
	}
    @FindBy(xpath ="//*[contains(text(),'Tài khoản')]")
    private WebElementFacade myAcc;
    @FindBy(xpath ="//button[text()='Đăng nhập']")
    private WebElementFacade Login;
    @FindBy(xpath = "//h2[contains(text(),'Đăng nhập')]")
    private WebElementFacade text;
    private WebElement category_Parent(String category_parent)
	{
		return getDriver().findElement(By.xpath("//*[contains(text(),'"+category_parent+"')]"));
	}
    public String Title1(String title1)
    {
    	return getDriver().findElement(By.xpath("//h1[contains(text(),'"+title1+"')]")).getText();
    }
    public String GetText()
    {
    	return text.getText();
    }
    public void action1()
    {
    	myAcc.click();
    	Login.click();
    	waitABit(5000);
    }
    public void openBrowser()
    {
    	getDriver().navigate().to("https://tiki.vn");
    	waitABit(2000);
		getDriver().manage().window().maximize();
    }
    public void choose_Group(String s)
    {
    	category_Parent(s).click();
    }
    public void navigateProductlist()
    {
    	Actions action= new Actions(getDriver());
    	action.moveToElement(category_Parent("Sách, VPP & Quà Tặng")).build().perform();
    	category_Parent("Sách Kỹ Năng").click();
    }
}