package openCart.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import openCart.userInterface.opencart.home.HomePage;

public class GoTo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.CHECKOUT_BUTTON),
                Click.on(HomePage.GUEST_CHECKOUT_BUTTON),
                Click.on(HomePage.CONTINUE_BUTTON)
        );
    }

    public static GoTo guestCheckout(){
        return Tasks.instrumented(GoTo.class);
    }

}
