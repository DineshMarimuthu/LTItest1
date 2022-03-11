package day4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Junitexercise2 {
WebDriver  driver;

	@Test
	public void testcase1() {
		
	//verify whether registe and login is present
		WebElement registerlink= driver.findElement(By.linkText("Register"));
		WebElement loginlink=driver.findElement(By.linkText("Log in"));
		assertTrue(registerlink.isDisplayed());
		assertTrue(loginlink.isDisplayed());
	} 
	@Test
	public void testcase2() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("Email")).sendKeys("dinesh3@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("password123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		//verify success
		
		String emailtext= driver.findElement(By.linkText("dinesh3@gmail.com")).getText();
		assertTrue(emailtext.contains("dinesh3"));
		assertEquals("dinesh3@gmail.com",emailtext);
		assertTrue(driver.findElement(By.linkText("dinesh3@gmail.com")).isEnabled());		
		}
	@Before
	public void before() {
		System.out.println("Pre-Requisite");
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\All Is Well\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		 driver= new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		
	}
	@After
	public void After() {
		
		driver.close();
	}
	
}
