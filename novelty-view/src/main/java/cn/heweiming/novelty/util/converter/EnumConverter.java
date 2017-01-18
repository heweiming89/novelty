package cn.heweiming.novelty.util.converter;

import org.apache.commons.beanutils.Converter;

import cn.heweiming.novelty.domain.vo.BaseEnum;

@SuppressWarnings("rawtypes")
public class EnumConverter implements Converter {

	@Override
	public <T> T convert(Class<T> type, Object value) {
		if (value == null) {
			return null;
		}
		if (type.isEnum() && BaseEnum.class.isAssignableFrom(type)) {
			T[] enumConstants = type.getEnumConstants();
			for (T t : enumConstants) {
				if (((BaseEnum) t).getCode().equals(value)) {
					return t;
				}
			}
			return null;
		} else {
			return null;
		}
	}

}
