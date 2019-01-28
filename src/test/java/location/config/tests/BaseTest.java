package location.config.tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URL;
import org.json.simple.JSONObject;
import org.junit.*;

/**
 * BaseTest.java - Sets up the test pre-requisistes
 * 
 * @author skutty
 */

public class BaseTest { 
	
	static BufferedReader in = null;
	static String inputLine = null;
	public static URL testURL = null;
	public static JSONObject jsonObject;
	static Object obj = null;

	@BeforeClass
	public static void setup() throws IOException {
		
		System.out.println("Setting up test url.");
		Utils.setup();
		testURL = Utils.buildTestURL();
		jsonObject = Utils.getParsedJson(testURL);
		GoogleDocDownload.downloadGoogleDocument();

	}

	@AfterClass
	public static void tearDown() {
		
	}
}
