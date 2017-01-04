package cn.heweiming.novelty.controller.example;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.heweiming.novelty.bean.Person;

@Controller
@RequestMapping(value = "/model")
public class ModelController {

	@ModelAttribute("modelExampleMap")
	public Map<String, Object> model() {
		Person person = new Person();
		person.setName("431432");
		Map<String, Object> map = new HashMap<>();
		map.put("modelTest1", 1111);
		return map;
	}

	@RequestMapping
	public ModelAndView index() {
		return new ModelAndView("/example/model");
	}

	@GetMapping(value = "/get01")
	@ResponseBody
	public Map<String, Object> get01(@ModelAttribute("modelExampleMap") Map<String, Object> map,@CookieValue("JSESSIONID") String cookie) {
		map.put("result", 1111);
		map.put("JSESSIONID", cookie);
		return map;
	}
	
	@GetMapping(value = "/get02")
	@ResponseBody
	public Object get02(@RequestHeader MultiValueMap<String, String> map) {
		return map;
	}

}
