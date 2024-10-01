package HttpPostMethodEasy10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class SimplePostRequest {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://reqres.in/api/users"); // Simple mock API
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json; utf-8");
            conn.setDoOutput(true);

            String jsonInputString = "{\"name\": \"John\", \"age\": 30 \"married\"}";

            try (OutputStream os = conn.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            int responseCode = conn.getResponseCode();
            System.out.println("Response Code: " + responseCode);
            
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            
            String input;
            StringBuilder content = new StringBuilder();
            while((input=reader.readLine()) != null) {
            	content.append(input);
            }
            System.out.println("Content: "+content);
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
