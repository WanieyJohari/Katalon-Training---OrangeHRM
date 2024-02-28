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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.urlAddress)

WebUI.click(findTestObject('Object Repository/02 - Reset Password/02-TC_006 - reset_Invalid_Username/Page_OrangeHRM/p_Forgot your password'))

WebUI.setText(findTestObject('Object Repository/02 - Reset Password/02-TC_006 - reset_Invalid_Username/Page_OrangeHRM/input_Username_username'), 
    username)

WebUI.click(findTestObject('Object Repository/02 - Reset Password/02-TC_006 - reset_Invalid_Username/Page_OrangeHRM/button_Reset Password'))

WebUI.verifyElementPresent(findTestObject('Object Repository/02 - Reset Password/02-TC_006 - reset_Invalid_Username/Page_OrangeHRM/h6_Reset Password link sent successfully'), 
    5)

