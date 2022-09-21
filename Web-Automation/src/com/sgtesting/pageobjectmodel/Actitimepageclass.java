package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitimepageclass {
	
	public Actitimepageclass(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	//WebElement for User Name Text Field
	private WebElement username;
	
	public WebElement getUserName()
	{
		return username;
	}

	//WebElement for Password Text Field
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	
	//WebElement for Login Button
	@FindBy(xpath="//div[text()='Login']")
	private WebElement Login;
	public WebElement getLogin()
	{
		return Login;
	}
	
	//WebElement for FlyOutWindow
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	//WebElement for Logout Link
	@FindBy(linkText="Logout")
	private WebElement Logout;
	public WebElement getLogoutLink()
	{
		return Logout;
	}
	
}