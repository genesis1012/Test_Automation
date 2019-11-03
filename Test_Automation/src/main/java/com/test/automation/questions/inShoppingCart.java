package com.test.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.test.automation.user_interface.shoppingCart.productAdded;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class inShoppingCart implements Question<Boolean>{
	
	private String Product;
	
	public inShoppingCart(String Product) {
		this.Product = Product;
	}

	@Override
	public Boolean answeredBy(Actor actor) {
        return the(productAdded.of(Product)).answeredBy(actor).isCurrentlyVisible();
	}

	public static inShoppingCart is(String Product) {
		return new inShoppingCart(Product);
	}

}
