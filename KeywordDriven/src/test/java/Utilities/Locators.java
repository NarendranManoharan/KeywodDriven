package Utilities;

import org.apache.poi.ss.formula.atp.Switch;
import org.openqa.selenium.By;

public class Locators {
	public static By Locator;

	public static By get_id(String locatorvalue) {
		return By.id(locatorvalue);
	}

	public static By get_className(String locatorvalue) {
		return By.className(locatorvalue);
	}

	public static By get_xpath(String locatorvalue) {
		return By.xpath(locatorvalue);
	}

	public static By execeldrivenkeyword() {

		switch(Excelutilities.locatorname) {
		case "id":
			Locator=Locators.get_id(Excelutilities.locatorelement);
			break;
		case "classname":
			Locator=Locators.get_className(Excelutilities.locatorelement);
			break;
		case "xpath":
			Locator=Locators.get_xpath(Excelutilities.locatorelement);
			break;
		}
		return Locator;


	}

}
