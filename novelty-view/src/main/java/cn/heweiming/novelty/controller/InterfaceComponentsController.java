package cn.heweiming.novelty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/ui")
public class InterfaceComponentsController {

	@RequestMapping(value="/font_awesome")
	public ModelAndView fontawesome(){
		ModelAndView mav = new ModelAndView("/interface_components/font_awesome");
		return mav;
	}
	
	@RequestMapping(value="/bootstrap_switch")
	public ModelAndView bootstrapSwitch(){
		ModelAndView mav = new ModelAndView("/interface_components/bootstrap_switch");
		return mav;
	}
	
}
