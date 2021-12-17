package com.mobile.AppiumProject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GameCentre {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("deviceName", "OPPO A37f");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "5.1.1");
		WebDriver driver= new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		 WebElement clickicon=  driver.findElement(By.xpath("//android.widget.TextView[@text='Game Center']"));
	        clickicon.click();
	        WebElement clickcategories=  driver.findElement(By.xpath("//com.nearme.gamecenter:id/rl_content[@resource-id='android.widget.RelativeLayout']"));
	        clickcategories.click();


	}

}
