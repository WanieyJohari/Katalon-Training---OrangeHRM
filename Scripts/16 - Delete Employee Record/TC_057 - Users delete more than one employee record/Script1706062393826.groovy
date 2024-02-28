import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('01 - Login Functionality/POSITIVE/TC_001 - User Successfully Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('14 - Add Employee/14-TC_041-success_Add_Employee/Page_OrangeHRM/a_PIM'))

WebUI.check(findTestObject('16 - Delete Employee Record/16-TC_057_delete_Multiple_Employee/Page_OrangeHRM/checkbox_Aaron Clark', 
        [('employeeName01') : employeeName01]))

WebUI.check(findTestObject('16 - Delete Employee Record/16-TC_057_delete_Multiple_Employee/Page_OrangeHRM/checkbox_Adam Parker', 
        [('employeeName02') : employeeName02]))

WebUI.click(findTestObject('16 - Delete Employee Record/16-TC_057_delete_Multiple_Employee/Page_OrangeHRM/button_Delete Selected'))

WebUI.verifyElementPresent(findTestObject('16 - Delete Employee Record/16-TC_057_delete_Multiple_Employee/Page_OrangeHRM/verify_The selected record will be permanently deleted. Are you sure you want to continue'), 
    0)

WebUI.click(findTestObject('16 - Delete Employee Record/16-TC_057_delete_Multiple_Employee/Page_OrangeHRM/button_Yes, Delete'))

WebUI.verifyElementPresent(findTestObject('12- Add Job Category/Page_OrangeHRM/verify_Successfully Saved'), 0)

