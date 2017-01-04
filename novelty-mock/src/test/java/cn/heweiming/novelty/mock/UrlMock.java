package cn.heweiming.novelty.mock;

import java.net.URI;

import org.junit.Test;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class UrlMock {

	@Test
	public void test() {
		UriComponents uriComponents = UriComponentsBuilder
				.fromUriString("http://example.com/hotels/{hotel}/bookings/{booking}").build();
		URI uri = uriComponents.expand("42", "21").encode().toUri();
		System.out.println(uri);
	}

}
