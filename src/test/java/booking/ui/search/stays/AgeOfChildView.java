package booking.ui.search.stays;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AgeOfChildView {


    public static Target selAge = Target.the("Age of child").located(By.id("android:id/numberpicker_input"));
    //public static Target scrollNumYearsOld = Target.the("Scroll to Years old").located(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text('< 5 year old'));"));

    public static Target minorOneYearsOld = Target.the("< 1 year old").located(By.xpath("//android.widget.Button[@text = '< 1 year old']"));
    public static Target oneYearsOld = Target.the("1 year old").located(By.xpath("//android.widget.Button[@text = '1 year old']"));
    public static Target twoYearsOld = Target.the("2 years old").located(By.xpath("//android.widget.Button[@text = '2 years old']"));
    public static Target threeYearsOld = Target.the("3 years old").located(By.xpath("//android.widget.Button[@text = '3 years old']"));
    public static Target fourYearsOld = Target.the("4 years old").located(By.xpath("//android.widget.Button[@text = '4 years old']"));
    public static Target fiveYearsOld = Target.the("5 years old").located(By.xpath("//android.widget.Button[@text = '5 years old']"));

    public static Target btnOk = Target.the("Button Ok").located(By.id("android:id/button1"));








}
