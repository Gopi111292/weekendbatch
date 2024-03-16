package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	WebDriver driver;
	//LoginPage lp;
	LoginPage2 lp;

	@BeforeClass
	public void setup() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);

	}	
	
	@Test(priority=1)
	void testLogo() {
		//lp= new LoginPage(driver);
		lp= new LoginPage2(driver);

	}
	@Test(priority=2)
	public void testLogin()
	{
		
		lp.setUserName("admin");
		lp.setPassword("admin123");
		Assert.assertEquals(lp.checkLogoPresence(), true);

		
		
		
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}	

}
