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

WebUI.click(findTestObject('Object Repository/Liberacion Orden Correctivo Ital/Page_Pagina iniziale/span_'))

WebUI.setText(findTestObject('Object Repository/Liberacion Orden Correctivo Ital/Page_Pagina iniziale/input_Tutto_search'), 
    'gestione ticket ')

WebUI.sendKeys(findTestObject('Object Repository/Liberacion Orden Correctivo Ital/Page_Pagina iniziale/input_Tutto_search'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Liberacion Orden Correctivo Ital/Page_Cerca gestione ticket/span_Gestione ticket correttivo'))

WebUI.click(findTestObject('Object Repository/Liberacion Orden Correctivo Ital/Page_Gestione ticket correttivo/span_Standard_application-ZPM_SMART-GESTICK_bc967c'))

WebUI.click(findTestObject('Object Repository/Liberacion Orden Correctivo Ital/Page_Gestione ticket correttivo/li_Standard'))

WebUI.click(findTestObject('Object Repository/Liberacion Orden Correctivo Ital/Page_Gestione ticket correttivo/span_Data inizio_application-ZPM_SMART-GEST_ab4b7d'))

WebUI.click(findTestObject('Object Repository/Liberacion Orden Correctivo Ital/Page_Gestione ticket correttivo/span_Anno attuale'))

WebUI.setText(findTestObject('Object Repository/Liberacion Orden Correctivo Ital/Page_Gestione ticket correttivo/input_Ticket_application-ZPM_SMART-GESTICKE_9f2af5'), 
    '200100050740')

WebUI.click(findTestObject('Object Repository/Liberacion Orden Correctivo Ital/Page_Gestione ticket correttivo/bdi_Avvio'))

WebUI.click(findTestObject('Object Repository/Liberacion Orden Correctivo Ital/Page_Gestione ticket correttivo/div_Centro Lavoro Esec___item21-__clone117-_28152a'))

WebUI.click(findTestObject('Object Repository/Liberacion Orden Correctivo Ital/Page_Gestione ticket correttivo/span_copia___button81-img'))

