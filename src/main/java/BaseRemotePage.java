

import java.net.MalformedURLException;
import java.net.URI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * BasePage class contains common methods for all page classes
 */

public class BaseRemotePage {
	public RemoteWebDriver driver;

	//Constructor
	public BaseRemotePage(RemoteWebDriver driver) {
		this.driver = driver;
		System.out.println("BaseRemotePage class initialized");
	}
	
	//Run tests through selenoid (selenium grid which uses docker)
    public void execute(String browser, String version) throws MalformedURLException, InterruptedException {
	    	DesiredCapabilities capabilities = new DesiredCapabilities();
	    	capabilities.setBrowserName(browser);
	    	capabilities.setVersion(version);
	    	capabilities.setCapability("enableVNC", true);
	
	    	RemoteWebDriver driver = new RemoteWebDriver(
	    	    URI.create("http://165.227.9.145:4444/wd/hub/").toURL(), 
	    	    capabilities
	    	);
	    	
	    	driver.get("https://www.google.com");
	    	Thread.sleep(15000);
    }
	
	//Click Method
	public void click(String cssLocator) {
		driver.findElement(By.cssSelector(cssLocator)).click();
	}
	
	//Fill fields in text boxes
	public void fillFields(String cssLocator, String text) {
		driver.findElement(By.cssSelector(cssLocator)).sendKeys(text + "\n");
	}
	
	//Get text from element
	public String getText(String cssLocator) {
		return driver.findElement(By.cssSelector(cssLocator)).getText();
	}
	
	//Get text from attribute
	public String getAttribute(String cssLocator, String attribute) {
		return driver.findElement(By.cssSelector(cssLocator)).getAttribute(attribute);
	}
}
