package com.heweiming.novelty.controller.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExampleController {

    @GetMapping(value = "/layout")
    public ModelAndView layout() {
        String viewName = "layout/console-index";
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }

    @GetMapping(value = "/demo")
    public ModelAndView demo() {
        String viewName = "example/demo";
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }

}
