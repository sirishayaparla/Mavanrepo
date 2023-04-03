package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TS_01 {
	
	@Test(groups = "regression")
	public void test1() {
		System.out.println("test2 sucess");
	}
	
	
	@Test(groups = "smoke")
	public void test2() {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.google.com/");
		
		System.out.println("test2 sucess");
		//driver.close();

	}

}
