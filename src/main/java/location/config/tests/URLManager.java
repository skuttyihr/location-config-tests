package location.config.tests;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import junit.framework.Assert;
import location.config.tests.Utils;

/**
 * This class builds the Location Config api call/url for testing.
 * 
 * Sample URL for mobile = https://ca.api.iheart.com/api/v3/locationConfig?countryCode=CA&hostname=iphone.mobile&version=8.8.0
 * Sample URL for web = https://mx.api.iheart.com/api/v3/locationConfig?hostname=webapp&version=8-prod&countryCode=MX
 * Sample URL for web staging = https://mx.api.iheart.com/api/v3/locationConfig?hostname=webapp&version=8-beta&countryCode=MX
 * 
 * @author skutty
 */

public class URLManager {

	private static URL url = null;
	private static String baseURL = ".api.iheart.com/api/v3/locationConfig?countryCode=";
	

	/**
	 * This method builds the location config test url/api call
	 * It gets the parameter values for hostname, version, platform and environment from the property file.
	 * @return
	 * @throws IOException
	 */
	
	private static URL buildURL() throws IOException {		
		String env = null;
		String webEnvironment = "";

		if (Utils.HOSTNAME.equals("iphone.mobile") || Utils.HOSTNAME.equals("android.mobile")) {
			if (Utils.ENVIRONMENT.equals("prod")) {
				env = "";
			} else if (Utils.ENVIRONMENT.equals("qa")) {
				env = "-qa";
			} else if (Utils.ENVIRONMENT.equals("stage")){
				env = "-stg";
			}
		} 
		else if (Utils.HOSTNAME.equals("webapp")) {
			env = "";
			if (Utils.ENVIRONMENT.equals("prod")) {
				webEnvironment = "-prod";
			} else if (Utils.ENVIRONMENT.equals("stage")) {
				webEnvironment = "-stage";
			} else if (Utils.ENVIRONMENT.equals("qa")) {
				webEnvironment = "-qa";
			} else if (Utils.ENVIRONMENT.equals("beta")) {
				webEnvironment = "-beta";
			} else if (Utils.ENVIRONMENT.equals("sandbox")) {
				webEnvironment = "-sandbox";
			} else {
				webEnvironment = "-master";
			}
		} 

		try {
			
			url = new URL("https://" + Utils.COUNTRYCODE.toLowerCase() + env + baseURL + Utils.COUNTRYCODE + "&hostname=" 
					+ Utils.HOSTNAME + "&version=" + Utils.VERSION + webEnvironment);
			
		}
		catch (MalformedURLException e) {
			
			Assert.fail("URL was not built correctly.");
			e.printStackTrace();
			
		}
		
		System.out.println("URL Being Tested: " + url);
		return url;
		
	}

	
	/**
	 * Getter method for the test URL
	 * @return
	 * @throws IOException
	 */
	
	public static URL getUrl() throws IOException {
		
		return buildURL();
		
	}
}
