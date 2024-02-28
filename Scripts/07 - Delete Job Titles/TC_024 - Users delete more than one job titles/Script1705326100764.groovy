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

WebUI.click(findTestObject('06 - Add Job Titles/06 - TC_019-success_Add_New_Job/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('06 - Add Job Titles/06 - TC_019-success_Add_New_Job/Page_OrangeHRM/span_Job'))

WebUI.click(findTestObject('06 - Add Job Titles/06 - TC_019-success_Add_New_Job/Page_OrangeHRM/li_Job Titles'))

WebUI.check(findTestObject('07 - Delete Job Titles/07-TC_024-delete_Multiple_Job/Page_OrangeHRM/checkbox_jobTitle_QA Lead'))

WebUI.check(findTestObject('07 - Delete Job Titles/07-TC_024-delete_Multiple_Job/Page_OrangeHRM/checkbox_jobTitle_Support Specialist'))

WebUI.click(findTestObject('07 - Delete Job Titles/07-TC_024-delete_Multiple_Job/Page_OrangeHRM/button_Delete Selected'))

WebUI.click(findTestObject('07 - Delete Job Titles/07-TC_024-delete_Multiple_Job/Page_OrangeHRM/button_Yes, Delete'))

WebUI.verifyElementPresent(findTestObject('07 - Delete Job Titles/07-TC_023-success_Delete_Job/Page_OrangeHRM/verify_Success'), 
    0)

