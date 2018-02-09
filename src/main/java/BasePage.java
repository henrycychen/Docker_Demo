

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * BasePage class contains common methods for all page classes
 */

public class BasePage {
	public WebDriver driver;
	public WebDriverWait wait;
	
	//Constructor
	public BasePage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
		System.out.println("BasePage class initialized");
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
