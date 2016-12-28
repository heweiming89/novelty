package cn.heweiming.novelty.mock;

import java.text.NumberFormat;

public class MonetaMock {

	public static void main(String[] args) {
		String format = NumberFormat.getCurrencyInstance().format(12345678.9);
		System.out.println(format);
		String format2 = NumberFormat.getNumberInstance().format(12345678.9);
		System.out.println(format2);
	}
	
	
}
