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

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_Guided Purchasing/bdi_Paso 2'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_Guided Purchasing/input_Selecionar Material'))

    WebUI.setText(findTestObject('Object Repository/Page_Guided Purchasing/input_Selecionar Material'), Material)

    WebUI.delay(5)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Guided Purchasing/input_Selecionar Material'), Keys.chord(Keys.ARROW_DOWN))

    WebUI.sendKeys(findTestObject('Object Repository/Page_Guided Purchasing/input_Selecionar Material'), Keys.chord(Keys.ENTER))

    WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Guided Purchasing/bdi_Etapa 3'), 20, FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('Object Repository/Page_Guided Purchasing/bdi_Etapa 3'))

    WebUI.setText(findTestObject('Object Repository/Page_Guided Purchasing/input_Valor total de compra'), ValorTotal)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Guided Purchasing/input_Valor total de compra'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Guided Purchasing/input_Data'), FechaEntrega)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Guided Purchasing/input_Data'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Object Repository/Page_Guided Purchasing/checkbox_Proyecto'))

    WebUI.click(findTestObject('Object Repository/Page_Guided Purchasing/label_Inversin'))

    WebUI.click(findTestObject('Object Repository/Page_Guided Purchasing/li_Inversin'))

    WebUI.setText(findTestObject('Object Repository/Page_Guided Purchasing/input_ElementoPepProyecto'), ElementoPEP)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Guided Purchasing/input_ElementoPepProyecto'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Guided Purchasing/input_Fornitore'), Proveedor)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Guided Purchasing/input_Fornitore'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Guided Purchasing/textarea_Breve descrio da compra'), Descripcion)

    WebUI.click(findTestObject('Object Repository/Page_Guided Purchasing/bdi_Proceder con la compra'))

    WebUI.click(findTestObject('Object Repository/Page_Guided Purchasing/bdi_OK_popup'))

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/input_TextoBreveMX'), TextoBreve)

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_Ms Datos'))

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/input_BudgetAllocato'), PrespAsignado)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Solicitud de pedido/input_BudgetAllocato'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/span_Check'))

    WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_Verificar'), 5, FailureHandling.OPTIONAL)

    WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_Verificar'), 5, FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_Verificar'))

    WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_OK_1'), 10, FailureHandling.OPTIONAL)

    WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_OK_1'), 10, FailureHandling.OPTIONAL)

    //WebUI.takeScreenshot('Screenshots/MX_COMPRAGUIADA_SP-ASMI.png', FailureHandling.STOP_ON_FAILURE)
    WebUI.takeScreenshot()

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_OK_1'))

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_Salvar'))

    WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_OK_1'), 10, FailureHandling.OPTIONAL)

    WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_OK_1'), 10, FailureHandling.OPTIONAL)

    //WebUI.takeScreenshot('Screenshots/MX_COMPRAGUIADA_SP-ASMI.png', FailureHandling.STOP_ON_FAILURE)
    WebUI.takeScreenshot()

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_OK_1'))

    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)
}
catch (Exception e) {
    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

    e.printStackTrace()

    KeywordUtil.markFailed('Test Failed')
} 

