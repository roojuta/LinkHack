package com.reccomendationgenie.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;

import com.google.gson.Gson;

public class JsonParser {

	
	public Member getMember(String name) {
	  
	  Gson gson = new Gson();
	  Member member = null;
      try {
        URL url = getClass().getResource(name + ".json");
          BufferedReader br = new BufferedReader(new FileReader(url.getPath()));
          
          //convert the json string back to object
          member = gson.fromJson(br, Member.class);
   
      } catch (Exception e) {
         e.printStackTrace();
      }
      return member;
	}
}
