package com.simplifying;

import org.json.JSONObject;

public class extractAccountDetails {
	public static void main(String[] args) {
		
		String root = "{\n" +
                "  \"customer\": {\n" +
                "    \"name\": \"John Doe\",\n" +
                "    \"account_number\": \"1234567890\",\n" +
                "    \"account_type\": \"Savings\",\n" +
                "    \"balance\": 5000.75\n" +
                "  }\n" +
                "}";

		JSONObject json = new JSONObject(root);
		
		String name = json.getJSONObject("customer").getString("name");
		System.out.println("Cusotmer Name: "+name);
		
		
		int accountnumber = json.getJSONObject("customer").getInt("account_number");
		System.out.println("Account Number: "+accountnumber);
		
		String type = json.getJSONObject("customer").getString("account_type");
		System.out.println("Account type: "+ type);
		
		double amount= json.getJSONObject("customer").getDouble("balance");
		System.out.println("Amount: "+amount);
		
		
	}

}
