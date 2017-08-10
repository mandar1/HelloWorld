package com.experitest.auto;


import org.testng.annotations.BeforeTest;


public class AndroidDemoTest extends BaseTest {

	@BeforeTest
	public void setUp() throws Exception{
		//client.setDevice("@serialnumber='f354d4d0'");
		init("@os='android' and @serialnumber='f354d4d0'", this.getClass().getName());
	}
	
	@org.testng.annotations.Test
	public void test(){
		client.deviceAction("HOME");
		client.verifyElementFound("NATIVE", "//*[@text='Apps']", 0);
	}
	
	
}
