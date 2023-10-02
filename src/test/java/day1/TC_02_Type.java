package day1;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class TC_02_Type extends BaseClass  {
	public static void main(String[] args) throws InterruptedException {
//			Playwright playwright = Playwright.create();
//			Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
//			Page page = browser.newPage();
//			page.navigate("https://testautomationpractice.blogspot.com");
			setUp();
			Locator name=page.locator("//input[@id='name']");
			name.fill("hii");
			name.type("omkay");
			page.keyboard().press("ArrowLeft");
			Thread.sleep(2000);
			Locator email=page.locator("#email");
			email.fill("all the best");
//			page.close();
//			browser.close();
//			playwright.close();
		} 
	}

