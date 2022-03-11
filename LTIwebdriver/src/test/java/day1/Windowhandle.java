package day1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\All Is Well\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
			//open the application

		driver.get("https://demo.guru99.com/popup.php");
	//driver.manage().window().maximize();
	String oldpage=driver.getWindowHandle();
	System.out.println("Current opened page windowID" +oldpage);
	// click on click here link
	driver.findElement(By.linkText("Click Here")).click();
	//switch from old to newpage
	// toget the windowid of newly opened tab 
	//use below code
	Set<String> newpage=driver.getWindowHandles();
	for(String name:newpage) {
		driver.switchTo().window(name);
		System.out.println("window name of newly opened is :"+name);
		
	}
	//enter email id
	driver.findElement(By.name("emailid")).sendKeys("Dinesh3@gmail.com");
	//click on submit
	driver.findElement(By.name("btnLogin")).click();
	//switch from newpage to oldpage
	driver.switchTo().window(oldpage);
	
	//driver.close();-->close th eactive tab onlu
	driver.quit();//forces to close all teh tab opened
		
	}

}
