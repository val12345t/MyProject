package test;

import static org.junit.Assert.*;
import test.Junit;

import org.junit.Test;

public class Concatenate {

	@Test
	public void testConcatenate() {
		Junit t1=new Junit();
		String result=t1.concatenate("one", "two");
		assertEquals("onetwo",result);
	}

	@Test
	public void testMultiply() {
		Junit t1=new Junit();
		int result=t1.multiply(12,2);
		assertEquals(24,result);
	}

}
