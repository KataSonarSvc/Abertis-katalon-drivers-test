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

CustomKeywords.'com.url_utilidades.urlutilidades.openApplicationUrl'('https://saps4-pre.abertis.com/sap/bc/ui2/flp?saml2=disabled&sap-client=100#zgui_opt_vim_wp-display')

WebUI.click(findTestObject('Object Repository/VIM creacion de facturas sin pedido con wf autorizacion/Page_rea de trabajo de VIM Invoice  Vista personal/div_Cambiar vista de trabajo'))

WebUI.click(findTestObject('Object Repository/VIM creacion de facturas sin pedido con wf autorizacion/Page_rea de trabajo de VIM Invoice  Vista personal/circle_V_M1461130-buttonin'))

WebUI.click(findTestObject('Object Repository/VIM creacion de facturas sin pedido con wf autorizacion/Page_rea de trabajo de VIM Invoice  Vista personal/div_Continuar'))

WebUI.setText(findTestObject('Object Repository/VIM creacion de facturas sin pedido con wf autorizacion/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/input_P_InputField'), 
    '610851')

WebUI.click(findTestObject('Object Repository/VIM creacion de facturas sin pedido con wf autorizacion/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/span_610851'))

WebUI.click(findTestObject('Object Repository/VIM creacion de facturas sin pedido con wf autorizacion/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/div_Aplicar'))

WebUI.click(findTestObject('Object Repository/VIM creacion de facturas sin pedido con wf autorizacion/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/svg_Suplencia para_gridC1623,3icp'))

WebUI.click(findTestObject('Object Repository/VIM creacion de facturas sin pedido con wf autorizacion/Page_Proceso Gestin de facturas sin pedido _4a26f4/span_Posiciones de documento'))

WebUI.click(findTestObject('Object Repository/VIM creacion de facturas sin pedido con wf autorizacion/Page_Proceso Gestin de facturas sin pedido _4a26f4/span_Contabilidad'))

WebUI.click(findTestObject('Object Repository/VIM creacion de facturas sin pedido con wf autorizacion/Page_Proceso Gestin de facturas sin pedido _4a26f4/span_Impuesto'))

WebUI.click(findTestObject('Object Repository/VIM creacion de facturas sin pedido con wf autorizacion/Page_Proceso Gestin de facturas sin pedido _4a26f4/span_Proceso'))

WebUI.click(findTestObject('Object Repository/VIM creacion de facturas sin pedido con wf autorizacion/Page_Proceso Gestin de facturas sin pedido _4a26f4/span_Otros datos'))

WebUI.click(findTestObject('Object Repository/VIM creacion de facturas sin pedido con wf autorizacion/Page_Proceso Gestin de facturas sin pedido _4a26f4/span_Datos bsicos'))

WebUI.click(findTestObject('Object Repository/VIM creacion de facturas sin pedido con wf autorizacion/Page_Proceso Gestin de facturas sin pedido _4a26f4/div_Simular reglas'))

WebUI.click(findTestObject('Object Repository/VIM creacion de facturas sin pedido con wf autorizacion/Page_Proceso Gestin de facturas sin pedido _4a26f4/div_'))

WebUI.click(findTestObject('Object Repository/VIM creacion de facturas sin pedido con wf autorizacion/Page_Proceso Gestin de facturas sin pedido _4a26f4/div_S'))

WebUI.setText(findTestObject('Object Repository/VIM creacion de facturas sin pedido con wf autorizacion/Page_Proceso Gestin de facturas sin pedido _4a26f4/textarea_BypassActivacin de comentarios par_be88e4'), 
    'ok')

WebUI.click(findTestObject('Object Repository/VIM creacion de facturas sin pedido con wf autorizacion/Page_Proceso Gestin de facturas sin pedido _4a26f4/div_Grabar'))

WebUI.click(findTestObject('Object Repository/VIM creacion de facturas sin pedido con wf autorizacion/Page_Proceso Gestin de facturas sin pedido _4a26f4/div_Finalizar'))

WebUI.click(findTestObject('Object Repository/VIM creacion de facturas sin pedido con wf autorizacion/Page_Proceso Gestin de facturas sin pedido _4a26f4/div_Aplicar reglas'))

WebUI.click(findTestObject('Object Repository/VIM creacion de facturas sin pedido con wf autorizacion/Page_Proceso Gestin de facturas sin pedido _4a26f4/div_Aplicar reglas'))

WebUI.click(findTestObject('Object Repository/VIM creacion de facturas sin pedido con wf autorizacion/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/span_Cambios guardados correctamente'))

WebUI.click(findTestObject('Object Repository/VIM creacion de facturas sin pedido con wf autorizacion/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/div_Actualizar'))

WebUI.click(findTestObject('Object Repository/VIM creacion de facturas sin pedido con wf autorizacion/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/span_'))

WebUI.setText(findTestObject('Object Repository/VIM creacion de facturas sin pedido con wf autorizacion/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/input_Todo_search'), 
    '/opt/vim_va2')

WebUI.sendKeys(findTestObject('Object Repository/VIM creacion de facturas sin pedido con wf autorizacion/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/input_Todo_search'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/VIM creacion de facturas sin pedido con wf autorizacion/Page_Bsqueda de optvim_va2/span_Visualizar otras aplicaciones'))

WebUI.click(findTestObject('Object Repository/VIM creacion de facturas sin pedido con wf autorizacion/Page_Bsqueda de optvim_va2 en Aplicaciones/span_Funciones analticas de VIM'))

WebUI.setText(findTestObject('Object Repository/VIM creacion de facturas sin pedido con wf autorizacion/Page_VIM Analytics/input_F_InputField'), 
    '14.03.2025')

WebUI.setText(findTestObject('Object Repository/VIM creacion de facturas sin pedido con wf autorizacion/Page_VIM Analytics/input_P_InputField'), 
    '610851')

WebUI.click(findTestObject('Object Repository/VIM creacion de facturas sin pedido con wf autorizacion/Page_VIM Analytics/span_610851'))

WebUI.click(findTestObject('Object Repository/VIM creacion de facturas sin pedido con wf autorizacion/Page_VIM Analytics/div_EjecutarResaltado'))

WebUI.click(findTestObject('Object Repository/VIM creacion de facturas sin pedido con wf autorizacion/Page_VIM Analytics/span_Esperando autorizacin - Contabilizada'))

