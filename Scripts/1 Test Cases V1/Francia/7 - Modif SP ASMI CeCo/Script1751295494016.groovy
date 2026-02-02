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

    WebUI.click(findTestObject('Object Repository/Page_Pagina inicial/div_Compras Menores'))

    WebUI.click(findTestObject('Object Repository/Page_Ordine rif. Contratto/span_Group'))

    WebUI.click(findTestObject('Object Repository/Page_Ordine rif. Contratto/span_DesplegarFiltro'))

    WebUI.setText(findTestObject('Object Repository/Page_Compras Menores/input_Solicitud de pedido'), Pedido)

    WebUI.click(findTestObject('Object Repository/Page_Compras Menores/bdi_Ir'))

    WebUI.click(findTestObject('Object Repository/Page_Compras Menores/a_200049227610'))

    WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_Editar'), 20, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_Editar'))

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/input_Ricevitore'), Receptor)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Solicitud de pedido/input_Ricevitore'), Keys.chord(Keys.ARROW_DOWN))

    WebUI.sendKeys(findTestObject('Object Repository/Page_Solicitud de pedido/input_Ricevitore'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Acquisto Minore/input_Gruppo acquisti'), GrupoCompra)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Acquisto Minore/input_Gruppo acquisti'), Keys.chord(Keys.ARROW_DOWN))

    WebUI.sendKeys(findTestObject('Object Repository/Page_Acquisto Minore/input_Gruppo acquisti'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/textarea_test'), TextoBreve)

    WebUI.setText(findTestObject('Object Repository/Page_Acquisto Minore/input_testoBreve'), TextoBreve)

    WebUI.setText(findTestObject('Object Repository/Page_Acquisto Minore/input_QtdRichiesta'), CantidadDemanda)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Acquisto Minore/input_QtdRichiesta'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/input_PrecioValoracion'), Valoracion)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Solicitud de pedido/input_PrecioValoracion'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/input_Fecha'), FechaEntrega)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Solicitud de pedido/input_Fecha'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_Verificar'))

    WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_OK_1'), 30, FailureHandling.STOP_ON_FAILURE)

    //WebUI.takeScreenshot('Screenshots/SANEF_SP-ASMI-CeCo.png', FailureHandling.STOP_ON_FAILURE)
	WebUI.takeScreenshot()

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_OK_1'))

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_Grabar'))

    WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_OK_1'), 30, FailureHandling.STOP_ON_FAILURE)

    //WebUI.takeScreenshot('Screenshots/SANEF_SP-ASMI-CeCo.png', FailureHandling.STOP_ON_FAILURE)
	WebUI.takeScreenshot()

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_OK_1'))

    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)
}
catch (Exception e) {
    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

    e.printStackTrace()

    KeywordUtil.markFailed('Test Failed')
} 

