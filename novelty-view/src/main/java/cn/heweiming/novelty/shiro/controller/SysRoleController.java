package cn.heweiming.novelty.shiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * TODO
 * 
 * @author heweiming
 * @createtime 2016年12月17日 下午6:57:05
 * @modifytime 2016年12月17日 下午6:57:05
 * @since
 */
@Controller
@RequestMapping(value = "/sys/role")
public class SysRoleController {
	
	@RequestMapping(value = "")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/sys_mgt/role/index");
		return mav;
	}
}
