package cn.heweiming.novelty.controller.example;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/example")
public class ExampleController {

	@GetMapping("/01")
	public Object example01(Date date){
		return date;
	}
	
}
