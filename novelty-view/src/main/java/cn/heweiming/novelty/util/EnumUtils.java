package cn.heweiming.novelty.util;

import cn.heweiming.novelty.domain.vo.BaseEnum;

public class EnumUtils {

	@SuppressWarnings("rawtypes")
	public static <T extends Enum<T> & BaseEnum<T>> T codeOf(Class<T> enumClass, String code) {
		T result = null;
		T[] constants = enumClass.getEnumConstants();
		for (T e : constants) {

			if (((BaseEnum) e).getCode().equals(code)) {
				result = e;
			}
		}
		return result;
	}

}
