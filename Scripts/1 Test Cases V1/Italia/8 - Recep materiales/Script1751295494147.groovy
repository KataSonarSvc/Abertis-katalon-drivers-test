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

    WebUI.click(findTestObject('Object Repository/Page_Pagina iniziale/div_Entrate Merci  Verifiche'))

    WebUI.click(findTestObject('Object Repository/Page_Pagina iniziale/div_Nuova Entrata Merci'))

    WebUI.click(findTestObject('Object Repository/Page_Entrata di Merci/span_Group'))

    WebUI.click(findTestObject('Object Repository/Page_Entrata di Merci/span_Non filtrato_com.abertis.mm.zgrdesdepo_fe1d89'))

    WebUI.click(findTestObject('Object Repository/Page_Entrata di Merci/div_No_com.abertis.mm.zgrdesdeposap.suite.u_ed1859'))

    WebUI.setText(findTestObject('Object Repository/Page_Entrata di Merci/input_Esplodi testata_com.abertis.mm.zgrdes_840bbc'), 
        Pedido)

    WebUI.click(findTestObject('Object Repository/Page_Entrata di Merci/bdi_Aggiornare'))

    WebUI.click(findTestObject('Object Repository/Page_Entrata di Merci/div_ItemTabla'))
	
	WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Entrata di Merci/bdi_Crea entrata merci'), 30, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Page_Entrata di Merci/bdi_Crea entrata merci'))

    WebUI.setText(findTestObject('Object Repository/Page_Entrata di Merci/input_TestoTestata'), TextoBreve)
	
	WebUI.setText(findTestObject('Object Repository/Page_Entrada de Mercancias/input_Fecha de contabilizacion'), FechaEntrega)
	
	WebUI.sendKeys(findTestObject('Object Repository/Page_Entrada de Mercancias/input_Fecha de contabilizacion'), Keys.chord(
				Keys.ENTER))

    WebUI.click(findTestObject('Object Repository/Page_Entrata di Merci/checkbox_PosOK'))

    WebUI.click(findTestObject('Page_Entrada de Mercancias/input_CantidadPendiente'))

    WebUI.setText(findTestObject('Page_Entrada de Mercancias/input_CantidadPendiente'), CantidadDemanda)

    WebUI.sendKeys(findTestObject('Page_Entrada de Mercancias/input_CantidadPendiente'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Object Repository/Page_Entrata di Merci/bdi_Salva'))

    //WebUI.takeScreenshot('Screenshots/IT_RecepMateriales.png', FailureHandling.STOP_ON_FAILURE)
	WebUI.takeScreenshot()

    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)
}
catch (Exception e) {
    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

    e.printStackTrace()

    KeywordUtil.markFailed('Test Failed')
} 

