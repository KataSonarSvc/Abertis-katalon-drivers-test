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

WebUI.click(findTestObject('Object Repository/Compra licitada/Page_Pgina de inicio/div_Gestin operativaCompras operativas'))

WebUI.click(findTestObject('Page_Pagina inicial/div_Lista de Pedidos NEW (1)'))

WebUI.click(findTestObject('Object Repository/Page_Lista de Pedidos/span_Grupo'))

WebUI.click(findTestObject('Object Repository/Page_Lista de Pedidos/span_Ir'))

WebUI.click(findTestObject('Object Repository/Page_Lista de Pedidos/button_Listado'))

WebUI.click(findTestObject('Object Repository/Page_Lista de Pedidos/enlace pedido lista'))

WebUI.click(findTestObject('Object Repository/Page_Lista de Pedidos/Page_Pedido/Tab_Button_Posiciones'))

WebUI.click(findTestObject('Object Repository/Page_Lista de Pedidos/Page_Pedido/Tab_Button_Estrategia Liberacin'))

WebUI.click(findTestObject('Object Repository/Page_Lista de Pedidos/Page_Pedido/Tab_Button_Historial Documentos'))

WebUI.click(findTestObject('Object Repository/Page_Lista de Pedidos/Page_Pedido/Button_Flecha_Atras'))

WebUI.closeBrowser()

