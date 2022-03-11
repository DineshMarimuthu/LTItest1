package day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Launchingbrowsertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// to launch chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\All Is Well\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//close chrome
		//driver.close();
		//open application
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		//click on register link
		driver.findElement(By.linkText("REGISTER")).click();
		// enter username as dinesh
		driver.findElement(By.name("email")).sendKeys("Dinesh");
		//enter passsword
		driver.findElement(By.name("password")).sendKeys("password123");
		//enter confirm password
		driver.findElement(By.name("confirmPassword")).sendKeys("password12");
		//click on submit
		driver.findElement(By.name("submit")).click();
		//close the browser
		driver.close();
	}
	
	

}
