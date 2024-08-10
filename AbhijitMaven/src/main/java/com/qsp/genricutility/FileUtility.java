package com.qsp.genricutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility 
{
	public String getDataFromProperty(String key) throws IOException 
	{
		FileInputStream fil = new FileInputStream("./src/test/resources/commomdata.properties");
		Properties prop =new Properties();
		prop.load(fil);
		return prop.getProperty(key);		
	}
}
