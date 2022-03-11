package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\All Is Well\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Actions act= new Actions(driver);
		WebElement src=driver.findElement(By.xpath("//div[@id='products']/div/ul/li[2]/a"));
		WebElement target=driver.findElement(By.id("amt7"));
		act.dragAndDrop(src, target).build().perform();
		
		act.dragAndDrop(driver.findElement(By.xpath("//div[@id='products']/div/ul/li[5]/a")),driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[1]/div/div/ol/li"))).build().perform();
		WebElement sc=driver.findElement(By.xpath("//div[@id='products']/div/ul/li[6]/a"));
		WebElement taret=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[2]/table/tbody/tr/td[1]/div/div/ol/li"));
		act.dragAndDrop(sc, taret).build().perform();

		WebElement scr=driver.findElement(By.xpath("//div[@id='products']/div/ul/li[4]/a"));
		WebElement trgt=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div/div/ol/li"));
		act.dragAndDrop(scr, trgt).build().perform();
	}

}
