package basepckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class PurplleBase {
	public static WebDriver driver;
	@BeforeClass
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://www.purplle.com/");
		driver.manage().window().maximize();
	}

}
