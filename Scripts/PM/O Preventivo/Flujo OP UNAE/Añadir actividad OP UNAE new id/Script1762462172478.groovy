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

WebUI.callTestCase(findTestCase('Acceso/Login'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.url_utilidades.urlutilidades.openApplicationUrl'('https://saps4-pre.abertis.com/sap/bc/ui2/flp?saml2=disabled&sap-client=100#MaintenanceOrder-change')

WebUI.setText(findTestObject('Object Repository/Añadir actividad OP UNAE new id/Page_Modificar Orden Acceso/input_O_InputField'), 
    GlobalVariable.DYNAMIC_PEDIDO)

WebUI.sendKeys(findTestObject('Añadir actividad OP UNAE new id/Page_Modificar Orden Acceso/input_O_InputField'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Añadir actividad OP UNAE new id/Page_Modificar Preventivo Autopista 1004006_8c5c69/span_Oper'))

WebUI.click(findTestObject('Object Repository/Añadir actividad OP UNAE new id/Page_Modif.Preventivo Autopista 10040063704_7e9ad6/span_YM03_InputField'))

WebUI.setText(findTestObject('Object Repository/Añadir actividad OP UNAE new id/Page_Modif.Preventivo Autopista 10040063704_7e9ad6/input_YM03_InputField'), 
    cltexes)

WebUI.click(findTestObject('Object Repository/Añadir actividad OP UNAE new id/Page_Modif.Preventivo Autopista 10040063704_7e9ad6/div_GrabarResaltado'))

WebUI.delay(3)

WebUI.click(findTestObject('Añadir actividad OP UNAE new id/Page_Modif.Preventivo Autopista 10040063704_7e9ad6/Modal_Informacion_Continuar'))

WebUI.click(findTestObject('Object Repository/Añadir actividad OP UNAE new id/Page_Modificar Orden Acceso/span_Orden 100400637047 grabada con aviso 1_0a069e'))

WebUI.takeFullPageScreenshot()

