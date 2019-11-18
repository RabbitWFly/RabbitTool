package com.rabbit.core.thread;

import org.junit.Ignore;
import org.junit.Test;

import com.rabbit.core.lang.Console;
import com.rabbit.core.util.RandomUtil;

public class ConcurrencyTesterTest {

	@Test
	@Ignore
	public void concurrencyTesterTest() {
		ConcurrencyTester tester = ThreadUtil.concurrencyTest(100, new Runnable() {

			@Override
			public void run() {
				long delay = RandomUtil.randomLong(100, 1000);
				ThreadUtil.sleep(delay);
				Console.log("{} test finished, delay: {}", Thread.currentThread().getName(), delay);
			}
		});
		Console.log(tester.getInterval());
	}
}
