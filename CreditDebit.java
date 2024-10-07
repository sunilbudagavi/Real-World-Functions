package com.simplifying;

import org.json.JSONArray;
import org.json.JSONObject;

public class CreditDebit {
    public static void main(String[] args) {
        // Correct JSON string
        String transactions = "{\n" +
                              "  \"transactions\": [\n" +
                              "    {\"id\": 1, \"type\": \"debit\", \"amount\": 100.50},\n" +
                              "    {\"id\": 2, \"type\": \"credit\", \"amount\": 250.00},\n" +
                              "    {\"id\": 3, \"type\": \"debit\", \"amount\": 50.00}\n" +
                              "  ]\n" +
                              "}";

        // Parse the JSON string
        JSONObject jsonObject = new JSONObject(transactions);

        // Get the transactions array
        JSONArray tranArray = jsonObject.getJSONArray("transactions");

        // Loop through the array and extract each transaction
        for (int i = 0; i < tranArray.length(); i++) {
            // Get each transaction object from the array
            JSONObject transaction = tranArray.getJSONObject(i);

            // Extract values from the transaction object
            int id_no = transaction.getInt("id");
            String types = transaction.getString("type");
            double amounts = transaction.getDouble("amount");

            // Print the extracted data
            System.out.println("ID Number: " + id_no);
            System.out.println("Type: " + types);
            System.out.println("Amount: " + amounts);
            System.out.println("--------------------------");
        }
    }
}
