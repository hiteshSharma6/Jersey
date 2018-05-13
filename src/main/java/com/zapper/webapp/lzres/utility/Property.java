package com.zapper.webapp.lzres.utility;

import java.io.InputStream;
import java.util.Properties;

public class Property {
	
	private static Properties prop = null;
	private InputStream in = null;
	private static final String CONFIG_FILE_NAME = "config.properties";
	
	public Property() {
		try {
			prop = new Properties();
			in = Property.class.getClassLoader().getResourceAsStream(CONFIG_FILE_NAME);
			
			if(in == null) {
				System.out.println("Unable to find file: "+ CONFIG_FILE_NAME);
				return;
			}
			
			prop.load(in);
			in.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
/*	
	public static Properties setProperty() {
		return prop;
	}
*/	
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}

}
