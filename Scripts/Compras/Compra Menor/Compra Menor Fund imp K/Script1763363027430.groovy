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

CustomKeywords.'com.url_utilidades.urlutilidades.openApplicationUrl'('https://saps4-pre.abertis.com/sap/bc/ui2/flp?saml2=disabled&sap-client=100&=ES&sap-ushell-config=lean#zpurchaserequisitionlr-minorPurchasing')

WebUI.click(findTestObject('Object Repository/Compra Menor Corp New id/Page_Compras Menores/bdi_Crear'))

WebUI.setText(findTestObject('Object Repository/Compra Menor Corp New id/Page_Solicitud de pedido/textarea_Objeto CompraContratacin_applicati_e79ebe'), 
    objeto_compra)

WebUI.setText(findTestObject('Object Repository/Compra Menor Corp New id/Page_Solicitud de pedido/input_Proveedor_application-zpurchaserequis_639655'), 
    proveedor)

WebUI.setText(findTestObject('Object Repository/Compra Menor Capex Sanef New/Page_Solicitud de pedido/input_Centre de cots_application-zpurchaser_6e4540'), 
    division)

WebUI.click(findTestObject('Object Repository/Compra Menor Corp New id/Page_Solicitud de pedido/span_Centro de coste_application-zpurchaser_9233e3'))

WebUI.click(findTestObject('Object Repository/Compra Menor Corp New id/Page_Solicitud de pedido/div_OProyecto Inversin'))

WebUI.setText(findTestObject('Object Repository/Compra Menor Corp New id/Page_Solicitud de pedido/input_Centro de coste_application-zpurchase_ad1c53'), 
    material)

WebUI.setText(findTestObject('Object Repository/Compra Menor Corp New id/Page_Solicitud de pedido/input_Centro de coste_application-zpurchase_c67e38'), 
    texto_breve)

WebUI.setText(findTestObject('Object Repository/Compra Menor Corp New id/Page_Solicitud de pedido/input_Marcando este campo se puede desglosa_bfb6e3'), 
    cantidad_solicitada)

WebUI.setText(findTestObject('Object Repository/Compra Menor Corp New id/Page_Solicitud de pedido/input_Estado de valor Informacin_applicatio_150c82'), 
    fecha_entrega)

WebUI.setText(findTestObject('Compra Menor Chile New ID/Page_Solicitud de pedido/Input_centro_coste'), centro_coste)

WebUI.click(findTestObject('Object Repository/Compra Menor Corp New id/Page_Solicitud de pedido/bdi_Ms Datos'))

WebUI.setText(findTestObject('Object Repository/Compra Menor Corp New id/Page_Solicitud de pedido/input_Necesidad_application-zpurchaserequis_c75806'), 
    necesidad)

WebUI.click(findTestObject('Object Repository/Compra Menor Corp New id/Page_Solicitud de pedido/span_Mostrar ms_application-zpurchaserequis_10e554'))

WebUI.click(findTestObject('Object Repository/Compra Menor Corp New id/Page_Solicitud de pedido/bdi_Verificar'))

WebUI.click(findTestObject('Object Repository/Compra Menor Corp New id/Page_Solicitud de pedido/bdi_OK'))

WebUI.click(findTestObject('Object Repository/Compra Menor Corp New id/Page_Solicitud de pedido/span_Grabar'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra Menor Chile New ID/Page_Solicitud de pedido/span_Solicitud 2000615133 creada'))

WebUI.takeFullPageScreenshot()

