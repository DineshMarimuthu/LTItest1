package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\All Is Well\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
			//open the application

		driver.get("http://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	WebElement computer= driver.findElement(By.xpath("//div[@class='header-menu']/div/ul/li[2]/a"));
	WebElement accessories= driver.findElement(By.xpath("//a[contains(text(),'Accessories')]"));
	
	Actions act=new Actions(driver);
	
	act.moveToElement(computer).moveToElement(accessories).click().build().perform();
	driver.close();
	
	
	}

}
