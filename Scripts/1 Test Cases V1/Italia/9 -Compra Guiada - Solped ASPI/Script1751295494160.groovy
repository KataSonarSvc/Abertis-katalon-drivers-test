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

    WebUI.click(findTestObject('Object Repository/Page_Pagina iniziale/div_Acquisto Guidato'))

    WebUI.click(findTestObject('Object Repository/Page_Guided Purchasing/bdi_Etapa 2'))

    WebUI.setText(findTestObject('Object Repository/Page_Guided Purchasing/input_Selecionar Material'), Material)

    WebUI.click(findTestObject('Object Repository/Page_Guided Purchasing/btn_selccMaterial'))

    WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Guided Purchasing/bdi_Etapa 3'), 20, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Page_Guided Purchasing/bdi_Etapa 3'))

    WebUI.setText(findTestObject('Object Repository/Page_Guided Purchasing/input_Valor total de compra'), ValorTotal)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Guided Purchasing/input_Valor total de compra'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Guided Purchasing/span_Calendario'), FechaEntrega)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Guided Purchasing/span_Calendario'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Guided Purchasing/input_Centro di costo'), CentroCoste)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Guided Purchasing/input_Centro di costo'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Guided Purchasing/input_Fornitore'), Proveedor)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Guided Purchasing/input_Fornitore'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Guided Purchasing/textarea_Breve descrio da compra'), ObjetoCompra)

    WebUI.click(findTestObject('Object Repository/Page_Guided Purchasing/bdi_Procedere allacquisto'))

    WebUI.click(findTestObject('Object Repository/Page_Guided Purchasing/bdi_OK_popup'))

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/input_testoBreve'), TextoBreve)

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_Mais dados'))

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/input_BudgetAllocato'), PrespAsignado)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Solicitud de pedido/input_BudgetAllocato'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Object Repository/Page_Guided Purchasing/span_Check'))

    WebUI.click(findTestObject('Object Repository/Page_Guided Purchasing/btn_Controllare'))

    WebUI.waitForElementClickable(findTestObject('Page_Solicitud de pedido/bdi_OK_1'), 20, FailureHandling.STOP_ON_FAILURE)

    //WebUI.takeScreenshot('Screenshots/IT_COMPRAGUIADA-SP-ASPI.png', FailureHandling.STOP_ON_FAILURE)
	WebUI.takeScreenshot()

    WebUI.click(findTestObject('Page_Solicitud de pedido/bdi_OK_1'))

    WebUI.click(findTestObject('Object Repository/Page_Guided Purchasing/btn_RegistrazionePreliminare'))

    WebUI.waitForElementClickable(findTestObject('Page_Solicitud de pedido/bdi_OK_1'), 20, FailureHandling.STOP_ON_FAILURE)

    //WebUI.takeScreenshot('Screenshots/IT_COMPRAGUIADA-SP-ASPI.png', FailureHandling.STOP_ON_FAILURE)
	WebUI.takeScreenshot()

    WebUI.click(findTestObject('Page_Solicitud de pedido/bdi_OK_1'))

    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)
}
catch (Exception e) {
    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

    e.printStackTrace()

    KeywordUtil.markFailed('Test Failed')
} 

