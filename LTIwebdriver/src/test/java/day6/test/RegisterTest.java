package day6.test;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.junit.After;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import day6.HomePageClass;
import day6.LoginPageClass;
import day6.RegisterPageClass;

public class RegisterTest {
WebDriver driver;
FileInputStream fis;
Properties prop;
HomePageClass hp;
RegisterPageClass rp;
LoginPageClass lp;

@BeforeClass
public void beforeClass() throws IOException{
	//create an object fro properties class
	fis =new FileInputStream(new File("C:\\Users\\All Is Well\\eclipse-workspace\\LTIwebdriver\\config.properties"));                                              
	prop=new Properties();
	prop.load(fis);
	
	System.setProperty("webdriver.chrome.driver",prop.getProperty("chromedriverpath"));
    driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    //open application
    driver.get("http://demowebshop.tricentis.com/"); 
	
    //create an object for home and register page
    hp=new HomePageClass(driver);
    rp=new RegisterPageClass(driver); 
    lp=PageFactory.initElements(driver, LoginPageClass.class);
}
	@AfterClass
	public void AfterClass() {
		driver.close();
		}
@Test(enabled=false)
public void RegisterTest1() {
	hp.click_register();
	rp.perform_register_male("Dinesh", "Marimuthu", "dinesh123@gmail.com","password123", "password123");
	//String text=driver.findElement(By.xpath("//class[@result='Your registration completed']")));
	//assertTrue(text.contains("completed");
	driver.findElement(By.linkText("Log out")).click();
}
	@Test
	public void Login() {
		hp.click_login();
		lp.perform_login("dinesh3@gmail.com","password123");
	}
	
}
