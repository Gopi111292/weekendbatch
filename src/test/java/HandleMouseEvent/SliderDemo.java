package HandleMouseEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class SliderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();

		Actions act=new Actions(driver);
		
		WebElement min_slider=driver.findElement(By.xpath("//span[1]"));
		System.out.println("Current location of min slider:"+min_slider.getLocation());
		act.dragAndDropBy(min_slider, 100, 250).perform();
		System.out.println("Location of min slider After moving:"+min_slider.getLocation());
		
		
		
	}

}
