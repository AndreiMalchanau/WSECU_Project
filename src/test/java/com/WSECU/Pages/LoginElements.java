package com.WSECU.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.WSECU.testbase.BaseClass;
import com.WSECU.utils.CommonMethods;

public class LoginElements extends CommonMethods{

	@FindBy(id = "digital-banking-username")
	public WebElement signIn;
	
	@FindBy(xpath = "//input[@class = 'button']")
	public WebElement signInButton;

	
	public LoginElements(){
		PageFactory.initElements(BaseClass.driver, this);
	}
}
