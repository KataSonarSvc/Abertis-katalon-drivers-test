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


WebUI.callTestCase(findTestCase('Acceso/Login'), [:], FailureHandling.STOP_ON_FAILURE)


try {
   

    WebUI.click(findTestObject('Object Repository/Page_Pagina inicial/span_Requisio de Compras'))

    WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Requisio de Compras/bdi_Criar'), 40, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Page_Requisio de Compras/bdi_Criar'))

    WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Solicitud de pedido/textarea_ObjetodeCompra'), 20, 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/textarea_ObjetodeCompra'), ObjetoCompra)

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/textarea_ProveeInvitados'), ProveedorInvt)

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/div_Centro'), Centro)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Solicitud de pedido/div_Centro'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/div_gCompradores'), GrupoCompra)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Solicitud de pedido/div_gCompradores'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/div_TipoImp'), Impuesto)

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/input_Material'), Material)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Solicitud de pedido/input_Material'), Keys.chord(Keys.ARROW_DOWN))

    WebUI.sendKeys(findTestObject('Object Repository/Page_Solicitud de pedido/input_Material'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/div_Detalle'))

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/input_QtdSolicitada'), CantidadDemanda)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Solicitud de pedido/input_QtdSolicitada'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/input_EvlPrecios'), Valoracion)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Solicitud de pedido/input_EvlPrecios'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Page_Solicitud de pedido/input_Fecha_BRAS'), FechaEntrega)

    WebUI.sendKeys(findTestObject('Page_Solicitud de pedido/input_Fecha_BRAS'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/input_CentroCusto'), CentroCoste)
	
	WebUI.sendKeys(findTestObject('Object Repository/Page_Solicitud de pedido/input_CentroCusto'), Keys.chord(Keys.ARROW_DOWN))

    WebUI.sendKeys(findTestObject('Object Repository/Page_Solicitud de pedido/input_CentroCusto'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_Mais dados'))

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/input_PrespAsignado'), PrespAsignado)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Solicitud de pedido/input_PrespAsignado'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/span_Check'))

    WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_Verificar'), 20, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_Verificar'))

    //WebUI.takeScreenshot('Screenshots/Arteris_SP-ASPI-CeCo.png', FailureHandling.STOP_ON_FAILURE)
	WebUI.takeScreenshot()

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_OK_1'))

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_Salvar'))

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_OK_1'))

    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)
}
catch (Exception e) {
    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

    e.printStackTrace()

    KeywordUtil.markFailed('Test Failed')
} 

