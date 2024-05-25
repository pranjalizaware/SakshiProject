package com.Sakshi.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Sakshi.base.BaseClass;
import com.Sakshi.page.LoginPage;

public class LoginTest extends BaseClass {
	LoginPage obj=new LoginPage(driver);
	
	@Test(priority=0)
	public void LoginApplicationScenario1()
	{
		obj.loginToApplicationwithoutUserPassword();
		Assert.assertEquals(driver.getCurrentUrl(), "https://sakshingp.github.io/assignment/home.html");
	}
	@Test(priority=1)
	public void LoginApplicationScenario2()
	{
		obj.loginToApplicationwithoutUsername();
		Assert.assertEquals(driver.getCurrentUrl(), "https://sakshingp.github.io/assignment/home.html");
	}
	@Test(priority=2)
	public void LoginApplicationScenario3()
	{
		obj.loginToApplicationwithoutUserPassword();;
		Assert.assertEquals(driver.getCurrentUrl(), "https://sakshingp.github.io/assignment/home.html");
	}
	@Test(priority=3)
	public void LoginApplication()
	{
		LoginPage obj=new LoginPage(driver);
		obj.loginToApplication();
		Assert.assertEquals(driver.getCurrentUrl(), "https://sakshingp.github.io/assignment/home.html");
	}
	
}
