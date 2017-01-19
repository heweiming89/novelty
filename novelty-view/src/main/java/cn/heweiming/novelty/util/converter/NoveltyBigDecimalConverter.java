package cn.heweiming.novelty.util.converter;

import java.math.BigDecimal;

import org.apache.commons.beanutils.converters.NumberConverter;

public class NoveltyBigDecimalConverter extends NumberConverter {

	public NoveltyBigDecimalConverter() {
		super(true);
	}

	public NoveltyBigDecimalConverter(final Object defaultValue) {
		super(true, defaultValue);
	}

	@Override
	protected Class<BigDecimal> getDefaultType() {
		return BigDecimal.class;
	}

	@Override
	public <T> T convert(Class<T> type, Object value) {
		if(value instanceof String){
			String source = ((String)value).trim().replace(",", ""); 
			return super.convert(type, source);
		}
		return super.convert(type, value);
	}
	
}
