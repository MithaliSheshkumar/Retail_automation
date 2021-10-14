package smokeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ProductsPurchasedReport_Admin {
	
	String exePath="E:\\chromedriver.exe";
    static WebDriver driver;
    
    
    public static void login()
    {
    	driver.get("http://retailm1.upskills.in/admin/index.php?route=report/product_purchased&token=8F9mSzd3i9rJWQCDK0Lk0gNuZs7VCfZG");
      	driver.manage().window().maximize();
          driver.findElement(By.id("input-username")).sendKeys("admin");
          driver.findElement(By.id("input-password")).sendKeys("admin@123");
          driver.findElement(By.cssSelector(".btn")).click();
    	
    }
    
    
    @BeforeTest
  public void f() {
	  System.setProperty("webdriver.chrome.driver",exePath);
		driver = new ChromeDriver();
  }
  
  @Test (priority =1)
  public void TestCase1() {
	  login();
	  driver.findElement(By.id("input-date-start")).sendKeys("2021-09-27");
	    driver.findElement(By.id("button-filter")).click();
	    driver.findElement(By.cssSelector("html")).click(); 
	   
  }
  
  @Test (priority =2)
  public void TestCase2_1() {
	  
	  login();
	  Select stat = new Select(driver.findElement(By.id("input-status")));
		stat.selectByVisibleText("Canceled");
	    driver.findElement(By.id("button-filter")).click();  
	  
  }
  
  @Test (priority =3)
  public void TestCase2_2() {
	  
	  login();
	  Select stat = new Select(driver.findElement(By.id("input-status")));
		stat.selectByVisibleText("Complete");
	    driver.findElement(By.id("button-filter")).click();  
	  
  }
  
  @Test (priority =4)
  public void TestCase2_3() {
	  
	  login();
	  Select stat = new Select(driver.findElement(By.id("input-status")));
		stat.selectByVisibleText("Processed");
	    driver.findElement(By.id("button-filter")).click();  
	  
  }

  @Test (priority =5)
  public void TestCase3() {
	  login();
	  driver.findElement(By.id("input-date-end")).sendKeys("2021-10-14");
	    driver.findElement(By.id("button-filter")).click();
	    driver.findElement(By.cssSelector("html")).click(); 
	    driver.close();
  }
}

