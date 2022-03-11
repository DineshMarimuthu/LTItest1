package day1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.util.*;

public class Scenario1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\All Is Well\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
Thread.sleep(5000);
//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	//open the application

driver.get("http://demowebshop.tricentis.com/");

//Click on Register Link
 driver.findElement(By.linkText("Register")).click();
 
 //Click on Gender - Female
 driver.findElement(By.id("gender-female")).click();
 //driver.findElement(By.name("))
 
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
 
 //Close Browser
 //driver.close();
 //click on login
 driver.findElement(By.linkText("Log in")).click();
 //enter email
 driver.findElement(By.name("Email")).sendKeys("dinesh");
 // enter password
 driver.findElement(By.name("Password")).sendKeys("password123");


	}

}
