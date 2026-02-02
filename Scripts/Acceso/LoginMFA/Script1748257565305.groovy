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

WebUI.navigateToUrl('https://sap-pre.abertis.com/sap/bc/ui5_ui5/ui2/ushell/shells/abap/Fiorilaunchpad.html')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_loginfmt'), User)

WebUI.click(findTestObject('Object Repository/Page_Login/inputidSIButton9'))

WebUI.click(findTestObject('Object Repository/Page_Login/inputidSIButton9'))

WebUI.setMaskedText(findTestObject('Object Repository/Page_Login/input_passwd'), Pass)

WebUI.click(findTestObject('Object Repository/Page_Login/inputidSIButton9'))

WebUI.delay(30)

WebUI.click(findTestObject('Object Repository/Page_Login/inputidSIButton9'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Login/input_sap-user'), 20, FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Login/input_sap-user'), 20, FailureHandling.STOP_ON_FAILURE)

