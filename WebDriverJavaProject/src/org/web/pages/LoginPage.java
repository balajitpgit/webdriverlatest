package org.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.web.automation.base.InitiateDriver;

	

public class LoginPage extends InitiateDriver {
	
	@FindBy(xpath="//input[@name='email']") WebElement usernameTextBox;
	@FindBy(xpath="//input[@name='pass']") WebElement passwordTextBox;
	
	public void enterUserName() {
		usernameTextBox.sendKeys("Pranav");
	}
	
	public void enterPassword() {
		passwordTextBox.sendKeys("Pass1");

	}

}
