import java.net.MalformedURLException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SelenoidGridTest extends BaseRemoteTest{
	
	    @Test
	    public void executeFirefoxDriver() throws MalformedURLException, InterruptedException {
			HomeRemotePage homeremotepage = new HomeRemotePage(driver);
			homeremotepage.execute("firefox", "58.0");
		}

	    @Test
	    public void executeChrome() throws MalformedURLException, InterruptedException {
			HomeRemotePage homeremotepage = new HomeRemotePage(driver);
			homeremotepage.execute("chrome", "64.0");
	    	}
}
