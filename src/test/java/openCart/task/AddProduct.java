package openCart.task;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import openCart.userInterface.opencart.home.HomePage;

public class AddProduct implements Task {

    private final String productName;

    public AddProduct(String productName) {
        this.productName = productName;
    }

    @Override
    @Step("#actor adds product '#productName' to the cart")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(HomePage.FEATURED_LABEL),
                Click.on(HomePage.ADD_PRODUCT_BUTTON.of(productName))
        );
    }

    public static AddProduct toCart(String productName){
        return Tasks.instrumented(AddProduct.class,productName);
    }
}
