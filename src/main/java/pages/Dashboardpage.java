package pages;

import SeleniumBase.ProjectSpecificMethods;

	public class Dashboardpage extends ProjectSpecificMethods {

		public Dashboardpage pageTitle()
		{
			String title = driver.getTitle();
			System.out.println("Page title"+ title);
		return this;
		}
	

}
