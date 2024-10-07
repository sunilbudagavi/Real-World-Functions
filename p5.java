package com.simplifying;

import org.json.JSONObject;

public class p5 {
	public static void main(String[] args) {
		 String customers = "{\n" +
	                "  \"customer1\": {\n" +
	                "    \"name\": \"Alice\",\n" +
	                "    \"account_balance\": 3000.00\n" +
	                "  },\n" +
	                "  \"customer2\": {\n" +
	                "    \"name\": \"Bob\",\n" +
	                "    \"account_balance\": 1500.50\n" +
	                "  }\n" +
	                "}";
		 
		 JSONObject json = new JSONObject(customers);
		 
		 String name1 = json.getJSONObject("customer1").getString("name");
		 System.out.println("The Name of the Customer 1: "+name1);
		 
		 String name2 = json.getJSONObject("customer2").getString("name");
		 System.out.println("The Name of the customer 2: "+name2);
	}

}
