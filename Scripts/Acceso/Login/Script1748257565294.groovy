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

WebUI.navigateToUrl('https://saps4-pre.abertis.com/sap/bc/ui2/flp?saml2=disabled&sap-client=100&sap-language=EN#Shell-home')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Login/input_sap-user'))

WebUI.setText(findTestObject('Object Repository/Page_Login/input_sap-user'), GlobalVariable.User)

WebUI.setText(findTestObject('Object Repository/Page_Login/input_sap-password'), GlobalVariable.Pass)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login/select_CA - CatalDE - DeutschEN - EnglishES_e3f430'), 
    GlobalVariable.Lenguaje, true)

WebUI.click(findTestObject('Object Repository/Page_Login/button_Log On'))

