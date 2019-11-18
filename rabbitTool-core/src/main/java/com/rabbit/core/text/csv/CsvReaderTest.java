package com.rabbit.core.text.csv;

import org.junit.Assert;
import org.junit.Test;

import com.rabbit.core.io.resource.ResourceUtil;
import com.rabbit.core.util.CharsetUtil;

public class CsvReaderTest {
	
	@Test
	public void readTest() {
		CsvReader reader = new CsvReader();
		CsvData data = reader.read(ResourceUtil.getReader("test.csv", CharsetUtil.CHARSET_UTF_8));
		Assert.assertEquals("关注\"对象\"", data.getRow(0).get(2));
	}
}
