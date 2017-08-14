package com.experitest.auto;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SNOverlayIcon extends BaseTest {
	
	@BeforeTest
	public void setUp() throws Exception{
		init("@os='android' and @serialnumber='f354d4d0'", this.getClass().getName());
	}
	
	@Test
	public void checkForOverlayIcon() {
		client.waitForElement("WEB", "xpath=//*[@text='	' and @nodeName='svg' and @width>0]", 0, 10000);
		
		boolean testCondition = client.isElementFound("WEB", "xpath=//*[@text='	' and @nodeName='svg' and @width>0]", 0);

		client.report("Overlay Icon ", testCondition);
		client.click("WEB", "xpath=//*[@text='	' and @nodeName='svg' and @width>0]", 0, 1);
	}
	
	@Test
	public void checkProtectionLevel() {
		client.waitForElement("WEB", "xpath=//*[@text='	' and @nodeName='svg' and @width>0]", 0, 10000);
		
		boolean testCondition = client.isElementFound("WEB", "xpath=//*[@text='	' and @nodeName='svg' and @width>0]", 0);

		client.report("Overlay Icon ", testCondition);
		client.click("WEB", "xpath=//*[@text='	' and @nodeName='svg' and @width>0]", 0, 1);
	}
}