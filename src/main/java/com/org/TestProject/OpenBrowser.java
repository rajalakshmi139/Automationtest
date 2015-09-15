package com.org.TestProject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {
	public static WebDriver driver;

	public static WebDriver getInstance() {
		if (driver == null) {
			driver = new FirefoxDriver();
		}
		return driver;
	}

}
