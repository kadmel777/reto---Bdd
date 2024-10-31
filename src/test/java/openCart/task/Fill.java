package openCart.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ui.Select;
import openCart.userInterface.opencart.home.CheckOutPage;

public class Fill implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues("Camilo").into(CheckOutPage.FIRSTNAME_INPUT),
                Enter.keyValues("Camilo").into(CheckOutPage.LASTNAME_INPUT),
                Enter.keyValues("Camilo@gmail.com").into(CheckOutPage.EMAIL_INPUT),
                Enter.keyValues("Camilo").into(CheckOutPage.TELEPHONE_INPUT),
                Enter.keyValues("Camilo").into(CheckOutPage.COMPANY_INPUT),
                Enter.keyValues("Camilo").into(CheckOutPage.ADDRESS_INPUT),
                Enter.keyValues("Camilo").into(CheckOutPage.CITY_INPUT),
                Enter.keyValues("Camilo").into(CheckOutPage.POSTCODE_INPUT),
                Scroll.to(CheckOutPage.COUNTRY_SELECT),
                Select.option("Colombia").from(CheckOutPage.COUNTRY_SELECT),
                Select.option("Bogota D.C.").from(CheckOutPage.ZONE_ID_SELECT),
                Click.on(CheckOutPage.CONTINUE_GUEST_BUTTON)
        );
    }

    public static Fill billingDetailsForm(){
        return Tasks.instrumented(Fill.class);
    }

}
