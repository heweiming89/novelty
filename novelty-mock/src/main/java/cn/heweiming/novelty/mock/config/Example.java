package cn.heweiming.novelty.mock.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.heweiming.novelty.mock.bean.Person;

@RestController
@ActiveProfiles(value = { "dev" })
public class Example {

	@Autowired
	private Person person;
	
	@Autowired
	private Environment env;
	
	@GetMapping("/")
	public String get() {
		return person.getName();
	}
	
	@PostMapping("/")
	public String post(){
		return env.getProperty("aaaa");
	}

}
