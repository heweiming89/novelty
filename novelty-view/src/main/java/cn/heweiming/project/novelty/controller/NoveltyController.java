package cn.heweiming.project.novelty.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NoveltyController {
    /**
     * Logger for this class
     */
    private static final Logger logger = LoggerFactory.getLogger(NoveltyController.class);

    @GetMapping(value = "/index")
    public ModelAndView index() {
        String viewName = "index";
        ModelAndView mav = new ModelAndView();
        mav.setViewName(viewName);
        mav.addObject("username", "admin");
        return mav;
    }

    @GetMapping(value = "/admin/index")
    public ModelAndView adminIndex() {
        String viewName = "admin_index";
        ModelAndView mav = new ModelAndView();
        mav.setViewName(viewName);
        mav.addObject("username", "admin");
        return mav;
    }

}
