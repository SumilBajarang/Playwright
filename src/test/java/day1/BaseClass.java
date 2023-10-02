package day1;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BaseClass {
	static Playwright playwright;
	static Browser browser;
	static Page page ;
	public static void setUp() {
			playwright = Playwright.create();
			browser= playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
			page = browser.newPage();
			page.navigate("https://testautomationpractice.blogspot.com");
			System.out.println(page.title());
	}
}
