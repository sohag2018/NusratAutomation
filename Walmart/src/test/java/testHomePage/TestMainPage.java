package testHomePage;

import homePage.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestMainPage extends MainPage {
    MainPage mainPage;
    @BeforeMethod
    public void initialize() {
    TestLogger.log(convertToString(new Object(){}.getClass().getSimpleName()) + " : " + convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    mainPage = PageFactory.initElements(driver, MainPage.class);
    }

    // dont touch the the above method, change from bellow. copy and create new as you need
    @Test
    public void testDeliveryPack(){  // change here after test
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    mainPage.checkDeliveryPack();// change here after mainPage. ( it will come automaticaly when you put dot )
    }

}
