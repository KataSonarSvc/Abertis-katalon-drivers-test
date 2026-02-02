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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

// Get the currently focused element
// Send TAB to the active element
// Small delay after each key press (e.g., 300 ms)
WebUI.callTestCase(findTestCase('Acceso/Login'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.url_utilidades.urlutilidades.openApplicationUrl'('https://saps4-pre.abertis.com/sap/bc/ui2/flp?saml2=disabled&sap-client=100#SalesDocument-create')

WebUI.setText(findTestObject('Object Repository/SD Creacion pedido/Page_Crear documentos de ventas/input_C_InputField'), 
    clase_de_pedido)

WebUI.delay(3)

WebUI.sendKeys(findTestObject('SD Creacion pedido/Page_Crear documentos de ventas/input_C_InputField'), Keys.chord(Keys.ESCAPE))

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear documentos de ventas/input_O_InputField'))

WebUI.setText(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear documentos de ventas/input_O_InputField'), 
    organizacion)

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear documentos de ventas/span_V330'))

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear documentos de ventas/input_C_InputField_1'))

WebUI.setText(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear documentos de ventas/input_C_InputField_1'), 
    canal)

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear documentos de ventas/span_01'))

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear documentos de ventas/input_S_InputField'))

WebUI.setText(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear documentos de ventas/input_S_InputField'), 
    sector)

WebUI.click(findTestObject('Object Repository/SDCreacion pedido todos los campos/Page_Crear documentos de ventas/div_ContinuarResaltado'))

WebUI.setText(findTestObject('Object Repository/SD Creacion pedido/Page_Crear Pedido Resumen/input_S_InputField'), solicitante)

WebUI.delay(3)

WebUI.sendKeys(findTestObject('SD Creacion pedido/Page_Crear Pedido Resumen/input_S_InputField'), Keys.chord(Keys.ESCAPE))

WebUI.click(findTestObject('Object Repository/SD Creacion pedido/Page_Crear Pedido Resumen/div_SolicitanteDestinat.mca'))

WebUI.setText(findTestObject('Object Repository/SD Creacion pedido/Page_Crear Pedido Resumen/input_D_InputField'), destinatario)

WebUI.delay(3)

WebUI.sendKeys(findTestObject('SD Creacion pedido/Page_Crear Pedido Resumen/input_D_InputField'), Keys.chord(Keys.ESCAPE))

WebUI.click(findTestObject('Object Repository/SD Creacion pedido/Page_Crear Pedido Resumen/div_SolicitanteDestinat.mca'))

WebUI.click(findTestObject('Object Repository/SD Creacion pedido/Page_Crear Pedido Resumen/span_Seleccin de fila desactivada_InputField'))

WebUI.setText(findTestObject('Object Repository/SD Creacion pedido/Page_Crear Pedido Resumen/input_Seleccin de fila desactivada_InputField'), 
    material)

WebUI.delay(3)

WebUI.sendKeys(findTestObject('SD Creacion pedido/Page_Crear Pedido Resumen/input_Seleccin de fila desactivada_InputField'), 
    Keys.chord(Keys.ESCAPE))

sendTabsIframe(1)

WebUI.setText(findTestObject('Object Repository/SD Creacion pedido/Page_Crear Pedido Resumen/input_Seleccin de fila desactivada_InputField_1'), 
    cantidad_pedido)

sendTabsIframe(6)

WebUI.setText(findTestObject('Object Repository/SD Creacion pedido/Page_Crear Pedido Resumen/input_D_InputField_1_2'), importe)

WebUI.delay(3)

sendTabsIframe(6)

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/SD Creacion pedido/Page_Crear Pedido Resumen/input_D_InputField_1'), centro_de_beneficio)

WebUI.delay(3)

WebUI.sendKeys(findTestObject('SD Creacion pedido/Page_Crear Pedido Resumen/input_D_InputField_1'), Keys.chord(Keys.ESCAPE))

WebUI.click(findTestObject('Object Repository/SD Creacion pedido/Page_Crear Pedido Resumen/div_GuardarResaltado'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

// Get the text from the element
String fullText = WebUI.getText(findTestObject('Object Repository/SD Creacion pedido/Page_Crear Pedido Resumen/span_Pedido 95206 se ha grabado'))

println("🔹 Full text: -'$fullText'-")

// Use regex to extract the pedido number
def matcher = fullText =~ 'Pedido (\\d+) se ha grabado\\.?\\s*$'

if (matcher.find()) {
    // Save the extracted number
    GlobalVariable.DYNAMIC_PEDIDO = matcher.group(1 // println("✅ Pedido number found: $GlobalVariable.DYNAMIC_PEDIDO")
        )
} else {
    KeywordUtil.markFailed('No se ha encontrado el mensaje: \'Pedido xxx se ha grabado\'')
}

CustomKeywords.'com.url_utilidades.urlutilidades.openApplicationUrl'('https://saps4-pre.abertis.com/sap/bc/ui2/flp?saml2=disable&sap-client=100#BillingDocument-createBillingDocument')

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Creacion Factura Ventas/Page_Crear factura/input_Para seleccionar una lnea, pulse la b_07f5b0'),
	GlobalVariable.DYNAMIC_PEDIDO)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Creacion Factura Ventas/Page_Factura (ZFA1) Crear Resumen, posicion_d3fbb0/div_GrabarResaltado'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Creacion Factura Ventas/Page_Crear factura/span_Documento 2520110021 grabado'))

WebUI.takeFullPageScreenshot()



def sendTabsIframe(int times) {
    WebUI.switchToFrame(findTestObject('SD Creacion pedido/Page_Crear Pedido Resumen/iframe_Ms_application-SalesDocument-create-iframe'), 
        3)

    WebDriver driver = DriverFactory.getWebDriver()

    Actions actions = new Actions(driver)

    for (int i = 0; i < times; i++) {
        WebElement activeElement = driver.switchTo().activeElement()

        actions.sendKeys(activeElement, Keys.TAB).perform()

        Thread.sleep(500)
    }
    
    WebUI.switchToDefaultContent()
}

