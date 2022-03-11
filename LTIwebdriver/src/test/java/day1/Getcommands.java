package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\All Is Well\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
			//open the application

		driver.get("http://demowebshop.tricentis.com/");
		String title=driver.getTitle();
		System.out.println("title is"+title );
		
		if (title.equals("Demo Web Shop")) {
			System.out.println("title is correct");
		}
		
		//fetch cuurent url
		System.out.println(driver.getCurrentUrl());
		//fetch html source of the page
		System.out.println(driver.getPageSource());
		//move back
		//driver.navigate().back();
		//move forward
		//driver.navigate().forward();
		//refresh
		//driver.navigate().refresh();
		driver.close();
	}

}
