package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Helloworld_firefox {
	
	public static void main(String[] args){
	
	
	/*String path=System.getProperty("user.dir");
	System.out.println(path);

	System.setProperty("webdriver.gecko.driver",
path+"/driver/geckodriver-v0.33.0-win-aarch64/geckodriver.exe");*/
	
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.amazon.com/");
	System.out.println(driver.getTitle());
	driver.quit();
	

}
}
