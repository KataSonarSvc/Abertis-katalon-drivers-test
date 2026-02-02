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

WebUI.click(findTestObject('Object Repository/Creacion Orden Correctivo Ital/Page_Pagina iniziale/span_Pagina iniziale_sapUiIconTitle'))

WebUI.click(findTestObject('Object Repository/Creacion Orden Correctivo Ital/Page_Pagina iniziale/span_Creazione ticket'))

WebUI.click(findTestObject('Object Repository/Creacion Orden Correctivo Ital/Page_Pagina iniziale/bdi_Creazione ticket'))

WebUI.setText(findTestObject('Object Repository/Creacion Orden Correctivo Ital/Page_Creazione ticket/input_Equipment___xmlview2--smartFilterBar-_a4e3ed'), 
    'ALIGAS00000001')

WebUI.sendKeys(findTestObject('Object Repository/Creacion Orden Correctivo Ital/Page_Creazione ticket/input_Equipment___xmlview2--smartFilterBar-_a4e3ed'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Creacion Orden Correctivo Ital/Page_Creazione ticket/circle_Ha allegati_sapMRbBInn'))

WebUI.click(findTestObject('Object Repository/Creacion Orden Correctivo Ital/Page_Creazione ticket/bdi_Passo 2'))

WebUI.setText(findTestObject('Object Repository/Creacion Orden Correctivo Ital/Page_Creazione ticket/input_Riferimento ticket___xmlview2--isortf_f6e755'), 
    'TEST')

WebUI.setText(findTestObject('Object Repository/Creacion Orden Correctivo Ital/Page_Creazione ticket/input_Referente___xmlview2--izzcontactp-inner'), 
    'TEST')

WebUI.setText(findTestObject('Object Repository/Creacion Orden Correctivo Ital/Page_Creazione ticket/input_Testo breve___xmlview2--ishorttext-inner'), 
    'TEST')

WebUI.click(findTestObject('Object Repository/Creacion Orden Correctivo Ital/Page_Creazione ticket/span_Sintomo___xmlview2--isymptomcode-arrow'))

WebUI.click(findTestObject('Object Repository/Creacion Orden Correctivo Ital/Page_Creazione ticket/span_Odore di gasolio o sversamento'))

WebUI.click(findTestObject('Object Repository/Creacion Orden Correctivo Ital/Page_Creazione ticket/span_Rilasciato_sapMSwtLabel sapMSwtLabelOff'))

WebUI.click(findTestObject('Object Repository/Creacion Orden Correctivo Ital/Page_Creazione ticket/bdi_Passo 3'))

WebUI.click(findTestObject('Object Repository/Creacion Orden Correctivo Ital/Page_Creazione ticket/span_Tecnico___xmlview2--itecnico2-vhi'))

WebUI.click(findTestObject('Object Repository/Creacion Orden Correctivo Ital/Page_Creazione ticket/div_30000017'))

WebUI.click(findTestObject('Object Repository/Creacion Orden Correctivo Ital/Page_Creazione ticket/bdi_Creare Ticket'))

WebUI.click(findTestObject('Object Repository/Creacion Orden Correctivo Ital/Page_Creazione ticket/span_stato creato il ticket 200100050741, s_7fec36'))

WebUI.click(findTestObject('Object Repository/Creacion Orden Correctivo Ital/Page_Creazione ticket/span_Vai al dettaglio___button55-img'))

WebUI.takeFullPageScreenshot()

