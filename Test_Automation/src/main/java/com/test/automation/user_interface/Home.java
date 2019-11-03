package com.test.automation.user_interface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;

@DefaultUrl("http://automationpractice.com/index.php")
public class Home extends PageObject{
	
	@WhenPageOpens
	public void waitUntilMainElementsAppears() {
		//se obtiene el controlar y se maximiza al total de la pantalla
		getDriver().manage().window().maximize();
	}
	
	//se define devolver el controlador para ser administrador
	public WebDriver MyDriver() {
		return getDriver();
	}
	
	public static final Target Search = Target.the("Search")
			.located(By.id("search_query_top"));

}
