package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\All Is Well\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
			//open the application

		driver.get("http://demowebshop.tricentis.com/");
		//login
		driver.findElement(By.linkText("Log in"));
		//enter email
		driver.findElement(By.name("Email")).sendKeys("dineshm1@gmail.com");
		//enter password
		driver.findElement(By.name("Password")).sendKeys("password123");
		// enter log button
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		//enter ststemennt
		driver.findElement(By.name("q")).sendKeys("Build your own cheap computer");
		//click on procedure
		driver.findElement(By.name("Build your own cheap computer")).click();
		//fast processor
		driver.findElement(By.name("product_attribute_72_5_18_65")).click();
		// 8 gb ram
		driver.findElement(By.xpath("//input[@value='91']")).click();
		//400 gb hdd
		driver.findElement(By.xpath("//input[@value='58']"));
		//all software
		driver.findElement(By.xpath("//input[@value='93']"));
		driver.findElement(By.xpath("//input[@value='94']"));
		driver.findElement(By.xpath("//input[@value='95']"));
		
		
		
		
		
		
		
		
		

	}

}
