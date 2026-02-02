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

CustomKeywords.'com.url_utilidades.urlutilidades.openApplicationUrl'('https://saps4-pre.abertis.com/sap/bc/ui2/flp?saml2=disabled&sap-client=100&sap-ushell-config=lean#zpurchaserequisitionlr-tenderedPurchasing')

WebUI.click(findTestObject('Compras Licitadas/Tab_Grupo'))

WebUI.click(findTestObject('Object Repository/Compra licitada Corp/Page_Solicitud a Compras/span_Crear'))

WebUI.setText(findTestObject('Object Repository/Compra licitada Corp/Page_Solicitud de pedido/textarea_Objeto CompraContratacin_applicati_5ca62f'), 
    objeto_compra)

WebUI.setText(findTestObject('Object Repository/Compra licitada Corp/Page_Solicitud de pedido/textarea_Proveedores Invitados_application-_7a5879'), 
    proveedores)

WebUI.setText(findTestObject('Compras Licitadas/Input_Centro'), centro)

WebUI.setText(findTestObject('Object Repository/Compra Menor Chile New ID/Page_Solicitud de pedido/input_Centro de coste_application-zpurchase_f9243e'), 
    tipo_imp)

WebUI.setText(findTestObject('Object Repository/Compra Menor Chile New ID/Page_Solicitud de pedido/input_Centro de coste_application-zpurchase_3b7aff'), 
    material)

WebUI.setText(findTestObject('Object Repository/Compra Menor Chile New ID/Page_Solicitud de pedido/input_Centro de coste_application-zpurchase_a5e4ee'), 
    texto_breve)

WebUI.setText(findTestObject('Object Repository/Compra Menor Chile New ID/Page_Solicitud de pedido/input_Marcando este campo se puede desglosa_62e8d3'), 
    cantidad_solicitada)

WebUI.setText(findTestObject('Object Repository/Compra Menor Chile New ID/Page_Solicitud de pedido/input_Estado de valor Informacin_applicatio_c41996'), 
    fecha_entrega)

WebUI.setText(findTestObject('Compras Licitadas/Input_WBS_Element'), wbs_element)

WebUI.click(findTestObject('Object Repository/Compra licitada Corp/Page_Solicitud de pedido/span_Ms Datos'))

WebUI.setText(findTestObject('Object Repository/Compra licitada Corp/Page_Solicitud de pedido/input_Presupuesto asignado_application-zpur_40bc69'), 
    presupuesto_asignado)

WebUI.click(findTestObject('Object Repository/Compra licitada Corp/Page_Solicitud de pedido/span_Mostrar ms_application-zpurchaserequis_699b5c'))

WebUI.click(findTestObject('Object Repository/Compra licitada Corp/Page_Solicitud de pedido/span_Verificar'))

WebUI.click(findTestObject('Object Repository/Compra licitada Corp/Page_Solicitud de pedido/span_Cerrar___button145-img'))

WebUI.click(findTestObject('Object Repository/Compra licitada Corp/Page_Solicitud de pedido/span_OK'))

WebUI.click(findTestObject('Object Repository/Compra licitada Corp/Page_Solicitud de pedido/span_Grabar'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra Menor Chile New ID/Page_Solicitud de pedido/span_Solicitud 2000615133 creada'))

WebUI.takeFullPageScreenshot()

