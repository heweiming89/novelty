package cn.heweiming.novelty.json.test;

import java.math.BigDecimal;
import java.util.Date;

public class JsonTestBean2 {

	private BigDecimal dec;

	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public BigDecimal getDec() {
		return dec;
	}

	public void setDec(BigDecimal dec) {
		this.dec = dec;
	}

	@Override
	public String toString() {
		return "JsonTestBean2 [dec=" + dec + ", date=" + date + "]";
	}

}
