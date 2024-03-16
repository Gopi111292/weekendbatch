package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	public WebDriver driver;

	
	LoginPage2(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	

	@FindBy(xpath ="//img[@alt='company-branding']")
	WebElement img_logo;
	
	@FindBy(name="username")
	WebElement txt_username;

	@FindBy(css="input[placeholder='Password']")
	WebElement txt_password;

	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btn_submit;
	
	//@FindBy(tagName="a")
	//List<WebElement> links;

	
	public void setUserName(String username)
	{
		txt_username.sendKeys(username);
	}

	public void setPassword(String password)
	{
		txt_password.sendKeys(password);
	}

	public void clickSubmit()
	{
		btn_submit.click();
	}

	public boolean checkLogoPresence()
	{
		boolean status=img_logo.isDisplayed();
		return status;
	}
	
}
