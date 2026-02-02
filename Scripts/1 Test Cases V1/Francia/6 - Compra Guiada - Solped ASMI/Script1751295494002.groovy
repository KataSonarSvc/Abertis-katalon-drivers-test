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

    WebUI.click(findTestObject('Object Repository/Page_Guided Purchasing/checkbox_ModificarDatos'))

    WebUI.setText(findTestObject('Object Repository/Page_Guided Purchasing/input_Pour quelle division'), Division)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Guided Purchasing/input_Pour quelle division'), Keys.chord(Keys.ARROW_DOWN))

    WebUI.sendKeys(findTestObject('Object Repository/Page_Guided Purchasing/input_Pour quelle division'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Guided Purchasing/input_Pour quel rceptionnaire'), Receptor)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Guided Purchasing/input_Pour quel rceptionnaire'), Keys.chord(
            Keys.ARROW_DOWN))

    WebUI.sendKeys(findTestObject('Object Repository/Page_Guided Purchasing/input_Pour quel rceptionnaire'), Keys.chord(
            Keys.ENTER))

    WebUI.delay(10)

    WebUI.click(findTestObject('Object Repository/Page_Guided Purchasing/bdi_tape 2'))

    WebUI.delay(10)

    WebUI.click(findTestObject('Object Repository/Page_Guided Purchasing/input_Material'))

    WebUI.setText(findTestObject('Object Repository/Page_Guided Purchasing/input_Material'), Material)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Guided Purchasing/input_Material'), Keys.chord(Keys.DELETE))

    WebUI.setText(findTestObject('Object Repository/Page_Guided Purchasing/input_Material'), Material)

    WebUI.delay(10)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Guided Purchasing/input_Material'), Keys.chord(Keys.ARROW_DOWN))

    WebUI.sendKeys(findTestObject('Object Repository/Page_Guided Purchasing/input_Material'), Keys.chord(Keys.ENTER))

    WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Guided Purchasing/bdi_Etapa 3'), 20, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Page_Guided Purchasing/bdi_tape 3'))

    WebUI.setText(findTestObject('Object Repository/Page_Guided Purchasing/input_Valor total de compra'), ValorTotal)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Guided Purchasing/input_Valor total de compra'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Guided Purchasing/input_Data'), FechaEntrega)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Guided Purchasing/input_Data'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Object Repository/Page_Guided Purchasing/checkbox_CentroCosto'))

    WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Guided Purchasing/input_Centro de costo'), 10, 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('Object Repository/Page_Guided Purchasing/input_Centro de costo'), CentroCoste)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Guided Purchasing/input_Centro de costo'), Keys.chord(Keys.ARROW_DOWN))

    WebUI.sendKeys(findTestObject('Object Repository/Page_Guided Purchasing/input_Centro de costo'), Keys.chord(Keys.ENTER))

    if (WebUI.findWebElement(findTestObject('Object Repository/Page_Guided Purchasing/input_Fornitore'), 60, FailureHandling.STOP_ON_FAILURE)) {
    } else {
        WebUI.click(findTestObject('Object Repository/Page_Guided Purchasing/span_Ds'))
    }
    
    WebUI.setText(findTestObject('Object Repository/Page_Guided Purchasing/input_Fornitore'), Proveedor)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Guided Purchasing/input_Fornitore'), Keys.chord(Keys.ARROW_DOWN))

    WebUI.sendKeys(findTestObject('Object Repository/Page_Guided Purchasing/input_Fornitore'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Guided Purchasing/textarea_Breve descrio da compra'), textoBreve)

    WebUI.click(findTestObject('Page_Guided Purchasing/bdi_Procder lachat_2'))

    WebUI.click(findTestObject('Object Repository/Page_Guided Purchasing/bdi_OK_popup'))

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/input_Elment OTP2_application-zpurchaserequ_b08444'), 
        textoBreve)

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_Mais dados'))

    WebUI.setText(findTestObject('Page_Guided Purchasing/input_orcamentoAtribuido'), ValorTotal)

    WebUI.sendKeys(findTestObject('Page_Guided Purchasing/input_orcamentoAtribuido'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/input_Localisation'), Localizacion)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Solicitud de pedido/input_Localisation'), Keys.chord(Keys.ARROW_DOWN))

    WebUI.sendKeys(findTestObject('Object Repository/Page_Solicitud de pedido/input_Localisation'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/input_Actividad'), Actividad)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Solicitud de pedido/input_Actividad'), Keys.chord(Keys.ARROW_DOWN))

    WebUI.sendKeys(findTestObject('Object Repository/Page_Solicitud de pedido/input_Actividad'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/input_Direccion'))

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/input_BuscadorDireccion'), Direccion)

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/div_ItemDireccion'))

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/span_Check'))

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_Verificar'))

    WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_OK_1'), 30, FailureHandling.STOP_ON_FAILURE)

    //WebUI.takeScreenshot('Screenshots/SANEF_COMPRAGUIADA-SP-ASMI.png', FailureHandling.STOP_ON_FAILURE)
	WebUI.takeScreenshot()

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_OK_1'))

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_Grabar'))

    WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_OK_1'), 30, FailureHandling.STOP_ON_FAILURE)

    //WebUI.takeScreenshot('Screenshots/SANEF_COMPRAGUIADA-SP-ASMI.png', FailureHandling.STOP_ON_FAILURE)
	WebUI.takeScreenshot()

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_OK_1'))

    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)
}
catch (Exception e) {
    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

    e.printStackTrace()

    KeywordUtil.markFailed('Test Failed')
} 

