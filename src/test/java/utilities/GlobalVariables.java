package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalVariables {
	
	public static Properties prop;
	public static String extractProperties() throws IOException
	{
		FileInputStream stream = new FileInputStream("/home/n1502752/Downloads/AutomationProject-master/src/test/java/utilities/global.properties");
		System.out.println("File loaded in to stream");
		prop = new Properties();
		prop.load(stream);
		String URL = prop.getProperty("url");
		
		return URL;
	}

}
