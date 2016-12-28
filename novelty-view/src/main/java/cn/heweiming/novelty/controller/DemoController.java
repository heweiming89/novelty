package cn.heweiming.novelty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.heweiming.novelty.bean.Person;

@RestController
public class DemoController {
	
	@Autowired
	private Person person;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String get() {
		return person.getName();
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
