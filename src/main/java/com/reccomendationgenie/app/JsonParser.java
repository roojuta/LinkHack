package com.reccomendationgenie.app;

import java.io.BufferedReader;
import java.io.FileReader;

import com.google.gson.Gson;

public class JsonParser {

	public static void main(String[] args) {
		
		Gson gson = new Gson();
		
		try {
			BufferedReader br = new BufferedReader(
					new FileReader("/Users/klohia/ln/LinkHack/src/main/java/com/reccomendationgenie/app/mem.json"));
			
			
			//convert the json string back to object
			Memeber obj = gson.fromJson(br, Memeber.class);
	 
			System.out.println(obj);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
