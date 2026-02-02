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

    WebUI.click(findTestObject('Object Repository/Page_Pagina inicial/div_Recepciones  Verificaciones'))

    WebUI.click(findTestObject('Object Repository/Page_Pagina inicial/div_Nueva recepcion'))

    WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Entrada de Mercancias/span_Grupo'), 10, FailureHandling.OPTIONAL)

    WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Entrada de Mercancias/span_Grupo'), 10, FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('Object Repository/Page_Entrada de Mercancias/span_Grupo'))

    WebUI.click(findTestObject('Object Repository/Page_Entrada de Mercancias/span_DesplegarFiltro'))

    WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Entrada de Mercancias/input_BuscadorCompra'), 10, 
        FailureHandling.OPTIONAL)

    WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Entrada de Mercancias/input_BuscadorCompra'), 10, 
        FailureHandling.OPTIONAL)

    WebUI.setText(findTestObject('Object Repository/Page_Entrada de Mercancias/input_BuscadorCompra'), Pedido)

    WebUI.click(findTestObject('Object Repository/Page_Entrada de Mercancias/div_SoloExpirados'))

    WebUI.click(findTestObject('Object Repository/Page_Entrada de Mercancias/bdi_Actualizar'))

    WebUI.click(findTestObject('Object Repository/Page_Entrada de Mercancias/td_ItemTabla'))

    try {
        // Not mandatory since it only appears on small screens
        WebUI.click(findTestObject('Page_Entrada de Mercancias/button_Details'))
    }
    catch (Exception e) {
    } 
    
    WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Entrada de Mercancias/bdi_Crear entrada de mercancas'), 
        30, FailureHandling.OPTIONAL)

    WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Entrada de Mercancias/bdi_Crear entrada de mercancas'), 
        30, FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('Object Repository/Page_Entrada de Mercancias/bdi_Crear entrada de mercancas'))

    WebUI.click(findTestObject('Page_Entrada de Mercancias/button_Fullscreen'))

    WebUI.setText(findTestObject('Object Repository/Page_Entrada de Mercancias/input_Texto de cabecera'), TextoBreve)

    WebUI.setText(findTestObject('Object Repository/Page_Entrada de Mercancias/input_Fecha de contabilizacion'), FechaEntrega)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Entrada de Mercancias/input_Fecha de contabilizacion'), Keys.chord(
            Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Entrada de Mercancias/input_CantidadPendiente'), CantidadDemanda)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Entrada de Mercancias/input_CantidadPendiente'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Object Repository/Page_Entrada de Mercancias/bdi_Guardar'))

    WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Entrada de Mercancias/bdi_Cerrar'), 10, FailureHandling.OPTIONAL)

    WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Entrada de Mercancias/bdi_Cerrar'), 10, FailureHandling.OPTIONAL)

    //WebUI.takeScreenshot('Screenshots/MX_Recep-Materiales.png', FailureHandling.STOP_ON_FAILURE)
    WebUI.takeScreenshot()

    WebUI.click(findTestObject('Object Repository/Page_Entrada de Mercancias/bdi_Cerrar'))

    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)
}
catch (Exception e) {
    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

    e.printStackTrace()

    KeywordUtil.markFailed('Test Failed')
} 

