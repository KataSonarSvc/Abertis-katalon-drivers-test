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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.callTestCase(findTestCase('Acceso/Login'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.url_utilidades.urlutilidades.openApplicationUrl'('https://saps4-pre.abertis.com/sap/bc/ui2/flp?saml2=disabled&sap-client=100#ZPM_SMART-CreaTicket')

WebUI.setText(findTestObject('Object Repository/Creación Orden Correctivo IT New ID/Page_Creazione ticket/input_Equipment___xmlview2--smartFilterBar-_a4e3ed'), 
    equipment)

WebUI.sendKeys(findTestObject('Object Repository/Creación Orden Correctivo IT New ID/Page_Creazione ticket/input_Equipment___xmlview2--smartFilterBar-_a4e3ed'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Creación Orden Correctivo IT New ID/Page_Creazione ticket/circle_Ha allegati_sapMRbBInn'))

WebUI.click(findTestObject('Object Repository/Creación Orden Correctivo IT New ID/Page_Creazione ticket/bdi_Passo 2'))

WebUI.setText(findTestObject('Object Repository/Creación Orden Correctivo IT New ID/Page_Creazione ticket/input_Riferimento ticket___xmlview2--isortf_f6e755'), 
    ticket)

WebUI.setText(findTestObject('Object Repository/Creación Orden Correctivo IT New ID/Page_Creazione ticket/input_Referente___xmlview2--izzcontactp-inner'), 
    reference)

WebUI.setText(findTestObject('Object Repository/Creación Orden Correctivo IT New ID/Page_Creazione ticket/input_Testo breve___xmlview2--ishorttext-inner'), 
    breve)

WebUI.click(findTestObject('Object Repository/Creación Orden Correctivo IT New ID/Page_Creazione ticket/span_Sintomo___xmlview2--isymptomcode-arrow'))

WebUI.click(findTestObject('Object Repository/Creación Orden Correctivo IT New ID/Page_Creazione ticket/span_Odore di gasolio o sversamento'))

WebUI.click(findTestObject('Object Repository/Creación Orden Correctivo IT New ID/Page_Creazione ticket/bdi_Passo 3'))

WebUI.click(findTestObject('Object Repository/Creación Orden Correctivo IT New ID/Page_Creazione ticket/span_Tecnico___xmlview2--itecnico2-vhi'))

WebUI.click(findTestObject('Object Repository/Creación Orden Correctivo IT New ID/Page_Creazione ticket/td_30000017'))

WebUI.click(findTestObject('Object Repository/Creación Orden Correctivo IT New ID/Page_Creazione ticket/bdi_Creare Ticket'))

String fullText = WebUI.getText(findTestObject('Object Repository/Creación Orden Correctivo IT New ID/Page_Creazione ticket/span_stato creato il ticket 200100050811, s_8803d0'))

WebUI.takeFullPageScreenshot()

def matcher = fullText =~ 'É stato creato il ticket (\\d+), seleziona un\'opzione$'

if (matcher.find()) {
    GlobalVariable.DYNAMIC_PEDIDO = matcher.group(1)

    println(GlobalVariable.DYNAMIC_PEDIDO)
} else {
    KeywordUtil.markFailed('No se ha encontrado el mensaje')
}

