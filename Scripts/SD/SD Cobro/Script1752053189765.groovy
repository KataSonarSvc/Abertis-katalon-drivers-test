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

CustomKeywords.'com.url_utilidades.urlutilidades.openApplicationUrl'('https://saps4-pre.abertis.com/sap/bc/ui2/flp?saml2=disabled&sap-client=100#AutomaticPayment-schedule')

WebUI.setText(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Status/input_D_InputField'), '22082025')

WebUI.setText(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Status/input_I_InputField'), '')

WebUI.click(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Status/input_I_InputField'))

WebUI.setText(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Status/input_I_InputField'), 'katc1')

WebUI.click(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Status/div_Da de ejecucinIdentificador.lsPanelsCon_0a786c'))

WebUI.click(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Status/span_Parmetro'))

WebUI.click(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Parmetros/span_Sig.fe.cont_InputField'))

WebUI.setText(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Parmetros/input_Sig.fe.cont_InputField'), 
    '1042')

WebUI.click(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Parmetros/span_Sig.fe.cont_InputField_1'))

WebUI.setText(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Parmetros/input_Sig.fe.cont_InputField_1'), 
    '4')

WebUI.click(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Parmetros/span_Sig.fe.cont_InputField_1_2'))

WebUI.setText(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Parmetros/input_Sig.fe.cont_InputField_1_2'), 
    '22082025')

WebUI.click(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Parmetros/input_P_InputField'))

WebUI.setText(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Parmetros/input_C_InputField'), '84559')

WebUI.click(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Parmetros/div_ProveedoraClientea'))

WebUI.click(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Parmetros/span_Seleccin libre'))

WebUI.click(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Parmetros/span_31.07.2025'))

WebUI.setText(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Parmetros/input_Sig.fe.cont_InputField_1_2'), 
    '08112025')

WebUI.click(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Parmetros/div_Fecha contabiliz.Doc.creados hastaPos.d_c73de7'))

WebUI.click(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Parmetros/span_Seleccin libre'))

WebUI.click(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Seleccin libre/span_Log adicional'))

WebUI.click(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Log adicional/span_Verificar vencimiento'))

WebUI.click(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Log adicional/span_Selec. va pago en caso de error'))

WebUI.click(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Log adicional/span_Posiciones de documentos de pago'))

WebUI.click(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Log adicional/span_Seleccionar va pago siempre'))

WebUI.click(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Log adicional/span_Selec. va pago en caso de error'))

WebUI.setText(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Log adicional/input_Deudores (dsdhst)_InputField'), 
    '84559')

WebUI.setText(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Log adicional/input_Deudores (dsdhst)_InputField_1'), 
    '84559')

WebUI.click(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Log adicional/span_Impresin y sop.datos'))

WebUI.click(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Impresin e ISD/div_Grabar parmetrosResaltado'))

WebUI.click(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Impresin e ISD/span_Estado'))

WebUI.click(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Status/span_Parmetros registrados'))

WebUI.click(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Status/div_Propuesta'))

WebUI.click(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Status/span_Ejecucin inmediata'))

WebUI.click(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Status/span_Crear medio de pago'))

WebUI.click(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Status/div_Planificar'))

WebUI.click(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Status/span_Propuesta en proceso'))

WebUI.click(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Status/div_EstadoParmetros registradosPropuesta en_1eeb87'))

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Status/div_Visualizar propuesta'))

WebUI.click(findTestObject('Object Repository/SD Cobros/Page_Visualizar propuestas de pago Pagos/div_Back de bsqueda'))

WebUI.click(findTestObject('Object Repository/SD Cobros/Page_Visualizar propuestas de pago Pagos/span_'))

WebUI.click(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Status/div_Ejec.pago'))

WebUI.click(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Status/span_Ejecucin inmediata'))

WebUI.click(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Status/span_Crear medio de pago'))

WebUI.click(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Status/div_Planificar'))

WebUI.click(findTestObject('Object Repository/SD Cobros/Page_Pagos automticos Status/div_Da de ejecucinIdentificador.lsPanelsCon_0a786c_1'))

WebUI.takeFullPageScreenshot()

