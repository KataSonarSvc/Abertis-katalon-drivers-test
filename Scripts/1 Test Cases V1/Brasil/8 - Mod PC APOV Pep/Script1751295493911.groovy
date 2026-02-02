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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

try {
    WebUI.callTestCase(findTestCase('Acceso/Login'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Page_Pagina inicial/div_Lista de Pedidos'))

    WebUI.click(findTestObject('Object Repository/Page_Pedidos Referentes ao Contrato/btn_Group'))

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/btn_defaultVariant'))

    WebUI.setText(findTestObject('Object Repository/Page_Requisio de Compras/input_DocumentoCompra'), Documento)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Requisio de Compras/input_DocumentoCompra'), Keys.chord(Keys.ENTER))

    WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Requisio de Compras/bdi_Iniciar'), 20, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Page_Requisio de Compras/bdi_Iniciar'))

    WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Lista de Pedidos/link_ItemTabla'), 20, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Page_Lista de Pedidos/link_ItemTabla'))

    WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Lista de Pedidos/bdi_Editar'), 30, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Page_Lista de Pedidos/bdi_Editar'))

    WebUI.waitForElementClickable(findTestObject('Page_Lista de Pedidos/textarea_ObjetodeCompra'), 30, FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('Page_Lista de Pedidos/textarea_ObjetodeCompra'), ObjetoCompra)

    WebUI.setText(findTestObject('Object Repository/Page_Lista de Pedidos/textarea_ProveeInvitados'), ProveedorInvt)

    WebUI.setText(findTestObject('Object Repository/Page_Purchase Order/input_Recebedor'), Receptor)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Purchase Order/input_Recebedor'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Requisio de Compras/input_QtdSolicitadaEdit'), CantidadDemanda)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Requisio de Compras/input_QtdSolicitadaEdit'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Lista de Pedidos/input_CalendarioEdit'), FechaEntrega)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Lista de Pedidos/input_CalendarioEdit'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Object Repository/Page_Lista de Pedidos/bdi_Verificar'))

    WebUI.waitForElementVisible(findTestObject('Page_Solicitud de pedido/bdi_OK_1'), 20, FailureHandling.STOP_ON_FAILURE)

    //WebUI.takeScreenshot('Screenshots/Arteris_SP-ASPI-CeCo.png', FailureHandling.STOP_ON_FAILURE)
	WebUI.takeScreenshot()

    WebUI.click(findTestObject('Page_Solicitud de pedido/bdi_OK_1'))

    WebUI.click(findTestObject('Object Repository/Page_Purchase Order/bdi_Grabar'))

    WebUI.click(findTestObject('Page_Solicitud de pedido/bdi_OK_1'))

    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)
}
catch (Exception e) {
    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

    e.printStackTrace()

    KeywordUtil.markFailed('Test Failed')
} 

