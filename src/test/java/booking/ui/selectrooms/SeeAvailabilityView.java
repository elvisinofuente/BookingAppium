package booking.ui.selectrooms;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SeeAvailabilityView {
    public static Target seeAvailability = Target.the("See availability").located(By.id("com.booking:id/select_room_cta"));

}
