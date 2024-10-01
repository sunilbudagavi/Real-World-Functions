package HttpIntermidiate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SetTimeLimit {
	public static void main(String[] args) {
		try{
			URL url = new URL("https://jsonplaceholder.typicode.com/posts");
			HttpURLConnection connection = (HttpURLConnection)url.openConnection();
			connection.setRequestMethod("GET");
			
			connection.setConnectTimeout(5000);
			connection.setReadTimeout(7000);
			
			String input;
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			StringBuilder content = new StringBuilder();
			while((input=reader.readLine())!=null) {
				content.append(input);
			}
			
			int resposeCode = connection.getResponseCode();
			System.out.println("COde: "+resposeCode);
			System.out.println(content.toString());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
