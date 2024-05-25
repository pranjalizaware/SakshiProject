package com.Sakshi.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Sakshi.base.BaseClass;
import com.Sakshi.page.AccountPage;
import com.Sakshi.page.LoginPage;

public class AmmountSorting extends BaseClass {
	
	@Test
	public void sortAmmount() throws InterruptedException
	{
		LoginPage obj=new LoginPage(driver);
		obj.loginToApplication();
		
		Thread.sleep(2000);
		
		AccountPage obj2=new AccountPage(driver);
		obj2.ClickOnAccount();
		List<WebElement> amountElements = driver.findElements(By.xpath("//table[@id='transactionsTable']//td[5]"));
		   
		 try {
          List<Double> amounts = new ArrayList<>();
           for (WebElement element : amountElements) {
               String amountText = element.getText().replace("$", "").replace(",", "").trim();
               amounts.add(Double.parseDouble(amountText));
           }
           List<Double> sortedAmounts = new ArrayList<>(amounts);
           Collections.sort(sortedAmounts);
           Assert.assertEquals("The amount column is not sorted.", amounts.equals(sortedAmounts));
           System.out.println("The amount column is sorted.");
           
	     } catch (NumberFormatException e) {
           System.out.println("Failed to parse one of the amount values.");
	     }
		 }
}
