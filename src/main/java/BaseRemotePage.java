

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

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
