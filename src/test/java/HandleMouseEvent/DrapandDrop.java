package HandleMouseEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class DrapandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();

		driver.get("http://demo.guru99.com/test/drag_drop.html");

		//Element(BANK) which need to drag.
		 	 WebElement From1=driver.findElement(By.xpath("//*[@id='credit2']/a"));

		 	//Element(DEBIT SIDE) on which need to drop.
		 	WebElement To1=driver.findElement(By.xpath("//*[@id='bank']/li"));

		//Element(SALES) which need to drag.
		 	WebElement From2=driver.findElement(By.xpath("//*[@id='credit1']/a"));

		//Element(CREDIT SIDE) on which need to drop.
		 	WebElement To2=driver.findElement(By.xpath("//*[@id='loan']/li"));

		 	//Element(500) which need to drag.
		    WebElement From3=driver.findElement(By.xpath("//*[@id='fourth']/a"));

		    //Element(DEBIT SIDE) on which need to drop.
		 	WebElement To3=driver.findElement(By.xpath("//*[@id='amt7']/li"));

		//Element(500) which need to drag.
		    WebElement From4=driver.findElement(By.xpath("//*[@id='fourth']/a"));

		    //Element(CREDIT SIDE) on which need to drop.
		 	WebElement To4=driver.findElement(By.xpath("//*[@id='amt8']/li"));

		//Using Action class for drag and drop.
		 	Actions act=new Actions(driver);
		 	
		 	act.dragAndDrop(From1, To1).build().perform();
		 	act.dragAndDrop(From2, To2).build().perform();
		 	act.dragAndDrop(From3, To3).build().perform();
		 	act.dragAndDrop(From4, To4).build().perform();

		
		
	}

}
