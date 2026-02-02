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

CustomKeywords.'com.url_utilidades.urlutilidades.openApplicationUrl'('https://saps4-pre.abertis.com/sap/bc/ui2/flp?saml2=disabled&sap-client=100#Shell-startGUI?sap-ui2-tcode=FS00&sap-system=FIORI_MENU')

def uniqueNumber = new Date().format('HHmmss') // e.g., 11070521

String cuentaMayor = '50'+ uniqueNumber.toString()

WebUI.setText(findTestObject('Object Repository/Creacion cuenta mayor/Page_Cta.mayor tratar Central/input_C_InputField'), cuentaMayor)

WebUI.click(findTestObject('Object Repository/Creacion cuenta mayor/Page_Cta.mayor tratar Central/div_Cta.mayorSociedadSANEFcon modelo'))

WebUI.setText(findTestObject('Object Repository/Creacion cuenta mayor/Page_Cta.mayor tratar Central/input_S_InputField'), 
    '1042')

WebUI.click(findTestObject('Object Repository/Creacion cuenta mayor/Page_Cta.mayor tratar Central/div_Cta.mayorSociedadSANEFcon modelo'))

WebUI.click(findTestObject('Object Repository/Creacion cuenta mayor/Page_Cta.mayor tratar Central/div_'))

WebUI.click(findTestObject('Object Repository/Creacion cuenta mayor/Page_Cta.mayor Crear Central/span_C_M046212B2562130-btn'))

WebUI.click(findTestObject('Object Repository/Creacion cuenta mayor/Page_Cta.mayor Crear Central/div_Cuenta de balance'))

WebUI.click(findTestObject('Object Repository/Creacion cuenta mayor/Page_Cta.mayor Crear Central/span_G_M046212B2562230-btn'))

WebUI.click(findTestObject('Object Repository/Creacion cuenta mayor/Page_Cta.mayor Crear Central/div_G005'))

WebUI.setText(findTestObject('Object Repository/Creacion cuenta mayor/Page_Cta.mayor Crear Central/input_T_InputField'), 
    'test katalon')

WebUI.setText(findTestObject('Object Repository/Creacion cuenta mayor/Page_Cta.mayor Crear Central/input_T_InputField_1'), 
    'test katalon')

WebUI.setText(findTestObject('Object Repository/Creacion cuenta mayor/Page_Cta.mayor Crear Central/input_N_InputField'), 
    '579')

WebUI.click(findTestObject('Object Repository/Creacion cuenta mayor/Page_Cta.mayor Crear Central/div_57900002'))

WebUI.click(findTestObject('Object Repository/Creacion cuenta mayor/Page_Cta.mayor Crear Central/span_Datos de control'))

WebUI.click(findTestObject('Object Repository/Creacion cuenta mayor/Page_Cta.mayor Crear Central/input_C_InputField'))

WebUI.click(findTestObject('Object Repository/Creacion cuenta mayor/Page_Cta.mayor Crear Central/span_C_ls-inputfieldhelpbutton'))

WebUI.click(findTestObject('Object Repository/Creacion cuenta mayor/Page_Cta.mayor Crear Central/div_OKResaltado'))

WebUI.click(findTestObject('Object Repository/Creacion cuenta mayor/Page_Cta.mayor Crear Central/span_EntradaBancoInter'))

WebUI.click(findTestObject('Object Repository/Creacion cuenta mayor/Page_Cta.mayor Crear Central/span_C_ls-inputfieldhelpbutton'))

WebUI.click(findTestObject('Object Repository/Creacion cuenta mayor/Page_Cta.mayor Crear Central/div_'))

WebUI.click(findTestObject('Object Repository/Creacion cuenta mayor/Page_Cta.mayor Crear Central/div_OKResaltado'))

WebUI.click(findTestObject('Object Repository/Creacion cuenta mayor/Page_Cta.mayor Crear Central/span_Palabra clv.Traduc'))

WebUI.click(findTestObject('Object Repository/Creacion cuenta mayor/Page_Cta.mayor Crear Central/span_Para seleccionar una lnea, pulse la ba_bd3e8c'))

WebUI.click(findTestObject('Object Repository/Creacion cuenta mayor/Page_Cta.mayor Crear Central/div_Francs'))

WebUI.click(findTestObject('Object Repository/Creacion cuenta mayor/Page_Cta.mayor Crear Central/span_Para seleccionar una lnea, pulse la ba_b2680d'))

WebUI.setText(findTestObject('Object Repository/Creacion cuenta mayor/Page_Cta.mayor Crear Central/input_Para seleccionar una lnea, pulse la b_07f5b0'), 
    'test')

WebUI.click(findTestObject('Object Repository/Creacion cuenta mayor/Page_Cta.mayor Crear Central/span_Informacin (PCtas.)'))

WebUI.click(findTestObject('Object Repository/Creacion cuenta mayor/Page_Cta.mayor Crear Central/span_Informacin (soc.)'))

WebUI.click(findTestObject('Object Repository/Creacion cuenta mayor/Page_Cta.mayor Crear Central/div_GrabarResaltado'))

WebUI.click(findTestObject('Object Repository/Creacion cuenta mayor/Page_Cta.mayor Crear Central/div__1'))

WebUI.click(findTestObject('Object Repository/Creacion cuenta mayor/Page_Cta.mayor Visualizar Central/div_Cont.Resaltado'))

WebUI.closeBrowser()

