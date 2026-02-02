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

CustomKeywords.'com.url_utilidades.urlutilidades.openApplicationUrl'('https://saps4-pre.abertis.com/sap/bc/ui2/flp?saml2=disabled&sap-client=100&sap-ushell-config=lean#zpurchaserequisitionlr-minorPurchasing')

WebUI.click(findTestObject('Object Repository/Compra Menor IT New ID/Page_Acquisto Minore/bdi_Creare'))

WebUI.setText(findTestObject('Object Repository/Compra Menor IT New ID/Page_Solicitud de pedido/textarea_Oggetto acquistoIngaggio_applicati_39a70f'), 
    oggetto_acquisto)

WebUI.setText(findTestObject('Object Repository/Compra Menor IT New ID/Page_Solicitud de pedido/input_Fornitore_application-zpurchaserequis_9d1982'), 
    fornitore)

WebUI.setText(findTestObject('Object Repository/Compra Menor Capex Sanef New/Page_Solicitud de pedido/input_Centre de cots_application-zpurchaser_6e4540'), 
    divisione)

WebUI.setText(findTestObject('Object Repository/Compra Menor IT New ID/Page_Solicitud de pedido/input_CdC_application-zpurchaserequisition-_717f50'), 
    cat_contabile)

WebUI.setText(findTestObject('Object Repository/Compra Menor IT New ID/Page_Solicitud de pedido/input_CdC_application-zpurchaserequisition-_08941c'), 
    materiale)

WebUI.setText(findTestObject('Object Repository/Compra Menor IT New ID/Page_Solicitud de pedido/input_CdC_application-zpurchaserequisition-_26c8f8'), 
    testo_breve)

WebUI.setText(findTestObject('Object Repository/Compra Menor IT New ID/Page_Solicitud de pedido/input_CdC_application-zpurchaserequisition-_13e5a6'), 
    qta_richiesta)

WebUI.setText(findTestObject('Object Repository/Compra Menor IT New ID/Page_Solicitud de pedido/input_Informazioni sullo stato del valore_a_8c8de8'), 
    data_di_consegna)

WebUI.setText(findTestObject('Compra Menor Chile New ID/Page_Solicitud de pedido/Input_centro_coste'), centro_coste)

WebUI.click(findTestObject('Object Repository/Compra Menor IT New ID/Page_Solicitud de pedido/bdi_Informazioni aggiuntive'))

WebUI.setText(findTestObject('Object Repository/Compra Menor IT New ID/Page_Solicitud de pedido/input_Necessit_application-zpurchaserequisi_f51426'), 
    necessita)

WebUI.click(findTestObject('Object Repository/Compra Menor IT New ID/Page_Solicitud de pedido/span_Mostra di pi_application-zpurchaserequ_8d61c9'))

WebUI.click(findTestObject('Object Repository/Compra Menor IT New ID/Page_Solicitud de pedido/bdi_Controllare'))

WebUI.click(findTestObject('Object Repository/Compra Menor IT New ID/Page_Solicitud de pedido/bdi_OK'))

WebUI.click(findTestObject('Object Repository/Compra Menor IT New ID/Page_Solicitud de pedido/span_Salvare'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra Menor Chile New ID/Page_Solicitud de pedido/span_Solicitud 2000615133 creada'))

WebUI.takeFullPageScreenshot()

