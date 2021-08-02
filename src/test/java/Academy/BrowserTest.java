package Academy;

import static org.junit.Assert.assertEquals;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class BrowserTest {

	@Test
	public void getData() {
		System.out.println("Hello Guys");
		// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriverService chromeDriverService = ChromeDriverService.createDefaultService();
		WebDriver driver = new ChromeDriver(chromeDriverService);
		driver.get("https://surendharthallapelly.azurewebsites.net/webapp/");
		String text = driver.findElement(By.cssSelector("h1")).getText();
		System.out.println(text);

		Assert.assertTrue(text.equalsIgnoreCase("SurendharThallapelly Azure Devops Learning"));
		driver.close();

		try {
			driver.quit();
			Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
		}

		catch (Exception e) {
		}

	}
}
