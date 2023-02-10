package util;

import java.util.Properties;

public class ReadConfig {
	Properties pro=new Properties();
	
	
	public String ReadConfigdata(String key) {
		return pro.getProperty(key);
	}

}
