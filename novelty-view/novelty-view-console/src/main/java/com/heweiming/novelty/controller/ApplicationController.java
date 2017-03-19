package com.heweiming.novelty.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.RandomUtils;
import org.springframework.stereotype.Controller;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.heweiming.novelty.web.constant.WebConstants;
import com.heweiming.novelty.web.util.VerifyCodeUtils;

@Controller
public class ApplicationController {

    @GetMapping(value = "/login")
    public ModelAndView login() {
        String viewName = "login";
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }

    @GetMapping(value = "/verifyCode")
    public void verifyCode(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType(MimeTypeUtils.IMAGE_JPEG_VALUE);
        //生成随机字串  
        String verifyCode = VerifyCodeUtils.generateVerifyCode(RandomUtils.nextInt(4, 6));

        //存入会话session  
        HttpSession session = request.getSession(true);
        session.setAttribute(WebConstants.VERIFIY_CODE, verifyCode.toLowerCase());
        //生成图片  
        int w = 110, h = 41;
        VerifyCodeUtils.outputImage(w, h, response.getOutputStream(), verifyCode);
    }

    @GetMapping(value = "/index")
    public ModelAndView index() {
        String viewName = "index";
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }

}
