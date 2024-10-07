package com.simplifying;

import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;

public class jsonToJavaParsing {

    public static void main(String[] args) {
        // Corrected JSON string with proper escaping
        String json2 = "{"
        		  + "\"laptop1\": {"
        		  + "\"brand\": \"Dell\","
        		  + "\"model\": \"XPS 13\","
        		  + "\"processor\": \"Intel Core i7\","
        		  + "\"ram\": \"16GB\","
        		  + "\"storage\": \"512GB SSD\","
        		  + "\"price\": 1200"
        		  + "},"
        		  + "\"laptop2\": {"
        		  + "\"brand\": \"Apple\","
        		  + "\"model\": \"MacBook Pro\","
        		  + "\"processor\": \"M1 Chip\","
        		  + "\"ram\": \"16GB\","
        		  + "\"storage\": \"1TB SSD\","
        		  + "\"price\": 2000"
        		  + "}"
        		  + "}";
        
        JSONObject json = new JSONObject(json2);
        
        String name = json.getJSONObject("laptop1").getString("brand");
        System.out.println(name);
    }
}
