package openCart.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theSearchHomePage() {
        return Task.where("{0} opens the opencartAbstracta home page",
                Open.browserOn().the(OpencartAbstractaPage.class));
    }
}
