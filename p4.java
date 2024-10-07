package com.simplifying;

//Extract the loan amount, interest rate, and duration (in years), and display them

import org.json.JSONObject;

public class p4 {
	public static void main(String[] args) {
		String loanDetails = "{\n" +
                "  \"loan\": {\n" +
                "    \"loan_id\": \"L1001\",\n" +
                "    \"loan_amount\": 250000.00,\n" +
                "    \"interest_rate\": 3.5,\n" +
                "    \"duration_years\": 15\n" +
                "  }\n" +
                "}";
		
		JSONObject jsonobject = new JSONObject(loanDetails);
		
		Double amount = jsonobject.getJSONObject("loan").getDouble("loan_amount");
		double rate = jsonobject.getJSONObject("loan").getDouble("interest_rate");
		int years = jsonobject.getJSONObject("loan").getInt("duration_years");
		
		System.out.println("Loan Amount: "+amount);
		System.out.println("Rate: "+rate);
		System.out.println("Duration Years: "+years+" years");
		
		System.out.println("                                                        ");
		double total_liability = amount * rate / years;
		System.out.println("Total liability: "+total_liability);
	}

}
