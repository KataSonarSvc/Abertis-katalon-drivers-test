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

CustomKeywords.'com.url_utilidades.urlutilidades.openApplicationUrl'('https://saps4-pre.abertis.com/sap/bc/ui2/flp?saml2=disabled&sap-client=100#ZPM_SMART-GESTPREVEN')

WebUI.click(findTestObject('Object Repository/Liberarción Orden Preventivo Ital New ID/Page_Gestione Ticket Programmata/span_Data inizio_application-ZPM_SMART-GEST_6f4ce1'))

WebUI.click(findTestObject('Object Repository/Liberarción Orden Preventivo Ital New ID/Page_Gestione Ticket Programmata/span_Anno attuale'))

WebUI.setText(findTestObject('Object Repository/Liberarción Orden Preventivo Ital New ID/Page_Gestione Ticket Programmata/input_Ticket_application-ZPM_SMART-GESTPREV_113cc2'), 
    orden)

WebUI.click(findTestObject('Object Repository/Liberarción Orden Preventivo Ital New ID/Page_Gestione Ticket Programmata/span_Avvio'))

WebUI.click(findTestObject('Object Repository/Liberarción Orden Preventivo Ital New ID/Page_Gestione Ticket Programmata/div_Centro Lavoro Esec___item13-__clone96-s_e577ed'))

WebUI.click(findTestObject('Object Repository/Liberarción Orden Preventivo Ital New ID/Page_Gestione Ticket Programmata/span_Correttiva_application-ZPM_SMART-GESTP_8bc314'))

not_run: WebUI.click(findTestObject('Object Repository/Liberarción Orden Preventivo Ital New ID/Page_Gestione Ticket Programmata/div_Le modifiche sono state salvate'))

WebUI.takeFullPageScreenshot()

