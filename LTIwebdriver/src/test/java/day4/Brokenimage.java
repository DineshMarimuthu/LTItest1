package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenimage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\All Is Well\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/test/newtours/");
		
		 // Storing all elements with img tag in a list of WebElements
        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("Total number of Images on the Page are " + images.size());
        
        
        //checking the links fetched.
        for(int index=0;index<images.size();index++)
        {
            WebElement image= images.get(index);
            String imageURL= image.getAttribute("src");
            System.out.println("URL of Image " + (index+1) + " is: " + imageURL);
            verifyLinks(imageURL);
          
            //Validate image display using JavaScript executor
            try {
                boolean imageDisplayed = (Boolean) ((JavascriptExecutor) driver).executeScript("return (typeof arguments[0].naturalWidth !=\"undefined\" && arguments[0].naturalWidth > 0);", image);
                if (imageDisplayed) {
                    System.out.println("DISPLAY - OK");
                }else {
                     System.out.println("DISPLAY - BROKEN");
                }
            } 
            catch (Exception e) {
            	System.out.println("Error Occured");
            }
        }
        
        
     driver.quit();
   }

	private static void verifyLinks(String imageURL) {
		// TODO Auto-generated method stub
		
	}
		
	
	
	}


