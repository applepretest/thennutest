package Modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import MavenProject.mavensample.ReusableMethod;

public class Homepage {
	public WebDriver driver;
	
	/*composition class*/
	public Homepage(WebDriver driver) {
		this.driver =driver;
	}
	/*
	 * clicking login btn and naviaget to login page*/
	public void ClickLogin() {
		WebElement login = driver.findElement(By.xpath("//li[@class='global-ceiling-bar-cta1']/a"));
		ReusableMethod R = new ReusableMethod();
		try {
			R.clickButton(login,"Login button");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
