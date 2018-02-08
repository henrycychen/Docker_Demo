import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTest {
	WebDriver driver;
	String baseURL;

	@Before
	public void setUp() throws Exception {
		baseURL = "https://www.docker.com/";
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	@Test
	public void test() {
		driver.get(baseURL);
	}

}
