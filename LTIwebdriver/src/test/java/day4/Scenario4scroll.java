package day4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Scenario4scroll {

	public static void main(String[] args) throws  InterruptedException, IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\All Is Well\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://demo.guru99.com/test/newtours/");
//perform scroll down
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,2000)");
//take screenshot
TakesScreenshot s=(TakesScreenshot)driver;
File src=s.getScreenshotAs(OutputType.FILE);//taking screenshot
//copy src to place it in local system
File dest= new File("C:\\IMAGES\\Screenshot1.jpeg");
FileUtils.copyFile(src,dest);
Thread.sleep(2000);
driver.close();
	}

}
