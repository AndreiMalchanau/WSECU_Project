package com.WSECU.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.WSECU.testbase.BaseClass;
import com.WSECU.utils.CommonMethods;

public class SecondLoginElements extends CommonMethods{

	@FindBy(xpath = "//input[@name = 'password']")
	public WebElement password;
	
	@FindBy(xpath = "//button[@type = 'submit']")
	public WebElement passwordButton;
	
	@FindBy(xpath = "//div[@class = 'ng-binding ng-scope']")
	public WebElement popUpMessage;
	
	public SecondLoginElements(){
		PageFactory.initElements(BaseClass.driver, this);
	}
	
}
