package com.Sakshi.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
public static WebDriver driver;
	
	@BeforeMethod
	public void launch() throws InterruptedException
	{
	driver=	new ChromeDriver();
	driver.get("https://sakshingp.github.io/assignment/login.html");
	driver.manage().window().maximize();
	Thread.sleep(6000);
	}
	
	public void quit()
	{
		driver.quit();
	}

}
