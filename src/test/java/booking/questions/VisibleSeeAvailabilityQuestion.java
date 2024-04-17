package booking.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import booking.ui.selectrooms.SeeAvailabilityView;

public class VisibleSeeAvailabilityQuestion implements Question {

    @Override
    public Boolean answeredBy(Actor actor) {
        return SeeAvailabilityView.seeAvailability.isVisibleFor(actor);
    }

    public static Question<Boolean> value(){
        return new VisibleSeeAvailabilityQuestion();
    }
}
