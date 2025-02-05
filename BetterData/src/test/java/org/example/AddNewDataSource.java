package org.example;

import org.example.CommonUtilities.CommonFunctions;
import org.example.Pom.DataWarehouse;
import org.testng.annotations.Test;

public class AddNewDataSource extends MainClass{

    @Test
    public void addNewDataSource() throws InterruptedException {

        // String email = "tozilbdnegjywgizrh@ckptr.com";
        // String password = "123456789";

        CommonFunctions commonFunctions = new CommonFunctions(MainClass.driver);
        DataWarehouse dataWarehouse = new DataWarehouse(MainClass.driver);
        commonFunctions.sendKeys(dataWarehouse.searchbox, "Something");
        // commonFunctions.wait(5);
        commonFunctions.click(dataWarehouse.enter);
        // commonFunctions.sendKeys(dataWarehouse.password,password);
        // commonFunctions.click(dataWarehouse.signIn);
        // commonFunctions.elementToBeClickable(dataWarehouse.navToDataWarehouse);
        // Thread.sleep(10000);
        // commonFunctions.click(dataWarehouse.navToDataWarehouse);
        // //commonFunctions.elementToBeClickable(dataWarehouse.addNewSourceButton);
        // Thread.sleep(3000);
        // commonFunctions.click(dataWarehouse.addNewSourceButton);
        // commonFunctions.click(dataWarehouse.readyToUpload);
        // //commonFunctions.elementToBeClickable(dataWarehouse.next);
        // Thread.sleep(3000);
        // String filePath = System.getProperty("user.dir") + "/src/main/java/org/example/ExcelData/access-code-password-recovery-code.csv";
        // commonFunctions.sendKeys(dataWarehouse.upload, filePath);
        // Thread.sleep(3000);
        // commonFunctions.elementToBeClickable(dataWarehouse.next);
        // //Thread.sleep(30000);
        // Thread.sleep(3000);
        // commonFunctions.click(dataWarehouse.next);
        // Thread.sleep(10000);
        // commonFunctions.click(dataWarehouse.addNewDataSource);
        // Thread.sleep(5000);
        // commonFunctions.elementToBeClickable(dataWarehouse.cancel);
        // Thread.sleep(3000);
        // commonFunctions.click(dataWarehouse.expandForDescription);
        // Thread.sleep(3000);
        // commonFunctions.click(dataWarehouse.dataProfile);
        // Thread.sleep(3000);
        // commonFunctions.click(dataWarehouse.cancelSidebar);
        // commonFunctions.click(dataWarehouse.moreOptions);
        // commonFunctions.click(dataWarehouse.delete);
        // commonFunctions.click(dataWarehouse.delete);
    }
}
