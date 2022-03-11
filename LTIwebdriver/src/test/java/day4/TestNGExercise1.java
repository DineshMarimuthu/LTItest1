package day4;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNGExercise1 {
  @Test
  public void Testcase1() {
	 System.out.println("this is first test case333333"); 
  }
  @Test
  public void Testcase2() {
	  System.out.println("this is the second test case4444444");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is the method opening000000");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("this is the method closing0000000");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is 1 class opening 1 time222222");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is 1 class opens 1 time22222222");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("THis is  1 test executes one1111111");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this is 1 test executs one111111111");
  }

}
