package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class ThirdTest extends BaseClass {
	@Test
	public void thirdTest() throws InterruptedException {
		SoftAssert soft = new SoftAssert();
		
		home.searchCourse("core java for selenium");
		soft.assertTrue(javaDemo.getpageHeader().isDisplayed());
		coreJava.clickCoreJavaLink();
		soft.assertTrue(javaDemo.getpageHeader().isDisplayed());
		web.switchToFrame(0);
		javaDemo.clickPlayButton();
		Thread.sleep(3000);
		javaDemo.clickPauseButton();
		javaDemo.clickAddToWhislist();
		
		soft.assertAll();
		
		
		
		
		
	}

}
