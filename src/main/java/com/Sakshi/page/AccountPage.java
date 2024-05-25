package com.Sakshi.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	

	@FindBy(id="amount")
	WebElement amount;
	
	public AccountPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void ClickOnAccount()
	{
		amount.click();
	}
	
	

}
