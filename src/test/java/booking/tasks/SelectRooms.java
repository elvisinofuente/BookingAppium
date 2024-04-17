package booking.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import booking.questions.VisibleSeeAvailabilityQuestion;
import booking.ui.selectrooms.SeeAvailabilityView;
import booking.ui.selectrooms.SelectRoomsView;


public class SelectRooms implements Performable {
    /*AndroidDriver<AndroidElement> androidDriver() {
        return (AndroidDriver<AndroidElement>)
                ((WebDriverFacade) getDriver()).getProxiedDriver();
    }*/
    @Override
    public <T extends Actor> void performAs(T actor) {
        Boolean existButtonSeeAvailability = VisibleSeeAvailabilityQuestion.value().answeredBy(actor);
        if (existButtonSeeAvailability)
            actor.attemptsTo(Click.on(SeeAvailabilityView.seeAvailability));
        else
            actor.attemptsTo(Click.on(SelectRoomsView.selectRooms));
    }
}
