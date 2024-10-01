package HttpIntermidiate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class Rederectionhttp {
	public static void main(String[] args) {
		try{
//			String redirect = URLEncoder.
			URL url = new URL("http://www.google.com");
			HttpURLConnection connection = (HttpURLConnection)url.openConnection();
			connection.setInstanceFollowRedirects(true);
			connection.setRequestMethod("GET");
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String input;
			StringBuilder content = new StringBuilder();
			while((input=reader.readLine()) != null){
				content.append(input);
			}
			reader.close();
			System.out.println("Content: "+content.toString());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
