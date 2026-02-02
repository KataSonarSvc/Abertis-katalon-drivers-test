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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

try {
    WebUI.callTestCase(findTestCase('Acceso/Login'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Page_Pagina inicial/div_Compras'))

    WebUI.click(findTestObject('Page_Pagina inicial/div_Lista de Pedidos_MX'))

    WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Entrada de Mercancias/span_Grupo'), 10, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Page_Entrada de Mercancias/span_Grupo'))

    WebUI.click(findTestObject('Object Repository/Page_Entrada de Mercancias/span_DesplegarFiltro'))

    WebUI.setText(findTestObject('Object Repository/Page_Requisio de Compras/input_DocumentoCompra'), Pedido)

    WebUI.click(findTestObject('Page_Ordine rif. Contratto/bdi_Avvio'))

    WebUI.click(findTestObject('Object Repository/Page_Lista de pedidos/link_ItemTabla'))

    WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Purchase Order/bdi_Editar'), 20, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Page_Purchase Order/bdi_Editar'))

    WebUI.setText(findTestObject('Object Repository/Page_Purchase Order/input_Ricevitore'), Receptor)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Purchase Order/input_Ricevitore'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Page_Lista de Pedidos/textarea_ObjetodeCompra'), ObjetoCompra)

    WebUI.setText(findTestObject('Object Repository/Page_Purchase Order/textarea_Commenti al fornitore'), Descripcion)

    WebUI.setText(findTestObject('Object Repository/Page_Requisio de Compras/input_QtdSolicitadaEdit'), CantidadDemanda)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Requisio de Compras/input_QtdSolicitadaEdit'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/input_Fecha'), FechaEntrega)

    WebUI.click(findTestObject('Object Repository/Page_Purchase Order/bdi_Verificar'))

    WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_OK_1'), 30, FailureHandling.STOP_ON_FAILURE)

    //WebUI.takeScreenshot('Screenshots/MX_Modif-PC-APOF-CeCo.png', FailureHandling.STOP_ON_FAILURE)
	WebUI.takeScreenshot()

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_OK_1'))

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_Grabar'))

    WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_OK_1'), 30, FailureHandling.STOP_ON_FAILURE)

    //WebUI.takeScreenshot('Screenshots/MX_Modif-PC-APOF-CeCo.png', FailureHandling.STOP_ON_FAILURE)
	WebUI.takeScreenshot()

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_OK_1'))

    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)
}
catch (Exception e) {
    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

    e.printStackTrace()

    KeywordUtil.markFailed('Test Failed')
} 

