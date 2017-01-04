package cn.heweiming.novelty.mock;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class TimeUnitMock {

	@Test
	public void test(){
		System.out.println(TimeUnit.DAYS.toSeconds(1));
		System.out.println(TimeUnit.HOURS.toSeconds(1));
		System.out.println(TimeUnit.MINUTES.toSeconds(1));
		System.out.println(TimeUnit.SECONDS.toSeconds(1));
		System.out.println(TimeUnit.MICROSECONDS.toSeconds(1));
		System.out.println(TimeUnit.NANOSECONDS.toSeconds(1));
	}
	
}
