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

WebUI.setText(findTestObject('Object Repository/Compra Referida a Contrato Sanef/Page_Commande sur Contrat/input_Contrat_com.abertis.mm.zpowithcontrac_2b89c8'), 
    contrato)

WebUI.sendKeys(findTestObject('Object Repository/Compra Referida a Contrato Sanef/Page_Commande sur Contrat/input_Contrat_com.abertis.mm.zpowithcontrac_2b89c8'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Compra Referida a Contrato Sanef/Page_Commande sur Contrat/circle_concat(Descr. d, , Attr.)_sapMRbBInn'))

WebUI.click(findTestObject('Object Repository/Compra Referida a Contrato Sanef/Page_Commande sur Contrat/bdi_Crer commande sur contrat'))

WebUI.click(findTestObject('Object Repository/Compra Referida a Contrato Sanef/Page_Purchase Order/div_Date de livraison estime___item278-__cl_43ff89'))

WebUI.click(findTestObject('Object Repository/Compra Referida a Contrato Sanef/Page_Purchase Order/bdi_Copier donnes slectionnes'))

WebUI.click(findTestObject('Object Repository/Compra Referida a Contrato Sanef/Page_Purchase Order/bdi_Fermer'))

WebUI.setText(findTestObject('Object Repository/Compra Referida a Contrato Sanef/Page_Purchase Order/textarea_Commentaires au fournisseur_applic_f2ef6b'), 
    comentario_proveedor)

WebUI.setText(findTestObject('Object Repository/Compra Referida a Contrato Sanef/Page_Purchase Order/input_Date livraison_application-zpurchaseo_ed6f7a'), 
    fecha_entrega)

WebUI.setText(findTestObject('Object Repository/Compra Referida a Contrato Sanef/Page_Purchase Order/input_Quantit_application-zpurchaseorder-cr_0fe5d2'), 
    cantidad)

WebUI.click(findTestObject('Object Repository/Compra Referida a Contrato Sanef/Page_Purchase Order/span_Slectionner options'))

WebUI.click(findTestObject('Object Repository/Compra Referida a Contrato Sanef/Page_Purchase Order/span_Opex Sanef'))

WebUI.click(findTestObject('Object Repository/Compra Referida a Contrato Sanef/Page_Purchase Order/span_Catgorie imputation_application-zpurch_6038e4'))

WebUI.click(findTestObject('Object Repository/Compra Referida a Contrato Sanef/Page_Purchase Order/div_42-A150'))

WebUI.click(findTestObject('Object Repository/Compra Referida a Contrato Sanef/Page_Purchase Order/bdi_Donnes supplmentaires'))

WebUI.click(findTestObject('Object Repository/Compra Referida a Contrato Sanef/Page_Purchase Order/span_Localisation_application-zpurchaseorde_dd20c0'))

WebUI.click(findTestObject('Object Repository/Compra Referida a Contrato Sanef/Page_Purchase Order/div_42-LMOET'))

WebUI.click(findTestObject('Object Repository/Compra Referida a Contrato Sanef/Page_Purchase Order/span_Activit_application-zpurchaseorder-cre_85c5d6'))

WebUI.click(findTestObject('Object Repository/Compra Referida a Contrato Sanef/Page_Purchase Order/td_V303'))

WebUI.click(findTestObject('Object Repository/Compra Referida a Contrato Sanef/Page_Purchase Order/span_concat(Numro d, , adresse)_application_955e88'))

WebUI.click(findTestObject('Object Repository/Compra Referida a Contrato Sanef/Page_Purchase Order/div_2539777'))

WebUI.click(findTestObject('Object Repository/Compra Referida a Contrato Sanef/Page_Purchase Order/span_Afficher plus_application-zpurchaseord_188661'))

WebUI.click(findTestObject('Object Repository/Compra Referida a Contrato Sanef/Page_Purchase Order/bdi_Contrler'))

WebUI.click(findTestObject('Object Repository/Compra Referida a Contrato Sanef/Page_Purchase Order/bdi_OK'))

WebUI.click(findTestObject('Object Repository/Compra Referida a Contrato Sanef/Page_Purchase Order/bdi_Enregistrer'))

WebUI.click(findTestObject('Object Repository/Compra Referida a Contrato Sanef/Page_Purchase Order/span_Cde contrat estim cr(e) sous le numro _a129a6'))

WebUI.click(findTestObject('Object Repository/Compra Referida a Contrato Sanef/Page_Purchase Order/span_OK'))

WebUI.takeFullPageScreenshot()

