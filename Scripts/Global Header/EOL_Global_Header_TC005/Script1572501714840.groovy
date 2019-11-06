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

WebUI.click(findTestObject('Page_Entertainmen/a_No Thanks'))

WebUI.mouseOver(findTestObject('GlobalHeader_OR/LatestNews_OR'))

WebUI.delay(5)

WebUI.mouseOver(findTestObject('GlobalHeader_OR/WatchFullEpisodes_OR'))

WebUI.delay(5)

WebUI.mouseOver(findTestObject('GlobalHeader_OR/Royals_OR'))

WebUI.delay(5)

WebUI.mouseOver(findTestObject('GlobalHeader_OR/Kardashians_OR'))

WebUI.delay(5)

WebUI.mouseOver(findTestObject('GlobalHeader_OR/photos_or'))

WebUI.delay(5)

WebUI.mouseOver(findTestObject('GlobalHeader_OR/TV_OR'))

WebUI.delay(5)

WebUI.mouseOver(findTestObject('GlobalHeader_OR/Hallowen_OR'))

WebUI.delay(5)

WebUI.mouseOver(findTestObject('GlobalHeader_OR/PCA_OR'))

WebUI.delay(5)

WebUI.closeBrowser()

