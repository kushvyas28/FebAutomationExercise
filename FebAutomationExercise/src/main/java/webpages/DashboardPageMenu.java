package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
 * This DashboardPageMenu class holds all web elements and events for Menu section on home screen.
 */

public class DashboardPageMenu {

	WebElement menuDashboard;
	WebElement menuUsers;
	WebElement menuGroups;
	WebElement menuAccounts;
	WebElement menuPrinters;
	WebElement menuDevices;
	WebElement menuReports;
	WebElement menuCards;
	WebElement menuOptions;
	WebElement menuLogs;
	WebElement menuAbout;

	String aboutPageVersionAndBuild;
	String dashboardPageVersion;
	String dashboardPageBuild;

	// Below method is defined to find the Dashboard menu item on home screen and fetch build and version from the footer
	public String verifyMenuDashboard(WebDriver driver) {
		menuDashboard = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/ul[1]/li[1]/div[1]/a[1]/span[2]/span[1]"));
		if (menuDashboard.isDisplayed()) {
			menuDashboard.click();
			dashboardPageVersion = driver.findElement(By.xpath("//span[contains(text(),'18.3.6')]"))
					.getAttribute("innerHTML");
			dashboardPageBuild = driver.findElement(By.xpath("//span[contains(text(),'(Build 48133')]"))
					.getAttribute("innerHTML");

		} else
			System.out.println("Dashboard menu is not visible");
		return dashboardPageVersion.concat(dashboardPageBuild);
	}

	// Below method is defined to find the Users menu item on home screen
	public void verifyMenuUsers(WebDriver driver) {
		menuUsers = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/ul[1]/li[2]/div[1]/a[1]/span[2]/span[1]"));
		if (menuUsers.isDisplayed())
			menuUsers.click();
		else
			System.out.println("Users menu is not visible");
	}

	// Below method is defined to find the Groups menu item on home screen
	public void verifyMenuGroups(WebDriver driver) {
		menuGroups = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/ul[1]/li[3]/div[1]/a[1]/span[2]/span[1]"));
		if (menuGroups.isDisplayed())
			menuGroups.click();
		else
			System.out.println("Groups menu is not visible");
	}

	// Below method is defined to find the Accounts menu item on home screen
	public void verifyMenuAccounts(WebDriver driver) {
		menuAccounts = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/ul[1]/li[4]/div[1]/a[1]/span[2]/span[1]"));
		if (menuAccounts.isDisplayed())
			menuAccounts.click();
		else
			System.out.println("Accounts menu is not visible");
	}

	// Below method is defined to find the Printers menu item on home screen
	public void verifyMenuPrinters(WebDriver driver) {
		menuPrinters = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/ul[1]/li[5]/div[1]/a[1]/span[2]/span[1]"));
		if (menuPrinters.isDisplayed())
			menuPrinters.click();
		else
			System.out.println("Printers menu is not visible");
	}

	// Below method is defined to find the Devices menu item on home screen
	public void verifyMenuDevices(WebDriver driver) {
		menuDevices = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/ul[1]/li[6]/div[1]/a[1]/span[2]/span[1]"));
		if (menuDevices.isDisplayed())
			menuDevices.click();
		else
			System.out.println("Devices menu is not visible");
	}

	// Below method is defined to find the Reports menu item on home screen
	public void verifyMenuReports(WebDriver driver) {
		menuReports = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/ul[1]/li[7]/div[1]/a[1]/span[2]/span[1]"));
		if (menuReports.isDisplayed())
			menuReports.click();
		else
			System.out.println("Reports menu is not visible");
	}

	// Below method is defined to find the Cards menu item on home screen
	public void verifyMenuCards(WebDriver driver) {
		menuCards = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/ul[1]/li[8]/div[1]/a[1]/span[2]/span[1]"));
		if (menuCards.isDisplayed())
			menuCards.click();
		else
			System.out.println("Cards menu is not visible");
	}

	// Below method is defined to find the Options menu item on home screen
	public void verifyMenuOptions(WebDriver driver) {
		menuOptions = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/ul[1]/li[9]/div[1]/a[1]/span[2]/span[1]"));
		if (menuOptions.isDisplayed())
			menuOptions.click();
		else
			System.out.println("Options menu is not visible");
	}

	// Below method is defined to find the Logs menu item on home screen
	public void verifyMenuLogs(WebDriver driver) {
		menuLogs = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/ul[1]/li[10]/div[1]/a[1]/span[2]/span[1]"));
		if (menuLogs.isDisplayed())
			menuLogs.click();
		else
			System.out.println("Logs menu is not visible");
	}

	// Below method is defined to find the About menu item on home screen and fetch build and version
	public String verifyMenuAbout(WebDriver driver) {
		menuAbout = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/ul[1]/li[11]/div[1]/a[1]/span[2]/span[1]"));
		if (menuAbout.isDisplayed()) {
			menuAbout.click();
			aboutPageVersionAndBuild = driver.findElement(By.xpath(
					"/html[1]/body[1]/div[5]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/p[1]"))
					.getAttribute("innerHTML");

		} else
			System.out.println("About menu is not visible");
		return aboutPageVersionAndBuild;
	}
}
