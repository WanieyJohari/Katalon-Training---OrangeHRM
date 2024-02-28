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

WebUI.setText(findTestObject('15 - Search Employee/15-TC_054-search_Employee_Supervisor name/Page_OrangeHRM/input'), supervisorName)

WebUI.click(findTestObject('15 - Search Employee/15-TC_054-search_Employee_Supervisor name/Page_OrangeHRM/div_Anthony  Nolan'))

WebUI.click(findTestObject('15 - Search Employee/15-TC_052-search_Employee_Status/Page_OrangeHRM/button_Search'))

WebUI.verifyElementPresent(findTestObject('15 - Search Employee/15-TC_054-search_Employee_Supervisor name/Page_OrangeHRM/verify_(1) Record Found'), 
    0)

