package com.inditex.rest.webservices.restfulwebservices;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
class RestfulWebServicesApplicationTests {

	
	private static String getTestResponse(String request) throws IOException, JSONException {

		
		URL url = new URL("http://localhost:8080" + request);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		
		int status = con.getResponseCode();
		
		BufferedReader in = new BufferedReader(
				  new InputStreamReader(con.getInputStream()));
				String inputLine;
				StringBuffer content = new StringBuffer();
				while ((inputLine = in.readLine()) != null) {
				    content.append(inputLine);
				}
		in.close();

		con.disconnect();
			
		return content.toString();
	}
	 
	
	/* Test 1: petición a las 10:00 del día 14 del producto 35455   para la brand 1 (ZARA) */
	@Test
	public void test1() throws IOException, JSONException  {
		ObjectMapper mapper = new ObjectMapper();
		String response = getTestResponse("/price?datetime=20200614100000&productid=35455&brandid=1");
		
		JSONObject  expected = new JSONObject();
		
		expected.put("productId","35455");
		expected.put("endDate","2020-12-31 23:59:59.0");
		expected.put("price",	"35.5");
		expected.put("brandId", "1");
		expected.put("startDate","2020-06-14 00:00:00.0");
		expected.put("priceList","1");
		
		assertEquals(mapper.readTree(expected.toString()), mapper.readTree(response));

	}
	
	
	/* Test 2: petición a las 16:00 del día 14 del producto 35455   para la brand 1 (ZARA) */
	@Test
	public void test2() throws IOException, JSONException  {
		ObjectMapper mapper = new ObjectMapper();
		String response = getTestResponse("/price?datetime=20200614160000&productid=35455&brandid=1");
		
		JSONObject  expected = new JSONObject();
		
		expected.put("productId","35455");
		expected.put("endDate","2020-06-14 18:30:00.0");
		expected.put("price",	"25.45");
		expected.put("brandId", "1");
		expected.put("startDate","2020-06-14 15:00:00.0");
		expected.put("priceList","2");
		
		assertEquals(mapper.readTree(expected.toString()), mapper.readTree(response));

	}
	
	
	/*  Test 3: petición a las 21:00 del día 14 del producto 35455   para la brand 1 (ZARA) */
	@Test
	public void test3() throws IOException, JSONException  {
		ObjectMapper mapper = new ObjectMapper();
		String response = getTestResponse("/price?datetime=20200614210000&productid=35455&brandid=1");
		
		JSONObject  expected = new JSONObject();
		
		expected.put("productId","35455");
		expected.put("endDate","2020-12-31 23:59:59.0");
		expected.put("price",	"35.5");
		expected.put("brandId", "1");
		expected.put("startDate","2020-06-14 00:00:00.0");
		expected.put("priceList","1");
		
		assertEquals(mapper.readTree(expected.toString()), mapper.readTree(response));

	}
	
	
	/*   Test 4: petición a las 10:00 del día 15 del producto 35455   para la brand 1 (ZARA) */
	@Test
	public void test4() throws IOException, JSONException  {
		ObjectMapper mapper = new ObjectMapper();
		String response = getTestResponse("/price?datetime=20200615100000&productid=35455&brandid=1");
		
		JSONObject  expected = new JSONObject();
		
		expected.put("productId","35455");
		expected.put("endDate","2020-06-15 11:00:00.0");
		expected.put("price",	"30.5");
		expected.put("brandId", "1");
		expected.put("startDate","2020-06-15 00:00:00.0");
		expected.put("priceList","3");
		
		assertEquals(mapper.readTree(expected.toString()), mapper.readTree(response));

	}

	
	/*   Test 5: petición a las 21:00 del día 16 del producto 35455   para la brand 1 (ZARA) */
	@Test
	public void test5() throws IOException, JSONException  {
		ObjectMapper mapper = new ObjectMapper();
		String response = getTestResponse("/price?datetime=20200616210000&productid=35455&brandid=1");
		
		JSONObject  expected = new JSONObject();
		
		expected.put("productId","35455");
		expected.put("endDate","2020-12-31 23:59:59.0");
		expected.put("price",	"38.95");
		expected.put("brandId", "1");
		expected.put("startDate","2020-06-15 16:00:00.0");
		expected.put("priceList","4");
		
		assertEquals(mapper.readTree(expected.toString()), mapper.readTree(response));

	}
}
