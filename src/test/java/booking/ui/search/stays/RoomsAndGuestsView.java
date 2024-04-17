package booking.ui.search.stays;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RoomsAndGuestsView {

    public static Target minusRooms = Target.the("Minus rooms").located(By.xpath("(//android.widget.Button)[1]"));
    public static Target plusRooms = Target.the("Plus rooms").located(By.xpath("(//android.widget.Button)[2]"));

    public static Target minusAdults = Target.the("Minus adults").located(By.xpath("(//android.widget.Button)[3]"));
    public static Target plusAdults = Target.the("Plus adults").located(By.xpath("(//android.widget.Button)[4]"));

    public static Target minusChildren = Target.the("Minus children").located(By.xpath("(//android.widget.Button)[5]"));
    public static Target plusChildren = Target.the("Plus children").located(By.xpath("(//android.widget.Button)[6]"));

    public static Target btnApply = Target.the("Button Apply").located(By.id("com.booking:id/group_config_apply_button"));
}
