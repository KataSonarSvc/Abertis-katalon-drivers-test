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

CustomKeywords.'com.url_utilidades.urlutilidades.openApplicationUrl'('https://saps4-pre.abertis.com/sap/bc/ui2/flp?saml2=disabled&sap-client=100&sap-ushell-config=lean#zpowithcontract-display')

WebUI.click(findTestObject('Object Repository/Compra Referida Contratos UNAE/Page_Pedidos Ref. contrato/input_Proveedor_com.abertis.mm.zpowithcontr_5e2275'))

WebUI.setText(findTestObject('Object Repository/Compra Referida Contratos UNAE/Page_Pedidos Ref. contrato/input_Contrato_com.abertis.mm.zpowithcontra_1bf86f'), 
    contrato)

WebUI.sendKeys(findTestObject('Object Repository/Compra Referida Contratos UNAE/Page_Pedidos Ref. contrato/input_Contrato_com.abertis.mm.zpowithcontra_1bf86f'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Compra Referida Contratos UNAE/Page_Pedidos Ref. contrato/circle_Descripcin Adj_sapMRbBInn'))

WebUI.click(findTestObject('Object Repository/Compra Referida Contratos UNAE/Page_Pedidos Ref. contrato/bdi_Crear Pedido con Referencia'))

WebUI.click(findTestObject('Object Repository/Compra Referida Contratos UNAE/Page_Purchase Order/div_Importe disponible___item113-__clone321_b8f537'))

WebUI.click(findTestObject('Object Repository/Compra Referida Contratos UNAE/Page_Purchase Order/bdi_Copiar las posiciones seleccionadas'))

WebUI.setText(findTestObject('Object Repository/Compra Referida Contratos UNAE/Page_Purchase Order/textarea_Comentarios al proveedor_applicati_4ad411'), 
    comentarios_proveedor)

WebUI.setText(findTestObject('Object Repository/Compra Referida Contratos UNAE/Page_Purchase Order/input_Fecha de entrega_application-zpurchas_185423'), 
    fecha_entrega)

WebUI.setText(findTestObject('Object Repository/Compra Referida Contratos UNAE/Page_Purchase Order/input_Cantidad_application-zpurchaseorder-c_7ce329'), 
    cantidad)

WebUI.click(findTestObject('Object Repository/Compra Referida Contratos UNAE/Page_Purchase Order/bdi_Ms Datos'))

WebUI.click(findTestObject('Object Repository/Compra Referida Contratos UNAE/Page_Purchase Order/span_Mostrar ms_application-zpurchaseorder-_7d6cfe'))

WebUI.click(findTestObject('Object Repository/Compra Referida Contratos UNAE/Page_Purchase Order/bdi_Verificar'))

WebUI.click(findTestObject('Object Repository/Compra Referida Contratos UNAE/Page_Purchase Order/span_Cerrar___button93-img'))

WebUI.click(findTestObject('Object Repository/Compra Referida Contratos UNAE/Page_Purchase Order/bdi_OK'))

WebUI.click(findTestObject('Object Repository/Compra Referida Contratos UNAE/Page_Purchase Order/bdi_Grabar'))

WebUI.click(findTestObject('Object Repository/Compra Referida Contratos UNAE/Page_Purchase Order/span_Cerrar___button93-img'))

WebUI.click(findTestObject('Object Repository/Compra Referida Contratos UNAE/Page_Purchase Order/span_Pedido Contr. Valor creado bajo el nme_d245d7'))

WebUI.click(findTestObject('Object Repository/Compra Referida Contratos UNAE/Page_Purchase Order/span_OK'))

WebUI.takeFullPageScreenshot()

