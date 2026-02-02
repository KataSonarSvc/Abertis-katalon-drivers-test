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

CustomKeywords.'com.url_utilidades.urlutilidades.openApplicationUrl'('https://saps4-pre.abertis.com/sap/bc/ui2/flp?saml2=disabled&sap-client=100#zgrdesdepo-display&/?sap-iapp-state--history=TAS8VOYP1L89JA1OHGCO31YSMJIVTVIXFUVVEUC6X&sap-iapp-state=TASKPBAJ0DI39EKHALW0V03AXQOJ8NWNL8VZDOJSK')

WebUI.setText(findTestObject('Object Repository/Aplicacion- Compra Nueva Recepcion/Page_Entrada de Mercancas/input_Desplegar cabecera_com.abertis.mm.zgr_b32e33'), 
    referencia)

WebUI.click(findTestObject('Object Repository/Aplicacion- Compra Nueva Recepcion/Page_Entrada de Mercancas/span_Actualizar'))

WebUI.click(findTestObject('Object Repository/Aplicacion- Compra Nueva Recepcion/Page_Entrada de Mercancas/span_COPEC S.A. (4500857822)'))

WebUI.click(findTestObject('Object Repository/Aplicacion- Compra Nueva Recepcion/Page_Entrada de Mercancas/span_CLP_com.abertis.mm.zgrdesdeposap.suite_ee88a9'))

WebUI.click(findTestObject('Object Repository/Aplicacion- Compra Nueva Recepcion/Page_Entrada de Mercancas/bdi_Crear entrada de mercancas'))

WebUI.click(findTestObject('Object Repository/Aplicacion- Compra Nueva Recepcion/Page_Entrada de Mercancas/input_Fecha de contabilizacin_com.abertis.m_007905'))

WebUI.click(findTestObject('Object Repository/Aplicacion- Compra Nueva Recepcion/Page_Entrada de Mercancas/div_Fecha de contabilizacinNota de entregaT_b7d589'))

WebUI.setText(findTestObject('Object Repository/Aplicacion- Compra Nueva Recepcion/Page_Entrada de Mercancas/input_Fecha de contabilizacin_com.abertis.m_007905'), 
    fecha_contabilizacion)

WebUI.setText(findTestObject('Object Repository/Aplicacion- Compra Nueva Recepcion/Page_Entrada de Mercancas/input_Texto de cabecera_com.abertis.mm.zgrd_2205e4'), 
    texto_de_cabecera)

WebUI.setText(findTestObject('Object Repository/Aplicacion- Compra Nueva Recepcion/Page_Entrada de Mercancas/input_Nota de entrega_com.abertis.mm.zgrdes_3cc6da'), 
    nota_de_entrega)

WebUI.click(findTestObject('Object Repository/Aplicacion- Compra Nueva Recepcion/Page_Entrada de Mercancas/div_Cantidad recepcionada25,000'))

WebUI.setText(findTestObject('Object Repository/Aplicacion- Compra Nueva Recepcion/Page_Entrada de Mercancas/input_Cantidad pendiente de recepcionar___f_f54315'), 
    cantidad_pendiente)

WebUI.sendKeys(findTestObject('Object Repository/Aplicacion- Compra Nueva Recepcion/Page_Entrada de Mercancas/input_Cantidad pendiente de recepcionar___f_f54315'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Aplicacion- Compra Nueva Recepcion/Page_Entrada de Mercancas/div_Pos. Ok___field12-__clone196-cBoxBool-CbBg'))

WebUI.click(findTestObject('Object Repository/Aplicacion- Compra Nueva Recepcion/Page_Entrada de Mercancas/bdi_Guardar'))

WebUI.delay(10)

WebUI.verifyElementVisible(findTestObject('Object Repository/Aplicacion- Compra Nueva Recepcion/Page_Entrada de Mercancas/div_Se ha creado la Entrada de Mercancas 20_f1998f'))

WebUI.takeFullPageScreenshot()

