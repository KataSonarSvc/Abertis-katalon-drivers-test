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

    WebUI.click(findTestObject('Page_Pagina iniziale/div_Ordine rif. Contratto'))

    WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Ordine rif. Contratto/span_Group'), 10, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Page_Ordine rif. Contratto/span_Group'))

    WebUI.click(findTestObject('Object Repository/Page_Ordine rif. Contratto/span_DesplegarFiltro'))

    WebUI.setText(findTestObject('Object Repository/Page_Ordine rif. Contratto/input_Contratto'), Contrato)

    WebUI.click(findTestObject('Object Repository/Page_Ordine rif. Contratto/bdi_Avvio'))

    WebUI.click(findTestObject('Object Repository/Page_Ordine rif. Contratto/chechbox_ItemTable'))

    WebUI.click(findTestObject('Object Repository/Page_Ordine rif. Contratto/bdi_Creare ordine con riferimento'))

    WebUI.click(findTestObject('Object Repository/Page_Purchase Order/div_CheckboxPos'))

    WebUI.click(findTestObject('Object Repository/Page_Purchase Order/bdi_CopiarItemSeleccionado'))

    WebUI.waitForElementVisible(findTestObject('Page_Acquisto Minore/input_Gruppo acquisti'), 70, FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('Page_Acquisto Minore/input_Gruppo acquisti'), GrupoCompra)

    WebUI.sendKeys(findTestObject('Page_Acquisto Minore/input_Gruppo acquisti'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Purchase Order/textarea_ObjetodeCompra'), ObjetoCompra)

    WebUI.setText(findTestObject('Object Repository/Page_Purchase Order/input_Cantidad'), CantidadDemanda)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Purchase Order/input_Cantidad'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Purchase Order/input_Calendario'), FechaEntrega)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Purchase Order/input_Calendario'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Object Repository/Page_Purchase Order/bdi_Mais Dados'))

    WebUI.click(findTestObject('Page_Purchase Order/input_Adresse'))

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/input_BuscadorDireccion'), Direccion)

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/div_ItemDireccion'))

    WebUI.click(findTestObject('Page_Purchase Order/span_CheckVerde'))

    WebUI.click(findTestObject('Object Repository/Page_Purchase Order/bdi_Verificar'))

    WebUI.waitForElementVisible(findTestObject('Page_Solicitud de pedido/bdi_OK_1'), 50, FailureHandling.STOP_ON_FAILURE)

    //WebUI.takeScreenshot('Screenshots/SANEF_PC-ref-cont-Pep.png', FailureHandling.STOP_ON_FAILURE)
	WebUI.takeScreenshot()

    WebUI.click(findTestObject('Page_Solicitud de pedido/bdi_OK_1'))

    WebUI.click(findTestObject('Object Repository/Page_Purchase Order/bdi_Grabar'))

    WebUI.waitForElementVisible(findTestObject('Page_Solicitud de pedido/bdi_OK_1'), 50, FailureHandling.STOP_ON_FAILURE)

    //WebUI.takeScreenshot('Screenshots/SANEF_PC-ref-cont-Pep.png', FailureHandling.STOP_ON_FAILURE)
	WebUI.takeScreenshot()

    WebUI.click(findTestObject('Page_Solicitud de pedido/bdi_OK_1'))

    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)
}
catch (Exception e) {
    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

    e.printStackTrace()

    KeywordUtil.markFailed('Test Failed')
} 

