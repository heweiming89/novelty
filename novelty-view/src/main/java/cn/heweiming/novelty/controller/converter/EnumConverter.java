package cn.heweiming.novelty.controller.converter;

import org.springframework.core.convert.converter.Converter;

import cn.heweiming.novelty.domain.vo.Gender;

public class EnumConverter implements Converter<String, Gender> {

	@Override
	public Gender convert(String source) {
		Gender[] constants = Gender.class.getEnumConstants();
		Gender result = null;
		for (Gender gender : constants) {
			if (gender.getCode().equals(source)) {
				result = gender;
				break;
			}
		}
		return result;
	}

}
