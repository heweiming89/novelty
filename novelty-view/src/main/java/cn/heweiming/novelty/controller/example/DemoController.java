package cn.heweiming.novelty.controller.example;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

import org.apache.commons.beanutils.ConvertUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.heweiming.novelty.bean.Person;
import cn.heweiming.novelty.domain.vo.AjaxRespObj;
import cn.heweiming.novelty.domain.vo.Gender;
import cn.heweiming.novelty.json.test.JsonTestBean2;
import cn.heweiming.novelty.util.BeanUtils;
import cn.heweiming.novelty.util.converter.DateConverter;
import cn.heweiming.novelty.util.converter.EnumConverter;
import cn.heweiming.novelty.util.converter.NoveltyBigDecimalConverter;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {

	@Autowired
	private Person person;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Person get() {
		person.setName("3421432");
		return person;
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String post() {
		return "DemoController.post()";
	}

	@RequestMapping(value = "/", method = RequestMethod.PUT)
	public String put() {
		return "DemoController.put()";
	}

	@RequestMapping(value = "/", method = RequestMethod.DELETE)
	public String delete() {
		return "DemoController.delete()";
	}

	@GetMapping(value = "/converter")
	public AjaxRespObj converterGet(BigDecimal dec) {
		AjaxRespObj resp = new AjaxRespObj();
		Object respData = dec;
		resp.setRespData(respData);
		return resp;
	}

	@PutMapping(value = "/converter")
	public AjaxRespObj converterPut(@RequestBody Map<String, Object> bean) {
		AjaxRespObj resp = new AjaxRespObj();
		JsonTestBean2 testBean = new JsonTestBean2();
		try {
			ConvertUtils.register(new DateConverter(), Date.class);
			ConvertUtils.register(new EnumConverter(), Gender.class);
			ConvertUtils.register(new NoveltyBigDecimalConverter(BigDecimal.ONE), BigDecimal.class);
			BeanUtils.populate(testBean, bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Object respData = testBean;

		resp.setRespData(respData);
		return resp;
	}

}
