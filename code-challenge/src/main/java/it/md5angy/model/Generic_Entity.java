package it.md5angy.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Generic_Entity {
	@Override
	public String toString() {
		String jsonString = "";
		ObjectMapper mapper = new ObjectMapper();
		try {
			jsonString = mapper.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			jsonString = "JSON parsing error.";
		}
		
		
		return jsonString;
		
	}
	
}

