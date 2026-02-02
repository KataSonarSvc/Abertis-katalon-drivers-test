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

CustomKeywords.'com.url_utilidades.urlutilidades.openApplicationUrl'('https://saps4-pre.abertis.com/sap/bc/ui2/flp?saml2=disabled&sap-client=100#Material-goodsReceipt')

WebUI.click(findTestObject('Object Repository/Movimientos Reservas/Page_Salida de mercancas Otros/span_A_M0461100-btn'))

WebUI.click(findTestObject('Object Repository/Movimientos Reservas/Page_Salida de mercancas Otros/div_Salida de mercancas'))

WebUI.click(findTestObject('Object Repository/Movimientos Reservas/Page_Salida de mercancas Otros/span_A_M04611020-btn'))

WebUI.click(findTestObject('Object Repository/Movimientos Reservas/Page_Salida de mercancas Otros/div_Reserva'))

WebUI.setText(findTestObject('Object Repository/Movimientos Reservas/Page_Salida de mercancas Reserva/input_A_InputField'), 
    ref)

WebUI.sendKeys(findTestObject('Object Repository/Movimientos Reservas/Page_Salida de mercancas Reserva/input_A_InputField'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Movimientos Reservas/Page_Salida de mercancas Reserva/input_F_InputField'))

WebUI.click(findTestObject('Object Repository/Movimientos Reservas/Page_Salida de mercancas Reserva/label_Fecha documento'))

WebUI.setText(findTestObject('Object Repository/Movimientos Reservas/Page_Salida de mercancas Reserva/input_F_InputField'), 
    fecha_documento)

WebUI.setText(findTestObject('Object Repository/Movimientos Reservas/Page_Salida de mercancas Reserva/input_F_InputField_1'), 
    fecha_contab)

WebUI.click(findTestObject('Object Repository/Movimientos Reservas/Page_Salida de mercancas Reserva/input_F_InputField_1'))

WebUI.click(findTestObject('Object Repository/Movimientos Reservas/Page_Salida de mercancas Reserva/input_F_InputField_1'))

WebUI.click(findTestObject('Object Repository/Movimientos Reservas/Page_Salida de mercancas Reserva/span_Material'))

WebUI.click(findTestObject('Object Repository/Movimientos Reservas/Page_Salida de mercancas Reserva/span_Cantidad'))

WebUI.doubleClick(findTestObject('Object Repository/Movimientos Reservas/Page_Salida de mercancas Reserva/label_Ctd.en UM de entrada'))

WebUI.setText(findTestObject('Object Repository/Movimientos Reservas/Page_Salida de mercancas Reserva/input_C_InputField'), 
    ctd_en_um_de_entrada)

WebUI.click(findTestObject('Object Repository/Movimientos Reservas/Page_Salida de mercancas Reserva/span_Donde'))

WebUI.click(findTestObject('Object Repository/Movimientos Reservas/Page_Salida de mercancas Reserva/div_Clase de movimientoSM para centro coste_6cf937'))

WebUI.setText(findTestObject('Object Repository/Movimientos Reservas/Page_Salida de mercancas Reserva/input_A_InputField_1'), 
    almacen)

WebUI.click(findTestObject('Object Repository/Movimientos Reservas/Page_Salida de mercancas Reserva/span_Posicin OK'))

WebUI.click(findTestObject('Object Repository/Movimientos Reservas/Page_Salida de mercancas Reserva/div_Verificar'))

WebUI.click(findTestObject('Object Repository/Movimientos Reservas/Page_Salida de mercancas Reserva/div_ContabilizarResaltado'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('Object Repository/Movimientos Reservas/Page_Salida de mercancas Reserva/span_Documento material 4900262240 contabilizado'))

WebUI.takeFullPageScreenshot()

