package cn.heweiming.novelty.shiro.controller;

import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@DeleteMapping(value = "/logout")
//	@PostMapping(value = "/admin/logout")
	public ModelAndView adminLogout(){
		ModelAndView mav = new ModelAndView("redirect:/admin/login");
		Subject currentUser = SecurityUtils.getSubject();
		currentUser.logout();
		return mav;
	}

	// @RequestMapping(value = "/admin/login", method = RequestMethod.DELETE)
	// @ResponseBody
	// public ModelAndView adminLogout() {
	// ModelAndView mav = new ModelAndView();
	// mav.setViewName("redirect:/index");
	// return mav;
	// }

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("/index");
		List<SysMenuVo> menuVos = sysMenuService.findMenuByUser(null);
		for (SysMenuVo sysMenuVo : menuVos) {
			List<SysMenuVo> subMenuList = sysMenuVo.getSubMenuList();
		}
		System.out.println(3421);
		mav.addObject("menuList", menuVos);
		return mav;
	}

	@GetMapping(value = "/unauthorized")
	public ModelAndView unauthorized() {
		ModelAndView mav = new ModelAndView("/error/unauthorized");
		return mav;
	}

}
