package demo.xebia;

import static org.junit.Assert.*;

import org.junit.Test;

import mypkg.MyCalc;

public class MyCalcTest {
	MyCalc calc = new MyCalc();

	@Test
	public void test_sum() {
		assertEquals(50, calc.sum(30, 20));
	}
	@Test
	public void test_diff() {
		assertEquals(10, calc.diff(30, 20));
	}


}
