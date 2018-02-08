import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
	public WebDriver driver;
	public WebDriverWait wait;

	@Before
	public void setUp() throws Exception {
		//Create a Chrome driver. All tests and page classes will use this.
		driver = new ChromeDriver();
		
		//Create a wait. All tests and page classes will use this.
		wait = new WebDriverWait(driver, 15);
		
		//Maximize Window
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void invalidSearchResultTest() throws InterruptedException {
		//Page instantiations
		HomePage homepage = new HomePage(driver, wait);
		SearchPage searchpage = new SearchPage(driver, wait);
		//Test Variables
		String searchString = "dafdsfdasjfkldas";
		//Page Methods
		homepage.goToHomePage();
		homepage.click(homepage.navBarSearch);
		homepage.fillFields(homepage.navBarSearchTextField, searchString);
		searchpage.verifySearchResultInvalidText();
		searchpage.verifyAdvancedSearch();
		searchpage.verifySearchUsedText(searchString);
		searchpage.invalidSearchResult();
	}

}
