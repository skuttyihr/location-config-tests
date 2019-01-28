package location.config.tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.collections4.map.MultiValueMap;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.json.simple.parser.JSONParser;
import org.junit.Assert;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

/**
 * This class has the methods that build up to the actual tests.
 *
 * @author skutty
 */

public class Utils {
	/**
	 *
	 * @param propFile: The absolute path to a properties file (must be validated)
	 * @return
	 */
	private static String propFile = "test.properties.local";
	private static URL url = null;
	private static MultiValueMap dataMap;
	private static List<String> splitKey;
	private static JSONObject name;
	private static BufferedReader in;
	private static String inputLine;
	private static JSONParser jsonParser;
	private static JSONObject parsedJson;
	private static ReadWriteExcel reader = new ReadWriteExcel();
	
	private static String excelKey = "";
	public static String ENVIRONMENT;
	public static String COUNTRYCODE;
	public static String PLATFORM;
	public static String HOSTNAME;
	public static String VERSION;
	public static String CLIENTENVIRONMENT;

	private static String baseURL = ".api.iheart.com/api/v3/locationConfig?countryCode=";
	public static URL buildTestURL() {

		try {

			url = URLManager.getUrl();

		} catch (IOException e) {

			e.printStackTrace();

		}
		return url;

	}

	protected static void setup() {

		// Load up the properties file
		Properties props = null;
		try {
			props = PropertiesManager.loadProperties(propFile);
		}
		catch (Exception e) {
			System.out.println("Could not load properties, defaulting to passed in properties.");
		}
		setProperties(props);
	}

	protected static void setProperties(Properties props) {

		ENVIRONMENT = PropertiesManager.getProperties(props, "ENVIRONMENT");
		COUNTRYCODE = PropertiesManager.getProperties(props, "COUNTRYCODE");
		PLATFORM = PropertiesManager.getProperties(props, "PLATFORM");
		HOSTNAME = PropertiesManager.getProperties(props, "HOSTNAME");
		VERSION = PropertiesManager.getProperties(props, "VERSION");
		CLIENTENVIRONMENT = PropertiesManager.getProperties(props, "CLIENTENVIRONMENT");

	}


	/**
	 * This method reads from the location config URL and parses the stream
	 * @param url
	 * @return
	 */

	public static JSONObject getParsedJson(URL url) {

		Object obj = null;

		try {

			if (url != null) {
				
				in = new BufferedReader(new InputStreamReader(url.openStream()));
				
			}

			if (in !=  null) {
				
				inputLine =  in.readLine();
				
			}

			jsonParser = new JSONParser();
			obj = jsonParser.parse(inputLine);
			parsedJson = (JSONObject) obj;
			in.close();

		} catch (Exception e) {

			e.printStackTrace();
		}

		return parsedJson;
	}


	public static MultiValueMap readExcelData() {

		try {

			dataMap = reader.readExcel();

		} catch (IOException e) {

			e.printStackTrace();

		}
		return dataMap;
	}

	public static List<String> splitString(String text) {

		String[] items = text.split("\\.");
		List<String> itemList = Arrays.asList(items);
		return itemList;

	}

	public static String trim(Object obj) {

		return obj.toString().trim();

	}

	/**
	 * This method gets the excel key and value from the iHeartRadio Localization.xlsx file by row, writes it to a new xlsx file.
	 * Then gets the json value from the location config call and writes to the same row in the xls file for a visual comparision of values.
	 *
	 * @param jsonObj
	 * @throws IOException
	 */

	public static boolean compareValuesWriteToExcel(JSONObject jsonObj) throws IOException {

		dataMap = reader.readExcel();
		Workbook workbook = ReadWriteExcel.setUpWorkbook();
		Object excelValue = null;
		Object jsonValue = null;
        int rowNum = 2;
        Row row = null;
        Boolean failingTests = false;

		Sheet sheet = ReadWriteExcel.setUpExcelFile(workbook);
		Iterator<String> mapIterator = dataMap.keySet().iterator();

		//Read from iHeartRadio Localization.xls file, write the key and value for the country being tested into a new xlsx file
		while (mapIterator.hasNext()) {

			//get Excel key and value for each row
			String key = mapIterator.next();
			row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(key);

			ArrayList values = (ArrayList<Object>) dataMap.get(key);

			for (Object value : values) {

				excelValue = value;
			}

			//write to excel
            row.createCell(1).setCellValue(trim(excelValue));
			jsonValue = getJsonValueForKey(jsonObj, key, trim(excelValue));

			if (excelValue == "n/a" && jsonValue == null) {

				jsonValue = "n/a";

			}
            row.createCell(2).setCellValue(jsonValue.toString());

			if (trim(excelValue).equals(trim(jsonValue))) {

				row.createCell(3).setCellValue("Pass");

			} else {

				row.createCell(3).setCellValue("Fail");
				failingTests = true;

			}
		}
		
		ReadWriteExcel.writeToExcelFile(workbook, sheet);
		return failingTests;

	}
	
	/**
	 * Splits the key value into parts, checks if it's an JSONObject and retrieves the value for the last object.
	 * If the last object is a JSONArray then the array is processed for the expected values.
	 *
	 * @param jsonObj
	 * @param testKey
	 * @return
	 */

	public static Object getJsonValueForKey(JSONObject jsonObj, String testKey, String excelVal) {

		JSONObject jsonKey = jsonObj; 		//for getting jSON Key
		//Object objKey = null;
		Object jsonValue = null;

		try {
			//split the key at "." to get the final key Object and then the value.
			splitKey = splitString(testKey);
			int size = splitKey.size()-1;

			if (size > 0) {
				
				if (splitKey.get(size-1).contains("[")) {

					for (int i = 0; i <= size; i++) {
						int clientArrayIndex = Integer.parseInt(splitKey.get(size-1).substring(1, 2));
						String finalKey = splitKey.get(size);
						jsonValue = getJsonValueForSpecificTestKey(jsonObj, testKey, clientArrayIndex, finalKey);
					}
					
				} else {

					for (int i = 0; i <= splitKey.size()-1; i++) {
						JSONObject jsonTempKeyValue = jsonKey;

						if (jsonTempKeyValue.get(splitKey.get(i)) instanceof JSONObject) {
							jsonKey = (JSONObject) jsonTempKeyValue.get(splitKey.get(i));
						} else if (jsonTempKeyValue.get(splitKey.get(i)) instanceof JSONArray) {
							JSONArray arr = (JSONArray) jsonTempKeyValue.get(splitKey.get(i));
							jsonValue =  arr;
							break;
						} else {
							jsonKey  = null;
						}
					
						if (jsonKey == null) {
							jsonValue = jsonTempKeyValue.get(splitKey.get(i));
						}
					}
				}
			} else {

				jsonValue = jsonObj.get(testKey);

			}
				 
		} catch (Exception e) {

			System.out.println("\nThis key: " + testKey + " is missing on the location config api call.");

		}

		if (jsonValue == null) {

			jsonValue = "";

		}
		
		if (excelVal.equals("n/a")) {
			
			jsonValue = "n/a";
			
		}
		
		return trim(jsonValue);
	}

	public static Object getJsonValueForKey(JSONObject jsonObj, String testKey) {
		
		return getJsonValueForKey(jsonObj, testKey, "");
		
	}

	public static Object getKeyValueFromExcelForKey(String testString) {

		dataMap = readExcelData();
		Object excelValue = null;

		Iterator<String> mapIterator = dataMap.keySet().iterator();

		while (mapIterator.hasNext()) {

			String key = trim(mapIterator.next());
			if (key.equals(testString)) {

				ArrayList values = (ArrayList<Object>) dataMap.get(key);   //This helps to get the value as a string instead of with the [] notation

				for (Object value : values) {

					excelValue = value;

				}
			}
		}

		if (excelValue == null) {

			excelValue = "";

		} else if (excelValue.equals("n/a")) {

			excelValue = trim(excelValue);

		} else {

			excelValue = trim(excelValue);

		}

		return excelValue;

	}

	/**
	 * This method gets the JSON value for a specific key that is passed in as a parameter
	 *
	 * @param jsonObj
	 * @param testKey
	 * @param clientArrayIndex
	 * @param finalKey
	 * @return
	 */

	public static Object getJsonValueForSpecificTestKey(JSONObject jsonObj, String testKey, int clientArrayIndex, String finalKey) {

		//Object objKey = null;
		boolean flag = false;

		Object jsonValue = null;
		try {
			//split the key at "." to get the final key Object and then the value.
			List splitKey = splitString(testKey);

			if (splitKey.size() > 0) {

				for (int i = 0; i <= splitKey.size()-1; i++) {

					JSONObject jsonTempKeyValue = jsonObj;
					if (splitKey.get(i).equals(finalKey)) {

						flag = true;

					}

					if ((jsonTempKeyValue.get(splitKey.get(i)) instanceof JSONArray)) {

						JSONArray tempArray = (JSONArray) jsonTempKeyValue.get(splitKey.get(i));
						jsonObj = (JSONObject) tempArray.get(clientArrayIndex);
						jsonValue = trim((Object) jsonObj.get(finalKey));
						break;

					} else if ((jsonTempKeyValue.get(splitKey.get(i)) instanceof JSONObject)) {

							jsonObj = (JSONObject) jsonTempKeyValue.get(splitKey.get(i));


					} else if (jsonTempKeyValue.get(splitKey.get(i)) == null) {


						jsonValue = "";

					}

				}  //for
			} else {

				jsonValue = trim((Object) jsonObj.get(testKey));

			}

		} catch (Exception e) {

			//System.out.println("This key is not seen on location config yet." e.printStackTrace());
			e.printStackTrace();

		}
		if (jsonValue == null) {

			jsonValue = "";

		}
		return jsonValue;
	}


	public static void compareExcelToJson(JSONObject jsonObj) {

		dataMap = readExcelData();
		String key;
		Object excelValue = null;
		Iterator<String> mapIterator = dataMap.keySet().iterator();

		while (mapIterator.hasNext()) {

			key = mapIterator.next();

			ArrayList values = (ArrayList<Object>) dataMap.get(key);

			for (Object value : values) {

				excelValue = value;

			}

			//split the key at "." to get the final key Object and then the value.
			splitKey = splitString(key);
			excelValue = trim(excelValue);
			Object jsonValue = getJsonValueForKey(jsonObj, key);
			if (excelValue.equals(jsonValue)) {

				System.out.println("Test Passed for key: " + key + " Excel Value: " + excelValue + " JSONValue:" + jsonValue);
				Assert.assertEquals("For key value: " + key + ", values from json and excel matched.", excelValue, jsonValue);

			} else {

				System.out.println("Test Failed for key: " + key + " Excel Value: " + excelValue + " JSONValue:" + jsonValue);

			}
		}
	}
}
