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

WebUI.click(findTestObject('Object Repository/03 - Search Users/03- TC_007-search_Valid_Username/Page_OrangeHRM/a_Admin'))

WebUI.setText(findTestObject('03 - Search Users/03- TC_007-search_Valid_Username/Page_OrangeHRM/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus'), 
    searchUsername)

WebUI.click(findTestObject('03 - Search Users/03- TC_007-search_Valid_Username/Page_OrangeHRM/Page_OrangeHRM/select_User_dropdown'))

WebUI.click(findTestObject('03 - Search Users/03- TC_007-search_Valid_Username/Page_OrangeHRM/Page_OrangeHRM/user_dropdown_Value'))

WebUI.click(findTestObject('03 - Search Users/03- TC_007-search_Valid_Username/Page_OrangeHRM/Page_OrangeHRM/select_Status_dropdown'))

WebUI.click(findTestObject('03 - Search Users/03- TC_007-search_Valid_Username/Page_OrangeHRM/Page_OrangeHRM/status_Dropdown_value'))

WebUI.click(findTestObject('03 - Search Users/03- TC_007-search_Valid_Username/Page_OrangeHRM/Page_OrangeHRM/button_Search'))

WebUI.verifyElementPresent(findTestObject('03 - Search Users/03- TC_007-search_Valid_Username/Page_OrangeHRM/Page_OrangeHRM/span_(1) Record Found'), 
    5)

