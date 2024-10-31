package openCart.userInterface.opencart.home;

import net.serenitybdd.screenplay.targets.Target;

public class CheckOutPage {

    public static Target FIRSTNAME_INPUT = Target.the("firstname input")
            .located(net.serenitybdd.core.annotations.findby.By.xpath("//input[@name='firstname']"));

    public static Target LASTNAME_INPUT = Target.the("lastname input")
            .located(net.serenitybdd.core.annotations.findby.By.xpath("//input[@name='lastname']"));

    public static Target EMAIL_INPUT = Target.the("email input")
            .located(net.serenitybdd.core.annotations.findby.By.xpath("//input[@id='input-payment-email']"));

    public static Target TELEPHONE_INPUT = Target.the("telephone input")
            .located(net.serenitybdd.core.annotations.findby.By.xpath("//input[@name='telephone']"));

    public static Target COMPANY_INPUT = Target.the("company input")
            .located(net.serenitybdd.core.annotations.findby.By.xpath("//input[@name='company']"));

    public static Target ADDRESS_INPUT = Target.the("address input")
            .located(net.serenitybdd.core.annotations.findby.By.xpath("//input[@name='address_1']"));

    public static Target CITY_INPUT = Target.the("city input")
            .located(net.serenitybdd.core.annotations.findby.By.xpath("//input[@name='city']"));

    public static Target POSTCODE_INPUT = Target.the("postcode input")
            .located(net.serenitybdd.core.annotations.findby.By.xpath("//input[@name='postcode']"));

    public static Target COUNTRY_SELECT= Target.the("country select")
            .located(net.serenitybdd.core.annotations.findby.By.xpath("//select[@name='country_id']"));

    public static Target ZONE_ID_SELECT= Target.the("zone id select")
            .located(net.serenitybdd.core.annotations.findby.By.xpath("//select[@name='zone_id']"));

    public static Target TERMS_CONDITIONS_CHECK = Target.the("terms y conditions")
            .located(net.serenitybdd.core.annotations.findby.By.xpath("//input[@name='agree']"));

    public static Target CONTINUE_GUEST_BUTTON = Target.the("continue guest button")
            .located(net.serenitybdd.core.annotations.findby.By.xpath("//input[@id='button-guest']"));

    public static Target CONTINUE_SHIPPING_METHOD_BUTTON = Target.the("continue shipping method button")
            .located(net.serenitybdd.core.annotations.findby.By.xpath("//input[@id='button-shipping-method']"));

    public static Target CONTINUE_PAYMENT_METHOD_BUTTON = Target.the("continue payment method button")
            .located(net.serenitybdd.core.annotations.findby.By.xpath("//input[@id='button-payment-method']"));

    public static Target CONFIRM_BUTTON = Target.the("button confirm")
            .located(net.serenitybdd.core.annotations.findby.By.xpath("//input[@id='button-confirm']"));

    public static Target SUCCES_ORDER_TITTLE = Target.the("succes order tittle: {0}")
            .located(net.serenitybdd.core.annotations.findby.By.xpath("//h1[contains(text(),'Your order has been placed!')]"));

}
