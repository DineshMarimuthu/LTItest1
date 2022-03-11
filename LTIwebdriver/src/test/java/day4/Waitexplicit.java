package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitexplicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\All Is Well\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
			//open the application

		driver.navigate().to("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[value='Search']")).click();
		
		//wait for 2 seconds fro alert to appear
		WebDriverWait wait=new WebDriverWait(driver,2);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		driver.close();
		
		
		
		
	}

}
