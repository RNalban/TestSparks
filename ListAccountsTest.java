package ae.zand.devops.corporate.accounts;

import ae.zand.devops.Setup;
import ae.zand.devops.constants.Paths;
import ae.zand.devops.utils.Wait;
import ae.zand.devops.views.common.Login;
import ae.zand.devops.views.corporate.AccountDetails;
import ae.zand.devops.views.corporate.AllAccounts;
import ae.zand.devops.views.corporate.Dashboard;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListAccountsTest extends Setup {
    @Test
    public void listAllAccounts() {
        Login login = new Login(driver);
        Dashboard dashboard = login.loginValidUser(INPUTTER_USERNAME, INPUTTER_PASSWORD);
        AllAccounts allAccounts = dashboard.goToAllAccounts();
        driver.get(Paths.LOGOUT);
    }

    @Test (dependsOnMethods = {"listAllAccounts"})
    public void searchAccount(){
        Login login=new Login(driver);
        Dashboard dashboard = login.loginValidUser(INPUTTER_USERNAME,INPUTTER_PASSWORD);
        AllAccounts allAccounts = dashboard.goToAllAccounts();
        allAccounts.SearchAccount("0310100033256001");
      Assert.assertEquals(allAccounts.getAccountNumber(), "0310100033256001");
        driver.get(Paths.LOGOUT);
    }

    @Test (dependsOnMethods = {"listAllAccounts"})
    public void filterStatusByActive(){
        Login login = new Login(driver);
        Dashboard dashboard = login.loginValidUser(INPUTTER_USERNAME, INPUTTER_PASSWORD);
        AllAccounts allAccounts = dashboard.goToAllAccounts();
        allAccounts.ActiveAccountStatus("Active");
        Assert.assertEquals(allAccounts.getAccountStatusText(), "Active");
        driver.get(Paths.LOGOUT);
    }
    @Test (dependsOnMethods = {"listAllAccounts"})
    public void filterStatusByInactive(){
        Login login = new Login(driver);
        Dashboard dashboard = login.loginValidUser(INPUTTER_USERNAME, INPUTTER_PASSWORD);
        AllAccounts allAccounts = dashboard.goToAllAccounts();
        allAccounts.InActiveAccountStatus("Inactive");
        Assert.assertEquals(allAccounts.getAccountStatusText(), "Inactive");
        driver.get(Paths.LOGOUT);
    }
    @Test (dependsOnMethods = {"listAllAccounts"})
    public void filterStatusByDormant(){
        Login login = new Login(driver);
        Dashboard dashboard = login.loginValidUser(INPUTTER_USERNAME, INPUTTER_PASSWORD);
        AllAccounts allAccounts = dashboard.goToAllAccounts();
        allAccounts.DormantAccountStatus("Dormant");
        Assert.assertEquals(allAccounts.getAccountStatusText(), "Dormant");
        driver.get(Paths.LOGOUT);
    }
    @Test (dependsOnMethods = {"listAllAccounts"})
    public void filterStatusByBlocked(){
        Login login = new Login(driver);
        Dashboard dashboard = login.loginValidUser(INPUTTER_USERNAME, INPUTTER_PASSWORD);
        AllAccounts allAccounts = dashboard.goToAllAccounts();
        allAccounts.BlockAccountStatus("Blocked");
        Assert.assertEquals(allAccounts.getAccountStatusText(), "Blocked");
        driver.get(Paths.LOGOUT);
    }
    @Test (dependsOnMethods = {"listAllAccounts"})
    public void viewAccountDetails(){
        Login login = new Login(driver);
        Dashboard dashboard = login.loginValidUser(INPUTTER_USERNAME, INPUTTER_PASSWORD);
        AllAccounts allAccounts = dashboard.goToAllAccounts();
        allAccounts.viewDetails();
        driver.get(Paths.LOGOUT);
    }
    @Test (dependsOnMethods = {"listAllAccounts","viewAccountDetails"})
    public void switchingAccounts(){
        Login login = new Login(driver);
        Dashboard dashboard = login.loginValidUser(INPUTTER_USERNAME, INPUTTER_PASSWORD);
       AllAccounts allAccounts = dashboard.goToAllAccounts();
        allAccounts.switchAccounts();
        driver.get(Paths.LOGOUT);
    }
    @Test (dependsOnMethods = {"viewAccountDetails"})
    public void nickName() {
        Login login =new Login(driver);
        Dashboard dashboard = login.loginValidUser(INPUTTER_USERNAME, INPUTTER_PASSWORD);
        AllAccounts allAccounts= dashboard.goToAllAccounts();
        allAccounts.addNickName();
        driver.get(Paths.LOGOUT);
    }
    @Test (dependsOnMethods = {"viewAccountDetails"})
    public void downloadFromStatementsOption() {
        Login login = new Login(driver);
        Dashboard dashboard = login.loginValidUser(INPUTTER_USERNAME, INPUTTER_PASSWORD);
       AllAccounts allAccounts = dashboard.goToAllAccounts();
        allAccounts.downloadingfromStatements();
        driver.get(Paths.LOGOUT);

    }
    @Test (dependsOnMethods = {"viewAccountDetails","downloadFromStatementsOption"})
    public void downloadOptionBelowRecords(){
        Login login = new Login(driver);
        Dashboard dashboard = login.loginValidUser(INPUTTER_USERNAME, INPUTTER_PASSWORD);
        AllAccounts allAccounts = dashboard.goToAllAccounts();
        allAccounts.downloadingStatementsbelowRecords();
        driver.get(Paths.LOGOUT);


    }
}
