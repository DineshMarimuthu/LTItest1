package day4;
//import org.openqa.selenium.*;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNGexercise2 {
	WebDriver driver;
  @Test(priority=1)
  public void login() {
			driver.findElement(By.name("userName")).sendKeys("dinesh");
			driver.findElement(By.name("password")).sendKeys("password123");
			driver.findElement(By.name("submit")).click();
  }
  @Test(priority=2,enabled=false)
  public void Flights() throws InterruptedException{
		driver.findElement(By.linkText("Flights")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\All Is Well\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		 driver= new ChromeDriver();	
		driver.get("https://demo.guru99.com/test/newtours/");
  }
  @AfterTest
  public void afterTest() {
	  driver.close();
  }
}
