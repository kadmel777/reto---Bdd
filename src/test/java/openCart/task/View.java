package openCart.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import openCart.interaction.Wait;
import openCart.userInterface.opencart.home.HomePage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class View implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(HomePage.CART_BUTTON),
                Wait.forMilisecons(500),
                WaitUntil.the(HomePage.CART_BUTTON,isVisible())
                        .forNoMoreThan(10).seconds(),
                Click.on(HomePage.CART_BUTTON),
                WaitUntil.the(HomePage.VIEW_CART,isClickable())
                        .forNoMoreThan(10).seconds(),
                Click.on(HomePage.VIEW_CART)
        );
    }

    public static View cart(){
        return Tasks.instrumented(View.class);
    }

}
