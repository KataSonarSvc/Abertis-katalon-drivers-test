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

CustomKeywords.'com.url_utilidades.urlutilidades.openApplicationUrl'('https://saps4-pre.abertis.com/sap/bc/ui2/flp?saml2=disabled&sap-client=100&sap-ushell-config=lean#zmycontractslr-myContracts')

WebUI.click(findTestObject('Object Repository/Listado contratos new/Page_Contratos existentes/span_Group'))

WebUI.click(findTestObject('Object Repository/Listado contratos new/Page_Contratos existentes/span_Ir'))

WebUI.click(findTestObject('Object Repository/Listado contratos new/Page_Contratos existentes/a_610000448210_1'))

WebUI.click(findTestObject('Object Repository/Listado contratos new/Page_Purchase Order/bdi_Posiciones'))

WebUI.click(findTestObject('Object Repository/Listado contratos new/Page_Purchase Order/div_Posiciones'))

WebUI.click(findTestObject('Object Repository/Listado contratos new/Page_Purchase Order/bdi_Estrategia Liberacin'))

WebUI.click(findTestObject('Object Repository/Listado contratos new/Page_Purchase Order/div_Estrategia Liberacin'))

WebUI.click(findTestObject('Object Repository/Listado contratos new/Page_Purchase Order/bdi_Histrico de documentos'))

WebUI.click(findTestObject('Object Repository/Listado contratos new/Page_Purchase Order/div_Histrico de documentos'))

WebUI.click(findTestObject('Object Repository/Listado contratos new/Page_Purchase Order/span_Datos de Adjudicacin'))

WebUI.click(findTestObject('Object Repository/Listado contratos new/Page_Purchase Order/div_Datos de Adjudicacin'))

WebUI.click(findTestObject('Object Repository/Listado contratos new/Page_Purchase Order/bdi_Datos Generales'))

WebUI.click(findTestObject('Object Repository/Listado contratos new/Page_Purchase Order/span_'))

WebUI.takeFullPageScreenshot()

