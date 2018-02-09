import org.openqa.selenium.remote.RemoteWebDriver;

public class HomeRemotePage extends BaseRemotePage{
	
	public HomeRemotePage(RemoteWebDriver driver) {
		super(driver);
		System.out.println("HomeRemotePage class activated");
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
	public void goToHomePage() {
		driver.get(baseURL);
	}
}
