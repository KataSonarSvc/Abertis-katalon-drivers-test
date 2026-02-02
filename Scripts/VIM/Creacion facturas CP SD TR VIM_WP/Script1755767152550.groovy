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

CustomKeywords.'com.example.WebUICustomKeywords.getHtmlTableColumns'(null, 'https://saps4-pre.abertis.com/sap/bc/ui2/flp?saml2=disabled&sap-client=100#zgui_opt_vim_wp-display')

WebUI.click(findTestObject('Object Repository/Creacion facturas CP SD TR VIM_WP/Page_rea de trabajo de VIM Invoice  Vista personal/div_Cambiar vista de trabajo'))

WebUI.click(findTestObject('Object Repository/Creacion facturas CP SD TR VIM_WP/Page_rea de trabajo de VIM Invoice  Vista personal/circle_V_M1461130-buttonin'))

WebUI.click(findTestObject('Object Repository/Creacion facturas CP SD TR VIM_WP/Page_rea de trabajo de VIM Invoice  Vista personal/div_Continuar'))

WebUI.click(findTestObject('Object Repository/Creacion facturas CP SD TR VIM_WP/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/div_Mostrar Panel de detalles'))

WebUI.click(findTestObject('Object Repository/Creacion facturas CP SD TR VIM_WP/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/div_Ocultar Panel de detalles'))

WebUI.click(findTestObject('Object Repository/Creacion facturas CP SD TR VIM_WP/Page_rea de trabajo de VIM Invoice  Todas l_8ce86e/svg_Suplencia para_gridC290109,3icp'))

WebUI.click(findTestObject('Object Repository/Creacion facturas CP SD TR VIM_WP/Page_Proceso Gestin de pedidos VIM 7.5 - 00_144224/div_Mostr panel detalles'))

WebUI.click(findTestObject('Object Repository/Creacion facturas CP SD TR VIM_WP/Page_Proceso Gestin de pedidos VIM 7.5 - 00_144224/div_Ocult panel detalles'))

WebUI.click(findTestObject('Object Repository/Creacion facturas CP SD TR VIM_WP/Page_Proceso Gestin de pedidos VIM 7.5 - 00_144224/span_Datos bsicos'))

WebUI.click(findTestObject('Object Repository/Creacion facturas CP SD TR VIM_WP/Page_Proceso Gestin de pedidos VIM 7.5 - 00_144224/span_Posiciones de documento'))

WebUI.click(findTestObject('Object Repository/Creacion facturas CP SD TR VIM_WP/Page_Proceso Gestin de pedidos VIM 7.5 - 00_144224/div_Posible duplicado (PO).lsPanelsContaine_a4483c'))

WebUI.click(findTestObject('Object Repository/Creacion facturas CP SD TR VIM_WP/Page_Proceso Gestin de pedidos VIM 7.5 - 00_144224/span_Contabilidad'))

WebUI.click(findTestObject('Object Repository/Creacion facturas CP SD TR VIM_WP/Page_Proceso Gestin de pedidos VIM 7.5 - 00_144224/span_Impuesto'))

WebUI.click(findTestObject('Object Repository/Creacion facturas CP SD TR VIM_WP/Page_Proceso Gestin de pedidos VIM 7.5 - 00_144224/span_Proceso'))

WebUI.click(findTestObject('Object Repository/Creacion facturas CP SD TR VIM_WP/Page_Proceso Gestin de pedidos VIM 7.5 - 00_144224/span_Otros datos'))

WebUI.click(findTestObject('Object Repository/Creacion facturas CP SD TR VIM_WP/Page_Proceso Gestin de pedidos VIM 7.5 - 00_144224/span_Datos bsicos'))

WebUI.click(findTestObject('Object Repository/Creacion facturas CP SD TR VIM_WP/Page_Proceso Gestin de pedidos VIM 7.5 - 00_144224/div_Aplicar reglas'))

