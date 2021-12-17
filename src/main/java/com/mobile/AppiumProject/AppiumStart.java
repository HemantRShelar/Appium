package com.mobile.AppiumProject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AppiumStart 
{
	
	public static void main(String[] args) throws MalformedURLException {
		
		
		//System.setProperty("webdriver.edge.driver", "resource/msedgedriver.exe");
		//WebDriver driver= new EdgeDriver();
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("deviceName", "OPPO A37f");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "5.1.1");
		cap.setCapability("browserName", "chrome");
		
		WebDriver driver= new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("email")).sendKeys("saurab@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("mypass");
		driver.findElement(By.name("login")).click();
		
		driver.quit();
	}

}