package com.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

/**
 * @author : Ki Beom Lee
 * @time : 2022. 3. 10.-¿ÀÈÄ 12:01:51
 */
public class NumberCaculationTest extends NumberCaculation {
	NumberCaculation nc = new NumberCaculation();
	@Test
	public void test1() {
		assertEquals(1,nc.add(1, 0));
	}
	@Test
	public void test2() {
		assertNotEquals(1, nc.add(1, 1));
	}
	@Test
	public void test3() {
		assertEquals("HELLO", nc.converCase("hello"));
	}

}
