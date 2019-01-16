package homePage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class MainPage extends BaseUtil {


 // first one is made for you. copy and make new as you need. delete all comment out message

    @FindBy(className = "/html/body/div[1]/div/div/div/div[1]/div/div/div[1]/span[2]/div/div[1]/div/div[1]/img")             // put locator and the way to find the locator like xpath, css, id, name
    public static WebElement deliveryPack; // change the variable name as your choice try to name it similar to your test

public void checkDeliveryPack() { // change the method name after void
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    driver.manage().window().maximize();
    deliveryPack.click();      //change here before before .click
}







}
