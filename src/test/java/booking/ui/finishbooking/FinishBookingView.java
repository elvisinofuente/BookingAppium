package booking.ui.finishbooking;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FinishBookingView {
    public static Target cardNumber = Target.the("card number").located(By.id("com.booking:id/new_credit_card_number_edit"));
    public static Target selectCardType = Target.the("Select card type").located(By.xpath("(//android:id/text1)[1]"));
    public static Target selectCardTypeVisa = Target.the("Select card type Visa").located(By.xpath("(//android:id/text1)[3]"));

    public static Target expirationDat = Target.the("expiration date").located(By.id("com.booking:id/new_credit_card_expiry_date_edit"));
    public static Target btnBookNow = Target.the("press button book now").located(By.id("com.booking:id/action_button"));


}
