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

    WebUI.click(findTestObject('Object Repository/Page_Pagina inicial/span_Pedidos Referentes ao Contrato'))

    WebUI.click(findTestObject('Object Repository/Page_Pedidos Referentes ao Contrato/btn_Group'))

    WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Pedidos Referentes ao Contrato/check_ItemTabla'), 
        20, FailureHandling.STOP_ON_FAILURE)

    WebUI.scrollToElement(findTestObject('Object Repository/Page_Pedidos Referentes ao Contrato/input_Contrato'), 20, FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('Object Repository/Page_Pedidos Referentes ao Contrato/input_Contrato'), Contrato)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Pedidos Referentes ao Contrato/input_Contrato'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Object Repository/Page_Pedidos Referentes ao Contrato/bdi_Iniciar'))

    WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Pedidos Referentes ao Contrato/check_ItemTabla'), 
        20, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Page_Pedidos Referentes ao Contrato/check_ItemTabla'))

    WebUI.click(findTestObject('Object Repository/Page_Pedidos Referentes ao Contrato/bdi_Criar pedido com referncia'))

    WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Purchase Order/div_CheckboxPos'), 20, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Page_Purchase Order/div_CheckboxPos'))

    WebUI.click(findTestObject('Object Repository/Page_Purchase Order/bdi_CopiarItemSeleccionado'))

    WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Purchase Order/textarea_ObjetodeCompra'), 50, FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('Object Repository/Page_Purchase Order/textarea_ObjetodeCompra'), ObjetoCompra)

    WebUI.setText(findTestObject('Object Repository/Page_Purchase Order/input_Cantidad'), CantidadDemanda)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Purchase Order/input_Cantidad'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Purchase Order/input_Calendario'), FechaEntrega)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Purchase Order/input_Calendario'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Object Repository/Page_Purchase Order/bdi_Mais Dados'))

    WebUI.setText(findTestObject('Object Repository/Page_Purchase Order/input_PrespAsignado'), PrespAsignado)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Purchase Order/input_PrespAsignado'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Object Repository/Page_Purchase Order/input_CodDeImpuesto'))

    WebUI.click(findTestObject('Object Repository/Page_Purchase Order/div_ItemTablaCodigoImpuesto'))

    WebUI.click(findTestObject('Object Repository/Page_Purchase Order/span_CheckVerde'))
	
	WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Purchase Order/bdi_Verificar'), 20, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Page_Purchase Order/bdi_Verificar'))

    WebUI.waitForElementVisible(findTestObject('Page_Solicitud de pedido/bdi_OK_1'), 70, FailureHandling.STOP_ON_FAILURE)

    //WebUI.takeScreenshot('Screenshots/Arteris_PC-ref-cont-CeCo.png', FailureHandling.STOP_ON_FAILURE)
	WebUI.takeScreenshot()

    WebUI.click(findTestObject('Page_Solicitud de pedido/bdi_OK_1'))

    WebUI.click(findTestObject('Object Repository/Page_Purchase Order/bdi_Grabar'))

    WebUI.waitForElementVisible(findTestObject('Page_Solicitud de pedido/bdi_OK_1'), 70, FailureHandling.STOP_ON_FAILURE)

    //WebUI.takeScreenshot('Screenshots/Arteris_PC-ref-cont-CeCo.png', FailureHandling.STOP_ON_FAILURE)
	WebUI.takeScreenshot()

    WebUI.click(findTestObject('Page_Solicitud de pedido/bdi_OK_1'))

    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)
}
catch (Exception e) {
    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

    e.printStackTrace()

    KeywordUtil.markFailed('Test Failed')
} 

