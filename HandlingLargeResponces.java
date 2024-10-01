package HttpIntermidiate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HandlingLargeResponces {

	public static void main(String[] args) {
		try{
			URL url = new URL("https://www.wikipedia.org/");
			HttpURLConnection connection = (HttpURLConnection)url.openConnection();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String input;
			StringBuilder content = new StringBuilder();
			while((input=reader.readLine()) != null) {
				content.append(input);
			}
			reader.close();
			
			System.out.println("Content: "+content);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
