package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsSetUp {
	public SwagLabsSetUp(WebDriver v)
	{
		PageFactory.initElements(v, this);
	}
	@FindBy (xpath=("//input[@id='user-name']"))
	private WebElement username;
	public WebElement username()
	{
		return username;
	}
	private WebElement password;
	public WebElement password()
	{
		return password;
	}
	@FindBy(xpath="//*[@id=\'login-button\']")
	private WebElement login;
	public WebElement login()
	{
		return login;
	}
}
