package booking.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import booking.ui.fillyourinfo.FillInYourInfoView;

public class VisibleAddressQuestion implements Question {

    @Override
    public Boolean answeredBy(Actor actor) {
        return FillInYourInfoView.address.isVisibleFor(actor);
    }

    public static Question<Boolean> value(){
        return new VisibleAddressQuestion();
    }
}
