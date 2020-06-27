package com.WSECU.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.WSECU.testbase.BaseClass;
import com.WSECU.testbase.PageInitializer;
import com.WSECU.utils.CommonMethods;

public class FrontPageElements extends CommonMethods {

	@FindBy (xpath = "//div[@class = 'icon icon-arrows-down']")
	public WebElement arrow;
	@FindBy (xpath = "//*[@id=\"items-grid\"]/li[4]/a/div[2]")
	public WebElement briskTableIcon;
	
	public FrontPageElements(){
		PageFactory.initElements(BaseClass.driver, this);
	}
	
}
