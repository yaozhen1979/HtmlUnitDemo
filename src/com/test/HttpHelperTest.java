package com.test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.junit.Test;

import com.main.java.helper.HttpHelper;

class TestForHttpHelper extends HttpHelper {
	@Override
	protected InputStream createInputStream(URL url) throws IOException {
		// 傳回的 InputStream 就是 Mock 物件的概念
		return new ByteArrayInputStream(new String("success").getBytes());
	}
}

public class HttpHelperTest {
	@Test
	public void testGetContent() throws Exception {
		HttpHelper helper = new TestForHttpHelper();
		String expected = "success";
		String result = helper.getContent(new URL("http://localhost:8080"));
		assertEquals(expected, result);
	}
}
