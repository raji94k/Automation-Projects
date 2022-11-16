package taskNov10;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class BrokenLinkORError {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//URL url = new URL("https://www.ikea.com/404");
		
		URL url = new URL("https://web.whatsapp.com/");
		HttpURLConnection con = (HttpURLConnection)url.openConnection();
		
		int code = con.getResponseCode();
		System.out.println(code);
		
		int msg = con.getResponseCode();
		System.out.println(msg);
		

	}

	
}
