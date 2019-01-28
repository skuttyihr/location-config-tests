package location.config.tests;

import org.json.simple.JSONArray;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class ConfigTests extends BaseTest {
	
	//https://docs.google.com/spreadsheets/d/1aVYNMjY-Y9COXBICaI9X-RX9MozqxwPEqMbyGLAPuqM/edit#gid=0
	String name = "";
	protected       ArrayList<HashMap<String, String>>    decodedArray;
    protected       HashMap<String, String> decodedMap;
    protected       Iterator<String>        it;
    protected       JSONArray               m_Array;
    protected       String response;
    protected       String keys;
    protected       String value;
    
    @Rule
    public TestName testName= new TestName();
  
	@Test
	public void test_002_CountryCode() throws IOException {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("countryCode");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "countryCode");		
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("\nTestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue: " + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);

	}
	
	@Test
	public void test_003_ActivateUrl() {

		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.activateUrl");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.activateUrl");	
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue: " + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_005_GoogleDFPKeys() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.ads.dfpInstanceId");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.ads.dfpInstanceId");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue: " + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_006_IndexExchangeEn() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.ads.headerBidding.en");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.ads.headerBidding.en");	
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue: " + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_007_IndexExchangeFr() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.ads.headerBidding.fr");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.ads.headerBidding.fr");		
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue: " + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);	

	}
	
	@Test
	public void test_008_Affiliates_AmazonEnabled() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.affiliates.amazon.enabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.affiliates.amazon.enabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue: " + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_009_Affiliates_AmazonId() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.affiliates.amazon.id");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.affiliates.amazon.id");		
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue: " + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_010_Affiliates_GoogleEnabled() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.affiliates.google.enabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.affiliates.google.enabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue: " + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_011_Affiliates_GoogleId() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.affiliates.google.id");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.affiliates.google.id");		
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_012_Affiliates_iTunesEnabled() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.affiliates.itunes.enabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.affiliates.itunes.enabled");	
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_013_Affiliates_iTunesId() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.affiliates.itunes.id");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.affiliates.itunes.id");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_014_testAMPApiUrl() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.apiUrl");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.apiUrl");		
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_016_testAndroidAutoClientName() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.autoConfig.auto.[0].client");
		Object jsonValue = Utils.getJsonValueForSpecificTestKey(jsonObject, "config.autoConfig.auto.[0].client", 0, "client");		
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_017_testAndroidAutoFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.autoConfig.auto.[0].enable");
		Object jsonValue = Utils.getJsonValueForSpecificTestKey(jsonObject, "config.autoConfig.auto.[0].enable", 0, "enable");		
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_018_testAndroidAutoHostName() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.autoConfig.auto.[0].hostName");
		Object jsonValue = Utils.getJsonValueForSpecificTestKey(jsonObject, "config.autoConfig.auto.[0].hostName", 0, "hostName");		
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_019_testAndroidAutoTerminalID() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.autoConfig.auto.[0].terminalId");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.autoConfig.auto.[0].terminalId");	
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		//Object jsonValue = Utils.getJsonValueForSpecificTestKey(jsonObject, "config.autoConfig.auto.[0].terminalId", 0, "terminalId");		
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_020_testFordClientName() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.autoConfig.auto.[1].client");
		Object jsonValue = Utils.getJsonValueForSpecificTestKey(jsonObject, "config.autoConfig.auto.[1].client", 1, "client");	
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}

	@Test
	public void test_021_testWazeClientName() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.autoConfig.auto.[1].client");
		Object jsonValue = Utils.getJsonValueForSpecificTestKey(jsonObject, "config.autoConfig.auto.[2].client", 2, "client");	
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_022_testFordFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.autoConfig.auto.[1].enable");
		Object jsonValue = Utils.getJsonValueForSpecificTestKey(jsonObject, "config.autoConfig.auto.[1].enable", 1, "enable");	
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_023_testWazeFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.autoConfig.auto.[1].enable");
		Object jsonValue = Utils.getJsonValueForSpecificTestKey(jsonObject, "config.autoConfig.auto.[2].enable", 2, "enable");	
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_024_testFordHostName() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.autoConfig.auto.[1].hostName");
		Object jsonValue = Utils.getJsonValueForSpecificTestKey(jsonObject, "config.autoConfig.auto.[1].hostName", 1, "hostname");	
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_025_testWazeHostName() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.autoConfig.auto.[2].hostName");
		Object jsonValue = Utils.getJsonValueForSpecificTestKey(jsonObject, "config.autoConfig.auto.[2].hostName", 2, "hostname");	
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_026_testFordTerminalID() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.autoConfig.auto.[1].terminalId");
		Object jsonValue = Utils.getJsonValueForSpecificTestKey(jsonObject, "config.autoConfig.auto.[1].terminalId", 1, "terminalId");	
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_027_testWazeTerminalID() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.autoConfig.auto.[1].terminalId");
		Object jsonValue = Utils.getJsonValueForSpecificTestKey(jsonObject, "config.autoConfig.auto.[2].terminalId", 2, "terminalId");	
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_028_testBellMobilityAuthorization() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.bellMobility.authorization");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.bellMobility.authorization");		
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_029_testBellMobilityCacheDateLimit() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.bellMobility.cacheDateLimitDays");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.bellMobility.cacheDateLimitDays");	
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue: " + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_030_testBellMobilityDecisionAPIHost() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.bellMobility.decisionApiHost");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.bellMobility.decisionApiHost");	
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_031_testBellMobilityDecisionAPIKey() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.bellMobility.decisionApiSubIdKey");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.bellMobility.decisionApiSubIdKey");		
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_032_testBellMobilityLegalAPIHost() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.bellMobility.legalCopyApiHost");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.bellMobility.legalCopyApiHost");	
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_033_testCarPlayFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.carPlay.enabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.carPlay.enabled");		
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_034_testCarPlayHostName() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.carPlay.hostName");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.carPlay.hostName");	
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_035_testCarPlayArtistRadioFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.carPlay.isArtistRadioStationsEnabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.carPlay.isArtistRadioStationsEnabled");	
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_036_testCarPlayForYouFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.carPlay.isForYouTabEnabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.carPlay.isForYouTabEnabled");	
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_037_testCarPlayLiveRadioFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.carPlay.isLiveStationsEnabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.carPlay.isLiveStationsEnabled");	
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_038_testCarPlayPodcastFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.carPlay.isPodcastsEnabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.carPlay.isPodcastsEnabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_039_testCarPlayTerminalID() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.carPlay.terminalId");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.carPlay.terminalId");	
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_040_DefaultLiveCityID() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.defaultLiveCityId");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.defaultLiveCityId");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	}
	
	@Test
	public void test_041_DefaultLiveCityName() {

		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.defaultLiveCityName");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.defaultLiveCityName");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_042_DefaultLiveCountryAbbr() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.defaultLiveCountryAbbr");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.defaultLiveCountryAbbr");
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	}
	
	@Test
	public void test_043_DefaultLiveCountryID() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.defaultLiveCountryId");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.defaultLiveCountryId");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	}
	
	@Test
	public void test_044_DefaultLiveCountyrName() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.defaultLiveCountryName");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.defaultLiveCountryName");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	}
	
	@Test
	public void test_045_DefaultLiveMarketID() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.defaultLiveMarketId");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.defaultLiveMarketId");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	}
	
	@Test
	public void test_046_DefaultLiveMarketName() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.defaultLiveMarketName");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.defaultLiveMarketName");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	}
	
	
	@Test
	public void test_047_DefaultLiveStateAbbr() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.defaultLiveStateAbbr");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.defaultLiveStateAbbr");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	}
	
	@Test
	public void test_048_DefaultLiveStateID() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.defaultLiveStateId");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.defaultLiveStateId");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	}
	
	@Test
	public void test_049_DefaultLiveStateName() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.defaultLiveStateName");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.defaultLiveStateName");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	}
	
	@Test
	public void test_050_DefaultZipCode() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.defaultZip");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.defaultZip");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	}
	
	@Test
	public void test_051_AuthenticationEmailOptin() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.emailUpdatesDefaultUnchecked");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.emailUpdatesDefaultUnchecked");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	}
	
	@Test
	public void test_052_PromotionAllAccessPreview() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.featureFlags.allAccessPreview");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.featureFlags.allAccessPreview");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	}
	
	@Test
	public void test_053_CustomRadioFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.featureFlags.customradioEnabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.featureFlags.customradioEnabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	}
	
	@Test
	public void test_054_ExoPlayerFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.featureFlags.exoLivePlayer");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.featureFlags.exoLivePlayer");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	}
	
	@Test
	public void test_055_Gracenote() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.featureFlags.gracenote");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.featureFlags.gracenote");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	}
	
	@Test
	public void test_056_LiveRadioCountryNavigation() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.featureFlags.liveRadioCountryNav");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.featureFlags.liveRadioCountryNav");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	}
	
	@Test
	public void test_057_MixTapeInForYouFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.featureFlags.mixtapeInForYou");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.featureFlags.mixtapeInForYou");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	}
	
	@Test
	public void test_058_OnDemandFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.featureFlags.ondemand");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.featureFlags.ondemand");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	}

	@Test
	public void test_059_PlaylistRadioAds() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.featureFlags.playlistRadioAds");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.featureFlags.playlistRadioAds");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	}
	
	@Test
	public void test_060_PlaylistRadioFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.featureFlags.playlistRadioFlag");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.featureFlags.playlistRadioFlag");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	}
	
	
	@Test
	public void test_061_PodcastPrerollAds() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.featureFlags.podcastPreRollAds");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.featureFlags.podcastPreRollAds");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	}
	
	//Excel lines 62 and 63
	@Test
	public void test_062_UserQRCodeFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.featureFlags.qrCode");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.featureFlags.qrCode");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
	
	}
	
	@Test
	public void test_064_ScanFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.featureFlags.scanEnabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.ford.enabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	//Excel lines 67 and 68
	@Test
	public void test_067_68_FordArtistsFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.ford.isArtistRadioStationsEnabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.ford.isArtistRadioStationsEnabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);

	}
	
	//Excel lines 69 and 70
	@Test
	public void test_069_70_FordForYouFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.ford.isForYouTabEnabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.ford.isForYouTabEnabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);

	}
	
	//Excel lines 71 and 72
	@Test
	public void test_071_72_FordLiveRadioFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.ford.isLiveStationsEnabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.ford.isLiveStationsEnabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);

	}
	
	//Excel lines 73 and 74
	@Test
	public void test_073_74_FordPlaylistsFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.ford.isPlaylistsEnabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.ford.isPlaylistsEnabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	}
	
	//Excel lines 75 and 76
	@Test
	public void test_075_76_FordPodcastsFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.ford.isPodcastsEnabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.ford.isPodcastsEnabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_077_78_FordTerminalID() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.ford.terminalId");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.ford.terminalId");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_079_ImageURL() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.imgUrl");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.imgUrl");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_081_NavTabForYouFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.navTabs.forYou.enabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.navTabs.forYou.enabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	}
	
	@Test
	public void test_082_NavTabForYouFeatured() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.navTabs.forYou.featured");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.navTabs.forYou.featured");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	}
	
	@Test
	public void test_083_LibraryFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.navTabs.library.enabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.navTabs.library.enabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	}
	
	@Test
	public void test_084_LibraryFeatured() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.navTabs.library.featured");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.navTabs.library.featured");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	}
	
	@Test
	public void test_085_PlaylistFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.navTabs.playlist.enabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.navTabs.playlist.enabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	}
	
	@Test
	public void test_086_PlaylistFeatured() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.navTabs.playlist.featured");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.navTabs.playlist.featured");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	}
	
	@Test
	public void test_087_PodcastFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.navTabs.podcast.enabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.navTabs.podcast.enabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	}
	
	@Test
	public void test_088_PodcastFeatured() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.navTabs.podcast.featured");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.navTabs.podcast.featured");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	}
	
	@Test
	public void test_089_RadioFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.navTabs.radio.enabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.navTabs.radio.enabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	}
	
	@Test
	public void test_090_RadioFeatured() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.navTabs.radio.featured");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.navTabs.radio.featured");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	}
	
	@Test
	public void test_091_AmazonClientName() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.platformOverrideConfig.platform.[0].client");
		//Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.platformOverrideConfig.platform.[0].client");
		Object jsonValue = Utils.getJsonValueForSpecificTestKey(jsonObject, "config.platformOverrideConfig.platform.[0].client", 0, "client");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	}
	
	@Test
	public void test_092_AmazonFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.platformOverrideConfig.platform.[0].enable");
		//Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.platformOverrideConfig.platform.[0].enable");
		Object jsonValue = Utils.getJsonValueForSpecificTestKey(jsonObject, "config.platformOverrideConfig.platform.[0].enable", 0, "enable");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	
	}
	
	@Test
	public void test_093_AmazonHostName() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.platformOverrideConfig.platform.[0].hostName");
		//Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.platformOverrideConfig.platform.[0].hostName");
		Object jsonValue = Utils.getJsonValueForSpecificTestKey(jsonObject, "config.platformOverrideConfig.platform.[0].hostName", 0, "hostName");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	}
	
	@Test
	public void test_094_AmazonTerminalID() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.platformOverrideConfig.platform.[0].terminalId");
		//Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.platformOverrideConfig.platform.[1].terminalId");
		Object jsonValue = Utils.getJsonValueForSpecificTestKey(jsonObject, "config.platformOverrideConfig.platform.[0].terminalId", 0, "terminalId");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	}
	
	@Test
	public void test_095_Wear2ClientName() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.platformOverrideConfig.platform.[1].client");
		//Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.platformOverrideConfig.platform.[1].client");
		Object jsonValue = Utils.getJsonValueForSpecificTestKey(jsonObject, "config.platformOverrideConfig.platform.[1].client", 1, "client");
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	}
	
	@Test
	public void test_096_Wear2Flag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.platformOverrideConfig.platform.[1].enable");
		//Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.platformOverrideConfig.platform.[1].enable");
		Object jsonValue = Utils.getJsonValueForSpecificTestKey(jsonObject, "config.platformOverrideConfig.platform.[1].enable", 1, "enable");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	
	}
	
	@Test
	public void test_097_Wear2HostName() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.platformOverrideConfig.platform.[1].hostName");
		//Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.platformOverrideConfig.platform.[1].hostName");
		Object jsonValue = Utils.getJsonValueForSpecificTestKey(jsonObject, "config.platformOverrideConfig.platform.[1].hostName", 1, "hostName");
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	}
	
	@Test
	public void test_098_Wear2TerminalID() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.platformOverrideConfig.platform.[1].terminalId");
		Object jsonValue = Utils.getJsonValueForSpecificTestKey(jsonObject, "config.platformOverrideConfig.platform.[1].terminalId", 1, "terminalId");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_099_PlaylistCampaignID() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.playlists.campaignId");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.playlists.campaignId");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_100_ContentAPI() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.radioEdit.contentApi");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.radioEdit.contentApi");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_102_GraphQLAPI() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.radioEdit.graphQlApi");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.radioEdit.graphQlApi");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_104_LeadsAPI() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.radioEdit.leadsApi");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.radioEdit.leadsApi");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_106_WebGraphQLAPI() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.radioEdit.webGraphQlApi");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.radioEdit.webGraphQlApi");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_108_RecsCampaignID() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.recs.campaignId");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.recs.campaignId");
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_109_RecsTemplate() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.recs.template");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.recs.template");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_110_AuthenticationGenderRequirement() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.registrationOptions.genderAllowUnselected");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.registrationOptions.genderAllowUnselected");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_111_AuthenticationGenders() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.registrationOptions.genders");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.registrationOptions.genders");
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_112_AuthenticationGigya() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.registrationOptions.gigya");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.registrationOptions.gigya");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_113_AuthenticationOAuths() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.registrationOptions.oauths");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.registrationOptions.oauths");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_114_AuthenticationUsePostal() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.registrationOptions.usePostal");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.registrationOptions.usePostal");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_115_AuthenticationZipLength() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.registrationOptions.zipCodeLength");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.registrationOptions.zipCodeLength");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_116_AuthenticationZipKeyboard() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.registrationOptions.zipKeyboard");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.registrationOptions.zipKeyboard");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_117_AuthenticationZipRegex() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.registrationOptions.zipRegex");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.registrationOptions.zipRegex");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_118_AdobeFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.adobe.enabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.adobe.enabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_120_AdobeIglooFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.adobe.enabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.adobe.enabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_121_AdobeLegacy() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.adobeAnalytics.account");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.adobeAnalytics.account");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_123_AdobeDTM() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.adobeAnalytics.dtmUrl");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.adobeAnalytics.dtmUrl");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	//Excel lines 125, 126, 127, 128, 129, 130
	@Test
	public void test_125_AdswizzCompanionZoneIdDev() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.adswizz.companionZoneId");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.adswizz.companionZoneId");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	//Excel lines 131 - 136
	@Test
	public void test_131__AdswizzEnabled() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.adswizz.enabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.adswizz.enabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	//Excel lines 137 - 140
	@Test
	public void test_137_AdswizzInstallationID() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.adswizz.installationId");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.adswizz.installationId");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_141_AdswizzPlayerID() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.adswizz.playerId");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.adswizz.playerId");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_145_AdswizzServer() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.adswizz.server");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.adswizz.server");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_152_AdswizzZoneID() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.adswizz.zoneId");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.adswizz.zoneId");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_157_AppboyAppID() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.appBoy.appKey");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.appBoy.appKey");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_163_AppboyDomain() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.appBoy.domain");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.appBoy.domain");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	

	@Test
	public void test_164_AppboyAppGroupID() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.appBoy.groupKey");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.appBoy.groupKey");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_170_AppboyStreamEventDelay() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.appBoy.streamEventDelayMillis");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.appBoy.streamEventDelayMillis");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_171_ComScoreCustomerID() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.comScore.customerId");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.comScore.customerId");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_172_ComScoreCustomerFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.comScore.enabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.comScore.enabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_173_ComScorePublisherID() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.comScore.publisherSecret");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.comScore.publisherSecret");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_174_175_CubeiqKey() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.cuebiq.appKey");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.cuebiq.appKey");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
	}
	
	@Test
	public void test_176_CubeiqFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.cuebiq.enabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.cuebiq.enabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_178_FirebaseFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.firebase.enabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.firebase.enabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_179_FirebaseSenderID() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.firebase.senderId");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.firebase.senderId");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_180_FirebaseProjectID() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.firebase.projectId");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.firebase.projectId");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_181_FirebaseApplicationID() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.firebase.applicationId");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.firebase.applicationId");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_182_FirebaseAPIKey() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.firebase.apiKey");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.firebase.apiKey");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_183_FirebaseDatabaseURL() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.firebase.databaseUrl");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.firebase.databaseUrl");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_184_FirebaseStorageBucket() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.firebase.storageBucket");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.firebase.storageBucket");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_185_GigyaAPIKey() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.gigya.apiKey");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.gigya.apiKey");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_187_GigyaEmailVerificationFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.gigya.emailVerificationEnabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.gigya.emailVerificationEnabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_189_GigyaFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.gigya.enabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.gigya.enabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_190_GigyaFacebookAppID() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.gigya.facebookAppId");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.gigya.facebookAppId");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_191_GigyaFacebookFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.gigya.facebookEnabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.gigya.facebookEnabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_192_GigyaGoogleFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.gigya.googleEnabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.gigya.googleEnabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_193_GigyaLinkedInFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.gigya.linkedinEnabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.gigya.linkedinEnabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_194_GigyaTwitterFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.gigya.twitterEnabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.gigya.twitterEnabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_195_GoogleAnalyticsAppKey() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.googleAnalytics.appKey");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.googleAnalytics.appKey");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	
	@Test
	public void test_197_GoogleCastAppKey() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.googleCast.appKey");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.googleCast.appKey");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_199_GoogleCastFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.googleCast.enabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.googleCast.enabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_201_GoogleCastHostName() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.googleCast.hostName");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.googleCast.hostName");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_204_GooglePlusFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.googlePlus.enabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.googlePlus.enabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_206_GracenoteFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.gracenote.enabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.gracenote.enabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_207_GracenoteEndBuffer() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.gracenote.endBuffer");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.gracenote.endBuffer");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_208_GracenoteInterval() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.gracenote.interval_in_sec");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.gracenote.interval_in_sec");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_209_IglooFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.igloo.enabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.igloo.enabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_211_KruxID_Dev() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.krux.id.dev");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.krux.id.dev");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_212_KruxIDEN() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.krux.id.en");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.krux.id.en");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_214_KruxIDFR() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.krux.id.fr");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.krux.id.fr");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_216_KruxConfIdEN() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.krux.lang.en.confId");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.krux.lang.en.confId");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_217_KruxAppEN() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.krux.lang.en.openApp");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.krux.lang.en.openApp");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_220_KruxConfIdFR() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.krux.lang.fr.confId");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.krux.lang.fr.confId");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_221_KruxAppFR() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.krux.lang.fr.openApp");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.krux.lang.fr.openApp");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_224_LocalyticsID() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.localytics.appKey");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.localytics.appKey");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_226_228_LotameClientID() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.lotame.clientId");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.lotame.clientId");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_229_LotameFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.lotame.enabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.lotame.enabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_230_LotamePublisherID() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.lotame.publisherId");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.lotame.publisherId");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_231_Lotametp() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.lotame.tp");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.lotame.tp");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_232_MagicStichFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.MagicStitch.enabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.MagicStitch.enabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_233_MagicStichAPIEndPoint() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.MagicStitch.MagicStitch_API_ENDPOINT");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.MagicStitch.MagicStitch_API_ENDPOINT");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_234_MagicStichAPIKey() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.MagicStitch.MagicStitch_API_KEY");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.MagicStitch.MagicStitch_API_KEY");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}	
	
	@Test
	public void test_235_MoatFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.moat.enabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.moat.enabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_236_MoatPartnerCode() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.moat.partnerCode");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.moat.partnerCode");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_239_NielsenAPN() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.nielsen.apn");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.nielsen.apn");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_241_NielsenAppID() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.nielsen.appId");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.nielsen.appId");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_247_NielsenAppName() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.nielsen.appName");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.nielsen.appName");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_253_NielsenAppVersion() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.nielsen.apv");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.nielsen.apv");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_255_NielsenFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.nielsen.enabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.nielsen.enabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_258_SimpleReachAPIKey() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.simpleReach.apiKey");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.simpleReach.apiKey");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_260_SimpleReachFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.simpleReach.enabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.simpleReach.enabled");
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_261_SonosCastAPIKey() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.sonos.apiKey");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.sonos.apiKey");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_262_SonosFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.sonos.enabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.sonos.enabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_263_SonosCastHostname() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.sonos.hostName");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.sonos.hostName");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_264_SonosCastAppKey() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.sonosCast.appKey");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.sonosCast.appKey");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_265_SonosCastCloudQueuePath() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.sonosCast.cloudQueuePath");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.sonosCast.cloudQueuePath");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_266_SonosCastFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.sonosCast.enabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.sonosCast.enabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_267_TritonCustomID() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.triton.custom");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.triton.custom");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_269_TritonDesktopCustomID() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.triton.desktop.custom");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.triton.desktop.custom");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_270_TritonDesktopPodcastID() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.triton.desktop.talk");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.triton.desktop.talk");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_271_TritonFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.triton.enabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.triton.enabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_272_TritonMobileCustomID() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.triton.mobile.custom");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.triton.mobile.custom");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_273_TritonMobilePodcastID() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.triton.mobile.talk");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.triton.mobile.talk");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_274_275_TritonPodcastID() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.triton.podcast");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.triton.podcast");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_276_TritonSID() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.triton.sid");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.triton.sid");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_277_TuneID() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.tune.advertiserId");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.tune.advertiserId");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_278_TuneKey() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.tune.conversionKey");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.tune.conversionKey");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_279_TuneFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.tune.enabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.tune.enabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_280_ZenDeskFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.sdks.zendesk.enabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.sdks.zendesk.enabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_281_SocialFacebookFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.socials.facebook.enabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.socials.facebook.enabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_282_SocialFacebookUsername() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.socials.facebook.name");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.socials.facebook.name");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_283_SocialGoogleFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.socials.google.enabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.socials.google.enabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_284_SocialGoogleUsername() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.socials.google.name");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.socials.google.name");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_285_SocialInstagramFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.socials.instagram.enabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.socials.instagram.enabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_286_SocialInstagramUsername() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.socials.instagram.name");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.socials.instagram.name");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_287_SocialLinkedInFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.socials.linkedin.enabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.socials.linkedin.enabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_288_SocialLinkedInUsername() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.socials.linkedin.name");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.socials.linkedin.name");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_289_SocialSnapChatFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.socials.snapchat.enabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.socials.snapchat.enabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_290_SocialSnapChatUsername() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.socials.snapchat.name");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.socials.snapchat.name");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_291_SocialTumblerFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.socials.tumblr.enabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.socials.tumblr.enabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_292_SocialTumblerUsername() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.socials.tumblr.name");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.socials.tumblr.name");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_293_SocialTwitterFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.socials.twitter.enabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.socials.twitter.enabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_294_SocialTwitterUsername() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.socials.twitter.name");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.socials.twitter.name");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	
	@Test
	public void test_295_SocialYouTubeFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.socials.youtube.enabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.socials.youtube.enabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_296_SocialYouTubeUsername() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.socials.youtube.name");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.socials.youtube.name");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_297_TerminalID() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.terminalId");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.terminalId");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_300_TerritoryCode() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.territoryCode");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.territoryCode");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_301_About() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.about");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.about");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_302_Advertise() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.advertise");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.advertise");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_303_AppsAuto() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.apps.auto");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.apps.auto");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_304_AppsHome() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.apps.home");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.apps.home");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_305_AppsMain() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.apps.main");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.apps.main");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_306_AppsMobile() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.apps.mobile");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.apps.mobile");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_307_AppsWearables() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.apps.wear");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.apps.wear");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_308_AutoDownload() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.autoDownload");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.autoDownload");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_310_Blog() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.blog");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.blog");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_311_BrandGuidelines() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.brand");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.brand");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_312_ContestingGuidelines() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.contestrules");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.contestrules");
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_313_Contests() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.contests");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.contests");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_314_CustomRadioURL() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.customradio");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.customradio");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_315_Events() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.events");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.events");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_316_Features() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.features");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.features");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_317_Genres() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.genres");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.genres");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_318_HelpEN() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.help.en");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.help.es");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Valuen " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_321_HelpES() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.help.es");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.help.es");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_324_HelpFR() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.help.fr");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.help.fr");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_327_HelpResetPassword() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.helpResettingPassword");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.helpResettingPassword");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_328_HelpSkipLimit() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.helpSkipLimit");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.helpSkipLimit");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_329_SocialSignIn() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.helpSocialSignIn");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.helpSocialSignIn");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_330_VerifyEmail() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.helpVerifyingEmail");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.helpVerifyingEmail");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue: " + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_331_HolidayLogo() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.holidayHat");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.holidayHat");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue: " + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_337_Home() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.home");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.home");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue: " + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_338_Igloo() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.iglooUrl");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.iglooUrl");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue: " + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_340_Jobs() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.jobs");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.jobs");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue: " + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_341_LiveRadio() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.liveradio");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.liveradio");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue: " + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_342_News() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.news");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.news");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue: " + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_343_Photos() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.photos");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.photos");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue: " + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_344_Playlists() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.playlists");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.playlists");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_345_Podcasts() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.podcasts");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.podcasts");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_346_PrivacyEN() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.privacy.en");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.privacy.en");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_347_PrivacyES() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.privacy.es");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.privacy.es");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_348_PrivacyFR() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.privacy.fr");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.privacy.fr");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_349_QRCodeModalTermsEN() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.qrCodeModalTos.en");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.qrCodeModalTos.en");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_350_QRCodeModalTermsES() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.qrCodeModalTos.es");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.qrCodeModalTos.es");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_351_RadioEditMediaServer() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.radioEditMediaServer");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.radioEditMediaServer");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_352_RadioEditURL() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.radioEditUrl");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.radioEditUrl");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue: " + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_354_TermsEN() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.tos.en");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.tos.en");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue: " + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_355_TermsES() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.tos.es");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.tos.es");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue: " + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_356_TermsFR() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.urls.tos.fr");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.urls.tos.fr");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue: " + jsonValue);
	}
	
	@Test
	public void test_357_WazeFlag() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.waze.enabled");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.waze.enabled");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue: " + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_358_WazeHostname() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.waze.hostName");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.waze.hostName");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue: " + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
	
	@Test
	public void test_359_WazeTerminalID() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.waze.terminalID");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.waze.terminalID");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue: " + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}

	@Test
	public void test_360_AdEnvironment() {
		
		Object excelKeyValue = Utils.getKeyValueFromExcelForKey("config.web_ad_env");
		Object jsonValue = Utils.getJsonValueForKey(jsonObject, "config.web_ad_env");
		if (excelKeyValue.equals("n/a")) {
			jsonValue = "n/a";
		}
		System.out.println("TestName: " + testName.getMethodName() + ", Excel Value: " + excelKeyValue + ", JSONValue:" + jsonValue);
		Assert.assertEquals(excelKeyValue, jsonValue);
		
	}
}


