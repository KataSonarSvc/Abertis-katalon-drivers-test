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

    WebUI.click(findTestObject('Object Repository/Page_Pagina iniziale/div_Richiesta dAcquisto'))

    WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Solicitud a Compras/bdi_Crear'), 10, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Page_Solicitud a Compras/bdi_Crear'))

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/div_Transversal'))

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/input_Gruppo acquisti'), GrupoCompra)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Solicitud de pedido/input_Gruppo acquisti'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/textarea_ObjetodeCompra'), ObjetoCompra)

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/textarea_ProveeInvitados'), ProveedorInvt)

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/input_Divisione'), Centro)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Solicitud de pedido/input_Divisione'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/input_CatContabile'), Impuesto)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Solicitud de pedido/input_CatContabile'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/input_Material'), Material)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Solicitud de pedido/input_Material'), Keys.chord(Keys.ARROW_DOWN))

    WebUI.sendKeys(findTestObject('Object Repository/Page_Solicitud de pedido/input_Material'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/input_testoBreve'), TextoBreve)

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/checkbox_Scomposizione'))

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/input_QtdSolicitada'), CantidadDemanda)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Solicitud de pedido/input_QtdSolicitada'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/input_PrzValorazzione'), Valoracion)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Solicitud de pedido/input_PrzValorazzione'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/input_Data'), FechaEntrega)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Solicitud de pedido/input_Data'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/input_ElementoWBS'), ElementoWBS)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Solicitud de pedido/input_ElementoWBS'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_Informazioni aggiuntive'))

    WebUI.setText(findTestObject('Object Repository/Page_Solicitud de pedido/input_BudgetAllocato'), PrespAsignado)

    WebUI.sendKeys(findTestObject('Object Repository/Page_Solicitud de pedido/input_BudgetAllocato'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/span_Check'))

    WebUI.click(findTestObject('Page_Solicitud de pedido/bdi_Verificar'))

    WebUI.waitForElementClickable(findTestObject('Page_Solicitud de pedido/bdi_OK_1'), 10, FailureHandling.STOP_ON_FAILURE)

    //WebUI.takeScreenshot('Screenshots/IT_SP-ASPM-Pep.png', FailureHandling.STOP_ON_FAILURE)
	WebUI.takeScreenshot()

    WebUI.click(findTestObject('Page_Solicitud de pedido/bdi_OK_1'))

    WebUI.click(findTestObject('Object Repository/Page_Solicitud de pedido/bdi_Registrazione preliminare'))

    WebUI.waitForElementClickable(findTestObject('Page_Solicitud de pedido/bdi_OK_1'), 10, FailureHandling.STOP_ON_FAILURE)

    //WebUI.takeScreenshot('Screenshots/IT_SP-ASPM-Pep.png', FailureHandling.STOP_ON_FAILURE)
	WebUI.takeScreenshot()

    WebUI.click(findTestObject('Page_Solicitud de pedido/bdi_OK_1'))

    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)
}
catch (Exception e) {
    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

    e.printStackTrace()

    KeywordUtil.markFailed('Test Failed')
} 

