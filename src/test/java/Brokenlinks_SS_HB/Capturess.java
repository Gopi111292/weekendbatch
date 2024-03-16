package Brokenlinks_SS_HB;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Capturess {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("/Users/mac/Documents/Gopi/WeekdaysSeleniumClass/Screenshot/fullpage.png");
		FileUtils.copyFile(src, trg);
		

		
		
		
		WebElement featuredproducts=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));

		File src1=featuredproducts.getScreenshotAs(OutputType.FILE);
		File trg1=new File("/Users/mac/Documents/Gopi/WeekdaysSeleniumClass/Screenshot/featureproducts.png");
		FileUtils.copyFile(src1, trg1);
		
		
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File src2=logo.getScreenshotAs(OutputType.FILE);
		File trg2=new File("/Users/mac/Documents/Gopi/WeekdaysSeleniumClass/Screenshot/logo.png");
		FileUtils.copyFile(src2, trg2);


		
	}

}
