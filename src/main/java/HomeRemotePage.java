

import java.net.MalformedURLException;
import java.net.URI;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HomeRemotePage extends BaseRemotePage{
	
	public HomeRemotePage(RemoteWebDriver driver) {
		super(driver);
		System.out.println("HomeRemotePage class initialized");
	}
	
	//Page Variables
	String baseURL = "https://www.docker.com";
	
	//Web Elements
	public String navBarWhatIsDocker = ".row.desktop a[href='/what-docker']";
	public String navBarProduct = ".row.desktop a[href='/get-docker']";
	public String navBarCommunity = ".row.desktop a[href='/docker-community']";
	public String navBarSupport = ".row.desktop .last.expanded a[href='/']";
	public String navBarSearch = "#search_box_icon";
	public String navBarSearchTextField = "#edit-search-block-form--2";
	public String navBarCreateID = ".row.desktop a[href='https://cloud.docker.com/']";
	public String navBarSignIn = ".row.desktop a[href='https://cloud.docker.com/login/']";
	
	//Page Methods
	public void goToHomePage(String browser, String version) throws MalformedURLException, InterruptedException {
	    	DesiredCapabilities capabilities = new DesiredCapabilities();
	    	capabilities.setBrowserName(browser);
	    	capabilities.setVersion(version);
	    	capabilities.setCapability("enableVNC", true);
		this.driver = new RemoteWebDriver(
	    	    URI.create("http://165.227.9.145:4444/wd/hub/").toURL(), 
	    	    capabilities
	    	);
		driver.get(baseURL);
	}
}
