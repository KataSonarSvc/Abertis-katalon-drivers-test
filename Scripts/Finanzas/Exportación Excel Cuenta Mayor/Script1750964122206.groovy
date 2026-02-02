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

CustomKeywords.'com.url_utilidades.urlutilidades.openApplicationUrl'('https://saps4-pre.abertis.com/sap/bc/ui2/flp?saml2=disabled&sap-client=100#GLAccount-displayGLAccountLineItemGLView')

WebUI.setText(findTestObject('Object Repository/Exportación Excel C Mayor/Page_Cuentas de mayor, lista de partidas in_2c585a/input_C_InputField'), 
    '51221102')

WebUI.setText(findTestObject('Object Repository/Exportación Excel C Mayor/Page_Cuentas de mayor, lista de partidas in_2c585a/input_S_InputField'), 
    '1042')

WebUI.click(findTestObject('Object Repository/Exportación Excel C Mayor/Page_Cuentas de mayor, lista de partidas in_2c585a/div_EjecutarResaltado'))

WebUI.click(findTestObject('Exportación Excel C Mayor/Page_Cuentas de mayor, lista de partidas in_2c585a/div_Menu'))

WebUI.click(findTestObject('Object Repository/Exportación Excel C Mayor/Page_Cuentas de mayor, lista de partidas in_2c585a/span_Lista'))

WebUI.click(findTestObject('Object Repository/Exportación Excel C Mayor/Page_Cuentas de mayor, lista de partidas in_2c585a/span_Exportar'))

WebUI.click(findTestObject('Object Repository/Exportación Excel C Mayor/Page_Cuentas de mayor, lista de partidas in_2c585a/span_Hoja de clculo'))

WebUI.click(findTestObject('Object Repository/Exportación Excel C Mayor/Page_Cuentas de mayor, lista de partidas in_2c585a/input_N_InputField'))

WebUI.setText(findTestObject('Object Repository/Exportación Excel C Mayor/Page_Cuentas de mayor, lista de partidas in_2c585a/input_N_InputField'), 
    'TestCMayor_20250626_205209')

WebUI.click(findTestObject('Object Repository/Exportación Excel C Mayor/Page_Cuentas de mayor, lista de partidas in_2c585a/div_Exportar a'))

WebUI.click(findTestObject('Object Repository/Exportación Excel C Mayor/Page_Cuentas de mayor, lista de partidas in_2c585a/div_OK'))

WebUI.closeBrowser()

