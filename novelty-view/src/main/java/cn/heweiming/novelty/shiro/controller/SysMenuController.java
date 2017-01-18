package cn.heweiming.novelty.shiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * TODO
 * 
 * @author heweiming
 * @createtime 2016年12月17日 下午6:56:39
 * @modifytime 2016年12月17日 下午6:56:39
 * @since
 */
@Controller
@RequestMapping(value = "/sys/menu")
public class SysMenuController {

	@RequestMapping(value = "")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/sys_mgt/menu/index");
		return mav;
	}

}
