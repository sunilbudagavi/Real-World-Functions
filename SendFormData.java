package HttpPostMethodEasy10;

import java.io.OutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SendFormData {

    public static void main(String[] args) {
        try {
            // Set up the URL and HttpURLConnection
            URL url = new URL("https://reqres.in/api/register");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json");
            con.setDoOutput(true);

            // Create the JSON request body
            String jsonInputString = "{\"email\": \"eve.holt@reqres.in\", \"password\": \"pistol\"}";

            // Write the JSON request body
            try (OutputStream os = con.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            // Get the response code
            int rescode = con.getResponseCode();
            System.out.println("Response Code: " + rescode);

            // Handle response or error stream depending on the response code
            InputStream inputStream;
            if (rescode >= 200 && rescode < 300) {
                // Success - use regular input stream
                inputStream = con.getInputStream();
            } else {
                // Error - use error stream
                inputStream = con.getErrorStream();
            }

            // Read and print the response or error
            try (BufferedReader in = new BufferedReader(new InputStreamReader(inputStream))) {
                String inputLine;
                StringBuilder response = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                System.out.println("Response Body: " + response.toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
