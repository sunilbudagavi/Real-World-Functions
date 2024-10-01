package HttpPostMethodEasy10;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class PostWithHeaders {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://reqres.in/api/users"); // Mock API
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Authorization", "Bearer some-token");
            conn.setDoOutput(true);

            String jsonInputString = "{\"title\": \"My Post\", \"body\": \"Post content.\"}";

            try (OutputStream os = conn.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            int responseCode = conn.getResponseCode();
            System.out.println("Response Code: " + responseCode);
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            
            String inp;
            
            StringBuilder content = new StringBuilder();
            
            while((inp=reader.readLine())!=null) {
            	content.append(inp);
            }
            
            System.out.println("Content: "+content);
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
