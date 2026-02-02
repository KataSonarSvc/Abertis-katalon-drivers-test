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

WebUI.callTestCase(findTestCase('Acceso/Login'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.url_utilidades.urlutilidades.openApplicationUrl'('https://saps4-pre.abertis.com/sap/bc/ui2/flp?saml2=disabled&sap-client=100#AccountingDocument-displayDocument')

WebUI.setText(findTestObject('Object Repository/Visualizar Documento FB03/Page_Visualizar documento Acceso/input_N_InputField'), 
    '5500000004')

WebUI.click(findTestObject('Object Repository/Visualizar Documento FB03/Page_Visualizar documento Acceso/input_S_InputField'))

WebUI.click(findTestObject('Object Repository/Visualizar Documento FB03/Page_Visualizar documento Acceso/span_Sociedad'))

WebUI.setText(findTestObject('Object Repository/Visualizar Documento FB03/Page_Visualizar documento Acceso/input_S_InputField'), 
    '1375')

WebUI.click(findTestObject('Object Repository/Visualizar Documento FB03/Page_Visualizar documento Acceso/span_1375'))

WebUI.setText(findTestObject('Object Repository/Visualizar Documento FB03/Page_Visualizar documento Acceso/input_E_InputField'), 
    '2025')

WebUI.click(findTestObject('Object Repository/Visualizar Documento FB03/Page_Visualizar documento Acceso/div_ContinuarResaltado'))

