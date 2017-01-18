package cn.heweiming.novelty.shiro.controller;

import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.heweiming.novelty.shiro.domain.vo.SysMenuVo;
import cn.heweiming.novelty.shiro.service.SysMenuService;

@Controller("shiroApplicationController")
public class ApplicationController {

	@Autowired
	private SysMenuService sysMenuService;

	@RequestMapping(value = "/admin/login", method = RequestMethod.GET)
	public ModelAndView openLoginView() {
		System.out.println("get admin login");
		ModelAndView mav = new ModelAndView("/admin_login");
		return mav;
	}

	@RequestMapping(value = "/admin/login", method = RequestMethod.POST)
	public ModelAndView adminLogin(String username, String password, Boolean remember) {
		ModelAndView mav = new ModelAndView("redirect:/index");
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		UsernamePasswordToken token = new UsernamePasswordToken(username, password);
		currentUser.login(token);
		return mav;
	}

	// @RequestMapping(value = "/admin/login", method = RequestMethod.DELETE)
	// @ResponseBody
	// public ModelAndView adminLogout() {
	// ModelAndView mav = new ModelAndView();
	// mav.setViewName("redirect:/index");
	// System.out.println(3421);
	// return mav;
	// }

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("/index");
		List<SysMenuVo> menuVos = sysMenuService.findMenuByUser(null);
		for (SysMenuVo sysMenuVo : menuVos) {
			System.out.println(sysMenuVo);
			System.out.println("###########################################");
			List<SysMenuVo> subMenuList = sysMenuVo.getSubMenuList();
			for (SysMenuVo subMenu : subMenuList) {
				System.out.println(subMenu);
			}
		}
		mav.addObject("menuList", menuVos);
		return mav;
	}

}
