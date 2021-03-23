package com.logWork.LogWork;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

public class StringObjectDeserializer extends JsonDeserializer<String>{

	@Override
	public String deserialize(JsonParser jsonParser, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		final JsonNode node = jsonParser.getCodec().readTree(jsonParser);
		
		return new String();
	}
	
	

}
