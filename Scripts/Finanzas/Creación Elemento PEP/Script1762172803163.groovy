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

CustomKeywords.'com.url_utilidades.urlutilidades.openApplicationUrl'('https://saps4-pre.abertis.com/sap/bc/ui2/flp?saml2=disabled&sap-client=100#Project-process')

WebUI.click(findTestObject('Object Repository/Creacion Elemento PEP/Page_Project Builder/div_'))

WebUI.setText(findTestObject('Object Repository/Creacion Elemento PEP/Page_Project Builder/input_D_InputField'), 'I.AAE.0084')

WebUI.click(findTestObject('Object Repository/Creacion Elemento PEP/Page_Project Builder/div__1'))

WebUI.click(findTestObject('Object Repository/Creacion Elemento PEP/Page_Project Builder Proyecto I.AAE.0084/div_'))

WebUI.click(findTestObject('Object Repository/Creacion Elemento PEP/Page_Project Builder Proyecto I.AAE.0084/span_Elem.PEP'))

def randomNumber = String.format("%04d", new Random().nextInt(10000)) // 0000...9999

String elementoPEP = 'I.AAE.0084.01.56.1'+ randomNumber.toString() // I.AAE.0084.01.56.16028

WebUI.setText(findTestObject('Object Repository/Creacion Elemento PEP/Page_Project Builder Proyecto I.AAE.0084/input_E_InputField'), 
    elementoPEP)

WebUI.setText(findTestObject('Object Repository/Creacion Elemento PEP/Page_Project Builder Proyecto I.AAE.0084/input_E_InputField_1'), 
    'TEST KAT ')

WebUI.click(findTestObject('Object Repository/Creacion Elemento PEP/Page_Project Builder Proyecto I.AAE.0084/div_ResponsableD.PLAN. Y CG AAESolicitanteD_c479c6'))

WebUI.setText(findTestObject('Object Repository/Creacion Elemento PEP/Page_Project Builder Proyecto I.AAE.0084/input_C_InputField'), 
    'CG45')

WebUI.click(findTestObject('Object Repository/Creacion Elemento PEP/Page_Project Builder Proyecto I.AAE.0084/input_C_InputField_1'))

WebUI.click(findTestObject('Object Repository/Creacion Elemento PEP/Page_Project Builder Proyecto I.AAE.0084/input_C_InputField'))

WebUI.setText(findTestObject('Object Repository/Creacion Elemento PEP/Page_Project Builder Proyecto I.AAE.0084/input_C_InputField_1'), 
    '16022')

WebUI.click(findTestObject('Object Repository/Creacion Elemento PEP/Page_Project Builder Proyecto I.AAE.0084/span_Elemento planif'))

WebUI.click(findTestObject('Object Repository/Creacion Elemento PEP/Page_Project Builder Proyecto I.AAE.0084/span_Elemento facturacin'))

'Fechas'
WebUI.click(findTestObject('Object Repository/Creacion Elemento PEP/Page_Project Builder Proyecto I.AAE.0084/span_Fechas'))

WebUI.click(findTestObject('Object Repository/Creacion Elemento PEP/Page_Project Builder Proyecto I.AAE.0084/span_Asign'))

WebUI.click(findTestObject('Object Repository/Creacion Elemento PEP/Page_Project Builder Proyecto I.AAE.0084/span_Control'))

WebUI.click(findTestObject('Object Repository/Creacion Elemento PEP/Page_Project Builder Proyecto I.AAE.0084/span_Campos usuario'))

WebUI.click(findTestObject('Object Repository/Creacion Elemento PEP/Page_Project Builder Proyecto I.AAE.0084/span_Gestin'))

WebUI.click(findTestObject('Object Repository/Creacion Elemento PEP/Page_Project Builder Proyecto I.AAE.0084/span_Superior'))

WebUI.click(findTestObject('Object Repository/Creacion Elemento PEP/Page_Project Builder Proyecto I.AAE.0084/span_Progreso'))

WebUI.click(findTestObject('Object Repository/Creacion Elemento PEP/Page_Project Builder Proyecto I.AAE.0084/span_Txt.expl'))

WebUI.click(findTestObject('Object Repository/Creacion Elemento PEP/Page_Project Builder Proyecto I.AAE.0084/span_Txt.expl'))

WebUI.click(findTestObject('Object Repository/Creacion Elemento PEP/Page_Project Builder Proyecto I.AAE.0084/div_GrabarResaltado'))

WebUI.click(findTestObject('Object Repository/Creacion Elemento PEP/Page_Project Builder/span_Se ha modificado el proyecto I.AAE.0084'))

