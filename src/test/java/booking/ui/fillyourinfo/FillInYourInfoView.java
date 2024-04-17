package booking.ui.fillyourinfo;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillInYourInfoView {
    public static Target firstName = Target.the("First Name").located(By.xpath("//android.widget.TextView[@text='First Name *']/following-sibling::android.widget.EditText"));
    public static Target lastName = Target.the("Last Name").located(By.xpath("//android.widget.TextView[@text='Last Name *']/following-sibling::android.widget.EditText"));

    public static Target emailAddress = Target.the("email address").located(By.xpath("//android.widget.TextView[@text='Email Address *']/following-sibling::android.widget.EditText"));
    public static Target address = Target.the("Address").located(By.xpath("//android.widget.TextView[@text='Address *']/following-sibling::android.widget.EditText"));

    public static Target codeZip = Target.the("Code Zip").located(By.xpath("//android.widget.TextView[@text='Zip Code *']/following-sibling::android.widget.EditText"));
    public static Target city = Target.the("City").located(By.xpath("//android.widget.TextView[@text='City *']/following-sibling::android.widget.EditText"));

    public static Target country = Target.the("Country o Region").located(By.xpath("//android.widget.TextView[@text='Country/Region *']/following-sibling::android.widget.EditText"));
    public static Target mobilePhone = Target.the("Mobile phone").located(By.xpath("//android.widget.TextView[@text='Mobile Phone *']/following-sibling::android.widget.EditText"));

    public static Target purposeLeisure = Target.the("Purpose leisure").located(By.xpath("//android.widget.RadioButton[@resource-id='com.booking:id/business_purpose_leisure']"));

    public static Target btnAddMissingDetails = Target.the("Button Add missing details").located(By.xpath("//android.widget.Button[@resource-id='com.booking:id/action_button']"));

    public static Target lblCountry = Target.the("Please enter your country.").located(By.xpath("//android.widget.TextView[@text='Country/Region *']"));

    public static Target lblPhone = Target.the("Please enter your phone.").located(By.xpath("//android.widget.TextView[@text='Mobile Phone *']"));
}
