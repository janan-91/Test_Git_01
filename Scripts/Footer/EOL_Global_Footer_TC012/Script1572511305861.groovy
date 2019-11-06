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

WebUI.click(findTestObject('Object Repository/FooterObjects/a_No Thanks'))

WebUI.rightClick(findTestObject('Object Repository/FooterObjects/a_About Us'))

WebUI.click(findTestObject('Footer_OR/Footer/Page_Entertainment News Celebrity Gossip Celebrity News  E News/a_About Us'))

WebUI.delay(5)

WebUI.rightClick(findTestObject('Object Repository/FooterObjects/a_FAQ'))

WebUI.click(findTestObject('Footer_OR/Footer/Page_Entertainment News Celebrity Gossip Celebrity News  E News/a_FAQ'))

WebUI.rightClick(findTestObject('Object Repository/FooterObjects/a_Careers'))

WebUI.click(findTestObject('Footer_OR/Footer/Page_Entertainment News Celebrity Gossip Celebrity News  E News/a_Careers'))

WebUI.rightClick(findTestObject('Object Repository/FooterObjects/a_Contact Us'))

WebUI.click(findTestObject('Footer_OR/Footer/Page_Entertainment News Celebrity Gossip Celebrity News  E News/a_Contact Us'))

WebUI.rightClick(findTestObject('Object Repository/FooterObjects/a_Site Map'))

WebUI.click(findTestObject('Footer_OR/Footer/Page_Entertainment News Celebrity Gossip Celebrity News  E News/a_Site Map'))

WebUI.rightClick(findTestObject('Object Repository/FooterObjects/a_Apps'))

WebUI.click(findTestObject('Footer_OR/Footer/Page_Entertainment News Celebrity Gossip Celebrity News  E News/a_Apps'))

WebUI.rightClick(findTestObject('Object Repository/FooterObjects/a_Cookie Settings'))

WebUI.click(findTestObject('Footer_OR/Footer/Page_Entertainment News Celebrity Gossip Celebrity News  E News/a_Cookie Settings'))

WebUI.rightClick(findTestObject('Object Repository/FooterObjects/a_Show Schedule'))

WebUI.click(findTestObject('Footer_OR/Footer/Page_Entertainment News Celebrity Gossip Celebrity News  E News/a_Show Schedule'))

WebUI.rightClick(findTestObject('Object Repository/FooterObjects/a_ClosedCaptioning'))

WebUI.click(findTestObject('Footer_OR/Footer/Page_Entertainment News Celebrity Gossip Celebrity News  E News/a_Closed                        Captioning'))

WebUI.rightClick(findTestObject('Object Repository/FooterObjects/a_Watch Full Episodes'))

WebUI.click(findTestObject('Footer_OR/Footer/Page_Entertainment News Celebrity Gossip Celebrity News  E News/a_Watch Full Episodes'))

WebUI.rightClick(findTestObject('Object Repository/FooterObjects/a_Advertise'))

WebUI.click(findTestObject('Footer_OR/Footer/Page_Entertainment News Celebrity Gossip Celebrity News  E News/a_Advertise'))

WebUI.rightClick(findTestObject('Object Repository/FooterObjects/a_AdChoices'))

WebUI.click(findTestObject('Footer_OR/Footer/Page_Entertainment News Celebrity Gossip Celebrity News  E News/a_AdChoices'))

WebUI.rightClick(findTestObject('Object Repository/FooterObjects/a_RSS Feeds'))

WebUI.click(findTestObject('Footer_OR/Footer/Page_Entertainment News Celebrity Gossip Celebrity News  E News/a_RSS Feeds'))

WebUI.rightClick(findTestObject('Object Repository/FooterObjects/a_Peoples Choice'))

WebUI.click(findTestObject('Footer_OR/Footer/Page_Entertainment News Celebrity Gossip Celebrity News  E News/a_Peoples Choice'))

WebUI.rightClick(findTestObject('Object Repository/FooterObjects/a_Peoples Choice FAQ'))

WebUI.click(findTestObject('Footer_OR/Footer/Page_Entertainment News Celebrity Gossip Celebrity News  E News/a_Peoples Choice FAQ'))

WebUI.rightClick(findTestObject('Object Repository/FooterObjects/a_ClickHere'))

WebUI.click(findTestObject('Footer_OR/Footer/Page_Entertainment News Celebrity Gossip Celebrity News  E News/a_Click                Here'))

WebUI.rightClick(findTestObject('Object Repository/FooterObjects/a_New Privacy Policy'))

WebUI.click(findTestObject('Footer_OR/Footer/Page_Entertainment News Celebrity Gossip Celebrity News  E News/a_New Privacy Policy'))

WebUI.rightClick(findTestObject('Object Repository/FooterObjects/a_Terms of Service'))

WebUI.click(findTestObject('Footer_OR/Footer/Page_Entertainment News Celebrity Gossip Celebrity News  E News/a_Terms of Service'))

WebUI.rightClick(findTestObject('Object Repository/FooterObjects/a_IndependentProgrammingReport'))

WebUI.click(findTestObject('Footer_OR/Footer/Page_Entertainment News Celebrity Gossip Celebrity News  E News/a_Independent Programming Report'))

WebUI.rightClick(findTestObject('Object Repository/FooterObjects/div_New Privacy PolicyTerms of Service                                                                                                        Independent Programming Report'))

WebUI.click(findTestObject('Object Repository/FooterObjects/div_New Privacy PolicyTerms of Service                                                                                                        Independent Programming Report'))

WebUI.click(findTestObject('Object Repository/FooterObjects/a_footer__eonline-logo'))

WebUI.delay(5)

WebUI.closeBrowser()

