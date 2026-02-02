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

    WebUI.click(findTestObject('Object Repository/Page_Pagina iniziale/div_Acquisti'))

    WebUI.click(findTestObject('Object Repository/Page_Pagina iniziale/div_Ordine rif. Contratto'))

    WebUI.click(findTestObject('Object Repository/Page_Ordine rif. Contratto/span_Group'))

    WebUI.click(findTestObject('Object Repository/Page_Ordine rif. Contratto/span_DesplegarFiltro'))

    WebUI.setText(findTestObject('Object Repository/Page_Ordine rif. Contratto/input_Contratto'), Contrato)

    WebUI.click(findTestObject('Object Repository/Page_Ordine rif. Contratto/bdi_Avvio'))

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

    WebUI.setText(findTestObject('Object Repository/Page_Purchase Order/input_Data_1'), FechaEntrega)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Purchase Order/input_Data_1'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Purchase Order/input_Data_2'), FechaEntrega2)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Purchase Order/input_Data_2'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Purchase Order/input_Data_3'), FechaEntrega3)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Purchase Order/input_Data_3'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Object Repository/Page_Purchase Order/checkbox_Posicion1'))

    WebUI.click(findTestObject('Object Repository/Page_Purchase Order/bdi_Informazioni aggiuntive'))

    WebUI.setText(findTestObject('Object Repository/Page_Purchase Order/input_PrespAsignado'), '1')

    WebUI.sendKeys(findTestObject('Object Repository/Page_Purchase Order/input_PrespAsignado'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Object Repository/Page_Purchase Order/span_CheckVerde'))

    WebUI.click(findTestObject('Object Repository/Page_Purchase Order/checkbox_Posicion2'))

    WebUI.click(findTestObject('Object Repository/Page_Purchase Order/bdi_Informazioni aggiuntive'))

    WebUI.setText(findTestObject('Object Repository/Page_Purchase Order/input_PrespAsignado'), '1')

    WebUI.sendKeys(findTestObject('Object Repository/Page_Purchase Order/input_PrespAsignado'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Object Repository/Page_Purchase Order/span_CheckVerde'))

    WebUI.click(findTestObject('Object Repository/Page_Purchase Order/checkbox_Posicion3'))

    WebUI.click(findTestObject('Object Repository/Page_Purchase Order/bdi_Informazioni aggiuntive'))

    WebUI.setText(findTestObject('Object Repository/Page_Purchase Order/input_PrespAsignado'), '1')

    WebUI.sendKeys(findTestObject('Object Repository/Page_Purchase Order/input_PrespAsignado'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Object Repository/Page_Purchase Order/span_CheckVerde'))

    WebUI.click(findTestObject('Page_Purchase Order/bdi_Verificar'))

    //WebUI.takeScreenshot('Screenshots/IT_PC-ref-contrato.png', FailureHandling.STOP_ON_FAILURE)
	WebUI.takeScreenshot()

    WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_OK_1'), 10, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_OK_1'))

    WebUI.click(findTestObject('Object Repository/Page_Purchase Order/bdi_Savare'))

    WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_OK_1'), 10, FailureHandling.STOP_ON_FAILURE)

    //WebUI.takeScreenshot('Screenshots/IT_PC-ref-contrato.png', FailureHandling.STOP_ON_FAILURE)
	WebUI.takeScreenshot()

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_OK_1'))

    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)
}
catch (Exception e) {
    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

    e.printStackTrace()

    KeywordUtil.markFailed('Test Failed')
} 

