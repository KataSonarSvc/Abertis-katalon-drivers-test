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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Acceso/Login'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.url_utilidades.urlutilidades.openApplicationUrl'('https://saps4-pre.abertis.com/sap/bc/ui2/flp?saml2=disabled&sap-client=100#MaintenanceOrder-create')

WebUI.setText(findTestObject('Object Repository/Creación Orden de Correctico Unae new id/Page_Crear Orden Acceso/input_C_InputField'), 
    ci_orden)

WebUI.setText(findTestObject('Object Repository/Creación Orden de Correctico Unae new id/Page_Crear Orden Acceso/input_U_InputField'), 
    ubic_tecn)

WebUI.setText(findTestObject('Object Repository/Creación Orden de Correctico Unae new id/Page_Crear Orden Acceso/input_E_InputField'), 
    equipo)

WebUI.setText(findTestObject('Object Repository/Creación Orden de Correctico Unae new id/Page_Crear Orden Acceso/input_C_InputField_1'), 
    ce_planif)

WebUI.sendKeys(findTestObject('Creación Orden de Correctico Unae new id/Page_Crear Orden Acceso/input_C_InputField_1'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Creación Orden de Correctico Unae new id/Page_Crear Correctivo Autopista  Cabecera central/input_O_InputField'), 
    texto_orden)

WebUI.click(findTestObject('Object Repository/Creación Orden de Correctico Unae new id/Page_Crear Correctivo Autopista  Cabecera central/span_P_M0461123B2567148-btn'))

WebUI.click(findTestObject('Object Repository/Creación Orden de Correctico Unae new id/Page_Crear Correctivo Autopista  Cabecera central/div_Normal'))

WebUI.click(findTestObject('Object Repository/Creación Orden de Correctico Unae new id/Page_Crear Correctivo Autopista  Cabecera central/span_SntomaAvera'))

WebUI.click(findTestObject('Object Repository/Creación Orden de Correctico Unae new id/Page_Crear Correctivo Autopista  Cabecera central/div_'))

WebUI.setText(findTestObject('Object Repository/Creación Orden de Correctico Unae new id/Page_Crear Correctivo Autopista  Cabecera central/input_S_InputField'), 
    '')

WebUI.click(findTestObject('Object Repository/Creación Orden de Correctico Unae new id/Page_Crear Correctivo Autopista  Cabecera central/input_S_InputField'))

WebUI.setText(findTestObject('Object Repository/Creación Orden de Correctico Unae new id/Page_Crear Correctivo Autopista  Cabecera central/input_S_InputField'), 
    sintoma)

WebUI.setText(findTestObject('Object Repository/Creación Orden de Correctico Unae new id/Page_Crear Correctivo Autopista  Cabecera central/input_S_InputField_1'), 
    s1)

WebUI.setText(findTestObject('Object Repository/Creación Orden de Correctico Unae new id/Page_Crear Correctivo Autopista  Cabecera central/input_C_InputField'), 
    causa)

WebUI.setText(findTestObject('Object Repository/Creación Orden de Correctico Unae new id/Page_Crear Correctivo Autopista  Cabecera central/input_C_InputField_1'), 
    c1)

WebUI.click(findTestObject('Object Repository/Creación Orden de Correctico Unae new id/Page_Crear Correctivo Autopista  Cabecera central/div_GrabarResaltado'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Creación Orden de Correctico Unae new id/Page_Crear Correctivo Autopista  Cabecera central/Notification_Success_Text'), 
    5)

String fullText = WebUI.getText(findTestObject('Object Repository/Creación Orden de Correctico Unae new id/Page_Crear Correctivo Autopista  Cabecera central/Notification_Success_Text'))

WebUI.takeFullPageScreenshot()

println(fullText)

def matcher = fullText =~ 'Orden (\\d+) grabada con aviso (\\d+)$'

if (matcher.find()) {
    GlobalVariable.DYNAMIC_PEDIDO = matcher.group(1)

    println(GlobalVariable.DYNAMIC_PEDIDO)
} else {
    KeywordUtil.markFailed('No se ha encontrado el mensaje')
}

