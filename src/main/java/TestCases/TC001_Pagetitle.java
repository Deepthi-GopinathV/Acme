package TestCases;

import org.testng.annotations.Test;

import SeleniumBase.ProjectSpecificMethods;
import pages.Login;


	
	public class TC001_Pagetitle extends ProjectSpecificMethods{

		@Test
		public void runLogin() throws InterruptedException
		{
			new Login().EnterUsername().EnterPassword().ClickLogin().pageTitle();		
			
		}
	}
