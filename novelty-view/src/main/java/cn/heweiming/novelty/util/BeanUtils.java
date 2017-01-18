package cn.heweiming.novelty.util;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;

import cn.heweiming.novelty.domain.vo.BaseEnum;
import cn.heweiming.novelty.domain.vo.Gender;
import cn.heweiming.novelty.util.converter.DateConverter;
import cn.heweiming.novelty.util.converter.EnumConverter;

public class BeanUtils extends org.apache.commons.beanutils.BeanUtils {

	private static BeanUtilsBean beanUtilsBean = new BeanUtilsBean(new ConvertUtilsBean());

	private BeanUtils() {

	}

	static {
		ConvertUtils.register(new DateConverter(), Date.class);
		ConvertUtils.register(new EnumConverter(), Gender.class);
	}

	private static class ConvertUtilsBean extends org.apache.commons.beanutils.ConvertUtilsBean {

		@SuppressWarnings("rawtypes")
		@Override
		public String convert(Object value) {
			if (value == null) {
				return null;
			} else if (value.getClass().isArray()) {
				if (Array.getLength(value) < 1) {
					return (null);
				}
				value = Array.get(value, 0);
				if (value == null) {
					return null;
				} else {
					Converter converter = lookup(String.class);
					return (converter.convert(String.class, value));
				}
			} else if (value.getClass() == Date.class) {
				return String.valueOf(((Date) value).getTime());
			} else if (value instanceof BaseEnum && value instanceof Enum) {
				return ((BaseEnum) value).getCode();
			} else {
				Converter converter = lookup(String.class);
				return (converter.convert(String.class, value));
			}
		}
	}

	public static Map<String, String> describe(Object bean)
			throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		return beanUtilsBean.describe(bean);
	}

	public static Map<String, Object> describeObject(Object bean)
			throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Map<String, String> map = beanUtilsBean.describe(bean);
		Map<String, Object> describeMap = new HashMap<>();
		for (String key : map.keySet()) {
			describeMap.put(key, map.get(key));
		}
		return describeMap;

	}

}
