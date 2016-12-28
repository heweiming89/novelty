package cn.heweiming.novelty.mock.bean;

import org.springframework.stereotype.Component;

@Component
// @ConfigurationProperties(prefix = "person")
public class Person {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
