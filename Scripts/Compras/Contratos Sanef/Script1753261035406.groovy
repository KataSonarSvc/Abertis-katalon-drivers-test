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

CustomKeywords.'com.url_utilidades.urlutilidades.openApplicationUrl'('https://saps4-pre.abertis.com/sap/bc/ui2/flp?saml2=disabled&sap-client=100#PurchaseContract-create')

WebUI.setText(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  cran initial/input_F_InputField'), fournisseur)

WebUI.sendKeys(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  cran initial/input_F_InputField'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  cran initial/div_FournisseurType de contratDate du contr_9436e9'))

WebUI.setText(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  cran initial/input_T_InputField'), type_de_contrat)

WebUI.click(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  cran initial/div_FournisseurType de contratDate du contr_9436e9'))

WebUI.setText(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  cran initial/input_O_InputField'), organisation_achats)

WebUI.click(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  cran initial/div_Organisation achatsGroupe dacheteurs'))

WebUI.setText(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  cran initial/input_G_InputField'), groupe_d_acheteurs)

WebUI.sendKeys(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  cran initial/input_G_InputField'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  cran initial/input_S_InputField'), societe)

WebUI.click(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  cran initial/div_'))

WebUI.setText(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  donnes en-tte/input_F_InputField'), fin_validite)

WebUI.setText(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  donnes en-tte/input_V_InputField'), val_cible)

WebUI.sendKeys(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  donnes en-tte/input_V_InputField'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  synthse postes/span_concat(Pour slectionner une ligne, app_60848e'))

WebUI.setText(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  synthse postes/input_concat(Pour slectionner une ligne, ap_38abb6'), 
    i)

WebUI.click(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  synthse postes/span_concat(Pour slectionner une ligne, app_60848e_1'))

WebUI.setText(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  synthse postes/input_concat(Pour slectionner une ligne, ap_38abb6_1'), 
    article)

WebUI.sendKeys(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  synthse postes/input_concat(Pour slectionner une ligne, ap_38abb6_1'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  synthse postes/input_VRD hors page_InputField'), 
    qte_cible)

WebUI.sendKeys(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  synthse postes/input_VRD hors page_InputField'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  synthse postes/input_UND_InputField'), 
    prix_net)

WebUI.sendKeys(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  synthse postes/input_UND_InputField'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  poste 00010/input_E_InputField'), element_d_otp)

WebUI.click(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  poste 00010/div_Primtre ana.OrdreCentre profitElment dO_13fae0'))

WebUI.doubleClick(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  synthse postes/span_300216'))

WebUI.click(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  poste 00010/input_L_InputField'))

WebUI.click(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  poste 00010/span_L_ls-inputfieldhelpbutton'))

WebUI.click(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  poste 00010/div__1'))

WebUI.click(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  poste 00010/div_OKMis en surbrillance'))

WebUI.click(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  poste 00010/div_Menu'))

WebUI.click(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  poste 00010/td_En-tte'))

WebUI.click(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  poste 00010/td_Textes'))

WebUI.click(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  poste 00010/span_Synthse textes'))

WebUI.setText(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  textes en-tte/input_R_InputField'), raison_de_lachat)

WebUI.rightClick(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  textes en-tte/div_Ty.txteTxteSuite txtStatutRaison de lAc_f5aeaf'))

WebUI.click(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  textes en-tte/span_Page suivante'))

WebUI.setText(findTestObject('Contratos Sanef/Page_Crer Contrat  textes en-tte/input_R_InputField_2'), fournisseurs_invites)

WebUI.setText(findTestObject('Contratos Sanef/Page_Crer Contrat  textes en-tte/input_R_InputField_3'), criteres_d_adjudication)

WebUI.click(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  textes en-tte/div_SauvegarderMis en surbrillance'))

WebUI.click(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  textes en-tte/div_Oui'))

WebUI.click(findTestObject('Object Repository/Contratos Sanef/Page_Crer Contrat  cran initial/span_FR March BC (dcom) cr(e) sous le numro_2d9c2c'))

WebUI.takeFullPageScreenshot()

