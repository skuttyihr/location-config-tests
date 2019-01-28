package location.config.tests;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.commons.collections4.map.MultiValueMap;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONObject;
import location.config.tests.Utils;

/**
 * ReadExcelData.java - reads the filtered values from the Excel doc based on 1. Platform 2. Environment and 3. Country
 * eg. Platform: iOS; Environment: prod; Country: CA
 * 
 * @author skutty
 */

public class ReadWriteExcel {

	private static final String generatedExcelFile = "src/main/resources/iHeartRadioLocalization.xlsx";
	private static int keyColumnIndexInReadFile;
	private static int countryColumnIndexInReadFile;
	private static int platformColumnIndexInReadFile;
	private static int environmentColumnIndexInReadFile;
	private static String environmentColumnValueFromReadFile;
	private static String environmentColumnValueToBeReadFromFile;
	private static MultiValueMap<String, ?> map = new MultiValueMap();
	private static DataFormatter dataFormatter = new DataFormatter();
	private static String[] columns = {"Key", "Value in Excel", "Value in JSON", "Test Result"};
	

	/**
	 * This method reads key column and country column values from the excel file for rows filtered by platform, environment.
	 * 
	 * The read values are stored in a MultiValueMap.
	 * @return
	 * @throws IOException
	 */

	public MultiValueMap readExcel() throws IOException {

		//Gets the excel file, reads the headers, gets the columns, reads the values and stores in a MultiValueMap 

		File excel_file_path = new File(generatedExcelFile);
		FileInputStream fileObj = new FileInputStream(excel_file_path);
		XSSFWorkbook workbook = new XSSFWorkbook(fileObj);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		//get and set headers
		XSSFRow headerRow = sheet.getRow(0); // get first row
		setColumnIndices(headerRow); 
		
		//get the remaining values.
		setEnvironmentColumnValueToBeReadFromFile(); 
		return getColumnValues(sheet);	

	}

	/**
	 * This method gets the column index values for columns that need to be read from the excel file
	 * 
	 * Columns to be red: key, environment, platform, country (CA, US, AU, NZ, MX)
	 * 
	 * @param headerRow
	 */

	public void setColumnIndices(XSSFRow headerRow) {

		for (int k = 0; k < headerRow.getLastCellNum(); k++) { 
			
			if (dataFormatter.formatCellValue(headerRow.getCell(k)).equals("key")) {
				
				keyColumnIndexInReadFile = k;
				
			} else if (dataFormatter.formatCellValue(headerRow.getCell(k)).equals(Utils.COUNTRYCODE)) {
				
				countryColumnIndexInReadFile = k;
				
			} else if (dataFormatter.formatCellValue(headerRow.getCell(k)).equals("platform")) {
				
				platformColumnIndexInReadFile = k;
				
			} else if (dataFormatter.formatCellValue(headerRow.getCell(k)).equals("environment")) {
				
				environmentColumnIndexInReadFile = k;
				
			}
		}		
	}

	/**
	 * This method sets the Excel file's 'Environment' row value that needs to be read based
	 * on the properties file - hostname and environment from TestProperties.xml.
	 * eg. Read only rows that read prod or all
	 * 
	 * @return
	 */

	public String setEnvironmentColumnValueToBeReadFromFile() {
		
		if (Utils.HOSTNAME.equals("webapp")) {
			
			if (Utils.ENVIRONMENT.equals("prod")  || Utils.ENVIRONMENT.equals("master") ||  Utils.ENVIRONMENT.equals("beta")) {
				
				environmentColumnValueToBeReadFromFile = "prod";
				
			} else if (Utils.ENVIRONMENT.equals("stage")) {
				
				environmentColumnValueToBeReadFromFile = "stage";
				
			} else {
				
				environmentColumnValueToBeReadFromFile = "sandbox";
				
			}
		} else {
			
			if (Utils.ENVIRONMENT.equals("prod")) {
				
				environmentColumnValueToBeReadFromFile = "prod";
				
			} else if (Utils.ENVIRONMENT.equals("stage")) {
				
				environmentColumnValueToBeReadFromFile = "non-prod";
				
			}
		}

		return environmentColumnValueToBeReadFromFile;

	}

	/**
	 * This method iterates through all the rows in the excel sheet, gets the values for key and country and
	 * stores it in a MultiValueMap as a key value pair.
	 * 
	 * @param sheet
	 * @return a MultiValueMap with key value pairs for 'key' and 'value' from the whole excel sheet.
	 */

	@SuppressWarnings("deprecation")
	public MultiValueMap getColumnValues(XSSFSheet sheet) {

		int rowCount = sheet.getLastRowNum();
		System.out.println();

		for (int i = 1; i < rowCount + 1; i++) {

			XSSFRow row = sheet.getRow(i);

			String platformValueInReadFile = dataFormatter.formatCellValue(row.getCell(platformColumnIndexInReadFile));
			String environmentValueInReadFile = dataFormatter.formatCellValue(row.getCell(environmentColumnIndexInReadFile));
			String keyInExcel = Utils.trim(dataFormatter.formatCellValue(row.getCell(keyColumnIndexInReadFile)));
			String valueInExcel = Utils.trim(dataFormatter.formatCellValue(row.getCell(countryColumnIndexInReadFile)));

			if (Utils.HOSTNAME.equals("webapp")) {

				if ((platformValueInReadFile.equals("web") || platformValueInReadFile.equals("all"))
						&& (environmentValueInReadFile.equals("all") || environmentValueInReadFile.equals(environmentColumnValueToBeReadFromFile))) {
					
					//map.put(keyInExcel, valueInExcel + "\n");
					map.put(keyInExcel, valueInExcel);
					
				}

			} else if (Utils.HOSTNAME.equals("iphone.mobile")) {

				if ((platformValueInReadFile.equals("ios") || platformValueInReadFile.equals("all"))
						&& (environmentValueInReadFile.equals("all") || environmentValueInReadFile.equals(environmentColumnValueToBeReadFromFile))) {

					//map.put(keyInExcel, valueInExcel + "\n");
					map.put(keyInExcel, valueInExcel);

				}

			} else {

				if ((platformValueInReadFile.equals("android") || platformValueInReadFile.equals("all"))
						&& (environmentValueInReadFile.equals("all") || environmentValueInReadFile.equals(environmentColumnValueToBeReadFromFile))) {
					
					//map.put(keyInExcel, valueInExcel + "\n");
					map.put(keyInExcel, valueInExcel);

				}

			}
		}
		//map.put(Utils.buildTestURL().toString(), "");
		return map;
	}	
	

	private static Sheet createExcelSheet(Workbook workbook) {

		String sheetName = Utils.HOSTNAME + "-" + Utils.ENVIRONMENT + " Test";
		return workbook.createSheet(sheetName);

	}

	private static CellStyle setHeaderFont(Workbook workbook) {

		Font headerFont = workbook.createFont();
		headerFont.setBold(true);
		headerFont.setFontHeightInPoints((short) 14);
		headerFont.setColor(IndexedColors.BLUE.getIndex());

		// Create a CellStyle with the font
		CellStyle headerCellStyle = workbook.createCellStyle();
		headerCellStyle.setFont(headerFont);
		return headerCellStyle;

	}

	public static Workbook setUpWorkbook() {

		Workbook workbook = new XSSFWorkbook();
		return workbook;

	}

	public static Sheet setUpExcelFile(Workbook wkbook) {

		Sheet sheet = createExcelSheet(wkbook);
		CellStyle headerCellStyle = setHeaderFont(wkbook);
		setUpHeaderRow(sheet, headerCellStyle);

		return sheet;

	}

	private static void setUpHeaderRow(Sheet sheet, CellStyle headerCellStyle) {

		Row headerRow1 = sheet.createRow(0);
		headerRow1.createCell(0).setCellValue("URL Tested: " + Utils.trim(Utils.buildTestURL()));
		
		Row headerRow2 = sheet.createRow(1);
		// Create cells
		for(int i = 1; i < columns.length; i++) {
			
			Cell cell = headerRow2.createCell(i);
			cell.setCellValue(columns[i]);
			cell.setCellStyle(headerCellStyle);
			
		}

	}

	public static void writeToExcelFile(Workbook workbook, Sheet sheet) throws IOException {
		
		for(int i = 0; i < columns.length; i++) {
			
			sheet.autoSizeColumn(i);
			
		}

		// Write the output to a file
		FileOutputStream fileOut = new FileOutputStream(Utils.PLATFORM + "_" + Utils.CLIENTENVIRONMENT + "_" + Utils.VERSION + "_" + "locationConfigTests.xlsx");
		workbook.write(fileOut);
		fileOut.close();

		// Closing the workbook
		workbook.close();

	}
}
