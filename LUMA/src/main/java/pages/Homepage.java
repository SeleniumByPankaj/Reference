package pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import commons.BaseFunctions;
import commons.ConfigReader;
import pageObjects.Homepage_PO;

public class Homepage extends BaseFunctions {

	BaseFunctions base = new BaseFunctions();
	ConfigReader cr = new ConfigReader();

	public void searchItem(String itemToBeSearched) {
		base.setValue(Homepage_PO.search, itemToBeSearched);

		List<WebElement> items = base.getList(Homepage_PO.itemList);

		for (WebElement item : items) {

			if (item.getText().contains(itemToBeSearched))
				item.click();
			break;
		}

	}
}
