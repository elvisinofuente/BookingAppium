package booking.ui.chooseyourstay;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChooseYourStay {

    public static Target selectYourStay = Target.the("Select your stay").located(By.id("com.booking:id/rooms_item_select_text_view"));
    public static Target lblNoCreditCardNeeded = Target.the("No credit card needed").located(By.xpath("//android.widget.TextView[@text ='No credit card needed']"));
    public static Target btnReserve = Target.the("Press button reserve").located(By.xpath("//android.widget.Button"));

    public static Target btnReserveTheseOptions = Target.the("Reserve these options").located(By.id("com.booking:id/recommended_block_reserve_button"));

//Numero de personas
//(//android.view.ViewGroup[@resource-id='com.booking:id/quick_filters_occupancy_flow_container'])[1]//android.widget.RadioButton[@text=3]
    //numero de camas
//(//android.view.ViewGroup[@resource-id='com.booking:id/quick_filters_occupancy_flow_container'])[2]//android.widget.RadioButton[@text='1 bed']

    //Room Information
    //seleccionar rooms
     //       id = com.booking:id/room_select_button_layout_container
    //boton reserve
    // id = com.booking:id/main_action
}
