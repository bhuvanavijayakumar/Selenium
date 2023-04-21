package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

public class Helloworld_chrome {
	public static void main(String[] args){


		/*System.setProperty("webdriver.chrome.driver",
				"/Users/bhuva/eclipse-workspace/Hello-world/src/main/resources/driver/chromedriver_new/chromedriver.exe");

		/*updated new version of chrome
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");*/
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.numpyninja.com/");
		System.out.println(driver.getTitle());
		driver.quit();

	}


}
