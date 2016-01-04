package com.kdyzm.main.test;

import org.junit.Test;
import com.kdyzm.main.Hello;
public class HelloTest
{
	@Test
	public void testHello(){
		Hello hello=new Hello();
		int result=hello.calculate(2);
		System.out.println("get caculate result:"+result);
	}
}