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

WebUI.click(findTestObject('08 - Add Pay Grade/08-TC_025-add_New_Pay/Page_OrangeHRM/span_Job'))

WebUI.click(findTestObject('08 - Add Pay Grade/08-TC_025-add_New_Pay/Page_OrangeHRM/a_Pay Grades'))

WebUI.click(findTestObject('09 - Add Currency/09-TC_027-add_New_Currency/Page_OrangeHRM/button_edit_Grade ABC', [('payGrade') : GlobalVariable.payGrade]))

WebUI.click(findTestObject('11 - Edit Currency/11-TC_033-edit_Minimum_Salary/Page_OrangeHRM/button_edit_Malaysian Ringgit'))

WebUI.setText(findTestObject('11 - Edit Currency/11-TC_033-edit_Minimum_Salary/Page_OrangeHRM/input_Minimum Salary_Malaysia'), minimumSalary)

WebUI.click(findTestObject('11 - Edit Currency/11-TC_033-edit_Minimum_Salary/Page_OrangeHRM/button_Save'))

WebUI.verifyElementPresent(findTestObject('11 - Edit Currency/11-TC_033-edit_Minimum_Salary/Page_OrangeHRM/verify_Success'), 0)

