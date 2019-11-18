package com.rabbit.core.lang;

import java.util.Set;

import org.junit.Ignore;
import org.junit.Test;

public class ClassScanerTest {
	
	@Test
	@Ignore
	public void scanTest() {
		ClassScanner scaner = new ClassScanner("com.rabbit.core.util", null);
		Set<Class<?>> set = scaner.scan();
		for (Class<?> clazz : set) {
			Console.log(clazz.getName());
		}
	}
}
