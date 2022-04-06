package com.kobil.dashboard.pages;

import java.io.IOException;
import org.openqa.selenium.By;
import com.kobil.dashboard.base.TestBase;

public class LoginPage extends TestBase{

	public LoginPage() throws IOException {
		super();		
	}
	

	private By txtUsername = By.xpath("//input[@id='username']");
	private By txtPassword = By.xpath("//input[@id='password']");
	private By btnSubmit = By.xpath("//button[@id='kc-login']");
	
	
	public void login() {	
		driver.findElement(txtUsername).sendKeys(prop.getProperty("ibbTest_usrName"));	
		driver.findElement(txtPassword).sendKeys(prop.getProperty("ibbTest_pwd"));
		driver.findElement(btnSubmit).click();
	}
}
