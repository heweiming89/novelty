package cn.heweiming.novelty.controller.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.heweiming.novelty.bean.Person;

@RestController
@RequestMapping("/matrix")
public class MatrixController {
	
	@GetMapping("/demo/{petId}")
	public String demo01(@PathVariable String petId,@MatrixVariable Integer q){
		return q.toString();
	}
	
	@GetMapping("/")
	public Person demo001(){
		Person person = new Person();
		person.setName("4321432");
		return person;
	}
	
}
