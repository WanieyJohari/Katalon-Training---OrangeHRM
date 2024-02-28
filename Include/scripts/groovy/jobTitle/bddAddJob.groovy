package jobTitle
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class bddAddJob {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User navigates to login page with valid credentials")
	def navigate_to_login_page () {

		WebUI.callTestCase(findTestCase('01 - Login Functionality/POSITIVE/TC_001 - User Successfully Login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User navigates to the job titles section")
	def insert_job_title () {

		WebUI.click(findTestObject('Object Repository/06 - Add Job Titles/06 - TC_019-success_Add_New_Job/Page_OrangeHRM/a_Admin'))

		WebUI.click(findTestObject('Object Repository/06 - Add Job Titles/06 - TC_019-success_Add_New_Job/Page_OrangeHRM/span_Job'))

		WebUI.click(findTestObject('Object Repository/06 - Add Job Titles/06 - TC_019-success_Add_New_Job/Page_OrangeHRM/li_Job Titles'))

		WebUI.click(findTestObject('Object Repository/06 - Add Job Titles/06 - TC_019-success_Add_New_Job/Page_OrangeHRM/button_Add'))
	}

	@And("User insert (.*) for the job title input field")
	def insert_job_title(String jobTitle) {

		WebUI.setText(findTestObject('Object Repository/06 - Add Job Titles/06 - TC_019-success_Add_New_Job/Page_OrangeHRM/input_Job Title_oxd-input oxd-input--focus'),
				jobTitle)
	}

	@And("User click save button")
	def click_save_button() {

		WebUI.click(findTestObject('Object Repository/06 - Add Job Titles/06 - TC_019-success_Add_New_Job/Page_OrangeHRM/button_Save'))
	}

	@Then("Job title is successfully added")
	def success_add_job_title() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/06 - Add Job Titles/06 - TC_019-success_Add_New_Job/Page_OrangeHRM/p_Success'),
				5)
	}
}