package booking.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import booking.ui.resultssearch.SearchResultsView;

public class PriceStaySelectQuestion implements Question {

    @Override
    public String answeredBy(Actor actor) {
        return SearchResultsView.getPrice.resolveFor(actor).getText();
    }

    public static Question<String> value(){
        return new PriceStaySelectQuestion();
    }
}
