package com.org.TestProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class MavenDemoTest {
	@Test
	public void Hello()
	{
		System.out.print("sucessfully tested maven");
		System.setProperty("webdriver.ie.driver", "D://IEDriverServer.exe");
        WebDriver driver=new InternetExplorerDriver(); 
driver.get("https://rediff.com");	


		
	}

}
