package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wind {
	public static WebDriver o=null;

	public static void main(String[] args) {
		launch();
	}
	private static void launch()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
		o=new ChromeDriver();
	}
	
}
