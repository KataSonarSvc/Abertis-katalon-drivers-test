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

    WebUI.click(findTestObject('Object Repository/Page_Pagina inicial/div_Compra Guiada'))

    WebUI.click(findTestObject('Object Repository/Page_Guided Purchasing/bdi_tape 2'))

    WebUI.delay(10)

    WebUI.click(findTestObject('Object Repository/Page_Guided Purchasing/input_Material'))

    WebUI.setText(findTestObject('Object Repository/Page_Guided Purchasing/input_Material'), Material)

    WebUI.delay(10)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Guided Purchasing/input_Material'), Keys.chord(Keys.ARROW_DOWN))

    WebUI.sendKeys(findTestObject('Object Repository/Page_Guided Purchasing/input_Material'), Keys.chord(Keys.ENTER))

    WebUI.delay(10)

    WebUI.setText(findTestObject('Object Repository/Page_Guided Purchasing/input_BuscadorContrats Disponibles'), Contrato)

    WebUI.click(findTestObject('Object Repository/Page_Guided Purchasing/checkbox_ContratoDisponible'))

    WebUI.click(findTestObject('Page_Guided Purchasing/bdi_seguirConCompra'))

    WebUI.click(findTestObject('Object Repository/Page_Guided Purchasing/bdi_OK_popup'))

    WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Purchase Order/div_ItemCompra'), 10, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Page_Purchase Order/div_ItemCompra'))

    WebUI.click(findTestObject('Object Repository/Page_Purchase Order/bdi_Copier donnes slectionnes'))

    WebUI.setText(findTestObject('Object Repository/Page_Acquisto Minore/input_Gruppo acquisti'), GrupoCompra)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Acquisto Minore/input_Gruppo acquisti'), Keys.chord(Keys.ARROW_DOWN))

    WebUI.sendKeys(findTestObject('Object Repository/Page_Acquisto Minore/input_Gruppo acquisti'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Purchase Order/textarea_ObjetodeCompra'), ObjetoCompra)

    WebUI.setText(findTestObject('Object Repository/Page_Purchase Order/input_FechaEntrega'), FechaEntrega)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Purchase Order/input_FechaEntrega'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Purchase Order/input_Division'), Division)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Purchase Order/input_Division'), Keys.chord(Keys.ARROW_DOWN))

    WebUI.sendKeys(findTestObject('Object Repository/Page_Purchase Order/input_Division'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Purchase Order/input_Quantita'), CantidadDemanda)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Purchase Order/input_Quantita'), Keys.chord(Keys.ARROW_DOWN))

    WebUI.sendKeys(findTestObject('Object Repository/Page_Purchase Order/input_Quantita'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Purchase Order/input_Imputacion'), Impuesto)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Purchase Order/input_Imputacion'), Keys.chord(Keys.ARROW_DOWN))

    WebUI.sendKeys(findTestObject('Object Repository/Page_Purchase Order/input_Imputacion'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Purchase Order/input_CentroCoste'), CentroCoste)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Purchase Order/input_CentroCoste'), Keys.chord(Keys.ARROW_DOWN))

    WebUI.sendKeys(findTestObject('Object Repository/Page_Purchase Order/input_CentroCoste'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Purchase Order/input_ElementOTP2'), ElementoOTP2)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Purchase Order/input_ElementOTP2'), Keys.chord(Keys.ARROW_DOWN))

    WebUI.sendKeys(findTestObject('Object Repository/Page_Purchase Order/input_ElementOTP2'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Object Repository/Page_Purchase Order/bdi_Donnes supplmentaires'))

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/input_Localisation'), Localizacion)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Solicitud de pedido/input_Localisation'), Keys.chord(Keys.ARROW_DOWN))

    WebUI.sendKeys(findTestObject('Object Repository/Page_Solicitud de pedido/input_Localisation'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/input_Actividad'), Actividad)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Solicitud de pedido/input_Actividad'), Keys.chord(Keys.ARROW_DOWN))

    WebUI.sendKeys(findTestObject('Object Repository/Page_Solicitud de pedido/input_Actividad'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Object Repository/Page_Purchase Order/input_Adresse'))

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/input_BuscadorDireccion'), Direccion)

    WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Solicitud de pedido/div_ItemDireccion'), 10, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/div_ItemDireccion'))

    WebUI.click(findTestObject('Object Repository/Page_Purchase Order/span_CheckVerde'))

    WebUI.click(findTestObject('Object Repository/Page_Purchase Order/bdi_Verificar'))

    WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_OK_1'), 30, FailureHandling.STOP_ON_FAILURE)

    //WebUI.takeScreenshot('Screenshots/SANEF_COMPRAGUIADA-PC-APOE.png', FailureHandling.STOP_ON_FAILURE)
	WebUI.takeScreenshot()

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_OK_1'))

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_Grabar'))

    WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_OK_1'), 30, FailureHandling.STOP_ON_FAILURE)

    //WebUI.takeScreenshot('Screenshots/SANEF_COMPRAGUIADA-PC-APOE.png', FailureHandling.STOP_ON_FAILURE)
	WebUI.takeScreenshot()

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_OK_1'))

    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)
}
catch (Exception e) {
    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

    e.printStackTrace()

    KeywordUtil.markFailed('Test Failed')
} 

