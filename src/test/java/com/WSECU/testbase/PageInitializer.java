package com.WSECU.testbase;

import com.WSECU.Pages.BriskTablePage;
import com.WSECU.Pages.FrontPageElements;
import com.WSECU.Pages.LoginElements;
import com.WSECU.Pages.SecondLoginElements;

public class PageInitializer extends BaseClass{
         
	public static LoginElements login;
	public static SecondLoginElements secondLogin;
	
	public static FrontPageElements frontPage;
	public static BriskTablePage tablePage;
	
	
	public static void initializeAll() {
		
		login = new LoginElements();
		secondLogin = new SecondLoginElements();
		
		frontPage = new FrontPageElements();
		tablePage = new BriskTablePage();
	}
}
