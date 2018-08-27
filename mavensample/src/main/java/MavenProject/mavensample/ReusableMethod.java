package MavenProject.mavensample;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Hello world!
 *
 */
public class ReusableMethod 
{
    public WebDriver driver;
    public void Launch() {
    	
//    	
//    	driver.get("https://www.xero.com/us/");
    	String GDpath="Z:\\SELENIUM_INSTALL\\geckodriver-v0.21.0-win64\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", GDpath);
		 DesiredCapabilities capabilities = new DesiredCapabilities();
		
	 capabilities = DesiredCapabilities.firefox();
		 capabilities.setBrowserName("firefox");
	 	 capabilities.setVersion("your firefox version");
	 	 capabilities.setPlatform(Platform.WINDOWS);
	 	 capabilities.setCapability("marionette", false);
		 
		 driver = new FirefoxDriver(capabilities);
		// driver=new FirefoxDriver();
		 
		driver.get("https://www.xero.com/us/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    }
    
    /* Name of the Method: clickButton
	 * Brief description: Click on Web Button 
	 * Arguments: obj --> webelement Object,objName --> Object Name
	 * Created By: ponmani 
	  * Creation Date: aug 25 2018
	 * Last Modified: aug 25 2018
	 * */
	public void clickButton(WebElement obj, String objName) throws IOException{
		if(obj.isDisplayed()){
			obj.click();
			System.out.println("Pass: " +objName + " is clicked");
		}
		else{
			System.out.println("Fail: "  +objName + " Button is not displayed please check your application");

		}
	}
	
	/* Name of the Method: enterText
	 * Brief description: Enter text value to text boxes 
	 * Arguments: obj --> webelement Object, textVal --> text to be entered, objName --> Object Name
	 * Created By: ponmani 
	 * Creation Date: aug 25 2018
	 * Last Modified: aug 25 2018
	 * */
	public void enterText(WebElement obj, String textVal, String objName) throws IOException{


		if(obj.isDisplayed()){
			obj.sendKeys(textVal);
			System.out.println("Pass: " +textVal+ "  is entered in " + objName + " field");
		}else{
			System.out.println("Fail: "+objName + " field is not displayed please check your application ");
		}

	}
	
	/* Name of the Method: validateTextMessage
	 * Brief description: validating Text message
	 * Arguments: obj --> webelement Object,objName --> Object Name
	 * Created By: ponmani 
	 * Creation Date: aug 25 2018
	 * Last Modified: aug 25 2018
	 * */
	public void validateTextMessage(WebElement obj, String expectedMsg, String objname) throws IOException{


		if(obj.isDisplayed()){
			String actualMsg = obj.getText().trim();
			System.out.println("___________"+actualMsg);
			if(expectedMsg.equals(actualMsg)){

				System.out.println("Pass: " + actualMsg+" is matched with expectedErrMsg "+expectedMsg);

			}
			else{

				System.out.println("Fail: "+ actualMsg+" is not matched with expectedErrMsg "+expectedMsg);

			}
		}
		else{
			System.out.println("Fail: "+objname + " Button is not displayed please check your application");

		}



	}
	
	
	
}
