package cn.heweiming.novelty.mock.bean;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonView;

@Component
// @ConfigurationProperties(prefix = "person")
public class Person {
	
	public interface WithoutPasswordView {};  
    public interface WithPasswordView extends WithoutPasswordView {};  

	private String name;
	
	private String password;

	@JsonView(WithoutPasswordView.class)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonView(WithPasswordView.class)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
