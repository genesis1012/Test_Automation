package com.test.automation.tasks;

import org.openqa.selenium.Keys;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.test.automation.user_interface.Home.Search;

public class search implements Task{
	
	String product;
	
	public search (String Product) {
		this.product = Product;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(product).into(Search).thenHit(Keys.ENTER));
	}
	
	public static search The(String Product) {
		return instrumented(search.class, Product);
	}

}
