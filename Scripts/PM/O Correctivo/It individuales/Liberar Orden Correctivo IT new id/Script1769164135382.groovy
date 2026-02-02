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

CustomKeywords.'com.url_utilidades.urlutilidades.openApplicationUrl'('https://saps4-pre.abertis.com/sap/bc/ui2/flp?saml2=disabled&sap-client=100#ZPM_SMART-GESTICKET')

WebUI.click(findTestObject('Object Repository/Liberar Orden Correctivo IT/Page_Gestione ticket correttivo/span_Standard_application-ZPM_SMART-GESTICK_bc967c'))

WebUI.click(findTestObject('Object Repository/Liberar Orden Correctivo IT/Page_Gestione ticket correttivo/li_Standard'))

WebUI.setText(findTestObject('Object Repository/Liberar Orden Correctivo IT/Page_Gestione ticket correttivo/input_Ticket_application-ZPM_SMART-GESTICKE_9f2af5'), 
    orden)

WebUI.click(findTestObject('Object Repository/Liberar Orden Correctivo IT/Page_Gestione ticket correttivo/span_Data inizio_application-ZPM_SMART-GEST_ab4b7d'))

WebUI.click(findTestObject('Object Repository/Liberar Orden Correctivo IT/Page_Gestione ticket correttivo/span_Anno attuale'))

WebUI.click(findTestObject('Object Repository/Liberar Orden Correctivo IT/Page_Gestione ticket correttivo/bdi_Avvio'))

WebUI.click(findTestObject('Object Repository/Liberar Orden Correctivo IT/Page_Gestione ticket correttivo/div_Centro Lavoro Esec_application-ZPM_SMAR_3ce99c'))

WebUI.click(findTestObject('Object Repository/Liberar Orden Correctivo IT/Page_Gestione ticket correttivo/span_copia_application-ZPM_SMART-GESTICKET-_16101f'))

WebUI.takeFullPageScreenshot()

