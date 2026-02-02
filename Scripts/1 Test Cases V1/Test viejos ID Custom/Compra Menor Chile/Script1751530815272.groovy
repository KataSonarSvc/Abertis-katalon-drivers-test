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

WebUI.click(findTestObject('Object Repository/Compra Menor Chile/Page_Pgina de inicio/span_Gestin operativa'))

WebUI.click(findTestObject('Object Repository/Compra Menor Chile/Page_Pgina de inicio/div_Compras MenoresDe bajo importe'))

WebUI.click(findTestObject('Object Repository/Compra Menor Chile/Page_Compras Menores/span_Crear'))

WebUI.click(findTestObject('Object Repository/Compra Menor Chile/Page_Solicitud de pedido/span_Proveedor_application-zpurchaserequisi_797b13'))

WebUI.click(findTestObject('Object Repository/Compra Menor Chile/Page_Solicitud de pedido/div_135560'))

WebUI.setText(findTestObject('Object Repository/Compra Menor Chile/Page_Solicitud de pedido/textarea_Objeto CompraContratacin_applicati_e79ebe'), 
    'test')

WebUI.click(findTestObject('Object Repository/Compra Menor Chile/Page_Solicitud de pedido/span_Centro de coste_application-zpurchaser_0dec5a'))

WebUI.click(findTestObject('Object Repository/Compra Menor Chile/Page_Solicitud de pedido/div_50307'))

WebUI.setText(findTestObject('Object Repository/Compra Menor Chile/Page_Solicitud de pedido/input_Centro de coste_application-zpurchase_3a07a7'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Compra Menor Chile/Page_Solicitud de pedido/input_Cantidad solicitada'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Compra Menor Chile/Page_Solicitud de pedido/input_Fecha entrega'), '01072026')

WebUI.click(findTestObject('Object Repository/Compra Menor Chile/Page_Solicitud de pedido/span_Centro coste'))

WebUI.click(findTestObject('Object Repository/Compra Menor Chile/Page_Solicitud de pedido/div_26272'))

WebUI.click(findTestObject('Object Repository/Compra Menor Chile/Page_Solicitud de pedido/bdi_Ms Datos'))

WebUI.click(findTestObject('Object Repository/Compra Menor Chile/Page_Solicitud de pedido/span_Mostrar ms_application-zpurchaserequis_06dbfb'))

WebUI.click(findTestObject('Object Repository/Compra Menor Chile/Page_Solicitud de pedido/button_Verificar'))

WebUI.click(findTestObject('Object Repository/Compra Menor Chile/Page_Solicitud de pedido/span_Cerrar___button176-img'))

WebUI.click(findTestObject('Object Repository/Compra Menor Chile/Page_Solicitud de pedido/span_OK'))

WebUI.click(findTestObject('Object Repository/Compra Menor Chile/Page_Solicitud de pedido/span_Grabar'))

WebUI.click(findTestObject('Object Repository/Compra Menor Chile/Page_Solicitud de pedido/span_xito'))

WebUI.click(findTestObject('Object Repository/Compra Menor Chile/Page_Solicitud de pedido/span_OK_1'))

