package HttpIntermidiate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class FetchW3schools {
	public static void main(String[] args) {
		try{
			URL url = new URL("https://www.w3schools.com/xml/simple.xml");
			HttpURLConnection connection = (HttpURLConnection)url.openConnection();
			connection.setRequestMethod("GET");
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String input;
			StringBuilder response =new StringBuilder();
			while((input=reader.readLine()) != null){
				response.append(input);
			}
			reader.close();
			System.out.println(connection.getResponseCode());
			System.out.println("XML FIle: "+response.toString());

		}
		catch(Exception e) {
			e.printStackTrace();

		}
	}
}