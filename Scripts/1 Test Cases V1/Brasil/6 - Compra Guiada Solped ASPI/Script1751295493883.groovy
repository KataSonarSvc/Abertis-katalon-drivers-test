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

    WebUI.click(findTestObject('Object Repository/Page_Pagina inicial/div_Compras'))

    WebUI.click(findTestObject('Object Repository/Page_Pagina inicial/div_Compra Guiada'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_Guided Purchasing/bdi_Etapa 2'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_Guided Purchasing/input_Material'))

    WebUI.setText(findTestObject('Object Repository/Page_Guided Purchasing/input_Material'), Material, FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(10)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Guided Purchasing/input_Material'), Keys.chord(Keys.ARROW_DOWN))

    WebUI.sendKeys(findTestObject('Object Repository/Page_Guided Purchasing/input_Material'), Keys.chord(Keys.ENTER))

    WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Guided Purchasing/bdi_Etapa 3'), 20, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Page_Guided Purchasing/bdi_Etapa 3'))

    WebUI.setText(findTestObject('Object Repository/Page_Guided Purchasing/input_Valor total de compra'), ValorTotal)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Guided Purchasing/input_Valor total de compra'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Guided Purchasing/span_Calendario'), FechaEntrega)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Guided Purchasing/span_Calendario'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Page_Guided Purchasing/checkbox_CentroCosto'))

    WebUI.setText(findTestObject('Object Repository/Page_Guided Purchasing/input_Centro de costo'), CentroCoste)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Guided Purchasing/input_Centro de costo'), Keys.chord(Keys.ARROW_DOWN))

    WebUI.sendKeys(findTestObject('Object Repository/Page_Guided Purchasing/input_Centro de costo'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Guided Purchasing/textarea_Breve descrio da compra'), textoBreve)

    WebUI.setText(findTestObject('Object Repository/Page_Guided Purchasing/textarea_Fornecedores Indicados'), ProveedorInvt)

    WebUI.click(findTestObject('Object Repository/Page_Guided Purchasing/bdi_Seguir com a compra'))

    WebUI.click(findTestObject('Object Repository/Page_Guided Purchasing/bdi_OK_popup'))

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_Mais dados'))

    WebUI.setText(findTestObject('Page_Guided Purchasing/input_orcamentoAtribuido'), PrespAsignado)

    WebUI.sendKeys(findTestObject('Page_Guided Purchasing/input_orcamentoAtribuido'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/span_Check'))

    WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_Verificar'), 20, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_Verificar'))

    WebUI.waitForElementVisible(findTestObject('Page_Solicitud de pedido/bdi_OK_1'), 20, FailureHandling.STOP_ON_FAILURE)

    //WebUI.takeScreenshot('Screenshots/Arteris_Compra Guiada-SP-ASPI.png', FailureHandling.STOP_ON_FAILURE)
	WebUI.takeScreenshot()

    WebUI.click(findTestObject('Page_Solicitud de pedido/bdi_OK_1'))

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_Salvar'))

    WebUI.waitForElementVisible(findTestObject('Page_Solicitud de pedido/bdi_OK_1'), 20, FailureHandling.STOP_ON_FAILURE)

    //WebUI.takeScreenshot('Screenshots/Arteris_Compra Guiada-SP-ASPI.png', FailureHandling.STOP_ON_FAILURE)
	WebUI.takeScreenshot()

    WebUI.click(findTestObject('Page_Solicitud de pedido/bdi_OK_1'))

    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)
}
catch (Exception e) {
    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

    e.printStackTrace()

    KeywordUtil.markFailed('Test Failed')
} 

