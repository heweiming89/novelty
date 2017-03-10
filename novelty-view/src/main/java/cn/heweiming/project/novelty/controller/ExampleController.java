package cn.heweiming.project.novelty.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/example")
public class ExampleController {

    @GetMapping(value = "/modal/ajax")
    public ModelAndView ajaxModal() {
        String viewName = "example/modal/ajax";
        ModelAndView mav = new ModelAndView(viewName);
        mav.addObject("date", new Date());
        return mav;
    }

}
