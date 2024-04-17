package booking.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import booking.ui.finishbooking.FinishBookingView;


public class FinishBooking implements Performable {
    /*AndroidDriver<AndroidElement> androidDriver() {
        return (AndroidDriver<AndroidElement>)
                ((WebDriverFacade) getDriver()).getProxiedDriver();
    }*/
    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(SendKeys.of("5457265085020317").into(FinishBookingView.cardNumber).
                then(SendKeys.of("12/25").into(FinishBookingView.expirationDat)).
                then(Click.on(FinishBookingView.btnBookNow))
                );
    }
}
