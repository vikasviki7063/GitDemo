package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Rediffloginpage {
	
	WebDriver driver;
	
	public Rediffloginpage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By username = By.xpath(".//*[@id='login1']");
	By password = By.name("passwd");
	By signin	= By.name("proceed");
	By home		= By.cssSelector(".f12");
	
	public WebElement Email()
	{
		return driver.findElement(username);
		
		}
	public WebElement password()
	{
		return driver.findElement(password);
		
		}
	public WebElement sigin()
	{
		return driver.findElement(signin);
		
		}
	public WebElement home()
	{
		return driver.findElement(home);
		
		}
	
	


}
