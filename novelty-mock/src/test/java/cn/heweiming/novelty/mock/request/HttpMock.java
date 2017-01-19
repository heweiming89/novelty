package cn.heweiming.novelty.mock.request;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpVersion;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHttpRequest;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import cn.heweiming.novelty.mock.json.JsonTestBean2;

public class HttpMock {

	@Test
	public void test01() {
		HttpRequest request = new BasicHttpRequest("PUT", "localhost:8080/novelty/demo/converter?dec=1,234,567.89",
				HttpVersion.HTTP_1_1);

		System.out.println(request.getRequestLine());
	}

	@Test
	public void test2017年1月18日01() throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		String url = "http://localhost:8080/novelty/demo/converter?dec=1,234,567.89";
		HttpGet request = new HttpGet(url);
		CloseableHttpResponse response = httpClient.execute(request);
		HttpEntity httpEntity = response.getEntity();
		String result = EntityUtils.toString(httpEntity);
		System.out.println(result);
	}

	@Test
	public void test2017年1月18日02() throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		String url = "http://localhost:8080/novelty/demo/converter";
		// HttpGet request = new HttpGet(url);
		HttpPut request = new HttpPut(url);
		JsonTestBean2 bean = new JsonTestBean2();
		bean.setDec("1,234,567.89");
//		bean.setDec("0");
		bean.setDate("2017-01-18");
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValueAsString(bean);
		request.setEntity(new StringEntity(mapper.writeValueAsString(bean), ContentType.APPLICATION_JSON));
		CloseableHttpResponse response = httpClient.execute(request);
		HttpEntity httpEntity = response.getEntity();
		String result = EntityUtils.toString(httpEntity);
		System.out.println(result);
	}

}
