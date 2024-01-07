package com.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestA {
	@Test
	public void test() {
		Reporter.log("sahana", true);
	}

}
