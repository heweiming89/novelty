package cn.heweiming.novelty.converter;

import static cn.heweiming.novelty.common.Constant.DATE_FORMAT_FULL;
import static cn.heweiming.novelty.common.Constant.DATE_FORMAT_LONG;
import static cn.heweiming.novelty.common.Constant.DATE_FORMAT_MEDIUM;
import static cn.heweiming.novelty.common.Constant.DATE_FORMAT_NUMBER;
import static cn.heweiming.novelty.common.Constant.DATE_FORMAT_SHORT;

import java.text.ParseException;
import java.util.Date;

import org.apache.commons.beanutils.Converter;
import org.apache.commons.lang3.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings(value = { "unchecked" })
public class DateConverter implements Converter {

	private static final Logger LOGGER = LoggerFactory.getLogger(DateConverter.class);

	@Override
	public <T> T convert(Class<T> type, Object value) {
		if (type != Date.class || value == null) {
			return null;
		}
		Date date = null;
		try {
			date = DateUtils.parseDate((String) value, DATE_FORMAT_SHORT, DATE_FORMAT_MEDIUM, DATE_FORMAT_LONG,
					DATE_FORMAT_FULL);
		} catch (ParseException e) {
			if (((String) value).matches(DATE_FORMAT_NUMBER)) {
				date = new Date(Long.parseLong((String) value));
			} else {
				LOGGER.error("错误", e);
			}
		}
		return (T) date;
	}

}
