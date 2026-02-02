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

WebUI.setText(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_Logon/input_User_sap-user'), 
    'MA_RSANCHRO')

WebUI.setEncryptedText(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_Logon/input_Password_sap-password'), 
    'y4zqKAfkKk/UZUdVygs67w==')

WebUI.selectOptionByValue(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_Logon/select_CA - CatalDE - DeutschEN - EnglishES_e3f430'), 
    'ES', true)

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_Logon/button_Log On'))

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_Pgina de inicio/span_'))

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_Pgina de inicio/span__1'))

WebUI.setText(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_Pgina de inicio/input_Todo_search'), 
    'opt/vim_wp')

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_Pgina de inicio/span_rea de trabajo de VIM - OPTVIM_WP'))

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_SAP GUI for HTML/button_'))

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Vista personal/div_Cambiar vista de trabajo'))

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Vista personal/circle_V_M1461130-buttonin'))

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Vista personal/div_Continuar'))

WebUI.setText(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/input_S_InputField'), 
    '1116')

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/div_Aplicar'))

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/svg_Suplencia para_gridC1861,3icp'))

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_Proceso Gestin de facturas sin pedido _193606/span_Posiciones de documento'))

WebUI.setText(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_Proceso Gestin de facturas sin pedido _193606/input_Para seleccionar una lnea, pulse la b_07f5b0'), 
    '62904030')

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_Proceso Gestin de facturas sin pedido _193606/span_62904030'))

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_Proceso Gestin de facturas sin pedido _193606/span_Debe_InputField'))

WebUI.setText(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_Proceso Gestin de facturas sin pedido _193606/input_Debe_InputField'), 
    '108.30')

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_Proceso Gestin de facturas sin pedido _193606/span_CG45_InputField'))

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_Proceso Gestin de facturas sin pedido _193606/span_16099'))

WebUI.setText(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_Proceso Gestin de facturas sin pedido _193606/input_Debe_InputField_1'), 
    '16053')

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_Proceso Gestin de facturas sin pedido _193606/span_CG45_urSCBBtn urBorderBox lsScrollbar-_e3ed92'))

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_Proceso Gestin de facturas sin pedido _193606/div_Codific. terminadaSaldoColumna de selec_d6fed2'))

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_Proceso Gestin de facturas sin pedido _193606/div_'))

WebUI.setText(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_Proceso Gestin de facturas sin pedido _193606/input_Debe_InputField'), 
    '108,30')

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_Proceso Gestin de facturas sin pedido _193606/div_'))

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_Proceso Gestin de facturas sin pedido _193606/div_Cerrar'))

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_Proceso Gestin de facturas sin pedido _193606/span_Contabilidad'))

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_Proceso Gestin de facturas sin pedido _193606/span_Datos bsicos'))

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_Proceso Gestin de facturas sin pedido _193606/div_GrabarResaltado'))

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_Proceso Gestin de facturas sin pedido _193606/div_Aplicar reglas'))

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_Proceso Gestin de facturas sin pedido _193606/span_Clase de proceso cambiada a Comprobar _6f894e'))

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_Proceso Gestin de facturas sin pedido _193606/div_Simular reglas'))

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_Proceso Gestin de facturas sin pedido _193606/div__1'))

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_Proceso Gestin de facturas sin pedido _193606/div_S'))

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_Proceso Gestin de facturas sin pedido _193606/div_BypassActivacin de comentarios para la _fc2637'))

WebUI.setText(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_Proceso Gestin de facturas sin pedido _193606/textarea_BypassActivacin de comentarios par_6f21de'), 
    'es ok')

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_Proceso Gestin de facturas sin pedido _193606/div_Grabar'))

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_Proceso Gestin de facturas sin pedido _193606/div_Finalizar'))

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_Proceso Gestin de facturas sin pedido _193606/div_GrabarResaltado'))

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_Proceso Gestin de facturas sin pedido _193606/span_Cambios guardados correctamente'))

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_Proceso Gestin de facturas sin pedido _193606/div_Aplicar reglas'))

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/span_'))

WebUI.setText(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/input_Todo_search'), 
    '/opt/vim_va2')

WebUI.sendKeys(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/input_Todo_search'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_Bsqueda de optvim_va2/span_Visualizar otras aplicaciones'))

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_Bsqueda de optvim_va2 en Aplicaciones/span_Funciones analticas de VIM'))

WebUI.setText(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_VIM Analytics/input_F_InputField'), 
    '20.06.2025')

WebUI.setText(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_VIM Analytics/input_P_InputField'), 
    '163622')

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_VIM Analytics/span_163622'))

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_VIM Analytics/div_EjecutarResaltado'))

WebUI.click(findTestObject('Object Repository/VIM Creacion factura sin pedido sin diferencias/Page_VIM Analytics/span_449488'))

