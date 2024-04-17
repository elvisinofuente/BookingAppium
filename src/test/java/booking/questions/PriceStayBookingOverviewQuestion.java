package booking.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import booking.ui.bookingoverview.BookingOverviewView;

public class PriceStayBookingOverviewQuestion implements Question {

    @Override
    public String answeredBy(Actor actor) {
        return BookingOverviewView.priceStayBookingOverview.resolveFor(actor).getText();
    }

    public static Question<String> value(){
        return new PriceStayBookingOverviewQuestion();
    }
}
