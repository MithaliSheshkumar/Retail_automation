package RetailPages;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

import java.io.IOException;
import java.util.List;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

@SuppressWarnings("unused")
public class retailAdminLoginPage{
	
	WebDriver driver;	
	

	//login
	By username= By.id("input-username");
	By password = By.id("input-password");
	By loginbutton = By.cssSelector("#content > div > div > div > div > div.panel-body > form > div.text-right > button");
	By HeaderText = By.xpath("//*[@id=\"content\"]/div[1]/div/h1");
	
	//Customer Filter
	By name = By.id("input-name");
	By Cg = By.id("input-customer-group");
	By approval = By.id("input-approved");
	By add_date = By.id("input-date-added");
	By email = 	By.id("input-email");
	By status =	By.id("input-status");
	By ip =	By.id("input-ip");
	By filter = By.id("button-filter");
	
	//Add Customer
	By addNew = By.xpath("//*[@id=\"content\"]/div[1]/div/div/a");
	By Cgrup = By.id("input-customer-group");
	By fname = By.id("input-firstname");
	By lname = By.id("input-lastname");
	By Cemail = By.id("input-email");
	By Cphone = By.id("input-telephone");
	By Cfax = By.id("input-fax");
	By Cpwd = By.id("input-password");
	By Ccpwd = By.id("input-confirm");
	By News = By.id("input-newsletter");
	By Cstatus =	By.id("input-status");
	By Capproval = By.id("input-approved");
	By Csafe =	By.id("input-safe");
	By save = By.cssSelector("#content > div.page-header > div > div > button");

	//Delete coustomer
	By Deletedata=By.xpath("//*[@id=\"form-customer\"]/div/table/tbody/tr[1]/td[1]/input");
	By DeleteButton=By.xpath("//*[@id=\"content\"]/div[1]/div/div/button/i");



	//creating parameterized constructor to initialize WebDriver reference
	public retailAdminLoginPage(WebDriver driver)
	{
		this.driver =driver;
	}
	
	public boolean isHeaderFound()
	{
		
		boolean found=false;
		try {
			//Dashboard header present in page?
			found=driver.findElement(HeaderText).isDisplayed();
		}
		
		catch (NoSuchElementException e)
		{
			found=false;
		}
		
		return found;
		
	}	
		

		public boolean AdminLogin(String un,String pw)
		{
			driver.findElement(username).sendKeys(un);
			driver.findElement(password).sendKeys(pw);
			driver.findElement(loginbutton).click();
			boolean success=this.isHeaderFound();
			return success;
		
		}

		
	
		
		}