package pages;


import SeleniumBase.ProjectSpecificMethods;

public class Login extends ProjectSpecificMethods {

		public Login EnterUsername()
		{
			driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		return this;
		}
		public Login EnterPassword()
		{
			driver.findElementById("password").sendKeys("leaf@12");
			return this;
		}
		public Dashboardpage ClickLogin()
		{
			driver.findElementById("buttonLogin").click();
			return new Dashboardpage();
		}
		

		
		
	}


