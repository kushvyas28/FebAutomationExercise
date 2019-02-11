package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webpages.LoginPage;
import webpages.DashboardPageMenu;
import webpages.DashboardPageSubMenu;

public class PapercutTestCases {
	public static WebDriver driver;
	DashboardPageMenu dashboardPagemenu = new DashboardPageMenu();
	DashboardPageSubMenu dashboardPageSubMenu = new DashboardPageSubMenu();

	String dashboardPageVersionAndBuild;
	String dashboardPageVersion;
	String dashboardPageBuild;

	String aboutPageVersionAndBuild;
	String aboutPageVersion;
	String aboutPageBuild;

	@BeforeClass
	public void launchFirefoxbrowser() {
		System.out.println("Launching Firefox Browser");
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Kush\\Desktop\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://localhost:9191/admin");
		driver.manage().window().maximize();
	}

	// Below Test case is to verify Login functionality
	@Test(priority = 1)
	public void verifyLogin() {
		System.out.println("Attempting to Login");
		LoginPage loginPage = new LoginPage();
		loginPage.papercutLogin("admin", "kushvyas", driver);
		String dashboardPageTitle = driver.getTitle();
		Assert.assertEquals(dashboardPageTitle, "PaperCut NG : Dashboard : Dashboard");
		System.out.println("Login Successful");
	}

	// Below Test case is to verify Menu and Submenu links
	@Test(priority = 2)
	public void verifyMenuLinks() {
		System.out.println("Menu Link verification - Start");

		// Verify Menu Item - Dashboard
		dashboardPageVersionAndBuild = dashboardPagemenu.verifyMenuDashboard(driver);
		String dashboardMenuTitle = driver.getTitle();
		Assert.assertEquals(dashboardMenuTitle, "PaperCut NG : Dashboard : Dashboard");
		System.out.println("Menu Verified - Dashboard");

		// Verify Menu Item - Users
		dashboardPagemenu.verifyMenuUsers(driver);
		String usersMenuTitle = driver.getTitle();
		Assert.assertEquals(usersMenuTitle, "PaperCut NG : Users : User List");
		System.out.println("Menu Verified - Users");

		// Verify Menu Item - Groups
		dashboardPagemenu.verifyMenuGroups(driver);
		String groupsMenuTitle = driver.getTitle();
		Assert.assertEquals(groupsMenuTitle, "PaperCut NG : Groups : Group List");
		System.out.println("Menu Verified - Groups");

		// Verify Menu Item - Accounts
		dashboardPagemenu.verifyMenuAccounts(driver);
		String accountsMenuTitle = driver.getTitle();
		Assert.assertEquals(accountsMenuTitle, "PaperCut NG : Accounts : Shared Account List");
		System.out.println("Menu Verified - Accounts");

			// Verify Menu Item - Accounts : Submenu Item - Shared Account List
			dashboardPageSubMenu.verifyMenuAccountsSubMenuSharedAccountList(driver);
			String accountsSubMenu1Title = driver.getTitle();
			Assert.assertEquals(accountsSubMenu1Title, "PaperCut NG : Accounts : Shared Account List");
			System.out.println("Sub Menu Verified - Accounts - Shared Account List");
	
			// Verify Menu Item - Accounts : Submenu Item - Batch Import Update
			dashboardPageSubMenu.verifyMenuAccountsSubMenuBatchImportUpdate(driver);
			String accountsSubMenu2Title = driver.getTitle();
			Assert.assertEquals(accountsSubMenu2Title, "PaperCut NG : Accounts : Batch Import / Update");
			System.out.println("Sub Menu Verified - Accounts - Batch Import / Update");
	
			// Verify Menu Item - Accounts : Submenu Item - Shared Account Sync
			dashboardPageSubMenu.verifyMenuAccountsSubMenuSharedAccountSync(driver);
			String accountsSubMenu3Title = driver.getTitle();
			Assert.assertEquals(accountsSubMenu3Title, "PaperCut NG : Accounts : Shared Account Sync");
			System.out.println("Sub Menu Verified - Accounts - Shared Account Sync");

		// Verify Menu Item - Printers
		dashboardPagemenu.verifyMenuPrinters(driver);
		String printersMenuTitle = driver.getTitle();
		Assert.assertEquals(printersMenuTitle, "PaperCut NG : Printers : Printer List");
		System.out.println("Menu Verified - Printers");

			// Verify Menu Item - Printers : Submenu Item - Printer List
			dashboardPageSubMenu.verifyMenuPrintersSubMenuPrinterList(driver);
			String printersSubMenu1Title = driver.getTitle();
			Assert.assertEquals(printersSubMenu1Title, "PaperCut NG : Printers : Printer List");
			System.out.println("Sub Menu Verified - Printers - Printer List");
	
			// Verify Menu Item - Printers : Submenu Item - Jobs Pending Release
			dashboardPageSubMenu.verifyMenuPrintersSubMenuJobsPendingRelease(driver);
			String printersSubMenu2Title = driver.getTitle();
			Assert.assertEquals(printersSubMenu2Title, "PaperCut NG : Printers : Jobs Pending Release");
			System.out.println("Sub Menu Verified - Printers - Jobs Pending Release");
	
			// Verify Menu Item - Printers : Submenu Item - Notification Options
			dashboardPageSubMenu.verifyMenuPrintersSubMenuNotificationOptions(driver);
			String printersSubMenu3Title = driver.getTitle();
			Assert.assertEquals(printersSubMenu3Title, "PaperCut NG : Printers : Notification Options");
			System.out.println("Sub Menu Verified - Printers - Notification Options");
	
			// Verify Menu Item - Printers : Submenu Item - Charts
			dashboardPageSubMenu.verifyMenuPrintersSubMenuCharts(driver);
			String printersSubMenu4Title = driver.getTitle();
			Assert.assertEquals(printersSubMenu4Title, "PaperCut NG : Printers : Charts");
			System.out.println("Sub Menu Verified - Printers - Charts");
	
			// Verify Menu Item - Printers : Submenu Item - Refunds
			dashboardPageSubMenu.verifyMenuPrintersSubMenuRefunds(driver);
			String printersSubMenu5Title = driver.getTitle();
			Assert.assertEquals(printersSubMenu5Title, "PaperCut NG : Printers : User Refund Requests");
			System.out.println("Sub Menu Verified - Printers - Refunds");

		// Verify Menu Item - Devices
		dashboardPagemenu.verifyMenuDevices(driver);
		String devicesMenuTitle = driver.getTitle();
		Assert.assertEquals(devicesMenuTitle, "PaperCut NG : Devices : External Device List");
		System.out.println("Menu Verified - Devices");

		// Verify Menu Item - Reports
		dashboardPagemenu.verifyMenuReports(driver);
		String reportsMenuTitle = driver.getTitle();
		Assert.assertEquals(reportsMenuTitle, "PaperCut NG : Reports : User Reports");
		System.out.println("Menu Verified - Reports");

			// Verify Menu Item - Reports : Submenu Item - User
			dashboardPageSubMenu.verifyMenuReportsSubMenuUser(driver);
			String reprotsSubMenu1Title = driver.getTitle();
			Assert.assertEquals(reprotsSubMenu1Title, "PaperCut NG : Reports : User Reports");
			System.out.println("Sub Menu Verified - Reports - User");
	
			// Verify Menu Item - Reports : Submenu Item - Printer
			dashboardPageSubMenu.verifyMenuReportsSubMenuPrinter(driver);
			String reprotsSubMenu2Title = driver.getTitle();
			Assert.assertEquals(reprotsSubMenu2Title, "PaperCut NG : Reports : Printer Reports");
			System.out.println("Sub Menu Verified - Reports - Printer");
	
			// Verify Menu Item - Reports : Submenu Item - Group
			dashboardPageSubMenu.verifyMenuReportsSubMenuGroup(driver);
			String reprotsSubMenu3Title = driver.getTitle();
			Assert.assertEquals(reprotsSubMenu3Title, "PaperCut NG : Reports : Group Reports");
			System.out.println("Sub Menu Verified - Reports - Group");
	
			// Verify Menu Item - Reports : Submenu Item - Account
			dashboardPageSubMenu.verifyMenuReportsSubMenuAccount(driver);
			String reprotsSubMenu4Title = driver.getTitle();
			Assert.assertEquals(reprotsSubMenu4Title, "PaperCut NG : Reports : Shared Account Reports");
			System.out.println("Sub Menu Verified - Reports - Account");
	
			// Verify Menu Item - Reports : Submenu Item - Environment
			dashboardPageSubMenu.verifyMenuReportsSubMenuEnvironment(driver);
			String reprotsSubMenu5Title = driver.getTitle();
			Assert.assertEquals(reprotsSubMenu5Title, "PaperCut NG : Reports : Environment Reports");
			System.out.println("Sub Menu Verified - Reports - Environment");
	
			// Verify Menu Item - Reports : Submenu Item - Transaction
			dashboardPageSubMenu.verifyMenuReportsSubMenuTransaction(driver);
			String reprotsSubMenu6Title = driver.getTitle();
			Assert.assertEquals(reprotsSubMenu6Title, "PaperCut NG : Reports : Transaction Reports");
			System.out.println("Sub Menu Verified - Reports - Transaction");
	
			// Verify Menu Item - Reports : Submenu Item - Schedule Email Reports
			dashboardPageSubMenu.verifyMenuReportsSubMenuScheduleEmailReports(driver);
			String reprotsSubMenu7Title = driver.getTitle();
			Assert.assertEquals(reprotsSubMenu7Title, "PaperCut NG : Reports : Schedule / Email Reports");
			System.out.println("Sub Menu Verified - Reports - Schedule / Email Reports");

		// Verify Menu Item - Cards
		dashboardPagemenu.verifyMenuCards(driver);
		String cardsMenuTitle = driver.getTitle();
		Assert.assertEquals(cardsMenuTitle, "PaperCut NG : Cards : TopUp/PrePaid Card Management");
		System.out.println("Menu Verified - Cards");

		// Verify Menu Item - Options
		dashboardPagemenu.verifyMenuOptions(driver);
		String optionsMenuTitle = driver.getTitle();
		Assert.assertEquals(optionsMenuTitle, "PaperCut NG : Options : General");
		System.out.println("Menu Verified - Options");

			// Verify Menu Item - Options : Submenu Item - General
			dashboardPageSubMenu.verifyMenuOptionsSubMenuGeneral(driver);
			String optionsSubMenu1Title = driver.getTitle();
			Assert.assertEquals(optionsSubMenu1Title, "PaperCut NG : Options : General");
			System.out.println("Sub Menu Verified - Options - General");
	
			// Verify Menu Item - Options : Submenu Item - Mobile BYOD
			dashboardPageSubMenu.verifyMenuOptionsSubMenuMobileBYOD(driver);
			String optionsSubMenu2Title = driver.getTitle();
			Assert.assertEquals(optionsSubMenu2Title, "PaperCut NG : Options : Mobile & BYOD");
			System.out.println("Sub Menu Verified - Options - Mobile & BYOD");
	
			// Verify Menu Item - Options : Submenu Item - Notifications
			dashboardPageSubMenu.verifyMenuOptionsSubMenuNotifications(driver);
			String optionsSubMenu3Title = driver.getTitle();
			Assert.assertEquals(optionsSubMenu3Title, "PaperCut NG : Options : Notifications");
			System.out.println("Sub Menu Verified - Options - Notifications");
	
			// Verify Menu Item - Options : Submenu Item - User Group Sync
			dashboardPageSubMenu.verifyMenuOptionsSubMenuUserGroupSync(driver);
			String optionsSubMenu4Title = driver.getTitle();
			Assert.assertEquals(optionsSubMenu4Title, "PaperCut NG : Options : User/Group Sync");
			System.out.println("Sub Menu Verified - Options - User/Group Sync");
	
			// Verify Menu Item - Options : Submenu Item - Admin Rights
			dashboardPageSubMenu.verifyMenuOptionsSubMenuAdminRights(driver);
			String optionsSubMenu5Title = driver.getTitle();
			Assert.assertEquals(optionsSubMenu5Title, "PaperCut NG : Options : Admin Rights");
			System.out.println("Sub Menu Verified - Options - Admin Rights");
	
			// Verify Menu Item - Options : Submenu Item - Backups
			dashboardPageSubMenu.verifyMenuOptionsSubMenuBackups(driver);
			String optionsSubMenu6Title = driver.getTitle();
			Assert.assertEquals(optionsSubMenu6Title, "PaperCut NG : Options : Backups");
			System.out.println("Sub Menu Verified - Options - Backups");
	
			// Verify Menu Item - Options : Submenu Item - Tools
			dashboardPageSubMenu.verifyMenuOptionsSubMenuTools(driver);
			String optionsSubMenu7Title = driver.getTitle();
			Assert.assertEquals(optionsSubMenu7Title, "PaperCut NG : Options : Tools");
			System.out.println("Sub Menu Verified - Options - Tools");
	
			// Verify Menu Item - Options : Submenu Item - Advanced
			dashboardPageSubMenu.verifyMenuOptionsSubMenuAdvanced(driver);
			String optionsSubMenu8Title = driver.getTitle();
			Assert.assertEquals(optionsSubMenu8Title, "PaperCut NG : Options : Advanced");
			System.out.println("Sub Menu Verified - Options - Advanced");

		// Verify Menu Item - Logs
		dashboardPagemenu.verifyMenuLogs(driver);
		String logsMenuTitle = driver.getTitle();
		Assert.assertEquals(logsMenuTitle, "PaperCut NG : Logs : Job Log");
		System.out.println("Menu Verified - Logs");

			// Verify Menu Item - Logs : Submenu Item - Job Logs
			dashboardPageSubMenu.verifyMenuLogsSubMenuJobLogs(driver);
			String logsSubMenu1Title = driver.getTitle();
			Assert.assertEquals(logsSubMenu1Title, "PaperCut NG : Logs : Job Log");
			System.out.println("Sub Menu Verified - Logs - Job Log");
	
			// Verify Menu Item - Logs : Submenu Item - Application Logs
			dashboardPageSubMenu.verifyMenuLogsSubMenuApplicationLogs(driver);
			String logsSubMenu2Title = driver.getTitle();
			Assert.assertEquals(logsSubMenu2Title, "PaperCut NG : Logs : Application Log");
			System.out.println("Sub Menu Verified - Logs - Application Log");
	
			// Verify Menu Item - Logs : Submenu Item - Audit Logs
			dashboardPageSubMenu.verifyMenuLogsSubMenuAuditLogs(driver);
			String logsSubMenu3Title = driver.getTitle();
			Assert.assertEquals(logsSubMenu3Title, "PaperCut NG : Logs : Audit Log");
			System.out.println("Sub Menu Verified - Logs - Audit Log");

		// Verify Menu Item - About
		aboutPageVersionAndBuild = dashboardPagemenu.verifyMenuAbout(driver);
		String aboutMenuTitle = driver.getTitle();
		Assert.assertEquals(aboutMenuTitle, "PaperCut NG : About : About");
		System.out.println("Menu Verified - About");

		System.out.println("Menu Link verification - End");
	}

	// Below Test case is to verify that version and build number are same on Dashboard and ABout pages
	@Test(priority = 3)
	public void verifyVersionAndBuild() {
		System.out.println("Version and Build verification - Start");
		
		// Fetch Version and BUild from Dashboard Page
		dashboardPageVersion = dashboardPageVersionAndBuild.substring(0, 6);
		dashboardPageBuild = dashboardPageVersionAndBuild.substring(13, 18);
		
		// Fetch Version and BUild from About Page
		aboutPageVersion = aboutPageVersionAndBuild.substring(10, 16);
		aboutPageBuild = aboutPageVersionAndBuild.substring(24, 29);

		// Verify that Version and Build from Dashboard Page and About Page are same
		Assert.assertEquals(dashboardPageVersion, aboutPageVersion);
		Assert.assertEquals(dashboardPageBuild, aboutPageBuild);
		System.out.println("Version and Build are same on Dashboard and About Page");

		System.out.println("Version and Build verification - End");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("Closing Firefox Browser");
		driver.quit();
	}
}
