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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.eonline.com/us')

WebUI.click(findTestObject('Object Repository/Footer_OR/Page_Entertainment/Page_Entertainment/a_No Thanks'))

WebUI.delay(5)

'Verify whether the footer logo present'
WebUI.verifyElementPresent(findTestObject('Footer_OR/Page_Entertainment/Page_Entertainment/a_Promoted Links_footer__enews-logo footer__enews-logo--us'), 
    0)

WebUI.click(findTestObject('Object Repository/Footer_OR/Page_Entertainment/Page_Entertainment/a_Promoted Links_footer__enews-logo footer__enews-logo--us'))

WebUI.delay(5)

WebUI.closeBrowser()

