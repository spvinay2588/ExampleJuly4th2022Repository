package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1 {
public static WebDriver o=null;
	public static void main(String[] args) {
		launch();
		navigate();
		login();
		createuser();
		update();
		deleteuser();
		logout();
		closeapplication();
	}
	private static void launch()
	{
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
		o=new ChromeDriver();
	}
	private static void navigate()
	{
		try
		{
			o.get("http://localhost:6854/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			o.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(500);
			o.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createuser()
	{
		try
		{
			o.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
			o.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			o.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(1000);
			o.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("vinay");
			Thread.sleep(1000);
			o.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("patil");
			Thread.sleep(1000);
			o.findElement(By.id("userDataLightBox_emailField")).sendKeys("vinayspatil73@gmail.com");
			Thread.sleep(1000);
			o.findElement(By.id("userDataLightBox_usernameField")).sendKeys("vinay");
			Thread.sleep(1000);
			o.findElement(By.id("userDataLightBox_passwordField")).sendKeys("patil");
			Thread.sleep(1000);
			o.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("patil");
			Thread.sleep(1000);
			o.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void update()
	{
		try
		{
			o.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(1000);
			o.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("shashi");
			Thread.sleep(1000);
			Thread.sleep(1000);
			o.findElement(By.name("password")).sendKeys("vinay2588");
			Thread.sleep(1000);
			o.findElement(By.name("passwordCopy")).sendKeys("vinay2588");
			Thread.sleep(1000);
			o.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteuser()
	{
		try
		{
			o.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(1000);
			o.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(1000);
			Alert a=o.switchTo().alert();
			a.accept();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			o.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeapplication()
	{
		try
		{
			o.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
