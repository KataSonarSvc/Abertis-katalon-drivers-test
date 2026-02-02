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

WebUI.setText(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_Logon/input_User_sap-user'), 
    'KAT_FIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_Logon/input_Password_sap-password'), 
    'smf9zuhvlFgXLdPHx7r1FA==')

WebUI.selectOptionByValue(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_Logon/select_CA - CatalDE - DeutschEN - EnglishES_e3f430'), 
    'ES', true)

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_Logon/button_Log On'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_Pgina de inicio/span_'))

WebUI.setText(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_Pgina de inicio/input_Todo_search'), 
    '/opt/vim_wp')

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_Pgina de inicio/span_rea de trabajo de VIM - OPTVIM_WP'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Vista personal/div_Cambiar vista de trabajo'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Vista personal/div_Cambiar vista de trabajo'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Vista personal/circle_V_M1461130-buttonin'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Vista personal/circle_V_M1461130-buttonin'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Vista personal/div_Continuar'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Vista personal/div_Continuar'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/span_ID doc'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/span_ID doc'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/div_Pulse Intro para iniciar una accin y la_925c8d'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/div_Pulse Intro para iniciar una accin y la_925c8d'))

WebUI.setText(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/input_I_InputField'), 
    '449493')

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/div_'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/div_'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/div_Todas ba. (500 Acie) - (500 Filtrados)__ee9d6a'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/div_Todas ba. (500 Acie) - (500 Filtrados)__ee9d6a'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/span_Borrar filtros'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/span_Borrar filtros'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/div_ZAB_NPO_u3344-div'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/div_ZAB_NPO_u3344-div'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/div_ZAB_NPO_u497B-div'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/div_ZAB_NPO_u497B-div'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/div_ZAB_NPO_u482-bgdiv'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/div_ZAB_NPO_u482-bgdiv'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/input_S_InputField'))

WebUI.setText(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/input_S_InputField'), 
    '1001')

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/span_1001'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/span_1001'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/div_Aplicar'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/div_Aplicar'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/svg_Suplencia para_gridC16261,3icp'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/svg_Suplencia para_gridC16261,3icp'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_Proceso Gestin de pedidos VIM 7.5 - 00_144224/div_Mostr panel detalles'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_Proceso Gestin de pedidos VIM 7.5 - 00_144224/div_Mostr panel detalles'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_Proceso Gestin de pedidos VIM 7.5 - 00_144224/div_Ocult panel detalles'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_Proceso Gestin de pedidos VIM 7.5 - 00_144224/div_Ocult panel detalles'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_Proceso Gestin de pedidos VIM 7.5 - 00_144224/span_Posiciones de documento'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_Proceso Gestin de pedidos VIM 7.5 - 00_144224/span_Posiciones de documento'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_Proceso Gestin de pedidos VIM 7.5 - 00_144224/div_Procesar factura de pedido (PO), OCR.ls_e6d2d1'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_Proceso Gestin de pedidos VIM 7.5 - 00_144224/div_Procesar factura de pedido (PO), OCR.ls_e6d2d1'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_Proceso Gestin de pedidos VIM 7.5 - 00_144224/span_Contabilidad'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_Proceso Gestin de pedidos VIM 7.5 - 00_144224/span_Contabilidad'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_Proceso Gestin de pedidos VIM 7.5 - 00_144224/span_Impuesto'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_Proceso Gestin de pedidos VIM 7.5 - 00_144224/span_Impuesto'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_Proceso Gestin de pedidos VIM 7.5 - 00_144224/span_Proceso'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_Proceso Gestin de pedidos VIM 7.5 - 00_144224/span_Proceso'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_Proceso Gestin de pedidos VIM 7.5 - 00_144224/span_Otros datos'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_Proceso Gestin de pedidos VIM 7.5 - 00_144224/span_Otros datos'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_Proceso Gestin de pedidos VIM 7.5 - 00_144224/span_Datos bsicos'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_Proceso Gestin de pedidos VIM 7.5 - 00_144224/span_Datos bsicos'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_Proceso Gestin de pedidos VIM 7.5 - 00_144224/div_GrabarResaltado'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_Proceso Gestin de pedidos VIM 7.5 - 00_144224/div_GrabarResaltado'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_Proceso Gestin de pedidos VIM 7.5 - 00_144224/div_Aplicar reglas'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_Proceso Gestin de pedidos VIM 7.5 - 00_144224/div_Aplicar reglas'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/span_'))

WebUI.setText(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/input_Todo_search'), 
    '/opt/vim_va2')

WebUI.sendKeys(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/input_Todo_search'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_Bsqueda de optvim_va2/div_OPTVIM_VA2_sapMGTHdrContent OneByOne'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_Bsqueda de optvim_va2 en Aplicaciones/span_Funciones analticas de VIM'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_VIM Analytics/input_F_InputField'))

WebUI.setText(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_VIM Analytics/input_F_InputField'), 
    '30')

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_VIM Analytics/input_F_InputField'))

WebUI.setText(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_VIM Analytics/input_F_InputField'), 
    '30.06.2025')

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_VIM Analytics/input_P_InputField'))

WebUI.setText(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_VIM Analytics/input_P_InputField'), 
    '184869')

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_VIM Analytics/span_184869'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_VIM Analytics/span_184869'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_VIM Analytics/div_EjecutarResaltado'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_VIM Analytics/div_EjecutarResaltado'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_VIM Analytics/span_449493'))

WebUI.click(findTestObject('Object Repository/Creación de Facturas con pedido sin diferencias/Page_VIM Analytics/span_449493'))

