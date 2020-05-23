package com.sample.jenkins.myclass;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sample.jenkins.myclass.Calc;

public class Calc_Test {

	@Test
	public void shouldCheckAddition() {
		Calc cal = new Calc();
		assertEquals(6, cal.add(3, 3));
	}

	@Test
	public void shouldCheckSub() {
		Calc cal = new Calc();
		assertEquals(0, cal.sub(3, 3));
	}
}
