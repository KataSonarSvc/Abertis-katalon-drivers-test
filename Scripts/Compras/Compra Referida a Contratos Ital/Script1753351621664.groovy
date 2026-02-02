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

CustomKeywords.'com.url_utilidades.urlutilidades.openApplicationUrl'('https://saps4-pre.abertis.com/sap/bc/ui2/flp?saml2=disabled&sap-client=100&sap-ushell-config=lean#zpowithcontract-display')

WebUI.setText(findTestObject('Object Repository/Compra Referida a Contratos Ital/Page_Ordine rif. Contratto/input_Contratto_com.abertis.mm.zpowithcontr_45a1f6'), 
    contrato)

WebUI.sendKeys(findTestObject('Object Repository/Compra Referida a Contratos Ital/Page_Ordine rif. Contratto/input_Contratto_com.abertis.mm.zpowithcontr_45a1f6'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Compra Referida a Contratos Ital/Page_Ordine rif. Contratto/circle_Descrizione Agg_sapMRbBInn'))

WebUI.click(findTestObject('Object Repository/Compra Referida a Contratos Ital/Page_Ordine rif. Contratto/bdi_Creare ordine con riferimento'))

WebUI.click(findTestObject('Object Repository/Compra Referida a Contratos Ital/Page_Purchase Order/div_Importo disponibile___item123-__clone32_450282'))

WebUI.click(findTestObject('Object Repository/Compra Referida a Contratos Ital/Page_Purchase Order/bdi_Copiare posizioni selezionate'))

WebUI.setText(findTestObject('Object Repository/Compra Referida a Contratos Ital/Page_Purchase Order/textarea_Commenti al fornitore_application-_8a7d7d'), 
    comentarios_proveedor)

WebUI.setText(findTestObject('Object Repository/Compra Referida a Contratos Ital/Page_Purchase Order/input_Data di consegna_application-zpurchas_480c8e'), 
    fecha_entrega)

WebUI.setText(findTestObject('Object Repository/Compra Referida a Contratos Ital/Page_Purchase Order/input_Quantit_application-zpurchaseorder-cr_3fd60a'), 
    cantidad)

WebUI.click(findTestObject('Object Repository/Compra Referida a Contratos Ital/Page_Purchase Order/bdi_Controllare'))

WebUI.click(findTestObject('Object Repository/Compra Referida a Contratos Ital/Page_Purchase Order/span_OK'))

WebUI.click(findTestObject('Object Repository/Compra Referida a Contratos Ital/Page_Purchase Order/bdi_Savare'))

WebUI.click(findTestObject('Object Repository/Compra Referida a Contratos Ital/Page_Purchase Order/span_OA Contratto creatoa con il numero 4500857933'))

WebUI.click(findTestObject('Object Repository/Compra Referida a Contratos Ital/Page_Purchase Order/bdi_OK'))

WebUI.takeFullPageScreenshot()

