package com.org.TestProject;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.org.TestProject.commons.PropertyfileReader;

public class LoginPIKrogerTest {

	

		
	public String[] loginDataProvider()
	{

Map<String, String> properties = new HashMap<String, String>();

try {
	properties.putAll(PropertyfileReader
			.fetchPropertyFileContent("PIKrogerLoginCredentials.properties"));
} catch (IOException e) {
	Reporter.log("File Does not exist");
}
String userName = null;
if (properties.containsKey("userName")) {
	userName = properties.get("userName");
} else {
	Reporter.log("The value is Null");
}

String password = null;
if (properties.containsKey("password")) {
	password = properties.get("password");
} else {
	Reporter.log("The value is Null");
}


return new String[] { userName, password };
}

//public String verificationDataProvider() {
//Map<String, String> properties = new HashMap<String, String>();
//
//try {
//	properties.putAll(PropertyfileReader
//			.fetchPropertyFileContent("Verify.properties"));
//} catch (IOException e) {
//	Reporter.log("File Does not exist");
//}
//String actualPagetitle = null;
//if (properties.containsKey("title")) {
//	actualPagetitle = properties.get("title");
//} else {
//	Reporter.log("The value is Null");
//}
//
//return actualPagetitle;
//}


@DataProvider(name="Logindp")
public Object[][] Logindp() {
		
String[] loginData= loginDataProvider() ;
//String verifyData = verificationDataProvider();

		
return new Object[][]{{loginData[0],loginData[1]}};
}
  @Test(dataProvider="Logindp")
  public void loginPIKrogerTest(String userName,String password) {
	  LoginPIKroger loginPIKroger = new LoginPIKroger();
	  loginPIKroger.loginPIKroger(userName, password);
	  
  }
}