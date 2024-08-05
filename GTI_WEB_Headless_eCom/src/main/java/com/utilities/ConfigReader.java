package com.utilities;

import java.io.*;
import java.util.Properties;

import static com.resuableMethods.CommonAction.props;

public class ConfigReader {

	private static Properties prop;

	/**
	 * This method is used to load the properties from config.properties file
	 * 
	 * @return it returns Properties prop object
	 */


	public static String getTestData(String data) throws IOException {
		loadTestData();
		data = props.getProperty(data);
		return data;
	}
	public static void loadTestData() throws IOException {
		props = new Properties();
		File file = new File(System.getProperty("user.dir") + "./src/test/resources/config/Testdata.properties");
		FileReader fileInput = new FileReader(file);
		props.load(fileInput);
	}

	public static Properties init_prop() {

		prop = new Properties();
		try {

			String env = System.getenv("ENVIRONMENT");
			if (env == null) {
				env = System.getProperty("ENVIRONMENT");

			}
			if (env.equalsIgnoreCase("UAT")) {
				FileInputStream ip = new FileInputStream("./src/test/resources/config/UAT.properties");
				prop.load(ip);
			}  else if (env.equalsIgnoreCase("QA2")) {
				FileInputStream ip = new FileInputStream("./src/test/resources/config/QA2.properties");
				prop.load(ip);
			}  else if (env.equalsIgnoreCase("QA1")) {
				FileInputStream ip = new FileInputStream("./src/test/resources/config/QA1.properties");
				prop.load(ip);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return prop;
	}

}
