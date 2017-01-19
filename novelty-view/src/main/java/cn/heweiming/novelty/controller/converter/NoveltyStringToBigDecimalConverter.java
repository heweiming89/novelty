package cn.heweiming.novelty.controller.converter;

import java.math.BigDecimal;

import org.springframework.core.convert.converter.Converter;

public class NoveltyStringToBigDecimalConverter implements Converter<String, BigDecimal> {

	@Override
	public BigDecimal convert(String source) {
		if (source != null && source.trim().length() > 0) {
			return new BigDecimal(source.trim().replace(",", ""));
		}
		return null;
	}

}
