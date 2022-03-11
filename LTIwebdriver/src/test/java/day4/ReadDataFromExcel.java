package day4;

import java.io.*;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcel {
    static WebDriver driver;

    
	@Test
    public void Login() throws IOException, InterruptedException{
        //Read data from Excel'
        FileInputStream fis=new FileInputStream(new File("‪‪C:\\Users\\All Is Well\\Desktop\\Book123.xlsx"));
        //access workbook - XSSFWorkbook class
         
		XSSFWorkbook wb=new XSSFWorkbook(fis);
        //access worksheet
        XSSFSheet sh = wb.getSheet("Sheet1");
        //XSSFSheet sh=work.getSheetAt(0);
        //access cell data
        /*
        String username = sh.getRow(0).getCell(0).getStringCellValue();
        System.out.println(username);
        String psd = sh.getRow(0).getCell(1).getStringCellValue();    
        System.out.println(psd);
        */
        System.out.println("no of rows is:"+sh.getPhysicalNumberOfRows());

        for(int i=1;i<sh.getPhysicalNumberOfRows();i++){
            String username = sh.getRow(i).getCell(0).getStringCellValue();
            String psd = sh.getRow(i).getCell(1).getStringCellValue();
            System.out.println(username+"==="+psd);
            driver.findElement(By.name("userName")).sendKeys(username);
            driver.findElement(By.name("password")).sendKeys(psd);
            driver.findElement(By.name("submit")).click();
            if(driver.getTitle().contains("Login")){
                System.out.println("valid credentials");
                driver.findElement(By.linkText("SIGN-OFF")).click();
            }else{
                System.out.println("Invalid credentials");
            }
        }
    }

    @Before
    public  void beforeClass() throws InterruptedException{
        //launch chrome browser
        System.setProperty("webdriver.chrome.driver", 
                "C:\\Users\\All Is Well\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
                //open application
        driver.get("https://demo.guru99.com/test/newtours/");
        
    }

    @AfterClass
    public  void afterClass(){
        driver.close();

    }
 
}
