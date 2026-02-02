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

CustomKeywords.'com.url_utilidades.urlutilidades.openApplicationUrl'('https://saps4-pre.abertis.com/sap/bc/ui2/flp?saml2=disabled&sap-client=100#PurchaseContract-create')

WebUI.setText(findTestObject('Object Repository/Contratos Chile/Page_Crear Pedido abierto  Acceso/input_P_InputField'), 
    '177806')

WebUI.sendKeys(findTestObject('Contratos Chile/Page_Crear Pedido abierto  Acceso/input_P_InputField'), Keys.chord(Keys.ESCAPE))

WebUI.click(findTestObject('Object Repository/Contratos Chile/Page_Crear Pedido abierto  Acceso/div_ProveedorClase de contratoFecha de cont_b1b546'))

WebUI.setText(findTestObject('Object Repository/Contratos Chile/Page_Crear Pedido abierto  Acceso/input_C_InputField'), 
    'acof')

WebUI.click(findTestObject('Object Repository/Contratos Chile/Page_Crear Pedido abierto  Acceso/div_ProveedorClase de contratoFecha de cont_b1b546'))

WebUI.setText(findTestObject('Object Repository/Contratos Chile/Page_Crear Pedido abierto  Acceso/input_O_InputField'), 
    '1077')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Contratos Chile/Page_Crear Pedido abierto  Acceso/input_O_InputField'), Keys.chord(Keys.ESCAPE))

WebUI.click(findTestObject('Object Repository/Contratos Chile/Page_Crear Pedido abierto  Acceso/div_Organizacin comprasGrupo de compras'))

WebUI.setText(findTestObject('Object Repository/Contratos Chile/Page_Crear Pedido abierto  Acceso/input_G_InputField'), 
    'x06')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Contratos Chile/Page_Crear Pedido abierto  Acceso/input_G_InputField'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Contratos Chile/Page_Crear Pedido abierto  Acceso/input_S_InputField'), 
    '1077')

WebUI.sendKeys(findTestObject('Object Repository/Contratos Chile/Page_Crear Pedido abierto  Acceso/input_S_InputField'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Contratos Chile/Page_Crear Pedido abierto  Datos cabecera/input_F_InputField'), 
    '20.04.2026')

WebUI.setText(findTestObject('Object Repository/Contratos Chile/Page_Crear Pedido abierto  Datos cabecera/input_V_InputField'), 
    '1000')

WebUI.sendKeys(findTestObject('Object Repository/Contratos Chile/Page_Crear Pedido abierto  Datos cabecera/input_V_InputField'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Contratos Chile/Page_Crear Pedido abierto  Resumen de posiciones/span_Para seleccionar una lnea, pulse la ba_b15f70'))

WebUI.setText(findTestObject('Object Repository/Contratos Chile/Page_Crear Pedido abierto  Resumen de posiciones/input_Para seleccionar una lnea, pulse la b_07f5b0'), 
    'u')

WebUI.click(findTestObject('Object Repository/Contratos Chile/Page_Crear Pedido abierto  Resumen de posiciones/span_Para seleccionar una lnea, pulse la ba_b2680d'))

WebUI.setText(findTestObject('Object Repository/Contratos Chile/Page_Crear Pedido abierto  Resumen de posiciones/input_Para seleccionar una lnea, pulse la b_07f5b0_1'), 
    '50233')

WebUI.sendKeys(findTestObject('Object Repository/Contratos Chile/Page_Crear Pedido abierto  Resumen de posiciones/input_Para seleccionar una lnea, pulse la b_07f5b0_1'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Contratos Chile/Page_Crear Pedido abierto  Resumen de posiciones/input_UN_InputField'), 
    '1000')

WebUI.click(findTestObject('Object Repository/Contratos Chile/Page_Crear Pedido abierto  Resumen de posiciones/div_'))

WebUI.setText(findTestObject('Object Repository/Contratos Chile/Page_Crear Pedido abierto  Datos cabecera/input_N_InputField'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Contratos Chile/Page_Crear Pedido abierto  Datos cabecera/input_D_InputField'), 
    'test')

WebUI.click(findTestObject('Object Repository/Contratos Chile/Page_Crear Pedido abierto  Datos cabecera/input_T_M046512B256338'))

WebUI.click(findTestObject('Object Repository/Contratos Chile/Page_Crear Pedido abierto  Datos cabecera/div_Subasta electrnica'))

WebUI.click(findTestObject('Object Repository/Contratos Chile/Page_Crear Pedido abierto  Datos cabecera/div_Men'))

WebUI.click(findTestObject('Contratos Autopistas/Page_Crear Pedido abierto  Datos cabecera/td_Cabecera'))

WebUI.click(findTestObject('Object Repository/Contratos Chile/Page_Crear Pedido abierto  Datos cabecera/td_Textos'))

WebUI.click(findTestObject('Object Repository/Contratos Chile/Page_Crear Pedido abierto  Datos cabecera/span_Resumen de textos'))

WebUI.rightClick(findTestObject('Object Repository/Contratos Chile/Page_Crear Pedido abierto  Textos cabecera/div_Cl.txt.Txt.Ms txt.EstadoComentarios al _41f9c6'))

WebUI.click(findTestObject('Object Repository/Contratos Chile/Page_Crear Pedido abierto  Textos cabecera/span_Pgina siguiente'))

WebUI.setText(findTestObject('Object Repository/Contratos Chile/Page_Crear Pedido abierto  Textos cabecera/input_O_InputField'), 
    'test')

WebUI.rightClick(findTestObject('Object Repository/Contratos Chile/Page_Crear Pedido abierto  Textos cabecera/div_Cl.txt.Txt.Ms txt.EstadoObjeto de Compr_a1f6c0'))

WebUI.click(findTestObject('Object Repository/Contratos Chile/Page_Crear Pedido abierto  Textos cabecera/span_Pgina siguiente'))

WebUI.setText(findTestObject('Object Repository/Contratos Chile/Page_Crear Pedido abierto  Textos cabecera/input_O_InputField'), 
    'test')

WebUI.rightClick(findTestObject('Object Repository/Contratos Chile/Page_Crear Pedido abierto  Textos cabecera/div_Cl.txt.Txt.Ms txt.EstadoProveedores Invitados'))

WebUI.click(findTestObject('Object Repository/Contratos Chile/Page_Crear Pedido abierto  Textos cabecera/span_Pgina siguiente'))

WebUI.setText(findTestObject('Object Repository/Contratos Chile/Page_Crear Pedido abierto  Textos cabecera/input_O_InputField'), 
    'test')

WebUI.click(findTestObject('Object Repository/Contratos Chile/Page_Crear Pedido abierto  Textos cabecera/div_GrabarResaltado'))

WebUI.click(findTestObject('Object Repository/Contratos Chile/Page_Crear Pedido abierto  Textos cabecera/div_S'))

WebUI.click(findTestObject('Object Repository/Contratos Chile/Page_Crear Pedido abierto  Acceso/span_Contrato Marco creado bajo el nmero 61_20c3a7'))

WebUI.takeFullPageScreenshot()

