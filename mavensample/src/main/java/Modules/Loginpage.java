package Modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import MavenProject.mavensample.ReusableMethod;

public class Loginpage {
	
	public WebDriver driver;
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
	}
	
	/*Enter username and pass and click login btn*/
	public void Login(String un,String pwd) throws IOException {
		ReusableMethod R = new ReusableMethod();
		WebElement username = driver.findElement(By.id("email"));
		R.enterText(username, un, "User Name ");

		WebElement password = driver.findElement(By.id("password"));
		R.enterText(password, pwd, "Password ");

		WebElement btnLogin = driver.findElement(By.id("submitButton"));
		R.clickButton(btnLogin, "Login Button ");
	}
	
	/*Verify the incorrect credential error message*/
	public void ErrorMsg(String expectedMsg) throws IOException {
		ReusableMethod R = new ReusableMethod();
		
		WebElement Errormsg=driver.findElement(By.xpath("//div[@class='x-boxed warning']/p"));
		R.validateTextMessage(Errormsg, expectedMsg, "Incorrect credential");
	}

}
