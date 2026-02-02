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

    WebUI.click(findTestObject('Object Repository/Page_Pagina iniziale/div_Acquisto Minore'))

    WebUI.click(findTestObject('Object Repository/Page_Acquisto Minore/span_Utente_com.abertis.mm.zpurchaserequisi_49be12'))

    WebUI.click(findTestObject('Object Repository/Page_Acquisto Minore/span_Filtro'))

    WebUI.setText(findTestObject('Object Repository/Page_Acquisto Minore/input_concat(Richiesta d, , acquisto)_com.a_4e6297'), 
        Pedido)

    WebUI.click(findTestObject('Object Repository/Page_Acquisto Minore/bdi_Avvio'))

    WebUI.click(findTestObject('Object Repository/Page_Acquisto Minore/a_200049209210'))

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_Modificare'))

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/input_Ricevitore'), Receptor)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Solicitud de pedido/input_Ricevitore'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/input_Gruppo acquisti_application-zpurchase_31ca82'), 
        GrupoCompra)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Solicitud de pedido/input_Gruppo acquisti_application-zpurchase_31ca82'), 
        Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Page_Lista de Pedidos/textarea_ObjetodeCompra'), ObjetoCompra)

    WebUI.setText(findTestObject('Object Repository/Page_Acquisto Minore/input_testoBreve'), TextoBreve)

    WebUI.setText(findTestObject('Object Repository/Page_Acquisto Minore/input_QtdRichiesta'), CantidadDemanda)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Acquisto Minore/input_QtdRichiesta'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Acquisto Minore/input_Valorazzione'), Valoracion)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Acquisto Minore/input_Valorazzione'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Acquisto Minore/input_Data'), FechaEntrega)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Acquisto Minore/input_Data'), Keys.chord(Keys.ENTER))

    WebUI.doubleClick(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_Controllare'))

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_Controllare'))

    WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Guided Purchasing/bdi_OK_popup'), 10, FailureHandling.STOP_ON_FAILURE)

    //WebUI.takeScreenshot('Screenshots/IT_Modif-SP-ASMI-CeCo.png', FailureHandling.STOP_ON_FAILURE)
	WebUI.takeScreenshot()

    WebUI.click(findTestObject('Object Repository/Page_Guided Purchasing/bdi_OK_popup'))

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_Salvare'))

    WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Guided Purchasing/bdi_OK_popup'), 10, FailureHandling.STOP_ON_FAILURE)

    //WebUI.takeScreenshot('Screenshots/IT_Modif-SP-ASMI-CeCo.png', FailureHandling.STOP_ON_FAILURE)
	WebUI.takeScreenshot()

    WebUI.click(findTestObject('Object Repository/Page_Guided Purchasing/bdi_OK_popup'))

    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)
}
catch (Exception e) {
    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

    e.printStackTrace()

    KeywordUtil.markFailed('Test Failed')
} 

