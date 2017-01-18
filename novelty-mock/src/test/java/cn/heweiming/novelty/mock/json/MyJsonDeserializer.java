package cn.heweiming.novelty.mock.json;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class MyJsonDeserializer extends JsonDeserializer<Integer> {

	@Override
	public Integer deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		JsonToken token = p.getCurrentToken();
		System.out.println(token);
		
		String source = p.getValueAsString();
		if(source != null && source.trim().length() >0 ){
			return Integer.valueOf(source.trim().replace(",", ""));
		}
		return null;
	}


}
