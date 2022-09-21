package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwaglabsAuto {
	public static WebDriver v=null;
	public static SwagLabsSetUp s=null;
	public static void main(String[] args) {
		launch();
		navigate();
		login();
	}
	public static void launch()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
		v=new ChromeDriver();
		s=new SwagLabsSetUp(v);
	}
	public static void navigate()
	{
		try
		{
			v.get("https://www.saucedemo.com/");
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void login()
	{
		try
		{
			s.username().sendKeys("standard_user");
			s.password().sendKeys("secret_sauce");
			Thread.sleep(1000);
			s.login().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
