package org.qsp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Urbanladder 
{
	@FindBy(xpath= "//a[@data-gaaction='popup.auth.close']")
	private WebElement close;

	@FindBy(xpath= "//li[@class='topnav_item livingunit']")
	private WebElement Living;
	
	@FindBy(xpath= "//span[text()='Fabric Sofa Sets']")
	private WebElement FebricSofaSet;
	
	@FindBy(xpath= "//li[1]/descendant::div[@class='Grey selected variations']/descendant::button[text()='View Product']")
	private WebElement viewproduct;
	
	public void closeClick()
	{
		close.click();
	}
	
	public void livingMouseover(WebDriver driver)
	{
		Actions a=new Actions(driver);
	    a.moveToElement(Living).build().perform();   
	}
	
	public Urbanladder(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sofaClick()
	{
		FebricSofaSet.click();
	}
	
	public void viewproduct()
	{
		viewproduct.click();
	}
	
}
