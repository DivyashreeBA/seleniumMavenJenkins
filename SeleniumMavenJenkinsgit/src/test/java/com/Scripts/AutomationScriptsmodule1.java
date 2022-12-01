package com.Scripts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationScriptsmodule1 {

	
@Test
public void JavaTestparallel1Method1() throws InterruptedException {
	System.out.println(Thread.currentThread().getId()+" JavaTestparallel1Method1");
	WebDriver driver;

	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://login.salesforce.com/");
	Thread.sleep(5000);
	driver.close();
}
@Test
public void JavaTestparallel1Method2() throws InterruptedException {
	System.out.println(Thread.currentThread().getId()+" JavaTestparallel1Method2");
	WebDriver driver;

	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(5000);
	driver.close();
}

}
