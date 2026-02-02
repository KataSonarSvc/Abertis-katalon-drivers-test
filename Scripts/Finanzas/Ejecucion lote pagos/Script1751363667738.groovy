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
import org.openqa.selenium.Keys as Keys
import java.time.*
import java.time.format.DateTimeFormatter as DateTimeFormatter

String todayPlus5days = ZonedDateTime.now(ZoneId.systemDefault()).toLocalDate().plusDays(5).format(DateTimeFormatter.ofPattern(
        'dd.MM.yyyy'))

String todayPlus7days = ZonedDateTime.now(ZoneId.systemDefault()).toLocalDate().plusDays(7).format(DateTimeFormatter.ofPattern(
        'dd.MM.yyyy'))

WebUI.callTestCase(findTestCase('Acceso/Login'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.url_utilidades.urlutilidades.openApplicationUrl'('https://saps4-pre.abertis.com/sap/bc/ui2/flp?saml2=disabled&sap-client=100#AutomaticPayment-schedule')

WebUI.setText(findTestObject('Object Repository/Ejecucion lote pagos/Page_Pagos automticos Status/input_D_InputField'), 
    todayPlus5days // "dd.MM.yyyy"
    )

WebUI.setText(findTestObject('Object Repository/Ejecucion lote pagos/Page_Pagos automticos Status/input_I_InputField'), 
    '')

WebUI.click(findTestObject('Object Repository/Ejecucion lote pagos/Page_Pagos automticos Status/input_I_InputField'))

'En cada ejecucion este valor debe ser nuevo'
WebUI.setText(findTestObject('Object Repository/Ejecucion lote pagos/Page_Pagos automticos Status/input_I_InputField'), 
    'PRO31')

WebUI.sendKeys(findTestObject('Ejecucion lote pagos/Page_Pagos automticos Status/input_I_InputField'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Ejecucion lote pagos/Page_Pagos automticos Status/span_Parmetro'))

WebUI.click(findTestObject('Object Repository/Ejecucion lote pagos/Page_Pagos automticos Parmetros/span_Sig.fe.cont_InputField'))

WebUI.setText(findTestObject('Object Repository/Ejecucion lote pagos/Page_Pagos automticos Parmetros/input_Sig.fe.cont_InputField'), 
    '1042')

WebUI.click(findTestObject('Object Repository/Ejecucion lote pagos/Page_Pagos automticos Parmetros/span_Sig.fe.cont_InputField_1'))

WebUI.setText(findTestObject('Object Repository/Ejecucion lote pagos/Page_Pagos automticos Parmetros/input_Sig.fe.cont_InputField_1'), 
    'y')

WebUI.click(findTestObject('Object Repository/Ejecucion lote pagos/Page_Pagos automticos Parmetros/span_Sig.fe.cont_InputField_1_2'))

WebUI.setText(findTestObject('Object Repository/Ejecucion lote pagos/Page_Pagos automticos Parmetros/input_Sig.fe.cont_InputField_1_2'), 
    todayPlus7days // "dd.MM.yyyy"
    )

WebUI.setText(findTestObject('Object Repository/Ejecucion lote pagos/Page_Pagos automticos Parmetros/input_P_InputField'), 
    '147352')

WebUI.click(findTestObject('Object Repository/Ejecucion lote pagos/Page_Pagos automticos Parmetros/span_Seleccin libre'))

WebUI.click(findTestObject('Object Repository/Ejecucion lote pagos/Page_Pagos automticos Seleccin libre/span_Log adicional'))

WebUI.click(findTestObject('Object Repository/Ejecucion lote pagos/Page_Pagos automticos Log adicional/span_Verificar vencimiento'))

WebUI.click(findTestObject('Object Repository/Ejecucion lote pagos/Page_Pagos automticos Log adicional/span_Selec. va pago en caso de error'))

WebUI.click(findTestObject('Object Repository/Ejecucion lote pagos/Page_Pagos automticos Log adicional/span_Posiciones de documentos de pago'))

WebUI.setText(findTestObject('Object Repository/Ejecucion lote pagos/Page_Pagos automticos Log adicional/input_Deudores (dsdhst)_InputField'), 
    '0')

WebUI.setText(findTestObject('Object Repository/Ejecucion lote pagos/Page_Pagos automticos Log adicional/input_Deudores (dsdhst)_InputField_1'), 
    'zzzzzzzzzz')

WebUI.click(findTestObject('Object Repository/Ejecucion lote pagos/Page_Pagos automticos Log adicional/span_Impresin y sop.datos'))

WebUI.click(findTestObject('Object Repository/Ejecucion lote pagos/Page_Pagos automticos Impresin e ISD/span_Estado'))

WebUI.click(findTestObject('Object Repository/Ejecucion lote pagos/Page_Pagos automticos Impresin e ISD/div_S'))

WebUI.click(findTestObject('Object Repository/Ejecucion lote pagos/Page_Pagos automticos Status/div_Propuesta'))

WebUI.click(findTestObject('Object Repository/Ejecucion lote pagos/Page_Pagos automticos Status/span_Ejecucin inmediata'))

WebUI.click(findTestObject('Object Repository/Ejecucion lote pagos/Page_Pagos automticos Status/span_Crear medio de pago'))

WebUI.click(findTestObject('Object Repository/Ejecucion lote pagos/Page_Pagos automticos Status/div_Planificar'))

WebUI.delay(3)

WebUI.click(findTestObject('Ejecucion lote pagos/Page_Pagos_Automaticos/Menu/Menu - Estado'))

WebUI.click(findTestObject('Ejecucion lote pagos/Page_Pagos_Automaticos/Menu/Menu - Ejecutar Pago'))

WebUI.click(findTestObject('Object Repository/Ejecucion lote pagos/Page_Pagos automticos Status/div_Planificar'))

WebUI.delay(3)

WebUI.click(findTestObject('Ejecucion lote pagos/Page_Pagos_Automaticos/Menu/Menu - Estado'))

WebUI.switchToFrame(findTestObject('Ejecucion lote pagos/Page_Pagos_Automaticos/Automatic Payment Iframe'), 5)

WebUI.verifyTextPresent('Se ha realizado la ejecución de pago', false)

