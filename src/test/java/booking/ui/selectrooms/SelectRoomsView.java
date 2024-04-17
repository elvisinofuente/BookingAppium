package booking.ui.selectrooms;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectRoomsView {
    public static Target selectRooms = Target.the("Select Rooms").located(By.id("com.booking:id/property_availability_cta_facetframe"));

}
