package openCart.userInterface.opencart.home;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static Target ADD_PRODUCT_BUTTON = Target.the("add product {0}")
            .locatedBy("(//a[contains(text(), '{0}')]/following::button[contains(@onclick, 'cart.add')])[1]"); //selectOptionTarget.of(optionName)

    public static Target FEATURED_LABEL = Target.the("featured label")
            .located(net.serenitybdd.core.annotations.findby.By.xpath("//h3[.='Featured']"));

    public static Target CART_BUTTON = Target.the("cart button")
            .located(net.serenitybdd.core.annotations.findby.By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']"));

    public static Target VIEW_CART = Target.the("view cart")
            .located(net.serenitybdd.core.annotations.findby.By.xpath("//a[.=' View Cart']"));

    public static Target CHECKOUT_BUTTON = Target.the("checkout")
            .located(net.serenitybdd.core.annotations.findby.By.xpath("//a[.='Checkout']"));

    public static Target GUEST_CHECKOUT_BUTTON = Target.the("guest checkout")
            .located(net.serenitybdd.core.annotations.findby.By.xpath("//input[@value='guest']"));

    public static Target CONTINUE_BUTTON = Target.the("continue button")
            .located(net.serenitybdd.core.annotations.findby.By.xpath("//input[@value='Continue']"));



}
