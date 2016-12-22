package cn.heweiming.novelty.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String get() {
		return "DemoController.get()";
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
