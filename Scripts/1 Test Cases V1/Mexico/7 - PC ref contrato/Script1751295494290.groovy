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

// Scroll into view and then move up by offsetY pixels
try {
    WebUI.callTestCase(findTestCase('Acceso/Login'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Page_Pagina inicial/div_Compras'))

    WebUI.click(findTestObject('Object Repository/Page_Pagina inicial/div_Pedidos Ref.Contratos'))

    WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Ordine rif. Contratto/span_Group'), 10, FailureHandling.OPTIONAL)

    WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Ordine rif. Contratto/span_Group'), 10, FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('Object Repository/Page_Ordine rif. Contratto/span_Group'))

    WebUI.click(findTestObject('Object Repository/Page_Ordine rif. Contratto/span_DesplegarFiltro'))

    WebUI.setText(findTestObject('Object Repository/Page_Ordine rif. Contratto/input_Contratto'), Contrato)

    WebUI.click(findTestObject('Object Repository/Page_Ordine rif. Contratto/bdi_Avvio'))

    WebUI.delay(10)

    CustomKeywords.'com.utils.ScrollUtils.scrollElementToPosition'(findTestObject('Page_Ordine rif. Contratto/div_ScrollableContainer'), 
        0)

    WebUI.click(findTestObject('Object Repository/Page_Ordine rif. Contratto/chechbox_ItemTable'))

    WebUI.click(findTestObject('Object Repository/Page_Ordine rif. Contratto/bdi_Creare ordine con riferimento'))

    WebUI.click(findTestObject('Object Repository/Page_Purchase Order/div_CheckboxPos'))

    WebUI.click(findTestObject('Object Repository/Page_Purchase Order/bdi_Copiare posizioni selezionate'))

    WebUI.setText(findTestObject('Object Repository/Page_Purchase Order/input_Quantita_1'), CantidadDemanda)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Purchase Order/input_Quantita_1'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Purchase Order/input_Quantita_2'), CantidadDemanda2)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Purchase Order/input_Quantita_2'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Purchase Order/input_Quantita_3'), CantidadDemanda3)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Purchase Order/input_Quantita_3'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Purchase Order/input_Data_1'), FechaEntrega1)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Purchase Order/input_Data_1'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Purchase Order/input_Data_2'), FechaEntrega2)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Purchase Order/input_Data_2'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Purchase Order/input_Data_3'), FechaEntrega3)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Purchase Order/input_Data_3'), Keys.chord(Keys.ENTER))

    WebUI.clickOffset(findTestObject('Object Repository/Page_Purchase Order/bdi_Controllare'), 0, -10)

    WebUI.waitForElementVisible(findTestObject('Page_Solicitud de pedido/bdi_OK'), 10, FailureHandling.OPTIONAL)

    WebUI.waitForElementClickable(findTestObject('Page_Solicitud de pedido/bdi_OK'), 10, FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('Page_Solicitud de pedido/bdi_OK'))

    WebUI.waitForElementVisible(findTestObject('Page_Purchase Order/bdi_Savare'), 10, FailureHandling.OPTIONAL)

    WebUI.waitForElementClickable(findTestObject('Page_Purchase Order/bdi_Savare'), 10, FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('Object Repository/Page_Purchase Order/bdi_Savare'))

    WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_OK_1'), 10, FailureHandling.OPTIONAL)

    WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_OK_1'), 10, FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_OK_1'))

    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)
}
catch (Exception e) {
    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

    e.printStackTrace()

    KeywordUtil.markFailed('Test Failed')
} 

