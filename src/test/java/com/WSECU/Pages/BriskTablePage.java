package com.WSECU.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.WSECU.testbase.BaseClass;
import com.WSECU.utils.CommonMethods;

public class BriskTablePage extends CommonMethods{

	@FindBy (linkText = "Teachers")
	public WebElement textTeacher;
	
	
	public BriskTablePage(){
		PageFactory.initElements(BaseClass.driver, this);
	}
	
}
