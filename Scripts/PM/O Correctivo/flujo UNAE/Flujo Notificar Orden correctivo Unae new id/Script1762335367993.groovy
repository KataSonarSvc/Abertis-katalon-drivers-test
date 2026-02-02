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

CustomKeywords.'com.url_utilidades.urlutilidades.openApplicationUrl'('https://saps4-pre.abertis.com/sap/bc/ui2/flp?saml2=disabled&sap-client=100#ZPM_SMART-GESTICKET')

WebUI.setText(findTestObject('Object Repository/Notificar Orden correctivo Unae/Page_Gestin de rdenes Correctivo/input_Orden_application-ZPM_SMART-GESTICKET_667dc1'), 
    GlobalVariable.DYNAMIC_PEDIDO)

WebUI.click(findTestObject('Object Repository/Notificar Orden correctivo Unae/Page_Gestin de rdenes Correctivo/span_Fecha inicio extrema_application-ZPM_S_79b981'))

WebUI.click(findTestObject('Object Repository/Notificar Orden correctivo Unae/Page_Gestin de rdenes Correctivo/div_Este ao'))

WebUI.click(findTestObject('Object Repository/Notificar Orden correctivo Unae/Page_Gestin de rdenes Correctivo/span_Ir'))

WebUI.click(findTestObject('Notificar Orden correctivo Unae/Page_Gestin de rdenes Correctivo/span_200100050798', [('orderId') : GlobalVariable.DYNAMIC_PEDIDO]))

WebUI.click(findTestObject('Object Repository/Notificar Orden correctivo Unae/Page_Gestin de rdenes Correctivo/span_Datos de orden_application-ZPM_SMART-G_1f1012'))

WebUI.click(findTestObject('Object Repository/Notificar Orden correctivo Unae/Page_Gestin de rdenes Correctivo/span_Advertencia emitida_application-ZPM_SM_94591d'))

WebUI.click(findTestObject('Object Repository/Notificar Orden correctivo Unae/Page_Gestin de rdenes Correctivo/span_Notificacin final_sapMSwtLabel sapMSwt_f93253'))

WebUI.click(findTestObject('Object Repository/Notificar Orden correctivo Unae/Page_Gestin de rdenes Correctivo/bdi_Guardar'))

WebUI.takeFullPageScreenshot()

