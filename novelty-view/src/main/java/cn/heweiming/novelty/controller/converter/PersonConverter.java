package cn.heweiming.novelty.controller.converter;

import org.springframework.core.convert.converter.Converter;

import cn.heweiming.novelty.bean.Person;
import cn.heweiming.novelty.domain.vo.Gender;
import cn.heweiming.novelty.util.EnumUtils;

//@Component
public class PersonConverter implements Converter<String, Person> {

	@Override
	public Person convert(String source) {
		Person person = new Person();
		person.setName("转换失败");
		if (source != null && source.split("-").length == 3) {
			String[] param = source.split("-");
			person.setName(param[0]);
			person.setAge(Integer.valueOf(param[1]));
			person.setGender(EnumUtils.codeOf(Gender.class, param[2]));
		}
		return person;
	}

}
