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

CustomKeywords.'com.url_utilidades.urlutilidades.openApplicationUrl'('https://saps4-pre.abertis.com/sap/bc/ui2/flp?saml2=disabled&sap-client=100#WorkflowTask-DisplayAll?allItems=true&listSize=10000&massAction=false&scenarioId=ZFIO_TASKPURCHASINGINBOX&substitution=false&/empty_view')

WebUI.setText(findTestObject('Object Repository/Solicitud Pedido Solicitud Informacion/Page_Bandeja/input_Seleccin mltiple___xmlview7--myInbox__3c6212'), 
    num_pedido)

WebUI.click(findTestObject('Object Repository/Contratos Solicitud informacion/Page_Bandeja/div_Ma_jgarcia'))

WebUI.click(findTestObject('Object Repository/Contratos Solicitud informacion/Page_Bandeja/bdi_SolicitudRespuesta de Informacin'))

WebUI.setText(findTestObject('Object Repository/Contratos Solicitud informacion/Page_Bandeja/textarea_Enviar decisin___area0-inner'), 
    texto_decision)

WebUI.click(findTestObject('Object Repository/Contratos Solicitud informacion/Page_Bandeja/bdi_Enviar'))

WebUI.click(findTestObject('Object Repository/Contratos Solicitud informacion/Page_Bandeja/div_Tarea procesada correctamente'))

WebUI.takeFullPageScreenshot()

