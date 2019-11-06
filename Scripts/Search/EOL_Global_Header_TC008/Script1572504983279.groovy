import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.eonline.com/us')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Search_OR/Page_Entertainment News Celebrity Gossip Celebrity News  E News/a_No Thanks'))

WebUI.click(findTestObject('Page_Entertainmen/div_Venezuela_nav__search-button js-nav__search-button queryly_search_button'))

WebUI.setText(findTestObject('Page_Entertainmen/input_Advanced Search_queryly_query'), 
    'Priyanka Chopra')

WebUI.click(findTestObject('Page_Entertainmen/div_Showing 387 Results for priyanka chopra'))

WebUI.click(findTestObject('Page_Entertainmen/img_Advanced Search_advanced_closebutton'))

WebUI.closeBrowser()

