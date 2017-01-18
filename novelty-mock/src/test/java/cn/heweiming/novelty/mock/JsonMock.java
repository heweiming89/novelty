package cn.heweiming.novelty.mock;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.Jackson2ObjectMapperFactoryBean;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import cn.heweiming.novelty.mock.bean.Person;
import cn.heweiming.novelty.mock.json.JsonTestBean;
import cn.heweiming.novelty.mock.json.MyJsonDeserializer;

public class JsonMock {

	@Test
	public void test01() throws JsonGenerationException, JsonMappingException, IOException {

		Person person = new Person();
		person.setName("曾阿牛");
		person.setPassword("123456");

		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectMapper om = new ObjectMapper();

		om.writerWithView(Person.WithoutPasswordView.class).writeValue(bos, person);
		System.out.println(bos.toString());

		bos.reset();
		om.writerWithView(Person.WithPasswordView.class).writeValue(bos, person);
		System.out.println(bos.toString());

	}

	@Test
	public void test02() throws IOException {
		ObjectMapper om = new ObjectMapper();
		Jackson2ObjectMapperFactoryBean objectMapperFactoryBean = new Jackson2ObjectMapperFactoryBean();
		
		Map<Class<?>, JsonDeserializer<?>> deserializers = new LinkedHashMap<>();
		deserializers.put(Integer.class, new MyJsonDeserializer());
		// JsonDeserializer<?> deserializers = new MyJsonDeserializer();
		// objectMapperFactoryBean.setDeserializers(deserializers);
		objectMapperFactoryBean.setDeserializersByType(deserializers);
		om = objectMapperFactoryBean.getObject();
		JsonTestBean bean = new JsonTestBean();
		bean.setI(1234567);
		String string = om.writeValueAsString(bean);
		System.out.println(string);
		String source = "{\"i\":\"123,456,7\"}";
		// source = "{\"i\":1234567}";
		JsonTestBean readValue = om.readValue(source, JsonTestBean.class);
		System.out.println(readValue);

	}
	
	@Test
	public void test03() throws JsonParseException, JsonMappingException, IOException{
		String source = "{\"i\":\"123,456,7\"}";
		ObjectMapper om = new ObjectMapper();
		JsonTestBean readValue = om.readValue(source, JsonTestBean.class);
		System.out.println(readValue);
	}
	
	@Test
	public void test04() throws JsonParseException, JsonMappingException, IOException{
		Map<Class<?>, JsonDeserializer<?>> deserializers = new LinkedHashMap<>();
		deserializers.put(Integer.class, new MyJsonDeserializer());
		Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
		builder.deserializersByType(deserializers);
		ObjectMapper om = builder.build();
		String source = "{\"i\":\"123,456,7\"}";
		JsonTestBean readValue = om.readValue(source, JsonTestBean.class);
		System.out.println(readValue);
		
	}

}
