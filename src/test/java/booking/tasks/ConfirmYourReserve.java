package booking.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import booking.questions.VisibleNoCreditCardNeededQuestion;
import booking.ui.chooseyourstay.ChooseYourStay;


public class ConfirmYourReserve implements Performable {
    /*AndroidDriver<AndroidElement> androidDriver() {
        return (AndroidDriver<AndroidElement>)
                ((WebDriverFacade) getDriver()).getProxiedDriver();
    }*/
    @Override
    public <T extends Actor> void performAs(T actor) {
        Boolean noCreditCardNeeded = VisibleNoCreditCardNeededQuestion.value().answeredBy(actor);
        actor.remember("noCreditCardNeeded", noCreditCardNeeded);
        actor.attemptsTo(Click.on(ChooseYourStay.btnReserve));
    }
}
