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

WebUI.setText(findTestObject('Object Repository/Añadir actividad OC Unae/Page_Modificar Orden Acceso/input_O_InputField'), 
    GlobalVariable.DYNAMIC_PEDIDO)

WebUI.sendKeys(findTestObject('Object Repository/Añadir actividad OC Unae/Page_Modificar Orden Acceso/input_O_InputField'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Añadir actividad OC Unae/Page_Modificar Correctivo Autopista 1002013_b6f960/span_Oper'))

WebUI.click(findTestObject('Object Repository/Añadir actividad OC Unae/Page_Modif.Correctivo Autopista 10020135674_5c4142/span_I_ALI03'))

WebUI.setText(findTestObject('Object Repository/Añadir actividad OC Unae/Page_Modif.Correctivo Autopista 10020135674_5c4142/input_YM01_InputField'), 
    actividad)

WebUI.click(findTestObject('Object Repository/Añadir actividad OC Unae/Page_Modif.Correctivo Autopista 10020135674_5c4142/div_GrabarResaltado'))

WebUI.delay(3)

WebUI.click(findTestObject('Añadir actividad OC Unae/Page_Modif.Correctivo Autopista 10020135674_5c4142/button_SI'))

WebUI.click(findTestObject('Object Repository/Añadir actividad OC Unae/Page_Modificar Orden Acceso/span_Orden 100201356744 grabada con aviso 1_2f9711'))

WebUI.takeFullPageScreenshot()

