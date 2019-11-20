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

WebUI.navigateToUrl('https://www.eonline.com/newsletter')

WebUI.scrollToElement(findTestObject('Newsletter/Page_Newsletter  E Online/span_news_newsletter-landing__radio'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Newsletter/Page_Newsletter  E Online/span_news_newsletter-landing__radio'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Newsletter/Page_Newsletter  E Online/input_Weekly_newsletter-landing__input'), 
    MailID)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Newsletter/Page_Newsletter  E Online/input_Weekly_glossy__btn newsletter-landing__btn'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Newsletter/Page_Newsletter  E Online/p_Thank you for subscribing'), 
    0)

WebUI.closeBrowser()

