package commons;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public Properties prop;

	public String readConfigProperty(String key) {

		BufferedReader reader;

		try {
			reader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/config.properties"));
			prop = new Properties();
			try {
				prop.load(reader);
			} catch (IOException e) {
				System.out.println("proeprties file could not be loaded");
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException("config.properties file not found");
		}
		return prop.getProperty(key);
	}

	
}
