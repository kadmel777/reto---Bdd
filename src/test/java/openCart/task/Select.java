package openCart.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import openCart.userInterface.opencart.home.CheckOutPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class Select {

    public static Performable deliveryMethod(){
        return Task.where(actor -> actor.attemptsTo(
                WaitUntil.the(CheckOutPage.CONTINUE_SHIPPING_METHOD_BUTTON,isClickable())
                        .forNoMoreThan(10).seconds(),
                Click.on(CheckOutPage.CONTINUE_SHIPPING_METHOD_BUTTON)
        ));
    }

    public static Performable paymentMethod(){
        return Task.where(actor -> actor.attemptsTo(
                WaitUntil.the(CheckOutPage.TERMS_CONDITIONS_CHECK,isClickable())
                        .forNoMoreThan(10).seconds(),
                Click.on(CheckOutPage.TERMS_CONDITIONS_CHECK),
                Click.on(CheckOutPage.CONTINUE_PAYMENT_METHOD_BUTTON)
        ));
    }

}
