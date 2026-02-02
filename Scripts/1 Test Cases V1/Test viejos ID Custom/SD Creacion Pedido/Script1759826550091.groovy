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

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear documentos de ventas/input_C_InputField'))

WebUI.setText(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear documentos de ventas/input_C_InputField'), 
    'ZPI9')

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear documentos de ventas/span_ZPI9'))

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear documentos de ventas/span_ZPI9'))

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear documentos de ventas/input_O_InputField'))

WebUI.setText(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear documentos de ventas/input_O_InputField'), 
    'V330')

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear documentos de ventas/span_V330'))

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear documentos de ventas/span_V330'))

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear documentos de ventas/input_C_InputField_1'))

WebUI.setText(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear documentos de ventas/input_C_InputField_1'), 
    '01')

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear documentos de ventas/span_01'))

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear documentos de ventas/span_01'))

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear documentos de ventas/input_S_InputField'))

WebUI.setText(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear documentos de ventas/input_S_InputField'), 
    '01')

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear documentos de ventas/div_ContinuarResaltado'))

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear documentos de ventas/div_ContinuarResaltado'))

WebUI.setText(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear Plan factu canti A4 Resumen/input_S_InputField'), 
    '902521')

WebUI.setText(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear Plan factu canti A4 Resumen/input_D_InputField'), 
    '')

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear Plan factu canti A4 Resumen/input_D_InputField'))

WebUI.setText(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear Plan factu canti A4 Resumen/input_D_InputField'), 
    '902521')

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear Plan factu canti A4 Resumen/div_Fe.pref.entrg.Tipo de fecha de la fecha_9885a7'))

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear Plan factu canti A4 Resumen/div_Fe.pref.entrg.Tipo de fecha de la fecha_9885a7'))

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear Plan factu canti A4 Resumen/span_Seleccin de fila desactivada_InputField'))

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear Plan factu canti A4 Resumen/span_Seleccin de fila desactivada_InputField'))

WebUI.setText(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear Plan factu canti A4 Resumen/input_Seleccin de fila desactivada_InputField'), 
    '906')

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear Plan factu canti A4 Resumen/input_Seleccin de fila desactivada_InputField_1'))

WebUI.setText(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear Plan factu canti A4 Resumen/input_Seleccin de fila desactivada_InputField_1'), 
    '12')

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear Plan factu canti A4 Resumen/span_D_InputField'))

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear Plan factu canti A4 Resumen/span_D_InputField'))

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear Plan factu canti A4 Resumen/input_Seleccin de fila desactivada_InputField_1'))

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear Plan factu canti A4 Resumen/input_Seleccin de fila desactivada_InputField_1'))

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear Plan factu canti A4 Resumen/span_12,000'))

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear Plan factu canti A4 Resumen/span_12,000'))

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear Plan factu canti A4 Resumen/span_D_M04623B256221,9_c-r'))

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear Plan factu canti A4 Resumen/span_D_M04623B256221,9_c-r'))

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear Plan factu canti A4 Resumen/span_Vaca_urSCBBtn urBorderBox lsScrollbar-_1a8776'))

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear Plan factu canti A4 Resumen/span_Vaca_urSCBBtn urBorderBox lsScrollbar-_1a8776'))

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear Plan factu canti A4 Resumen/span_D_InputField_1'))

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear Plan factu canti A4 Resumen/span_D_InputField_1'))

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear Plan factu canti A4 Resumen/span_Vaca_M04623B25622_hscroll-hdl'))

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear Plan factu canti A4 Resumen/span_Vaca_M04623B25622_hscroll-hdl'))

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear Plan factu canti A4 Resumen/input_D_InputField_1'))

WebUI.setText(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear Plan factu canti A4 Resumen/input_D_InputField_1'), 
    'B20000')

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear Plan factu canti A4 Resumen/span_D_InputField'))

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear Plan factu canti A4 Resumen/span_D_InputField'))

WebUI.setText(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear Plan factu canti A4 Resumen/input_D_InputField_1_2'), 
    '56')

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear Plan factu canti A4 Resumen/div_GuardarResaltado'))

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear Plan factu canti A4 Resumen/div_GuardarResaltado'))

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear Plan factu canti A4 Resumen/span_Plan factu canti A4 95214 se ha grabado'))

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear Plan factu canti A4 Resumen/span_Plan factu canti A4 95214 se ha grabado'))

