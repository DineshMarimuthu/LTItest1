package day4;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitexercise1 {
WebDriver driver;
	@Test
public void Testcase1() {
	
	System.out.println("Test case");

	// enter username
	driver.findElement(By.name("userName")).sendKeys("dinesh");
	//enter passsword
	driver.findElement(By.name("password")).sendKeys("password123");
	//submit button
	driver.findElement(By.name("submit")).click();
	//check whether login in success
	String actualresult=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3")).getText();
	Assert.assertEquals("Login Successfully",actualresult);
}
@Test 
public void Testcase2()throws InterruptedException{
	System.out.println("flights search");
	driver.findElement(By.linkText("Flights")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@value='oneway']"));
	//check wheter the title is same
	String title=driver.getTitle();
	Assert.assertEquals("Find a Flight: Mercury Tours:",title);
}
	
@Before
public void before() {
	System.out.println("Pre-Requisite");
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\All Is Well\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	 driver= new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/newtours/");
	//maximize the window
	driver.manage().window().maximize();
	
}
@After
public void after() throws InterruptedException {
	System.out.println("Post condition");
	//click on flights
			driver.findElement(By.linkText("Flights")).click();
			Thread.sleep(10000);
			driver.close();
}
	
	
}
