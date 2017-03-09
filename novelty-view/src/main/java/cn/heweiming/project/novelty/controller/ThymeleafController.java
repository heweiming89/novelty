package cn.heweiming.project.novelty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//@RequestMapping("/template")
@Controller
public class ThymeleafController {

    @RequestMapping("/demo")
    public ModelAndView view1() {
        String viewName = "demo01";
        return new ModelAndView(viewName);
    }

    @GetMapping(value = "/hello")
    public ModelAndView index() {
        String viewName = "index";
        ModelAndView mav = new ModelAndView();
        mav.setViewName(viewName);
        mav.addObject("username", "admin");
        return mav;
    }

}
