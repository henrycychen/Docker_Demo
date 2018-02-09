

import java.net.MalformedURLException;
import org.junit.Test;

public class SelenoidGridTest extends BaseRemoteTest{
	
	    @Test
	    public void executeFirefoxDriver() throws MalformedURLException, InterruptedException {
			HomeRemotePage homeremotepage = new HomeRemotePage(driver);
			homeremotepage.goToHomePage("firefox", "58.0");
			homeremotepage.driver.quit();
		}

	    @Test
	    public void executeChrome() throws MalformedURLException, InterruptedException {
			HomeRemotePage homeremotepage = new HomeRemotePage(driver);
			homeremotepage.goToHomePage("chrome", "64.0");
			homeremotepage.driver.quit();
	    	}
}
