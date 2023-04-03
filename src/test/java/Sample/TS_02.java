package Sample;

import org.testng.annotations.Test;


public class TS_02 {
	
	@Test(groups = "smoke")
	public void test3() {
		System.out.println("test3 sucess");
	}
	
	
	@Test(groups = "regression")
	public void test2() {
		
		System.out.println("test4 sucess");

	}


}
