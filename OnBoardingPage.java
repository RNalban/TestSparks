package ae.zand.devops.views.corporate;

import ae.zand.devops.constants.Paths;
import ae.zand.devops.utils.Wait;
import ae.zand.devops.views.onboarding.CustomerJourney;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OnBoardingPage {
    protected final WebDriver driver;
    private final By imglogo = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[1]/div/div[1]/div/img");

    public OnBoardingPage(WebDriver driver) {
        this.driver = driver;

        Wait.waitForPageToLoad(driver, imglogo);}


    public CustomerJourney goToOnBoarding(){
        driver.get(Paths.CUSTOMER_ONBOARDING);
        return new CustomerJourney(driver);
    }
}
