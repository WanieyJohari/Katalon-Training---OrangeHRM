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

WebUI.click(findTestObject('14 - Add Employee/14-TC_041-success_Add_Employee/Page_OrangeHRM/button_Add'))

WebUI.setText(findTestObject('14 - Add Employee/14-TC_041-success_Add_Employee/Page_OrangeHRM/input_Employee Full Name_firstName'), employeeFirstName)

WebUI.setText(findTestObject('14 - Add Employee/14-TC_041-success_Add_Employee/Page_OrangeHRM/input_Employee Full Name_lastName'), employeeLastName)

WebUI.sendKeys(findTestObject('14 - Add Employee/14-TC_041-success_Add_Employee/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--active'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('14 - Add Employee/14-TC_041-success_Add_Employee/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--active'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('14 - Add Employee/14-TC_041-success_Add_Employee/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--active'), 
    employeeID)

WebUI.click(findTestObject('14 - Add Employee/14_TC_044-enter_Registered_Username/Page_OrangeHRM/span_Employee Id_oxd-switch-input oxd-switch-input--active --label-right'))

WebUI.setText(findTestObject('14 - Add Employee/14_TC_044-enter_Registered_Username/Page_OrangeHRM/input_Username_Add_Employee'), usernameAddEmployee)

WebUI.verifyElementPresent(findTestObject('14 - Add Employee/14_TC_044-enter_Registered_Username/Page_OrangeHRM/span_Username already exists'), 
    0)

