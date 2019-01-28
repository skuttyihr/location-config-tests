package location.config.tests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections4.map.MultiValueMap;
import org.json.simple.JSONArray;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

/**
 * This test runs through the google doc rows and compares each row key value to the json value returned from the location config call.
 * 
 * @author skutty
 */

public class PrintOutValuesToExcel extends BaseTest {
	
	String name = "";
	protected       ArrayList<HashMap<String, String>>    decodedArray;
    protected       HashMap<String, String> decodedMap;
    protected       Iterator<String>        it;
    protected       JSONArray               m_Array;
    protected       String response;
    protected       String keys;
    protected       String value;
    
    @Rule
    public ErrorCollector collector = new ErrorCollector();
    
  
    @Test
    public void getExcelAndJSONValues_WriteToExcel() throws IOException { 
    	
        	Assert.assertFalse(Utils.compareValuesWriteToExcel(jsonObject));
        	
    }
    		    
}
