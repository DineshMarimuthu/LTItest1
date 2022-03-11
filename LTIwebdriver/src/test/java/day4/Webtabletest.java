package day4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtabletest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\All Is Well\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//implicit wait statement
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//open the application

		driver.navigate().to("https://demo.guru99.com/test/web-table-element.php#");
		//fetch no of column
		////*[@id="leftcontainer"]/table/thead/tr/th
		List<WebElement> col=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"));
		System.out.println("column size is:"+col.size());
		
		//fetch no of rows
		////*[@id="leftcontainer"]/table/thead/tr
		List<WebElement>rows=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println("no of rows is:"+rows.size());
		
		//fetch specific data from the cell
		////*[@id='leftcontainer']/table/tbody/tr[1]/td[2]
		
		String cell= driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td[2]")).getText();
		if (cell.equals('A')) {
			System.out.println("data validation is success");
		}else {
			System.out.println("data is incorrect");
		}
	// check which company is on top
		////*[@id="leftcontainer"]/table/tbody/tr[1]/td[1]/a
		String toplist=driver.findElement(By.xpath("//*[@id=\'leftcontainer\']/table/tbody/tr[1]/td[1]/a")).getText();
	System.out.println("top company name is:"+toplist);
	// fetch top 5 company list
	for(int i=1;i<=5;i++) {
		String list=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td[1]/a")).getText();
		System.out.println(list);	
	}
	driver.close();
	}

}
