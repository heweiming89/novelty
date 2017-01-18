package cn.heweiming.novelty.shiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * TODO
 * 
 * @author heweiming
 * @createtime 2016年12月17日 下午6:56:57
 * @modifytime 2016年12月17日 下午6:56:57
 * @since
 */
@Controller
@RequestMapping(value = "/sys/mgt")
public class SysMgtController {
	
	@RequestMapping(value = "")
	public ModelAndView index() {
		return null;
	}
}
