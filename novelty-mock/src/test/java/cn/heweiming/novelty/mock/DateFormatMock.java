package cn.heweiming.novelty.mock;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateFormatMock {

	@Test
	public void test01() throws ParseException{
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");  
//        format.setLenient(false);  
        Date date = format.parse("33/12/2011");  
        System.out.println(date);
	}
	
	
}
