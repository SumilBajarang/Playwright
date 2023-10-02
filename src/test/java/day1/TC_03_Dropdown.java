package day1;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.options.SelectOption;

public class TC_03_Dropdown extends BaseClass {
public static void main(String[] args) {
	setUp();
	Locator locator=page.locator("//select[@id='country']");
	locator.scrollIntoViewIfNeeded();
	//locator.selectOption("india");
	//locator.selectOption(new SelectOption().setIndex(3));
	locator.selectOption(new SelectOption().setLabel("Brazil"));
	
}
}
