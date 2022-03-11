package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class TestNGExercise4 {
	WebDriver driver;
  @Test(dataProvider = "data")
  public void f(String uname, String pswd) {
	  System.out.println(uname+"------"+pswd);
	  driver.findElement(By.name("userName")).sendKeys(uname);
		//enter passsword
		driver.findElement(By.name("password")).sendKeys(pswd);
		//submit button
		driver.findElement(By.name("submit")).click();
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\All Is Well\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		 driver= new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
  }
  @AfterMethod
  public void afterMethod() {
	 driver.close();
	 
  }
  @DataProvider
  public Object[][] data() {
    return new Object[][] {
      new Object[] { "dinesh", "password123" },
      new Object[] { "dinesh", "" },
      new Object[] { "din", "password123" },
      new Object[] { "din", "pa123" },
    };
  }
}
