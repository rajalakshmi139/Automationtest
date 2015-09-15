package com.org.TestProject.commons;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
public class PropertyfileReader {

	
	  private static String propFileName = "ElementXpath.properties";

	  /**
	   * Here we are populating property file key value pair.
	   * 
	   * @return map of properties file in key value pair.
	   * @throws IOException
	   */
	  public static Map<String, String> fetchPropertyFileContent() throws IOException
	  {
	    Map<String, String> properties = new HashMap<String, String>();

	    Properties prop = new Properties();
	    
	    InputStream inputStream = new FileInputStream(Thread.currentThread().getContextClassLoader().getResource(propFileName).getFile());
	    prop.load(inputStream);

	    for (Entry<Object, Object> content : prop.entrySet())
	    {
	      properties.put(content.getKey().toString(), content.getValue().toString());
	    }

	    return properties;
	  }

	  /**
	   * Here we are populating prope,.lo0rty file key value pair by taking file name as parameter.
	   * 
	   * @param propFileName
	   * @return map of properties file in key value pair.
	   * @throws IOException
	   */
	  public static Map<String, String> fetchPropertyFileContent(String propFileName) throws IOException
	  {
	    Map<String, String> properties = new HashMap<String, String>();

	    Properties prop = new Properties();

	    InputStream inputStream = PropertyfileReader.class.getClassLoader().getResourceAsStream(propFileName);
	    prop.load(inputStream);

	    for (Entry<Object, Object> content : prop.entrySet())
	    {
	      properties.put(content.getKey().toString(), content.getValue().toString());
	    }

	    return properties;
	  }

	}