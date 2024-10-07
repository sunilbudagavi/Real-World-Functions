package com.simplifying;

import org.json.JSONObject;

public class p3 {
	public static void main(String[] args) {
		String line = "{"
		        + "\"branch\": {"
		        + "\"branch_code\": \"B001\","
		        + "\"branch_name\": \"Downtown Branch\","
		        + "\"address\": {"
		        + "\"street\": \"123 Bank St.\","
		        + "\"city\": \"New York\","
		        + "\"zip_code\": \"10001\""
		        + "}"
		        + "}"
		        + "}";
		
		
		JSONObject detailsObject = new JSONObject(line);
		
		String name = detailsObject.getJSONObject("branch").getString("branch_code");
		System.out.println("Branch Code: "+name);
		
		String code = detailsObject.getJSONObject("branch").getString("branch_name");
		System.out.println("Branch Name: "+code);
		
		String zipcode = detailsObject.getJSONObject("branch").getJSONObject("address").getString("zip_code");
		System.out.println("ZIP Code: "+zipcode);
		
		
		
	}

	
}
