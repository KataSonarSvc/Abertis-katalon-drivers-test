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

WebUI.click(findTestObject('Object Repository/Movimientos salidas/Page_Salida de mercancas Reserva/span_A_M04611020-btn'))

WebUI.click(findTestObject('Object Repository/Movimientos salidas/Page_Salida de mercancas Reserva/div_Otros'))

WebUI.click(findTestObject('Object Repository/Movimientos salidas/Page_Salida de mercancas Otros/span_Fecha documento'))

WebUI.setText(findTestObject('Object Repository/Movimientos salidas/Page_Salida de mercancas Otros/input_F_InputField'), 
    fecha_documento)

WebUI.click(findTestObject('Movimientos Recepciones/Page_Entrada de mercancas Pedido 4500856944/input_Fecha Contabilización'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Movimientos Recepciones/Page_Entrada de mercancas Pedido 4500856944/input_Fecha Contabilización'), 
    fecha_contabilizacion)

WebUI.click(findTestObject('Object Repository/Movimientos salidas/Page_Salida de mercancas Otros/span_Material'))

WebUI.setText(findTestObject('Object Repository/Movimientos salidas/Page_Salida de mercancas Otros/input_M_InputField'), 
    material)

WebUI.sendKeys(findTestObject('Object Repository/Movimientos salidas/Page_Salida de mercancas Otros/input_M_InputField'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Movimientos salidas/Page_Salida de mercancas Otros/span_Cantidad'))

WebUI.setText(findTestObject('Object Repository/Movimientos salidas/Page_Salida de mercancas Otros/input_C_InputField'), 
    ctd_en_um_de_entrada)

WebUI.click(findTestObject('Object Repository/Movimientos salidas/Page_Salida de mercancas Otros/span_Donde'))

WebUI.setText(findTestObject('Object Repository/Movimientos salidas/Page_Salida de mercancas Otros/input_C_InputField_1'), 
    centro)

WebUI.setText(findTestObject('Object Repository/Movimientos salidas/Page_Salida de mercancas Otros/input_A_InputField'), 
    almacen)

WebUI.click(findTestObject('Object Repository/Movimientos salidas/Page_Salida de mercancas Otros/span_Imputacin'))

WebUI.setText(findTestObject('Object Repository/Movimientos salidas/Page_Salida de mercancas Otros/input_C_InputField_1_2'), 
    centro_coste)

WebUI.click(findTestObject('Object Repository/Movimientos salidas/Page_Salida de mercancas Otros/div_Verificar'))

WebUI.click(findTestObject('Object Repository/Movimientos salidas/Page_Salida de mercancas Otros/div_ContabilizarResaltado'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('Object Repository/Movimientos salidas/Page_Salida de mercancas Otros/span_Documento material 4900262241 contabilizado'))

WebUI.takeFullPageScreenshot()

