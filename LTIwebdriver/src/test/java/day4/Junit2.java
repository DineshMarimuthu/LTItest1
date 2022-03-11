package day4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit2 {
	WebDriver driver;
@Test
void testcase1() {
	
	//Click on Register Link
	 driver.findElement(By.linkText("Register")).click();
	 //Enter firstname
	 driver.findElement(By.name("FirstName")).sendKeys("Dinesh");
	 
	 // Enter lastname
	 driver.findElement(By.name("LastName")).sendKeys("Marimuthu");
	 
	 //Enter Phone number
	 //driver.findElement(By.name("phone")).sendKeys("9550601784");
	 
	 // Enter Email
	 driver.findElement(By.name("Email")).sendKeys("dinesh04@gmail.com");
	 
	 // Enter password
	 driver.findElement(By.name("Password")).sendKeys("password123");
	 
	 // Enter confirm password
	 driver.findElement(By.name("ConfirmPassword")).sendKeys("password123");
	 
	 // Click on Register
	 driver.findElement(By.id("register-button")).click();
}

@Test
void testcase2() {
	driver.findElement(By.linkText("Log in")).click();
	 //enter email
	 driver.findElement(By.name("Email")).sendKeys("dinesh");
	 // enter password
	 driver.findElement(By.name("Password")).sendKeys("password123");
	
	
}
@Before
void before() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\All Is Well\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 driver= new ChromeDriver();
		//open the application

	driver.get("http://demowebshop.tricentis.com/");
	
}
@After
void after() {
	
	driver.close();
	
}

}
