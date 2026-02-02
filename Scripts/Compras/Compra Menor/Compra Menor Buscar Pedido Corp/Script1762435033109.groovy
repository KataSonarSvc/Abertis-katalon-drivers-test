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

CustomKeywords.'com.url_utilidades.urlutilidades.openApplicationUrl'('https://saps4-pre.abertis.com/sap/bc/ui2/flp?saml2=disabled&sap-client=100#zpurchaserequisitionlr-minorPurchasing&/?sap-iapp-state--history=TASE6J2BJLI37IBVP1M5D3RFUBDI0T2YB5I2OOCPO&sap-iapp-state=TASKH6E3N4BICU9XMSOP2OLS2VUFXGJKOWBKAD10H')

WebUI.setText(findTestObject('Object Repository/Compra Menor Buscar Pedido corp/Page_Compras Menores/input_Solicitud de pedido_com.abertis.mm.zp_99f28e'), 
    num_solicitud)

WebUI.click(findTestObject('Object Repository/Compra Menor Buscar Pedido corp/Page_Compras Menores/bdi_Ir'))

WebUI.click(findTestObject('Object Repository/Compra Menor Buscar Pedido corp/Page_Compras Menores/span_Copiar a portapapeles___item89-button-img'))

WebUI.click(findTestObject('Object Repository/Compra Menor Buscar Pedido corp/Page_Compras Menores/a_450085800910'))

WebUI.takeFullPageScreenshot()

