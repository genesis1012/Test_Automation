package com.test.automation.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/test/feature/web/buyProduct.feature",
                 glue = "com.test.automation.step_definitions" )
public class productToShoppingCartTestRunner {

}
