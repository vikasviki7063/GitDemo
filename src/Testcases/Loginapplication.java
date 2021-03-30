package Testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Objectrepository.Pageobjectfactory;
import Objectrepository.Rediffloginpage;
import Objectrepository.Rediffloginpage2;

public class Loginapplication {
	
	@Test
	public void Login()
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		Rediffloginpage rd = new Rediffloginpage(driver);
		rd.Email().sendKeys("hello");
		rd.password().sendKeys("hello");
		//rd.sigin().click();	
		rd.home().click();
		
		Pageobjectfactory rh = new Pageobjectfactory(driver);
		rh.search().sendKeys("rediff");
		rh.submit().click();
		
		
	
	}

}
