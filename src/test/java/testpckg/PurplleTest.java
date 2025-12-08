package testpckg;

import org.testng.annotations.Test;

import basepckg.PurplleBase;
import pagepckg.PurpllePage;

public class PurplleTest extends PurplleBase {
	@Test
	public void testMenu() throws Exception {
	PurpllePage ob= new PurpllePage(driver);
	ob.title();
	ob.search("Shampoo");
	ob.categoriesMenu();
	ob.addToCart();
	ob.shopCategorys();
	ob.Brands();
	ob.NewItem();
	ob.Splurge();
	ob.Magazine();
	ob.EliteOffers();
	ob.shopCategoryList();
	}

}
