package com.WSECU.testbase;

import com.WSECU.Pages.LoginElements;
import com.WSECU.Pages.SecondLoginElements;

public class PageInitializer extends BaseClass{
         
	public static LoginElements login;
	public static SecondLoginElements secondLogin;
	
	
	public static void initializeAll() {
		
		login = new LoginElements();
		secondLogin = new SecondLoginElements();
	}
}
