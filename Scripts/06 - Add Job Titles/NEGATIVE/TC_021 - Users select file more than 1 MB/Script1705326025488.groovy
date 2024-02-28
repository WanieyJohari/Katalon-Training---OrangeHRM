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

WebUI.click(findTestObject('06 - Add Job Titles/06 - TC_019-success_Add_New_Job/Page_OrangeHRM/button_Add'))

WebUI.setText(findTestObject('06 - Add Job Titles/06 - TC_019-success_Add_New_Job/Page_OrangeHRM/input_Job Title_oxd-input oxd-input--focus'), 
    jobTitle)

WebUI.setText(findTestObject('06 - Add Job Titles/06 - TC_019-success_Add_New_Job/Page_OrangeHRM/textarea_Job Description_oxd-textarea oxd-t_4f7bba'), 
    jobDescription)

WebUI.uploadFile(findTestObject('06 - Add Job Titles/06-TC_021-file_More_Than_1MB/Page_OrangeHRM/div_BrowseNo file chosen'), 
    jobUploadFile)

WebUI.click(findTestObject('06 - Add Job Titles/06 - TC_019-success_Add_New_Job/Page_OrangeHRM/button_Save'))

WebUI.verifyElementPresent(findTestObject('06 - Add Job Titles/06-TC_021-file_More_Than_1MB/Page_OrangeHRM/verify_Attachment Size Exceeded'), 
    0)

