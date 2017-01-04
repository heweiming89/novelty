package cn.heweiming.novelty.mock;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import cn.heweiming.novelty.mock.bean.Person;

public class JsonMock {

	@Test
	public void test01() throws JsonGenerationException, JsonMappingException, IOException{
		
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
	
	
}
