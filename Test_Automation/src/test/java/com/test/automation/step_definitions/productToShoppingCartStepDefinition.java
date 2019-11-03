package com.test.automation.step_definitions;

import com.test.automation.questions.inShoppingCart;
import com.test.automation.tasks.addProduct;
import com.test.automation.tasks.openWeb;
import com.test.automation.tasks.search;
import com.test.automation.user_interface.Home;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class productToShoppingCartStepDefinition {
	
	@Managed(driver = "chrome")
	private Home home;
	
	private Actor Heri = Actor.named("Heri");
	
	@Before
    public void HeriCanBrowseTheWeb() {
		Heri.can(BrowseTheWeb.with(home.MyDriver()));
    }
	
	@Given("^I'm on the home page")
	public void imOnTheHomePage() {
		Heri.wasAbleTo(openWeb.HomePage());
	}

	@When("^I look for the product (.*)")
	public void iLookForFheProduct(String Product) {
		Heri.attemptsTo(search.The(Product));
	}

	@And("^Add the (.*) to the shopping cart$")
	public void addTheProductToTheShoppingCart(String Product) {
		Heri.attemptsTo(addProduct.ToSoppingCart(Product));
	}

	@Then("^Validate that the (.*) has been successfully added to the cart")
	public void validateThatTheProductHasBeenSuccessfullyAddedToTheCart(String Product) {
		Heri.should(seeThat(inShoppingCart.is(Product)));
	}


}
