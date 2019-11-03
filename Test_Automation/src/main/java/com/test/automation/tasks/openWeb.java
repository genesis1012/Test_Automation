package com.test.automation.tasks;

import com.test.automation.user_interface.Home;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class openWeb implements Task {
	
	private Home home;

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn().the(home));
	}
	
	public static openWeb HomePage() {
		return instrumented(openWeb.class);
	}

}
