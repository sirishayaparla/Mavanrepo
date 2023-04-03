package Sample;

import org.testng.annotations.Test;

public class TS_03 {
	
	@Test(groups = "regression")
	public void test5() {
		System.out.println("test5 sucess");
	}
	
	
	@Test(groups = "smoke")
	public void test6() {
		
		System.out.println("test6 sucess");

	}


}
