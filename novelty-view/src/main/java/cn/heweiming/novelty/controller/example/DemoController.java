package cn.heweiming.novelty.controller.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.heweiming.novelty.bean.Person;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {

	@Autowired
	private Person person;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Person get() {
		person.setName("3421432");
		return person;
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String post() {
		return "DemoController.post()";
	}

	@RequestMapping(value = "/", method = RequestMethod.PUT)
	public String put() {
		return "DemoController.put()";
	}

	@RequestMapping(value = "/", method = RequestMethod.DELETE)
	public String delete() {
		return "DemoController.delete()";
	}

}
