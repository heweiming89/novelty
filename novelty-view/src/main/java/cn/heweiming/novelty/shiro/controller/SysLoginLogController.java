package cn.heweiming.novelty.shiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/sys/loginlog")
public class SysLoginLogController {

	@RequestMapping(value = "")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/sys_mgt/loginlog/index");
		return mav;
	}
}
