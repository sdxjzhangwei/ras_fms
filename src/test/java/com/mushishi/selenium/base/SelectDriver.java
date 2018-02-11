package com.mushishi.selenium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectDriver {
	public WebDriver driverName(String browser){
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\ZhangWei\\code\\selenium\\driver\\chromedriver.exe");
			return new ChromeDriver();
		}else{
			System.setProperty("webdriver.chrome.driver","C:\\ZhangWei\\code\\selenium\\driver\\chromedriver.exe");
			return new ChromeDriver();
		}
	}
}
