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

WebUI.click(findTestObject('Object Repository/BP Crear Proveedor New ID/Page_Tratar interlocutor comercial/div_Organizacin'))

WebUI.click(findTestObject('Object Repository/BP Crear Proveedor New ID/Page_Crear Organizacin/span_C_M0461121021-btn'))

WebUI.click(findTestObject('Object Repository/BP Crear Proveedor New ID/Page_Crear Organizacin/div_ProveedorDatos Sociedad'))

WebUI.click(findTestObject('Object Repository/BP Crear Proveedor New ID/Page_Crear Organizacin/div_Crear'))

WebUI.click(findTestObject('Object Repository/BP Crear Proveedor New ID/Page_Crear Organizacin Rol ProveedorDatos Sociedad/span_A_M046111063-btn'))

WebUI.click(findTestObject('Object Repository/BP Crear Proveedor New ID/Page_Crear Organizacin Rol ProveedorDatos Sociedad/div_Proveedores Generales'))

WebUI.click(findTestObject('Object Repository/BP Crear Proveedor New ID/Page_Crear Organizacin Rol ProveedorDatos Sociedad/span_T_M046112212B25611021-btn'))

WebUI.click(findTestObject('Object Repository/BP Crear Proveedor New ID/Page_Crear Organizacin Rol ProveedorDatos Sociedad/div_Empresa'))

WebUI.setText(findTestObject('Object Repository/BP Crear Proveedor New ID/Page_Crear Organizacin Rol ProveedorDatos Sociedad/input_N_InputField'), 
    nombre)

WebUI.setText(findTestObject('Object Repository/BP Crear Proveedor New ID/Page_Crear Organizacin Rol ProveedorDatos Sociedad/input_C_InputField'), 
    conc_busq)

WebUI.click(findTestObject('Object Repository/BP Crear Proveedor New ID/Page_Crear Organizacin Rol ProveedorDatos Sociedad/span_I_M046112212B256113111122-btn'))

WebUI.click(findTestObject('Object Repository/BP Crear Proveedor New ID/Page_Crear Organizacin Rol ProveedorDatos Sociedad/div_Espaol'))

WebUI.setText(findTestObject('Object Repository/BP Crear Proveedor New ID/Page_Crear Organizacin Rol ProveedorDatos Sociedad/input_P_InputField'), 
    pais)

WebUI.click(findTestObject('Object Repository/BP Crear Proveedor New ID/Page_Crear Organizacin Rol ProveedorDatos Sociedad/div_AR'))

not_run: WebUI.click(findTestObject('Object Repository/BP Crear Proveedor New ID/Page_Crear Organizacin Rol ProveedorDatos Sociedad/input_R_InputField'))

WebUI.setText(findTestObject('Object Repository/BP Crear Cliente new/Page_Crear Organizacin Rol Cliente Datos Sociedad/input_R_InputField'), 
    region)

not_run: WebUI.click(findTestObject('Object Repository/BP Crear Proveedor New ID/Page_Crear Organizacin Rol ProveedorDatos Sociedad/span_N_ls-inputfieldhelpbutton'))

not_run: WebUI.click(findTestObject('Object Repository/BP Crear Proveedor New ID/Page_Crear Organizacin Rol ProveedorDatos Sociedad/div_OKResaltado'))

WebUI.setText(findTestObject('Object Repository/BP Crear Proveedor New ID/Page_Crear Organizacin Rol ProveedorDatos Sociedad/input_C_InputField_1'), 
    calle)

WebUI.setText(findTestObject('Object Repository/BP Crear Proveedor New ID/Page_Crear Organizacin Rol ProveedorDatos Sociedad/input_C_InputField_1_2'), 
    num)

WebUI.setText(findTestObject('Object Repository/BP Crear Proveedor New ID/Page_Crear Organizacin Rol ProveedorDatos Sociedad/input_C_InputField_1_2_3'), 
    cod_postal)

WebUI.setText(findTestObject('Object Repository/BP Crear Proveedor New ID/Page_Crear Organizacin Rol ProveedorDatos Sociedad/input_C_InputField_1_2_3_4'), 
    poblacion)

WebUI.click(findTestObject('Object Repository/BP Crear Proveedor New ID/Page_Crear Organizacin Rol ProveedorDatos Sociedad/span_Identificador'))

WebUI.click(findTestObject('Object Repository/BP Crear Proveedor New ID/Page_Crear Organizacin Rol ProveedorDatos Sociedad/span_Para seleccionar una lnea, pulse la ba_b2680d'))

WebUI.setText(findTestObject('Object Repository/BP Crear Proveedor New ID/Page_Crear Organizacin Rol ProveedorDatos Sociedad/input_Para seleccionar una lnea, pulse la b_07f5b0'), 
    tipo)

WebUI.sendKeys(findTestObject('Object Repository/BP Crear Proveedor New ID/Page_Crear Organizacin Rol ProveedorDatos Sociedad/input_Para seleccionar una lnea, pulse la b_07f5b0'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/BP Crear Proveedor New ID/Page_Crear Organizacin Rol ProveedorDatos Sociedad/span_Argentina CUIT_InputField'))

WebUI.setText(findTestObject('Object Repository/BP Crear Proveedor New ID/Page_Crear Organizacin Rol ProveedorDatos Sociedad/input_Argentina CUIT_InputField'), 
    nif_largo)

WebUI.click(findTestObject('Object Repository/BP Crear Proveedor New ID/Page_Crear Organizacin Rol ProveedorDatos Sociedad/span_Control'))

WebUI.click(findTestObject('Object Repository/BP Crear Proveedor New ID/Page_Crear Organizacin Rol ProveedorDatos Sociedad/span_Pagos'))

WebUI.click(findTestObject('Object Repository/BP Crear Proveedor New ID/Page_Crear Organizacin Rol ProveedorDatos Sociedad/span_Estado'))

WebUI.click(findTestObject('Object Repository/BP Crear Proveedor New ID/Page_Crear Organizacin Rol ProveedorDatos Sociedad/span_Datos jurdicos'))

WebUI.click(findTestObject('Object Repository/BP Crear Proveedor New ID/Page_Crear Organizacin Rol ProveedorDatos Sociedad/span_Acreedor Datos generales'))

WebUI.click(findTestObject('Object Repository/BP Crear Proveedor New ID/Page_Crear Organizacin Rol ProveedorDatos Sociedad/span_Proveedor Textos_M04611221-next'))

WebUI.click(findTestObject('Object Repository/BP Crear Proveedor New ID/Page_Crear Organizacin Rol ProveedorDatos Sociedad/span_Acreedor Datos de control'))

WebUI.setText(findTestObject('Object Repository/BP Crear Proveedor New ID/Page_Crear Organizacin Rol ProveedorDatos Sociedad/input_C_InputField_1_2_3_4_5'), 
    clase_impuesto)

WebUI.setText(findTestObject('Object Repository/BP Crear Proveedor New ID/Page_Crear Organizacin Rol ProveedorDatos Sociedad/input_T_InputField'), 
    tipo_nif)

WebUI.click(findTestObject('Object Repository/BP Crear Proveedor New ID/Page_Crear Organizacin Rol ProveedorDatos Sociedad/div_GrabarResaltado'))

WebUI.click(findTestObject('Object Repository/BP Crear Proveedor New ID/Page_Crear Organizacin Rol ProveedorDatos Sociedad/span_Ya existe el NIF AR1A 30687307123'))

WebUI.takeFullPageScreenshot()

