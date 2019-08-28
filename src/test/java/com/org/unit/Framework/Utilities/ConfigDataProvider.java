package com.org.unit.Framework.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider 
{
    Properties pro;
	public ConfigDataProvider()
	{
		File src1= new File("./Config/Config.properties");
		try {
			FileInputStream fis1= new FileInputStream(src1);
			pro= new Properties();
			pro.load(fis1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getConfigData(String key)
	{
		return pro.getProperty(key);
	}
   

}
