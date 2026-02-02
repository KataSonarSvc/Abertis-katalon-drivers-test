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

CustomKeywords.'com.url_utilidades.urlutilidades.openApplicationUrl'('https://saps4-pre.abertis.com/sap/bc/ui2/flp?saml2=disabled&sap-client=100#BusinessPartner-create')

WebUI.click(findTestObject('Object Repository/BP Crear Cliente new/Page_Tratar interlocutor comercial/div_Organizacin'))

WebUI.click(findTestObject('Object Repository/BP Crear Cliente new/Page_Crear Organizacin/span_C_M0461121021-btn'))

WebUI.click(findTestObject('Object Repository/BP Crear Cliente new/Page_Crear Organizacin/div_Cliente Datos Sociedad'))

WebUI.click(findTestObject('Object Repository/BP Crear Cliente new/Page_Crear Organizacin/div_Crear'))

WebUI.click(findTestObject('Object Repository/BP Crear Cliente new/Page_Crear Organizacin Rol Cliente Datos Sociedad/span_A_M046111063-btn'))

WebUI.click(findTestObject('Object Repository/BP Crear Cliente new/Page_Crear Organizacin Rol Cliente Datos Sociedad/div_Clientes Generales'))

WebUI.setText(findTestObject('Object Repository/BP Crear Cliente new/Page_Crear Organizacin Rol Cliente Datos Sociedad/input_N_InputField'), 
    nombre)

WebUI.setText(findTestObject('Object Repository/BP Crear Cliente new/Page_Crear Organizacin Rol Cliente Datos Sociedad/input_C_InputField'), 
    conc_busq)

WebUI.click(findTestObject('Object Repository/BP Crear Cliente new/Page_Crear Organizacin Rol Cliente Datos Sociedad/span_I_M046112212B256113111122-btn'))

WebUI.click(findTestObject('Object Repository/BP Crear Cliente new/Page_Crear Organizacin Rol Cliente Datos Sociedad/div_Espaol'))

WebUI.setText(findTestObject('Object Repository/BP Crear Cliente new/Page_Crear Organizacin Rol Cliente Datos Sociedad/input_P_InputField'), 
    pais_region)

WebUI.setText(findTestObject('Object Repository/BP Crear Cliente new/Page_Crear Organizacin Rol Cliente Datos Sociedad/input_C_InputField_1'), 
    calle)

WebUI.setText(findTestObject('Object Repository/BP Crear Cliente new/Page_Crear Organizacin Rol Cliente Datos Sociedad/input_C_InputField_1_2'), 
    num)

WebUI.setText(findTestObject('Object Repository/BP Crear Cliente new/Page_Crear Organizacin Rol Cliente Datos Sociedad/input_C_InputField_1_2_3'), 
    poblacion)

WebUI.setText(findTestObject('Object Repository/BP Crear Cliente new/Page_Crear Organizacin Rol Cliente Datos Sociedad/input_C_InputField_1_2_3_4'), 
    cod_postal)

WebUI.setText(findTestObject('Object Repository/BP Crear Cliente new/Page_Crear Organizacin Rol Cliente Datos Sociedad/input_R_InputField'), 
    region)

WebUI.setText(findTestObject('Object Repository/BP Crear Cliente new/Page_Crear Organizacin Rol Cliente Datos Sociedad/input_C_InputField_1_2_3'), 
    cod_postal)

WebUI.setText(findTestObject('Object Repository/BP Crear Cliente new/Page_Crear Organizacin Rol Cliente Datos Sociedad/input_C_InputField_1_2_3_4'), 
    poblacion)

WebUI.click(findTestObject('Object Repository/BP Crear Cliente new/Page_Crear Organizacin Rol Cliente Datos Sociedad/span_Resumen direccin'))

WebUI.click(findTestObject('Object Repository/BP Crear Cliente new/Page_Crear Organizacin Rol Cliente Datos Sociedad/span_Identificador'))

WebUI.scrollToElement(findTestObject('Object Repository/BP Crear Cliente new/Page_Crear Organizacin Rol Cliente Datos Sociedad/span_Para seleccionar una lnea, pulse la ba_b2680d'), 
    0)

WebUI.click(findTestObject('Object Repository/BP Crear Cliente new/Page_Crear Organizacin Rol Cliente Datos Sociedad/span_Para seleccionar una lnea, pulse la ba_b2680d'))

WebUI.setText(findTestObject('BP Crear Cliente new/Page_Crear Organizacin Rol Cliente Datos Sociedad/input_Para seleccionar una lnea, pulse la b_07f5b0'), 
    tipo)

WebUI.click(findTestObject('Object Repository/BP Crear Cliente new/Page_Crear Organizacin Rol Cliente Datos Sociedad/span_Chile RUT_InputField'))

WebUI.setText(findTestObject('Object Repository/BP Crear Cliente new/Page_Crear Organizacin Rol Cliente Datos Sociedad/input_Chile RUT_InputField'), 
    nif_largo)

WebUI.click(findTestObject('Object Repository/BP Crear Cliente new/Page_Crear Organizacin Rol Cliente Datos Sociedad/span_Control'))

WebUI.click(findTestObject('Object Repository/BP Crear Cliente new/Page_Crear Organizacin Rol Cliente Datos Sociedad/span_Pagos'))

WebUI.click(findTestObject('Object Repository/BP Crear Cliente new/Page_Crear Organizacin Rol Cliente Datos Sociedad/span_Estado'))

WebUI.click(findTestObject('Object Repository/BP Crear Cliente new/Page_Crear Organizacin Rol Cliente Datos Sociedad/span_Datos jurdicos'))

WebUI.click(findTestObject('Object Repository/BP Crear Cliente new/Page_Crear Organizacin Rol Cliente Datos Sociedad/span_Deudor Datos generales'))

WebUI.click(findTestObject('Object Repository/BP Crear Cliente new/Page_Crear Organizacin Rol Cliente Datos Sociedad/div_GrabarResaltado'))

WebUI.verifyElementVisible(findTestObject('Object Repository/BP Crear Cliente new/Page_Visualizar Organizacin 500011934, rol _e50ca7/span_El interlocutor comercial 500011934 se_882754'))

WebUI.takeFullPageScreenshot()

