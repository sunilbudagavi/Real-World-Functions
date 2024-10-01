//package HttpIntermidiate;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//
//public class ParsingTheData {
//	public static void main(String[] args) {
//		try{
//			URL url = new URL("https://jsonplaceholder.typicode.com/posts/1");
//			HttpURLConnection connection = (HttpURLConnection)url.openConnection();
//			connection.setRequestMethod("GET");
//			
//			int responsecode = connection.getResponseCode();
//			if(responsecode==connection.HTTP_OK) {
//				BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//				String input;
//				StringBuilder content = new StringBuilder();
//				
//				while((input=reader.readLine())!=null) {
//					content.append(input);
//				}
//				
////				Convert the repose to string
//				String jsonResponse = content.toString();
//				Gson gson = new Gson();
//				
//				Jso
//			}
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//}
