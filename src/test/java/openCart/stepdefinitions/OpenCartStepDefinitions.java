package openCart.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import openCart.navigation.NavigateTo;
import openCart.question.IsSuccesOrderVisible;
import openCart.task.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class OpenCartStepDefinitions {

    @Given("{actor} go to openCart page")
    public void sergeyGoToOpenCartPage(Actor actor) {
        actor.wasAbleTo(NavigateTo.theSearchHomePage());
    }

    @When("Buy a {string} and {string}")
    public void buyAAnd(String producName, String productName2) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AddProduct.toCart(producName),
                AddProduct.toCart(productName2),
                View.cart(),
                GoTo.guestCheckout(),
                Fill.billingDetailsForm(),
                Select.deliveryMethod(),
                Select.paymentMethod(),
                Confirm.order()
        );
    }

    @Then("He should see a confirmation message")
    public void heShouldSeeAConfirmationMessage() {
        OnStage.theActorInTheSpotlight().should(
                seeThat("The success order title is visible", IsSuccesOrderVisible.isVisible())
        );
    }
}
