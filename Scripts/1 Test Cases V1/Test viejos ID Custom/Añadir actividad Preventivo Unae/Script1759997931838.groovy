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

WebUI.click(findTestObject('Object Repository/Notificacion Orden Correctivo ITAL/Page_Pagina iniziale/span_'))

WebUI.setText(findTestObject('Object Repository/Notificacion Orden Correctivo ITAL/Page_Pagina iniziale/input_Tutto_search'), 
    'gestione ticket')

WebUI.sendKeys(findTestObject('Object Repository/Notificacion Orden Correctivo ITAL/Page_Pagina iniziale/input_Tutto_search'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Notificacion Orden Correctivo ITAL/Page_Cerca gestione ticket/span_Gestione ticket correttivo'))

WebUI.click(findTestObject('Object Repository/Notificacion Orden Correctivo ITAL/Page_Gestione ticket correttivo/span_Standard_application-ZPM_SMART-GESTICK_bc967c'))

WebUI.click(findTestObject('Object Repository/Notificacion Orden Correctivo ITAL/Page_Gestione ticket correttivo/li_Standard'))

WebUI.click(findTestObject('Object Repository/Notificacion Orden Correctivo ITAL/Page_Gestione ticket correttivo/span_Data inizio_application-ZPM_SMART-GEST_ab4b7d'))

WebUI.click(findTestObject('Object Repository/Notificacion Orden Correctivo ITAL/Page_Gestione ticket correttivo/span_Anno attuale'))

WebUI.setText(findTestObject('Object Repository/Notificacion Orden Correctivo ITAL/Page_Gestione ticket correttivo/input_Ticket_application-ZPM_SMART-GESTICKE_9f2af5'), 
    '200100050622')

WebUI.click(findTestObject('Object Repository/Notificacion Orden Correctivo ITAL/Page_Gestione ticket correttivo/bdi_Avvio'))

WebUI.click(findTestObject('Object Repository/Notificacion Orden Correctivo ITAL/Page_Gestione ticket correttivo/span_200100050622'))

WebUI.click(findTestObject('Object Repository/Notificacion Orden Correctivo ITAL/Page_Gestione ticket correttivo/span_Informazione_application-ZPM_SMART-GES_48af20'))

WebUI.click(findTestObject('Object Repository/Notificacion Orden Correctivo ITAL/Page_Gestione ticket correttivo/circle_Measurement document_sapMRbBInn'))

WebUI.click(findTestObject('Object Repository/Notificacion Orden Correctivo ITAL/Page_Gestione ticket correttivo/span_Esiste un messaggio di avvertimento____e056c2'))

WebUI.click(findTestObject('Object Repository/Notificacion Orden Correctivo ITAL/Page_Gestione ticket correttivo/span_Operazione completata_sapMSwtLabel sap_aa602a'))

WebUI.setText(findTestObject('Object Repository/Notificacion Orden Correctivo ITAL/Page_Gestione ticket correttivo/textarea_Testo esplicativo_ilongtext-inner'), 
    'test')

WebUI.click(findTestObject('Object Repository/Notificacion Orden Correctivo ITAL/Page_Gestione ticket correttivo/bdi_Confermare'))

WebUI.click(findTestObject('Object Repository/Notificacion Orden Correctivo ITAL/Page_Gestione ticket correttivo/span_Data di inizio riparazione_iStartDateT_a5e9e9'))

WebUI.click(findTestObject('Object Repository/Notificacion Orden Correctivo ITAL/Page_Gestione ticket correttivo/div_Annulla_sapMTPCItem sapMTPCDeg246'))

WebUI.click(findTestObject('Object Repository/Notificacion Orden Correctivo ITAL/Page_Gestione ticket correttivo/div_Annulla_iStartDateTime-Clocks-clockH-cover'))

WebUI.click(findTestObject('Object Repository/Notificacion Orden Correctivo ITAL/Page_Gestione ticket correttivo/bdi_OK'))

WebUI.click(findTestObject('Object Repository/Notificacion Orden Correctivo ITAL/Page_Gestione ticket correttivo/bdi_Confermare'))

WebUI.setText(findTestObject('Object Repository/Notificacion Orden Correctivo ITAL/Page_Gestione ticket correttivo/input_Aggiungi un operaio_multiInput1-inner'), 
    '30001648')

WebUI.click(findTestObject('Object Repository/Notificacion Orden Correctivo ITAL/Page_Gestione ticket correttivo/bdi_Confermare'))

