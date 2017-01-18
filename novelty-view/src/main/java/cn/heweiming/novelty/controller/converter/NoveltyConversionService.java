package cn.heweiming.novelty.controller.converter;

import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.TypeDescriptor;

public class NoveltyConversionService implements ConversionService {

	@Override
	public boolean canConvert(Class<?> sourceType, Class<?> targetType) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canConvert(TypeDescriptor sourceType, TypeDescriptor targetType) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <T> T convert(Object source, Class<T> targetType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object convert(Object source, TypeDescriptor sourceType, TypeDescriptor targetType) {
		// TODO Auto-generated method stub
		return null;
	}

}
