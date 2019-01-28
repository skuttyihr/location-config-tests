 package location.config.tests;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.DriveScopes;
import com.google.api.services.drive.model.File;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.gdata.client.GoogleService;
import com.google.gdata.client.spreadsheet.SpreadsheetService;
import com.google.gdata.data.spreadsheet.SpreadsheetEntry;
import com.google.gdata.data.spreadsheet.SpreadsheetFeed;
import com.google.api.services.drive.model.FileList;


/**
 * Credits : From the guide for Google Sheets > api4 https://developers.google.com/sheets/api/quickstart/java 
 *
 * @author 
 */

public class GoogleDocDownload {

  private static final String APPLICATION_NAME = "https://docs.google.com/spreadsheets/d/1aVYNMjY-Y9COXBICaI9X-RX9MozqxwPEqMbyGLAPuqM/edit#gid=0";
  private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
  private static final String TOKENS_DIRECTORY_PATH = "tokens";

  /**
   * Global instance of the scopes required by this quickstart.
   * If modifying these scopes, delete your previously saved tokens/ folder.
   */
  private static final List<String> SCOPES = Arrays.asList(DriveScopes.DRIVE);
  private static final String CREDENTIALS_FILE_PATH = "src/main/resources/credentials.json";

  /**
   * Creates an authorized Credential object.
   * @param HTTP_TRANSPORT The network HTTP Transport.
   * @return An authorized Credential object.
   * @throws IOException If the credentials.json file cannot be found.
   */
  private static final String SPREADSHEETS_FEED = "https://spreadsheets.google.com/feeds/spreadsheets/private/full";
  private static final java.io.File DATA_STORE_DIR = new java.io.File(System.getProperty("user.home"),
          ".credentials/drive-java-quickstart.json");
  private static final String CLIENT_SECRETS = "src/main/resources/raw/client_secret.json";
  private static final String DRIVE_EXCEL_PATH = "src/main/resources/";
  private static FileDataStoreFactory dataStoreFactory;
  private static HttpTransport HTTP_TRANSPORT;
  private static GoogleClientSecrets clientSecrets;
  private static FileDataStoreFactory DATA_STORE_FACTORY;

  static {
	  try {
		  
		  HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
		  DATA_STORE_FACTORY = new FileDataStoreFactory(DATA_STORE_DIR);
		  
	  } catch (Throwable t) {
		  
		  t.printStackTrace();
		  System.exit(1);
		  
	  }
  }

  /** Authorizes the installed application to access user's protected data. */
  private static Credential authorize() throws Exception {

	  Reader clientSecretReader = new InputStreamReader(new FileInputStream(CLIENT_SECRETS));
	  GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, clientSecretReader);

	  if (clientSecrets.getDetails().getClientId().startsWith("Enter")) {
		  System.out.println("Enter Client ID and Secret from https://code.google.com/apis/console/ "
				  + "into client_secrets.json");
		  System.exit(1);
	  }
    // set up authorization code flow
    GoogleAuthorizationCodeFlow flow =
        new GoogleAuthorizationCodeFlow.Builder(HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)
            .setDataStoreFactory(DATA_STORE_FACTORY).build();
    AuthorizationCodeInstalledApp app =
        new AuthorizationCodeInstalledApp(flow, new LocalServerReceiver());
    return app.authorize("user");
    
  }

  
  /**
   * Creates an authorized Credential object.
   * @param HTTP_TRANSPORT The network HTTP Transport.
   * @return An authorized Credential object.
   * @throws IOException If the credentials.json file cannot be found.
   */
  
  private static Credential getCredentials(final NetHttpTransport HTTP_TRANSPORT) throws Exception {
	  //Load client secrets
	  Reader clientSecretReader = new InputStreamReader(new FileInputStream(CLIENT_SECRETS));
	  GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, clientSecretReader);

	  // Build flow and trigger user authorization request.
	  GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
			  HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)
			  .setDataStoreFactory(DATA_STORE_FACTORY)
			  .setAccessType("offline")
			  .build();
	  LocalServerReceiver receiver = new LocalServerReceiver.Builder().setPort(8888).build();
	  return new AuthorizationCodeInstalledApp(flow, receiver).authorize("user");

  }

  private static Drive getDriveService() throws Exception {
	  
	  Credential credential = authorize();
	  return new Drive.Builder(HTTP_TRANSPORT, JSON_FACTORY, credential)
			  .setApplicationName(APPLICATION_NAME).build();
	  
  }

  static void downloadGoogleDocument() { 
	  
	  try {
		  
		  final NetHttpTransport HTTP_TRANSP = GoogleNetHttpTransport.newTrustedTransport();
		  Drive service = getDriveService();

		  //Credential credential = authorize();
		  Credential credential = getCredentials(HTTP_TRANSP);
		  GoogleService googleService = new SpreadsheetService(APPLICATION_NAME);
		  googleService.setOAuth2Credentials(credential);
		  URL SPREADSHEET_FEED_URL = new URL(SPREADSHEETS_FEED);
		  
		  SpreadsheetFeed feed = googleService.getFeed(SPREADSHEET_FEED_URL, SpreadsheetFeed.class);
		  List<SpreadsheetEntry> spreadsheets = feed.getEntries();
		  for (SpreadsheetEntry spreadsheet : spreadsheets) {
			 
			  String fileId = "1aVYNMjY-Y9COXBICaI9X-RX9MozqxwPEqMbyGLAPuqM";
			  OutputStream outputStream = new FileOutputStream(new java.io.File(DRIVE_EXCEL_PATH + "iHeartRadioLocalization.xlsx"));
			  
			  try {
				  
				  File file = service.files().get(fileId).execute();
				  service.files().export(fileId, "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")
				  .executeMediaAndDownloadTo(outputStream);
				  
			  } catch (IOException e) {
				  
				  System.out.println("An error occurred: " + e);
				  
			  }

			  // Print the names and IDs for up to 10 files.
			  FileList result = service.files().list().setPageSize(10).setFields("nextPageToken, files(id, name)").execute();
			  List<File> files = result.getFiles();
			 
		  }

		  String fileId = "1ZdR3L3qP4Bkq8noWLJHSr_iBau0DNT4Kli4SxNc2YEo";
		  OutputStream outputStream = new ByteArrayOutputStream();
		  return;
		  
	  }

	  catch (IOException e) {
		  
		  System.err.println(e.getMessage());
		  
	  }

	  catch (Throwable t) {
		  
		  t.printStackTrace();
		  
	  }

	  System.exit(1);
	  
  }
  
}
