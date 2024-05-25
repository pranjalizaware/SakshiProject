package com.Sakshi.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="log-in")
	WebElement button;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginToApplicationwithoutUserPassword()
	{
		
		 username.sendKeys(" "); password.sendKeys(" ");
		 
		button.click();
	}
	
	public void loginToApplicationwithoutPassword()
	{
		username.sendKeys("Pranjali");
		//password.sendKeys(" ");
		button.click();
	}
	public void loginToApplicationwithoutUsername()
	{
		username.sendKeys(" ");
		password.sendKeys("pranjali");
		button.click();
	}
	public void loginToApplication()
	{
		username.sendKeys("Pranjali");
		password.sendKeys("pranjali");
		button.click();
    }
    
}
