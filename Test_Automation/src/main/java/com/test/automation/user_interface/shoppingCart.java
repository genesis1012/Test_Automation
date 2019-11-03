package com.test.automation.user_interface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class shoppingCart extends PageObject{
	
	public static final Target productAdded = Target.the("product added to shopping cart")
			.locatedBy("//*[@id='layer_cart']//*[@title='{0}']");

}
