package booking.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import booking.questions.PriceStaySelectQuestion;
import booking.ui.resultssearch.SearchResultsView;


public class ResultSearchStays implements Performable {
    /*AndroidDriver<AndroidElement> androidDriver() {
        return (AndroidDriver<AndroidElement>)
                ((WebDriverFacade) getDriver()).getProxiedDriver();
    }*/
    @Override
    public <T extends Actor> void performAs(T actor) {
        String priceOfStay = PriceStaySelectQuestion.value().answeredBy(actor);
        actor.remember("priceOfStay", priceOfStay);
        actor.attemptsTo(Click.on(SearchResultsView.listResults));
    }
}
//android.widget.TextView[@resource-id='com.booking:id/title' and @text!='You selected']