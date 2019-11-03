package com.test.automation.user_interface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchProducts extends PageObject{
	
	public static final Target Product = Target.the("Product Found")
			.locatedBy("//img[@title='{0}']");
	
	public static final Target AddCart = Target.the("Add product to shopping cart")
			.locatedBy("//*[@title='Add to cart']");

}
