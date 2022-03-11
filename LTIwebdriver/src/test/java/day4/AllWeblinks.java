package day4;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
public class AllWeblinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\All Is Well\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.navigate().to("https://demo.guru99.com/test/newtours/");
//Get list of web-elements with tagName  - a
List<WebElement> allLinks = driver.findElements(By.tagName("a"));

//Traversing through the list and printing its text along with link address
for(WebElement link:allLinks){
System.out.println(link.getText() + " - " + link.getAttribute("href"));
}
driver.close();






	}

}
