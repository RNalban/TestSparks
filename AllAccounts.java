package ae.zand.devops.views.corporate;

import ae.zand.devops.utils.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;



public class AllAccounts {
    protected final WebDriver driver;

    private final By accountStatusBy = By.cssSelector("div.multiselect._account-summary__grouped-actions.is--default > div.multiselect__tags");
    private final By tableSpinnerBy = By.cssSelector("section.el-container.u-shape-card.is-vertical > div.el-loading-mask");
    private final By searchBarBy = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/section/section/section[1]/div[2]/div[1]/input");
    private final By AccountStatusInputBy = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/section/section/section[1]/div[2]/div[2]/div[2]/input");
    private final By getAccountStatusBy = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/section/section/section[1]/div[2]/div[2]/div[1]");
    private final By AccountStatusSpinnerBy = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/section/section/section[1]/div[2]/div[2]/div[2]/div[2]");
    private final By InActiveOptionBy = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/section/section/section[1]/div[2]/div[2]/div[3]/ul/li[3]/span");
    private final By DormantOptionBy = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/section/section/section[1]/div[2]/div[2]/div[3]/ul/li[4]/span");
    private final By BlockedOptionBy = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/section/section/section[1]/div[2]/div[2]/div[3]/ul/li[5]/span");
    private final By accountStatusTextBy = By.cssSelector("div.multiselect._account-summary__grouped-actions.is--default > div.multiselect__tags > span");
    private final By viewDetailsClickBy = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/section/section/section[2]/div[1]/div[3]/table/tbody/tr[1]/td[1]");
    private final By searchAccountNumberTableBy = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/section/section/section[2]/div[1]/div[3]/table/tbody/tr[1]/td[1]/div/div/div");
    private final By optionsBy = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/section/section/div[2]/div[2]/span[2]/div[2]/button");
    private final By addnicknameBy = By.xpath("(//li[text()=' Add nickname '])");
    private final By enterTextby = By.xpath("//input[@placeholder='Please enter nickname...']");
    private final By canceloptionBy = By.xpath("//button[@class='el-button el-button--default el-button--small _button']");
    private final By downloadBy = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/section/section/div[4]/button/span");
    private final By DownloadSpinnerBy = By.cssSelector("#app > div.app-wrapper.openSidebar.withoutAnimation > div.main-container > div:nth-child(2) > section > section > div.mt-3._account-details__footer > button > i");
    private final By inputmonthBy = By.xpath("//input[@placeholder='Select a month']");
    private final By selectmonthBy = By.xpath("//td[@class='current']");
    private final By downloadStatementSpinnerBy = By.xpath("//i[@class='el-icon-loading']");
    private final By statementBy = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/section/section/div[1]/div[2]/div/button");
    private final By downloadoptionby = By.xpath("//span[text()=' Download ']//parent :: button[@class='el-button el-button--primary _button']");
    private final By switchAccountSpinnerBy = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/section/section/div[1]/div[1]/div/div[2]/div[2]");
    private final By getaccountswitchBy = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/section/section/div[1]/div[1]/div");
    private final By clickoptionBy = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/section/section/div[1]/div[1]/div/div[3]/ul/li[2]/span/div/div/div[1]/div");
    /**
     * Constructor.
     *
     * @param driver the driver of the Browser to be used.
     */
    public AllAccounts(WebDriver driver) {
        this.driver = driver;
        Wait.waitForPageToLoad(driver, accountStatusBy);
        Wait.waitForSpinner(driver, tableSpinnerBy); }

    public void SearchAccount(String search){
       // Wait.waitForPageToLoad(driver, searchBarBy);
        driver.findElement(searchBarBy).click();
        driver.findElement(searchBarBy).sendKeys(search + Keys.RETURN);
    }

    public void ActiveAccountStatus(String status){
        Wait.waitForSpinner(driver, AccountStatusSpinnerBy);
        driver.findElement(getAccountStatusBy).click();
        driver.findElement(AccountStatusInputBy).sendKeys(status + Keys.ENTER);
        //Wait.waitForPageToLoad(driver, ActiveOptionsBy);

    }

    public void DormantAccountStatus(String status){
        Wait.waitForSpinner(driver, AccountStatusSpinnerBy);
        driver.findElement(getAccountStatusBy).click();
        driver.findElement(AccountStatusInputBy).sendKeys(status + Keys.ENTER);
        Wait.waitForPageToLoad(driver, DormantOptionBy);


    }

    public void InActiveAccountStatus(String status){
        Wait.waitForSpinner(driver, AccountStatusSpinnerBy);
        driver.findElement(getAccountStatusBy).click();
        driver.findElement(AccountStatusInputBy).sendKeys(status + Keys.ENTER);
        Wait.waitForPageToLoad(driver, InActiveOptionBy);
        }

    public void BlockAccountStatus(String status){
        Wait.waitForSpinner(driver, AccountStatusSpinnerBy);
        driver.findElement(getAccountStatusBy).click();
        driver.findElement(AccountStatusInputBy).sendKeys(status + Keys.ENTER);
        Wait.waitForPageToLoad(driver,BlockedOptionBy);
    }

    public void addNickName(){
        Wait.waitForPageToLoad(driver, viewDetailsClickBy);
        driver.findElement(viewDetailsClickBy).click();
        Wait.waitForPageToLoad(driver, optionsBy);
        driver.findElement(optionsBy).click();
        Wait.waitForDrawer(driver,addnicknameBy);
        driver.findElement(addnicknameBy).click();
        Wait.waitForDrawer(driver, enterTextby);
        driver.findElement(enterTextby).sendKeys("testing");
        driver.findElement(canceloptionBy).click();
    }

    public void viewDetails(){
        Wait.waitForPageToLoad(driver, viewDetailsClickBy);
        driver.findElement(viewDetailsClickBy).click();
        Wait.waitForPageToLoad(driver, getaccountswitchBy);
    }

    public void switchAccounts(){
        Wait.waitForPageToLoad(driver, viewDetailsClickBy);
        driver.findElement(viewDetailsClickBy).click();
        Wait.waitForPageToLoad(driver, getaccountswitchBy);
        Wait.waitForSpinner(driver, switchAccountSpinnerBy);
        driver.findElement(getaccountswitchBy).click();
        driver.findElement(clickoptionBy).click();

    }

    public String getAccountStatusText() {
        return driver.findElement(accountStatusTextBy).getText();
    }

    public String getAccountNumber(){
        return driver.findElement(searchAccountNumberTableBy).getText().split("\\s+")[1];
    }
    public void downloadingStatementsbelowRecords(){
        Wait.waitForPageToLoad(driver, viewDetailsClickBy);
        driver.findElement(viewDetailsClickBy).click();
        Wait.waitForPageToLoad(driver, downloadBy);
        driver.findElement(downloadBy).click();
        //Wait.waitForDrawer(driver, downloadBy);
        Wait.waitForSpinner(driver, DownloadSpinnerBy);


    }
    public void downloadingfromStatements(){
        Wait.waitForPageToLoad(driver, viewDetailsClickBy);
        driver.findElement(viewDetailsClickBy).click();
        Wait.waitForPageToLoad(driver, statementBy);
        driver.findElement(statementBy).click();
        Wait.waitForDrawer(driver, statementBy);
        driver.findElement(inputmonthBy).click();
        Wait.waitForDrawer(driver, inputmonthBy);
        Wait.waitForDrawer(driver, selectmonthBy);
        driver.findElement(selectmonthBy).click();

        Wait.waitForDrawer(driver, downloadoptionby);
        driver.findElement(downloadoptionby).click();
        Wait.waitForSpinner(driver, downloadStatementSpinnerBy);


    }


}
