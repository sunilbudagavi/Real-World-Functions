package urlpackage;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionExample {

    public static void main(String[] args) {
        try {
            // Step 1: Create a URL object
            URL url = new URL("https://www.youtube.com/?feature=ytca");

            // Step 2: Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Step 3: Set the request method to GET
            connection.setRequestMethod("GET");

            // Step 4: Get the response code
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            // Step 5: If the response is OK (200), read the input stream (response)
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder content = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }

                // Step 6: Close the streams
                in.close();

                // Step 7: Print the response
                System.out.println("Response: ");
                System.out.println(content.toString());
            } else {
                System.out.println("GET request failed.");
            }

            // Step 8: Disconnect the connection
            connection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
