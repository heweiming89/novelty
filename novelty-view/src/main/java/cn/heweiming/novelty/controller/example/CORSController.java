package cn.heweiming.novelty.controller.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.heweiming.novelty.domain.vo.AjaxRespObj;

@Controller
@RequestMapping(value = "/cors")
public class CORSController {

	@CrossOrigin("http://www.baidu.com")
	@RequestMapping(value = "/test01")
	public AjaxRespObj test01() {
		return null;
	}

}
