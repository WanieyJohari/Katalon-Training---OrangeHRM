package orangeHRM

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class addNewUser {
	
	@Keyword
	public static void addAcc() {
						
					WebUI.click(findTestObject('03 - Search Users/03- TC_007-search_Valid_Username/Page_OrangeHRM/a_Admin'))
					
					WebUI.click(findTestObject('03 - Search Users/03- TC_008-search_Invalid_User/Page_OrangeHRM/li_User Management'))
					
					WebUI.click(findTestObject('03 - Search Users/03- TC_008-search_Invalid_User/Page_OrangeHRM/li_Users'))
					
					WebUI.click(findTestObject('04 - Add Account/04-TC_009_add_New_User/Page_OrangeHRM/button_Add'))
					
					WebUI.click(findTestObject('04 - Add Account/04-TC_009_add_New_User/Page_OrangeHRM/user_Role_dropdown'), FailureHandling.STOP_ON_FAILURE)
					
					WebUI.click(findTestObject('04 - Add Account/04-TC_009_add_New_User/Page_OrangeHRM/div_Admin'))
	}
}
