package cn.heweiming.novelty.mock;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.Map;

import org.junit.Test;

import cn.heweiming.novelty.json.test.JsonTestBean2;
import cn.heweiming.novelty.util.BeanUtils;

public class BeanUtilsMock {

	@Test
	public void test01() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException{
//		Map<String, Date> bean = Collections.singletonMap("date", new Date());
		JsonTestBean2 bean1 = new JsonTestBean2();
		bean1.setDate(new Date());
		Map<String, String> map = BeanUtils.describe(bean1);
		JsonTestBean2 bean2 = new JsonTestBean2();
		map.put("dec", "1,234,567.89");
		map.put("date", "2017-01-18");
		BeanUtils.populate(bean2, map);
		System.out.println(map);
		
		System.out.println(bean2);
		
	}
	
	
}
