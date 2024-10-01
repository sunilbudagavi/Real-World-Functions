package HTTPsGET;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;


import java.net.URL;

public class WeatherAPI {
	

	    public static void main(String[] args) {
	        try {
	            URL url = new URL("https://reqres.in/api/users"); // Simple mock API
	            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	            conn.setRequestMethod("POST");
	            conn.setRequestProperty("Content-Type", "application/json; utf-8");
	            conn.setDoOutput(true);

	            String jsonInputString = "Hello World!";

	            try (OutputStream os = conn.getOutputStream()) {
	                byte[] input = jsonInputString.getBytes("utf-8");
	                os.write(input, 0, input.length);
	            }

	            int responseCode = conn.getResponseCode();
	            System.out.println("Response Code: " + responseCode);

	            // Read the response
	            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
	            String inputLine;
	            StringBuilder response = new StringBuilder();
	            
	            while ((inputLine = in.readLine()) != null) {
	                response.append(inputLine);
	            }
	            in.close();

	            // Print the response from the API (includes where the data is posted)
	            System.out.println("Response Body: " + response.toString());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}

	

