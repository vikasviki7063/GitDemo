package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Rediffloginpage2 {
	
	WebDriver driver;
	
	public Rediffloginpage2(WebDriver driver)
	{
		this.driver = driver;
		
		}
	
	By search = By.id("srchword");
	By submit = By.xpath("//input[@type='submit']");
	
	public WebElement search()
	{
		return driver.findElement(search);
	}
	
	public WebElement submit()
	{
		return driver.findElement(submit);
	}
	
	


}
