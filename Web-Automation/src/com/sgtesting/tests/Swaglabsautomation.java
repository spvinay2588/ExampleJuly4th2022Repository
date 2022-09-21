package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swaglabsautomation {
public static WebDriver o=null;
	public static void main(String[] args) {
		launchbrowser();
		loadurl();
		entercredentials();
		addingtocart();
		booking();
		logout();
		closeapp();
	}
	private static void launchbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
		o=new ChromeDriver();
	}
	private static void loadurl()
	{
		try
		{
			o.get("https://www.saucedemo.com/");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void entercredentials()
	{
		try
		{
			o.findElement(By.id("user-name")).sendKeys("standard_user");
			Thread.sleep(3000);
			o.findElement(By.id("password")).sendKeys("secret_sauce");
			Thread.sleep(3000);
			o.findElement(By.id("login-button")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void addingtocart()
	{
		try
		{
			o.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
			Thread.sleep(3000);
			o.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
			Thread.sleep(3000);
			o.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
			Thread.sleep(3000);
			o.findElement(By.className("shopping_cart_link")).click();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void booking()
	{
		try
		{
			o.findElement(By.id("checkout")).click();
			Thread.sleep(3000);
			o.findElement(By.id("first-name")).sendKeys("vinay");
			Thread.sleep(3000);
			o.findElement(By.id("last-name")).sendKeys("patil");
			Thread.sleep(3000);
			o.findElement(By.id("postal-code")).sendKeys("bagakot");
			Thread.sleep(3000);
			o.findElement(By.id("continue")).click();
			Thread.sleep(3000);
			o.findElement(By.id("finish")).click();
			Thread.sleep(3000);
			o.findElement(By.id("back-to-products")).click();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void logout()
	{
		try
		{
			o.findElement(By.id("react-burger-menu-btn")).click();
			Thread.sleep(3000);
			o.findElement(By.id("logout_sidebar_link")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void closeapp()
	{
		try
		{
			o.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
