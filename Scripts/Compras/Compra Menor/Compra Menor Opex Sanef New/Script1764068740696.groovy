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

WebUI.click(findTestObject('Object Repository/Compra Menor Imputacion OPEX Sanef NEW NEW/Page_Achat sans Contrat/bdi_concat(Positions des Demandes d, , Acha_4c2210'))

WebUI.click(findTestObject('Object Repository/Compra Menor Imputacion OPEX Sanef NEW NEW/Page_Solicitud de pedido/bdi_performance.fournisseurssanef.com_appli_a62c97'))

WebUI.setText(findTestObject('Object Repository/Compra Menor Imputacion OPEX Sanef NEW NEW/Page_Solicitud de pedido/input_Fournisseur_application-zpurchaserequ_a579cd'), 
    fournisseur)

WebUI.setText(findTestObject('Object Repository/Compra Menor Imputacion OPEX Sanef NEW NEW/Page_Solicitud de pedido/textarea_Raisons de lachat Contrat()_applic_04ee72'), 
    raisons_de_l_achat)

WebUI.setText(findTestObject('Object Repository/Compra Menor Capex Sanef New/Page_Solicitud de pedido/input_Centre de cots_application-zpurchaser_6e4540'), 
    division)

WebUI.setText(findTestObject('Object Repository/Compra Menor Imputacion OPEX Sanef NEW NEW/Page_Solicitud de pedido/input_Centre de cots_application-zpurchaser_203737'), 
    centre_cost)

WebUI.setText(findTestObject('Object Repository/Compra Menor Imputacion OPEX Sanef NEW NEW/Page_Solicitud de pedido/input_Centre de cots_application-zpurchaser_431e33'), 
    article)

WebUI.setText(findTestObject('Object Repository/Compra Menor Imputacion OPEX Sanef NEW NEW/Page_Solicitud de pedido/input_Centre de cots_application-zpurchaser_4e3c42'), 
    designat)

WebUI.setText(findTestObject('Object Repository/Compra Menor Imputacion OPEX Sanef NEW NEW/Page_Solicitud de pedido/input_En cochant ce champ, vous pouvez dcom_3b827b'), 
    quantite)

WebUI.setText(findTestObject('Object Repository/Compra Menor Imputacion OPEX Sanef NEW NEW/Page_Solicitud de pedido/input_Statut de valeur Information_applicat_ec6b21'), 
    date_livraison)

WebUI.setText(findTestObject('Object Repository/Compra Menor Imputacion OPEX Sanef NEW NEW/Page_Solicitud de pedido/input_Statut de valeur Information_applicat_4de40f'), 
    centre_de_couts)

WebUI.click(findTestObject('Object Repository/Compra Menor Imputacion OPEX Sanef NEW NEW/Page_Solicitud de pedido/circle_Centre de cots_sapMRbBInn'))

WebUI.click(findTestObject('Object Repository/Compra Menor Imputacion OPEX Sanef NEW NEW/Page_Solicitud de pedido/bdi_Postes_application-zpurchaserequisition_71d273'))

WebUI.setText(findTestObject('Object Repository/Compra Menor Imputacion OPEX Sanef NEW NEW/Page_Solicitud de pedido/input_Localisation_application-zpurchasereq_5eec22'), 
    localisation)

WebUI.setText(findTestObject('Object Repository/Compra Menor Imputacion OPEX Sanef NEW NEW/Page_Solicitud de pedido/input_Activit_application-zpurchaserequisit_228a87'), 
    activite)

WebUI.click(findTestObject('Object Repository/Compra Menor Imputacion OPEX Sanef NEW NEW/Page_Solicitud de pedido/div_Adresse de livraison___container51--Grid'))

WebUI.setText(findTestObject('Object Repository/Compra Menor Imputacion OPEX Sanef NEW NEW/Page_Solicitud de pedido/input_concat(Slectionner  Numro d, , adress_400651'), 
    numero_d_adresse)

WebUI.click(findTestObject('Object Repository/Compra Menor Imputacion OPEX Sanef NEW NEW/Page_Solicitud de pedido/span_Ville___dialog0-table-0-control-__clone2019'))

WebUI.click(findTestObject('Object Repository/Compra Menor Imputacion OPEX Sanef NEW NEW/Page_Solicitud de pedido/span_Afficher plus_application-zpurchasereq_5f9114'))

WebUI.click(findTestObject('Object Repository/Compra Menor Imputacion OPEX Sanef NEW NEW/Page_Solicitud de pedido/bdi_Achats petit montant (ASMI)_application_f91154'))

WebUI.click(findTestObject('Object Repository/Compra Menor Imputacion OPEX Sanef NEW NEW/Page_Solicitud de pedido/span_Saisie avec succs___mbox-btn-0-inner'))

WebUI.click(findTestObject('Object Repository/Compra Menor Imputacion OPEX Sanef NEW NEW/Page_Solicitud de pedido/span_Sauvegarder Prliminaire_application-zp_41e66c'))

WebUI.click(findTestObject('Object Repository/Compra Menor Imputacion OPEX Sanef NEW NEW/Page_Solicitud de pedido/bdi_concat(Demande d, , achat 2000615149 cr_ffc7cb'))

WebUI.takeFullPageScreenshot()

