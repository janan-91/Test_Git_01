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

WebUI.click(findTestObject('Object Repository/Test_OR/Page_Entertainment News Celebrity Gossip Celebrity News  E News/a_No Thanks'))

WebUI.click(findTestObject('Object Repository/Test_OR/Page_Entertainment News Celebrity Gossip Celebrity News  E News/p_Kim Kardashian Rents Out Childhood Home for Kris Jenners Birthday'))

WebUI.click(findTestObject('Object Repository/Test_OR/Page_Kim Kardashian Rents Out Childhood Home for Kris Jenners Birthday  E News/div_Email'))

WebUI.setText(findTestObject('Object Repository/Test_OR/Page_Kim Kardashian Rents Out Childhood Home for Kris Jenners Birthday  E News/input_EMAIL ARTICLE_fromEmail'), 
    'jananisuba.s@tringapps.com')

WebUI.setText(findTestObject('Object Repository/Test_OR/Page_Kim Kardashian Rents Out Childhood Home for Kris Jenners Birthday  E News/input_Invalid email Please enter a valid email address_toEmail'), 
    'jananisuba.s@tringapps.com')

WebUI.click(findTestObject('Object Repository/Test_OR/Page_Kim Kardashian Rents Out Childhood Home for Kris Jenners Birthday  E News/div_X'))

WebUI.click(findTestObject('Object Repository/Test_OR/Page_Kim Kardashian Rents Out Childhood Home for Kris Jenners Birthday  E News/div_Share'))

WebUI.switchToWindowTitle('Facebook')

WebUI.setText(findTestObject('Object Repository/Test_OR/Page_Facebook/input_Email address or phone number_email'), 'tringapps001@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Test_OR/Page_Facebook/input_Password_pass'), 'PsOxV63pk6ntYRmnNLn/2A==')

WebUI.click(findTestObject('Object Repository/Test_OR/Page_Facebook/label_Password_loginbutton'))

WebUI.click(findTestObject('Object Repository/Test_OR/Page_Post to Facebook/span_Post to Facebook'))

WebUI.closeBrowser()

