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

WebUI.click(findTestObject('08 - Add Pay Grade/08-TC_025-add_New_Pay/Page_OrangeHRM/span_Admin'))

WebUI.click(findTestObject('Object Repository/06 - Add Job Titles/06 - TC_019-success_Add_New_Job/Page_OrangeHRM/span_Job'))

WebUI.click(findTestObject('08 - Add Pay Grade/08-TC_025-add_New_Pay/Page_OrangeHRM/a_Pay Grades'))

WebUI.click(findTestObject('09 - Add Currency/09-TC_027-add_New_Currency/Page_OrangeHRM/button_edit_Grade ABC', [('payGrade') : GlobalVariable.payGrade]))

WebUI.click(findTestObject('09 - Add Currency/09-TC_030-minimum_Higher_Than_Maximum/Page_OrangeHRM/button_Malaysian Ringgit'))

WebUI.setText(findTestObject('09 - Add Currency/09-TC_030-minimum_Higher_Than_Maximum/Page_OrangeHRM/input_Minimum Salary'), 
    minimumSalary)

WebUI.setText(findTestObject('Object Repository/09 - Add Currency/09-TC_030-minimum_Higher_Than_Maximum/Page_OrangeHRM/Page_OrangeHRM/input_Maximum Salary_oxd-input oxd-input--f_c30d90'), 
    maximumSalary)

WebUI.verifyElementPresent(findTestObject('Object Repository/09 - Add Currency/09-TC_030-minimum_Higher_Than_Maximum/Page_OrangeHRM/Page_OrangeHRM/span_Should be higher than Minimum Salary'), 
    0)

