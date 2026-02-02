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

CustomKeywords.'com.url_utilidades.urlutilidades.openApplicationUrl'('https://saps4-pre.abertis.com/sap/bc/ui2/flp?saml2=disabled&sap-client=100#Project-processIndividualSettlementOfProjectsOrNetworks')

WebUI.click(findTestObject('Object Repository/Liquidación periodica/Page_Liquidacin real Proyectoelemento PEPgrafo/div_Men'))

WebUI.click(findTestObject('Object Repository/Liquidación periodica/Page_Liquidacin real Proyectoelemento PEPgrafo/td_Detalles'))

WebUI.click(findTestObject('Object Repository/Liquidación periodica/Page_Liquidacin real Proyectoelemento PEPgrafo/span_Fijar sociedad CO'))

WebUI.setText(findTestObject('Object Repository/Liquidación periodica/Page_Liquidacin real Proyectoelemento PEPgrafo/input_S_InputField'), 
    'cg29')

WebUI.click(findTestObject('Object Repository/Liquidación periodica/Page_Liquidacin real Proyectoelemento PEPgrafo/div_Continuar'))

WebUI.setText(findTestObject('Object Repository/Liquidación periodica/Page_Liquidacin real Proyectoelemento PEPgrafo/input_E_InputField'), 
    '1392-nvx021-1')

WebUI.click(findTestObject('Object Repository/Liquidación periodica/Page_Liquidacin real Proyectoelemento PEPgrafo/div_ProyectooElemento PEPoGrafoinclusv.jera_48cd65'))

WebUI.click(findTestObject('Object Repository/Liquidación periodica/Page_Liquidacin real Proyectoelemento PEPgrafo/span_inclusv.jerarqua'))

WebUI.setText(findTestObject('Object Repository/Liquidación periodica/Page_Liquidacin real Proyectoelemento PEPgrafo/input_P_InputField'), 
    '12')

WebUI.setText(findTestObject('Object Repository/Liquidación periodica/Page_Liquidacin real Proyectoelemento PEPgrafo/input_E_InputField_1'), 
    '2025')

WebUI.click(findTestObject('Object Repository/Liquidación periodica/Page_Liquidacin real Proyectoelemento PEPgrafo/span_F_M0461322-btn'))

WebUI.click(findTestObject('Object Repository/Liquidación periodica/Page_Liquidacin real Proyectoelemento PEPgrafo/div_Activacin parcial'))

WebUI.click(findTestObject('Object Repository/Liquidación periodica/Page_Liquidacin real Proyectoelemento PEPgrafo/span_Lista detallada'))

WebUI.click(findTestObject('Object Repository/Liquidación periodica/Page_Liquidacin real Proyectoelemento PEPgrafo/span_Ejec.test'))

WebUI.click(findTestObject('Object Repository/Liquidación periodica/Page_Liquidacin real Proyectoelemento PEPgrafo/div_EjecutarResaltado'))

WebUI.click(findTestObject('Object Repository/Liquidación periodica/Page_Liquidacin real Proyectoelemento PEPgrafo/div_'))

WebUI.click(findTestObject('Object Repository/Liquidación periodica/Page_Liquidacin real Proyectoelemento PEPgr_0e594d/div_Finalizar'))

