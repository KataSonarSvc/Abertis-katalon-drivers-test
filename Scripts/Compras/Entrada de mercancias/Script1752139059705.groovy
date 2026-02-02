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

WebUI.click(findTestObject('Object Repository/Entrada mercancias/Page_Pgina de inicio/span_'))

WebUI.setText(findTestObject('Object Repository/Entrada mercancias/Page_Pgina de inicio/input_Pgina de inicio_search'), 
    'nueva recepcion')

WebUI.sendKeys(findTestObject('Object Repository/Entrada mercancias/Page_Pgina de inicio/input_Pgina de inicio_search'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Entrada mercancias/Page_Buscar/div_1234Gestin'))

WebUI.setText(findTestObject('Object Repository/Entrada mercancias/Page_Entrada de Mercancas/input_Desplegar cabecera_com.abertis.mm.zgr_b32e33'), 
    '4500857822')

WebUI.click(findTestObject('Object Repository/Entrada mercancias/Page_Entrada de Mercancas/bdi_Actualizar'))

WebUI.click(findTestObject('Object Repository/Entrada mercancias/Page_Entrada de Mercancas/span_COPEC S.A. (4500857822)'))

WebUI.click(findTestObject('Object Repository/Entrada mercancias/Page_Entrada de Mercancas/span_CLP_com.abertis.mm.zgrdesdeposap.suite_ee88a9'))

WebUI.click(findTestObject('Object Repository/Entrada mercancias/Page_Entrada de Mercancas/bdi_Crear entrada de mercancas'))

WebUI.setText(findTestObject('Object Repository/Entrada mercancias/Page_Entrada de Mercancas/input_Fecha de contabilizacin_com.abertis.m_007905'), 
    '17.12.2024')

WebUI.click(findTestObject('Object Repository/Entrada mercancias/Page_Entrada de Mercancas/input_Nota de entrega_com.abertis.mm.zgrdes_3cc6da'))

WebUI.setText(findTestObject('Object Repository/Entrada mercancias/Page_Entrada de Mercancas/input_Nota de entrega_com.abertis.mm.zgrdes_3cc6da'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Entrada mercancias/Page_Entrada de Mercancas/input_Texto de cabecera_com.abertis.mm.zgrd_2205e4'), 
    'test')

WebUI.click(findTestObject('Object Repository/Entrada mercancias/Page_Entrada de Mercancas/div_Cantidad pendiente de recepcionar'))

WebUI.setText(findTestObject('Object Repository/Entrada mercancias/Page_Entrada de Mercancas/input_Cantidad pendiente de recepcionar___f_eab498'), 
    '25')

WebUI.click(findTestObject('Object Repository/Entrada mercancias/Page_Entrada de Mercancas/div_Cantidad pendiente de recepcionar'))

WebUI.click(findTestObject('Object Repository/Entrada mercancias/Page_Entrada de Mercancas/div_Pos. Ok___field12-__clone176-cBoxBool-CbBg'))

WebUI.doubleClick(findTestObject('Object Repository/Entrada mercancias/Page_Entrada de Mercancas/div_Pos. Ok___field12-__clone176-cBoxBool-CbBg'))

WebUI.doubleClick(findTestObject('Object Repository/Entrada mercancias/Page_Entrada de Mercancas/div_Se ha creado la Entrada de Mercancas 20_b56510'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Entrada mercancias/Page_Entrada de Mercancas/bdi_Cerrar'))

