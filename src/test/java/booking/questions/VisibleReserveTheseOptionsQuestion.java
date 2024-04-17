package booking.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import booking.ui.chooseyourstay.ChooseYourStay;

public class VisibleReserveTheseOptionsQuestion implements Question {

    @Override
    public Boolean answeredBy(Actor actor) {
        return ChooseYourStay.btnReserveTheseOptions.isVisibleFor(actor);
    }

    public static Question<Boolean> value(){
        return new VisibleReserveTheseOptionsQuestion();
    }
}
