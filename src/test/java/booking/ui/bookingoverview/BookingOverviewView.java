package booking.ui.bookingoverview;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BookingOverviewView {
    public static Target buttonFinalStep = Target.the("Final step").located(By.id("com.booking:id/action_button"));

    public static Target priceStayBookingOverview = Target.the("Price of stay").located(By.xpath("//android.widget.TextView[@resource-id='com.booking:id/title' and @text!='You selected']"));


}
