package day7;

import org.junit.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HeadlessExecution {

@Test
public void TestCase1() {
	//headless execution
	ChromeOptions option=new ChromeOptions();
	option.addArguments("headless");
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\All Is Well\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");     
   WebDriver webDriver=new ChromeDriver(); 
    webDriver.get("https://www.google.com/");
	System.out.println(webDriver.getTitle());
	webDriver.close();
	
	
}
	
}
