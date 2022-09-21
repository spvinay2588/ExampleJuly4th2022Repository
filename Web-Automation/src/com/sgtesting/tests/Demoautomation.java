package com.sgtesting.tests;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demoautomation {
public static WebDriver o=null;
public static Select a=null;
	public static void main(String[] args) {
		 launch();
		 navigate();
		 automate();
		 close();
	}
	private static void launch()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			o=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			o.get("https://www.techlistic.com/p/selenium-practice-form.html");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void automate()
	{
		try
		{
			o.findElement(By.name("firstname")).sendKeys("vinay");
			Thread.sleep(1000);
			o.findElement(By.name("lastname")).sendKeys("patil");
			Thread.sleep(1000);
			o.findElement(By.id("sex-0")).click();
			Thread.sleep(1000);
			o.findElement(By.id("exp-6")).click();
			Thread.sleep(1000);
			o.findElement(By.id("datepicker")).sendKeys("21/12/1996");
			Thread.sleep(1000);
			o.findElement(By.id("profession-1")).click();
			Thread.sleep(1000);
			o.findElement(By.id("tool-2")).click();
			Thread.sleep(1000);
			a=new Select(o.findElement(By.id("continents")));
			a.selectByVisibleText("South America");
			Thread.sleep(1000);
			a=new Select(o.findElement(By.id("selenium_commands")));
			a.selectByVisibleText("WebElement Commands");
			Thread.sleep(1000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void close()
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
