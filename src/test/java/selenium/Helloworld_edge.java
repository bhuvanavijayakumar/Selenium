package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Helloworld_edge {
	public static void main(String[] args){


		System.setProperty("webdriver.edge.driver",
				"/Users/bhuva/eclipse-workspace/Hello-world/src/main/resources/driver/edgedriver_win64 (1)/msedgedriver.exe");

		WebDriver driver= new EdgeDriver();
		driver.get("https://www.numpyninja.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}