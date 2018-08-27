package MavenProject.mavensample;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Modules.Homepage;
import Modules.Loginpage;

public class TCDriver extends ReusableMethod {
	
	@BeforeClass
	public void launchBrowser() {
		Launch();
		System.out.println("Browser is launched and navigated to url");
	}
	
	@Test
	public void NavigatetoLogin() throws InterruptedException, IOException {
		Homepage hp=new Homepage(driver);
		hp.ClickLogin();
		Thread.sleep(3000);
		Loginpage lp=new Loginpage(driver);
		lp.Login("ponmani027@gmail.com", "PURPLE646");
		
	}

}
