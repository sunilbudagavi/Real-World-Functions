package HttpIntermidiate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Catchget {
	public static void main(String[] args) {
		try{
			URL url = new URL("https://jsonplaceholder.typicode.com/posts/1");
			HttpURLConnection connection = (HttpURLConnection)url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("If-Modifed-Since", "Sat, 30 May 2021 19:43:31 GMT");
			
			int resposeCode = connection.getResponseCode();
			if(resposeCode==connection.HTTP_NOT_MODIFIED) {
				System.out.println("Didn't modefined anything.");
			}
			else {
				BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				
				String input;
				StringBuilder content = new StringBuilder();
				while((input=reader.readLine()) != null) {
					content.append(input);
				}
				reader.close();
				System.out.println("Fresh Data: "+content.toString());
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
