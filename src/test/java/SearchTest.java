

import org.junit.Test;

public class SearchTest extends BaseTest{
	
	@Test
	public void validSearchResultTest() throws InterruptedException {
		//Page instantiations
		HomePage homepage = new HomePage(driver, wait);
		SearchPage searchpage = new SearchPage(driver, wait);
		//Test Variables
		String searchString = "Hello World";
		//Page Methods
		homepage.goToHomePage();
		homepage.click(homepage.navBarSearch);
		homepage.fillFields(homepage.navBarSearchTextField, searchString);
		searchpage.verifySearchResultText();
		searchpage.verifyAdvancedSearch();
		searchpage.verifySearchUsedText(searchString);
		searchpage.validSearchResult();
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
