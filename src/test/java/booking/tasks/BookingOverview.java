package booking.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import booking.questions.PriceStayBookingOverviewQuestion;
import booking.ui.bookingoverview.BookingOverviewView;


public class BookingOverview implements Performable {
    /*AndroidDriver<AndroidElement> androidDriver() {
        return (AndroidDriver<AndroidElement>)
                ((WebDriverFacade) getDriver()).getProxiedDriver();
    }*/
    @Override
    public <T extends Actor> void performAs(T actor) {
        String priceBookingOverview = PriceStayBookingOverviewQuestion.value().answeredBy(actor);
        actor.remember("priceBookingOverview", priceBookingOverview);
        actor.attemptsTo(Click.on(BookingOverviewView.buttonFinalStep));
    }
}
