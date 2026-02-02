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

WebUI.setText(findTestObject('Object Repository/Añadir actividad OP IT new id/Page_Modificare Ordine videata iniziale/input_O_InputField'), 
    orden)

WebUI.sendKeys(findTestObject('Añadir actividad OP IT new id/Page_Modificare Ordine videata iniziale/input_O_InputField'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Añadir actividad OP IT new id/Page_Modificare Manut. Programmata 20040001_06833f/span_Operazioni'))

WebUI.click(findTestObject('Object Repository/Añadir actividad OP IT new id/Page_Modificare Manut. Programmata 20040001_ef037e/span_YM01_InputField'))

WebUI.setText(findTestObject('Object Repository/Añadir actividad OP IT new id/Page_Modificare Manut. Programmata 20040001_ef037e/input_YM01_InputField'), 
    activita)

WebUI.click(findTestObject('Object Repository/Añadir actividad OP IT new id/Page_Modificare Manut. Programmata 20040001_ef037e/div_SalvareEvidenziato'))

WebUI.click(findTestObject('Object Repository/Añadir actividad OP IT new id/Page_Modificare Manut. Programmata 20040001_ef037e/div_S'))

WebUI.click(findTestObject('Object Repository/Añadir actividad OP IT new id/Page_Modificare Ordine videata iniziale/span_Salvato ordine 200400013403 con avviso_3101e6'))

WebUI.takeFullPageScreenshot()

