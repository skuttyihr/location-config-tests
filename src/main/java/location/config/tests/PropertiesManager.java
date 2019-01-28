package location.config.tests;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import org.junit.*;

/**
 * This class reads the properties file and sets values for environment, country, hostname and platform
 * @author skutty
 */

class PropertiesManager {
	
	/**
	 * 
	 * @param propFile: The absolute path to a properties file (must be validated)
	 * @return
	 */
	public static Properties loadProperties(String propFile) throws Exception{
		Properties loadedProps = null;
		try {
			
			loadedProps = new Properties();
			InputStream in = PropertiesManager.class.getClassLoader().getResourceAsStream(propFile);
			loadedProps.load(in);
			
		}
		catch(Exception e) {
			
			System.out.println("Properties file not present or couldn't be loaded.");
			e.printStackTrace();
			
		}
		return loadedProps;
	}
	
	
	public static String getProperties(Properties props, String propertyName){
		String returnProp = "";


		returnProp = System.getProperty(propertyName);				
		System.out.println("System property for  " + propertyName + " is " + returnProp);

		if (returnProp != null) {
			
			return returnProp;
			
		} else if (returnProp == null || returnProp.isEmpty()) {

			System.out.println("Could not load " + propertyName + " from the system properties. Check your environment or Gradle script.");

		}

		if (props.containsKey(propertyName)) {

			returnProp = props.getProperty(propertyName);

			if (returnProp == null || returnProp.isEmpty()) {

				System.out.println("Could not load " + propertyName + " from the provided properties file. Check your properties file path and contents.");

			}
		}

		return returnProp;
	}

//	/**
//	 * Opens an XML document
//	 * @param docName
//	 * @return
//	 */
//	
//	private static Document openXmlDoc(String docName) {
//		
//		File propertiesFile = new File(docName);
//
//		if(!propertiesFile.exists()) {
//			Assert.fail("Could not find file: " + docName);
//		}
//
//		Document doc = null;
//		try {
//			
//			//Create a DocumentBuilder
//			File xmlFile = new File(docName);
//			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//
//			//Create a document from a file
//			//doc = dBuilder.parse(xmlFile);
//			doc = dBuilder.parse(xmlFile);
//			doc.getDocumentElement().normalize();
//
//		}
//		
//		catch(Exception e) {
//			
//			String errorMessage = String.format("Could not open %s:\n %s", docName, e.getMessage());
//			Assert.fail(errorMessage);
//			
//		}
//		return doc;	
//		
//	}
	
}
