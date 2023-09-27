package stepsdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.LoginStep;
import steps.RegisterStep;

public class LoginStepDefinition {

    @Steps
    LoginStep loginStep;

    @Given("^The user gets into the page$")
    public void theUserGetsIntoThePage() {
        loginStep.openBrowser();
    }

    @When("^The user enters the credentials$")
    public void theUserEntersTheCredentials() {

    }

    @Then("^The user should see Tu cuenta$")
    public void theUserShouldSeeTuCuenta() {

    }
}