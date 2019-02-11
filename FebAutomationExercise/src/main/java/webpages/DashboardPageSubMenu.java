package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
 * This DashboardPageSubMenu class holds all web elements and events for Submenu section on home screen.
 */

public class DashboardPageSubMenu {

	WebElement menuAccountsSubMenuSharedAccountList;
	WebElement menuAccountsSubMenuBatchImportUpdate;
	WebElement menuAccountsSubMenuSharedAccountSync;

	WebElement menuPrintersSubMenuPrinterList;
	WebElement menuPrintersSubMenuJobsPendingRelease;
	WebElement menuPrintersSubMenuNotificationOptions;
	WebElement menuPrintersSubMenuCharts;
	WebElement menuPrintersSubMenuRefunds;

	WebElement menuReportsSubMenuUser;
	WebElement menuReportsSubMenuPrinter;
	WebElement menuReportsSubMenuGroup;
	WebElement menuReportsSubMenuAccount;
	WebElement menuReportsSubMenuEnvironment;
	WebElement menuReportsSubMenuTransaction;
	WebElement menuReportsSubMenuScheduleEmailReports;

	WebElement menuOptionsSubMenuGeneral;
	WebElement menuOptionsSubMenuMobileBYOD;
	WebElement menuOptionsSubMenuNotifications;
	WebElement menuOptionsSubMenuUserGroupSync;
	WebElement menuOptionsSubMenuAdminRights;
	WebElement menuOptionsSubMenuBackups;
	WebElement menuOptionsSubMenuTools;
	WebElement menuOptionsSubMenuAdvanced;

	WebElement menuLogsSubMenuJobLog;
	WebElement menuLogsSubMenuApplicationLog;
	WebElement menuLogsSubMenuAuditLog;

	// Below method is defined to find the Shared Account List submenu under Accounts menu item
	public void verifyMenuAccountsSubMenuSharedAccountList(WebDriver driver) {
		menuAccountsSubMenuSharedAccountList = driver
				.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/ul[1]/li[1]/div[1]/a[1]/span[2]/span[1]"));
		if (menuAccountsSubMenuSharedAccountList.isDisplayed())
			menuAccountsSubMenuSharedAccountList.click();
		else
			System.out.println("Sub Menu - Accounts - Shared Account List is not visible");
	}

	// Below method is defined to find the Batch Import Update submenu under Accounts menu item
	public void verifyMenuAccountsSubMenuBatchImportUpdate(WebDriver driver) {
		menuAccountsSubMenuBatchImportUpdate = driver
				.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/ul[1]/li[2]/div[1]/a[1]/span[2]/span[1]"));
		if (menuAccountsSubMenuBatchImportUpdate.isDisplayed())
			menuAccountsSubMenuBatchImportUpdate.click();
		else
			System.out.println("Sub Menu - Accounts - Batch/Import Update is not visible");
	}

	// Below method is defined to find the Shared Account Sync submenu under Accounts menu item
	public void verifyMenuAccountsSubMenuSharedAccountSync(WebDriver driver) {
		menuAccountsSubMenuSharedAccountSync = driver
				.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/ul[1]/li[3]/div[1]/a[1]/span[2]/span[1]"));
		if (menuAccountsSubMenuSharedAccountSync.isDisplayed())
			menuAccountsSubMenuSharedAccountSync.click();
		else
			System.out.println("Sub Menu - Accounts - Shared Account Sync is not visible");
	}
	
	// Below method is defined to find the Printer List submenu under Printers menu item
	public void verifyMenuPrintersSubMenuPrinterList(WebDriver driver) {
		menuPrintersSubMenuPrinterList = driver
				.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/ul[1]/li[1]/div[1]/a[1]/span[2]/span[1]"));
		if (menuPrintersSubMenuPrinterList.isDisplayed())
			menuPrintersSubMenuPrinterList.click();
		else
			System.out.println("Sub Menu - Printers - Printer List is not visible");
	}

	// Below method is defined to find the Jobs Pending Release submenu under Printers menu item
	public void verifyMenuPrintersSubMenuJobsPendingRelease(WebDriver driver) {
		menuPrintersSubMenuJobsPendingRelease = driver
				.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/ul[1]/li[2]/div[1]/a[1]/span[2]/span[1]"));
		if (menuPrintersSubMenuJobsPendingRelease.isDisplayed())
			menuPrintersSubMenuJobsPendingRelease.click();
		else
			System.out.println("Sub Menu - Printers - Jobs Pending Release is not visible");
	}

	// Below method is defined to find the Notification OPtion submenu under Printers menu item
	public void verifyMenuPrintersSubMenuNotificationOptions(WebDriver driver) {
		menuPrintersSubMenuNotificationOptions = driver
				.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/ul[1]/li[3]/div[1]/a[1]/span[2]/span[1]"));
		if (menuPrintersSubMenuNotificationOptions.isDisplayed())
			menuPrintersSubMenuNotificationOptions.click();
		else
			System.out.println("Sub Menu - Printers - Notification Options is not visible");
	}

	// Below method is defined to find the Charts submenu under Printers menu item
	public void verifyMenuPrintersSubMenuCharts(WebDriver driver) {
		menuPrintersSubMenuCharts = driver
				.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/ul[1]/li[4]/div[1]/a[1]/span[2]/span[1]"));
		if (menuPrintersSubMenuCharts.isDisplayed())
			menuPrintersSubMenuCharts.click();
		else
			System.out.println("Sub Menu - Printers - Charts is not visible");
	}

	// Below method is defined to find the Refunds submenu under Printers menu item
	public void verifyMenuPrintersSubMenuRefunds(WebDriver driver) {
		menuPrintersSubMenuRefunds = driver
				.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/ul[1]/li[5]/div[1]/a[1]/span[2]/span[1]"));
		if (menuPrintersSubMenuRefunds.isDisplayed())
			menuPrintersSubMenuRefunds.click();
		else
			System.out.println("Sub Menu - Printers - Refunds is not visible");
	}

	// Below method is defined to find the User submenu under Reports menu item
	public void verifyMenuReportsSubMenuUser(WebDriver driver) {
		menuReportsSubMenuUser = driver
				.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/ul[1]/li[1]/div[1]/a[1]/span[2]/span[1]"));
		if (menuReportsSubMenuUser.isDisplayed())
			menuReportsSubMenuUser.click();
		else
			System.out.println("Sub Menu - Reports - User is not visible");
	}

	// Below method is defined to find the Printer submenu under Reports menu item
	public void verifyMenuReportsSubMenuPrinter(WebDriver driver) {
		menuReportsSubMenuPrinter = driver
				.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/ul[1]/li[2]/div[1]/a[1]/span[2]/span[1]"));
		if (menuReportsSubMenuPrinter.isDisplayed())
			menuReportsSubMenuPrinter.click();
		else
			System.out.println("Sub Menu - Reports - Printer is not visible");
	}

	// Below method is defined to find the Group submenu under Reports menu item
	public void verifyMenuReportsSubMenuGroup(WebDriver driver) {
		menuReportsSubMenuGroup = driver
				.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/ul[1]/li[3]/div[1]/a[1]/span[2]/span[1]"));
		if (menuReportsSubMenuGroup.isDisplayed())
			menuReportsSubMenuGroup.click();
		else
			System.out.println("Sub Menu - Reports - Group is not visible");
	}

	// Below method is defined to find the Account submenu under Reports menu item
	public void verifyMenuReportsSubMenuAccount(WebDriver driver) {
		menuReportsSubMenuAccount = driver
				.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/ul[1]/li[4]/div[1]/a[1]/span[2]/span[1]"));
		if (menuReportsSubMenuAccount.isDisplayed())
			menuReportsSubMenuAccount.click();
		else
			System.out.println("Sub Menu - Reports - Account is not visible");
	}

	// Below method is defined to find the Environment submenu under Reports menu item
	public void verifyMenuReportsSubMenuEnvironment(WebDriver driver) {
		menuReportsSubMenuEnvironment = driver
				.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/ul[1]/li[5]/div[1]/a[1]/span[2]/span[1]"));
		if (menuReportsSubMenuEnvironment.isDisplayed())
			menuReportsSubMenuEnvironment.click();
		else
			System.out.println("Sub Menu - Reports - Environment is not visible");
	}

	// Below method is defined to find the Transaction submenu under Reports menu item
	public void verifyMenuReportsSubMenuTransaction(WebDriver driver) {
		menuReportsSubMenuTransaction = driver
				.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/ul[1]/li[6]/div[1]/a[1]/span[2]/span[1]"));
		if (menuReportsSubMenuTransaction.isDisplayed())
			menuReportsSubMenuTransaction.click();
		else
			System.out.println("Sub Menu - Reports - Transaction is not visible");
	}

	// Below method is defined to find the Schedule Email Reports submenu under Reports menu item
	public void verifyMenuReportsSubMenuScheduleEmailReports(WebDriver driver) {
		menuReportsSubMenuScheduleEmailReports = driver
				.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/ul[1]/li[7]/div[1]/a[1]/span[2]/span[1]"));
		if (menuReportsSubMenuScheduleEmailReports.isDisplayed())
			menuReportsSubMenuScheduleEmailReports.click();
		else
			System.out.println("Sub Menu - Reports - Schedule/Email Reports is not visible");
	}

	// Below method is defined to find the General submenu under Options menu item
	public void verifyMenuOptionsSubMenuGeneral(WebDriver driver) {
		menuOptionsSubMenuGeneral = driver
				.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/ul[1]/li[1]/div[1]/a[1]/span[2]/span[1]"));
		if (menuOptionsSubMenuGeneral.isDisplayed())
			menuOptionsSubMenuGeneral.click();
		else
			System.out.println("Sub Menu - Options - General is not visible");
	}

	// Below method is defined to find the Mobile BYOD submenu under Options menu item
	public void verifyMenuOptionsSubMenuMobileBYOD(WebDriver driver) {
		menuOptionsSubMenuMobileBYOD = driver
				.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/ul[1]/li[2]/div[1]/a[1]/span[2]/span[1]"));
		if (menuOptionsSubMenuMobileBYOD.isDisplayed())
			menuOptionsSubMenuMobileBYOD.click();
		else
			System.out.println("Sub Menu - Options - Mobile & BYOD is not visible");
	}

	// Below method is defined to find the Notifications submenu under Options menu item
	public void verifyMenuOptionsSubMenuNotifications(WebDriver driver) {
		menuOptionsSubMenuNotifications = driver
				.findElement(By.xpath("//span[@class='content'][contains(text(),'Notifications')]"));
		if (menuOptionsSubMenuNotifications.isDisplayed())
			menuOptionsSubMenuNotifications.click();
		else
			System.out.println("Sub Menu - Options - Notifications is not visible");
	}

	// Below method is defined to find the User Group Sync submenu under Options menu item
	public void verifyMenuOptionsSubMenuUserGroupSync(WebDriver driver) {
		menuOptionsSubMenuUserGroupSync = driver
				.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/ul[1]/li[4]/div[1]/a[1]/span[2]/span[1]"));
		if (menuOptionsSubMenuUserGroupSync.isDisplayed())
			menuOptionsSubMenuUserGroupSync.click();
		else
			System.out.println("Sub Menu - Options - User / Group Sync is not visible");
	}

	// Below method is defined to find the Admin Rights submenu under Options menu item
	public void verifyMenuOptionsSubMenuAdminRights(WebDriver driver) {
		menuOptionsSubMenuAdminRights = driver
				.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/ul[1]/li[5]/div[1]/a[1]/span[2]/span[1]"));
		if (menuOptionsSubMenuAdminRights.isDisplayed())
			menuOptionsSubMenuAdminRights.click();
		else
			System.out.println("Sub Menu - Options - Admin Rights is not visible");
	}

	// Below method is defined to find the Backups submenu under Options menu item
	public void verifyMenuOptionsSubMenuBackups(WebDriver driver) {
		menuOptionsSubMenuBackups = driver
				.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/ul[1]/li[6]/div[1]/a[1]/span[2]/span[1]"));
		if (menuOptionsSubMenuBackups.isDisplayed())
			menuOptionsSubMenuBackups.click();
		else
			System.out.println("Sub Menu - Options - Backups is not visible");
	}

	// Below method is defined to find the Tools submenu under Options menu item
	public void verifyMenuOptionsSubMenuTools(WebDriver driver) {
		menuOptionsSubMenuTools = driver
				.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/ul[1]/li[7]/div[1]/a[1]/span[2]/span[1]"));
		if (menuOptionsSubMenuTools.isDisplayed())
			menuOptionsSubMenuTools.click();
		else
			System.out.println("Sub Menu - Options - Tools is not visible");
	}

	// Below method is defined to find the Advanced submenu under Options menu item
	public void verifyMenuOptionsSubMenuAdvanced(WebDriver driver) {
		menuOptionsSubMenuAdvanced = driver
				.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/ul[1]/li[8]/div[1]/a[1]/span[2]/span[1]"));
		if (menuOptionsSubMenuAdvanced.isDisplayed())
			menuOptionsSubMenuAdvanced.click();
		else
			System.out.println("Sub Menu - Options - Advanced is not visible");
	}

	// Below method is defined to find the Job Logs submenu under Logs menu item
	public void verifyMenuLogsSubMenuJobLogs(WebDriver driver) {
		menuLogsSubMenuJobLog = driver
				.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/ul[1]/li[1]/div[1]/a[1]/span[2]/span[1]"));
		if (menuLogsSubMenuJobLog.isDisplayed())
			menuLogsSubMenuJobLog.click();
		else
			System.out.println("Sub Menu - Logs - Job Logs is not visible");
	}

	// Below method is defined to find the Application Logs submenu under Logs menu item
	public void verifyMenuLogsSubMenuApplicationLogs(WebDriver driver) {
		menuLogsSubMenuApplicationLog = driver
				.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/ul[1]/li[2]/div[1]/a[1]/span[2]/span[1]"));
		if (menuLogsSubMenuApplicationLog.isDisplayed())
			menuLogsSubMenuApplicationLog.click();
		else
			System.out.println("Sub Menu - Logs - Application Logs is not visible");
	}

	// Below method is defined to find the Audit Logs submenu under Logs menu item
	public void verifyMenuLogsSubMenuAuditLogs(WebDriver driver) {
		menuLogsSubMenuAuditLog = driver
				.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/ul[1]/li[3]/div[1]/a[1]/span[2]/span[1]"));
		if (menuLogsSubMenuAuditLog.isDisplayed())
			menuLogsSubMenuAuditLog.click();

		else
			System.out.println("Sub Menu - Logs - Audit Logs is not visible");
	}

}
