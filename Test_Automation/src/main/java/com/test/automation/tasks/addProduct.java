package com.test.automation.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import java.util.concurrent.TimeUnit;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.test.automation.user_interface.SearchProducts.Product;
import static com.test.automation.user_interface.SearchProducts.AddCart;;

public class addProduct implements Task {
	
	String foundProduct;
	
	public addProduct (String foundProduct) {
		this.foundProduct = foundProduct;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Scroll.to(Product.of(foundProduct)),
				MoveMouse.to(Product.of(foundProduct)),
				Click.on(AddCart));
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {}
	}

	public static addProduct ToSoppingCart(String Product) {
		return instrumented(addProduct.class, Product);
	}
	
	

}
