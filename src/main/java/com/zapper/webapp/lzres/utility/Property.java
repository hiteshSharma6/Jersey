package com.zapper.webapp.lzres.utility;

import java.io.InputStream;
import java.util.Properties;

public abstract class Property {
	
	private static Properties prop = null;
	private static InputStream in = null;
	private static final String CONFIG_FILE_NAME = "config.properties";
	
	static {
		try {
			prop = new Properties();
			in = Property.class.getClassLoader().getResourceAsStream(CONFIG_FILE_NAME);
			
			if(in == null) {
				System.out.println("Unable to find file: "+ CONFIG_FILE_NAME);
			}
			else {
				prop.load(in);
				in.close();
			}
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
