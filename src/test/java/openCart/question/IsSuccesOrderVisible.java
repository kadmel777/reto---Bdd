package openCart.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;
import openCart.userInterface.opencart.home.CheckOutPage;

public class IsSuccesOrderVisible implements Question<Boolean> {


    public static IsSuccesOrderVisible isVisible() {
        return new IsSuccesOrderVisible();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(CheckOutPage.SUCCES_ORDER_TITTLE, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(10).seconds()
        );
        return Visibility.of(CheckOutPage.SUCCES_ORDER_TITTLE).answeredBy(actor).booleanValue();
    }
}