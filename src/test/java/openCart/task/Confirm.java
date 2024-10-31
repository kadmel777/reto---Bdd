package openCart.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import openCart.userInterface.opencart.home.CheckOutPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class Confirm implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CheckOutPage.CONFIRM_BUTTON,isClickable())
                        .forNoMoreThan(10).seconds(),
                Click.on(CheckOutPage.CONFIRM_BUTTON)
        );
    }

    public static Confirm order(){
        return Tasks.instrumented(Confirm.class);
    }
}
