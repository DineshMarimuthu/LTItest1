package day1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;


public class Scenario2 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\All Is Well\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		//maximize the window
		driver.manage().window().maximize();
		
		// enter username
		driver.findElement(By.name("userName")).sendKeys("dinesh");
		//enter passsword
		driver.findElement(By.name("password")).sendKeys("password123");
		//submit button
		driver.findElement(By.name("submit")).click();
		//click on flights
		driver.findElement(By.linkText("Flights")).click();
		Thread.sleep(10000);
		//click on oneway
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		
		//select passenger numbers
		Select p=new Select(driver.findElement(By.name("passCount")));
		p.selectByIndex(3);
		// select departure details
		Select d =new Select(driver.findElement(By.name("fromPort")));
		d.selectByValue("London");
		//select month
		Select on= new Select(driver.findElement(By.name("fromMonth")));
		on.selectByVisibleText("December");
		//select day
		Select day= new Select(driver.findElement(By.name("fromDay")));
		day.selectByValue("15");
		// arriving in
		Select arrive= new Select(driver.findElement(By.name("toPort")));
		arrive.selectByVisibleText("Frankfurt");
		//return
		Select retun= new Select(driver.findElement(By.name("toMonth")));
		retun.selectByVisibleText("January");
		//retrun date
		Select rd=new Select(driver.findElement(By.name("toDay")));
		rd.selectByIndex(10);
		// service class
		driver.findElement(By.xpath("//input[@value='Business']"));
		//preferecne
		Select airline =new Select(driver.findElement(By.name("airline")));
		airline.selectByVisibleText("Unified Airlines");
		//click on continue
		driver.findElement(By.name("findFlights")).click();
		
			
		
		
		
	}

}
