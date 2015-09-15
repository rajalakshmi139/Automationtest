package com.org.TestProject;




import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.org.TestProject.commons.PropertyfileReader;

public class LoginPIKroger {
	
	public void loginPIKroger(String userName,String password)
	{
		
		 Map<String, String> properties = new HashMap<String, String>();

			try {
				properties.putAll(PropertyfileReader.fetchPropertyFileContent("ElementXpath.properties"));
			} catch (IOException e) {
				Reporter.log("File Does not exist");
			}
			
		  OpenBrowser.driver = OpenBrowser.getInstance();
			OpenBrowser.driver.get((properties.get("url")));
		    WebElement wb = OpenBrowser.driver.findElement(By.xpath(properties.get("userName_txtbox")));
			wb.sendKeys(userName);
			WebElement wb1 = OpenBrowser.driver.findElement(By.xpath(properties.get("password_txtbox")));
			wb1.sendKeys(password);
			OpenBrowser.driver.findElement(By.xpath(properties.get("login_button"))).click();
			
			}
	  
		
	}
	


