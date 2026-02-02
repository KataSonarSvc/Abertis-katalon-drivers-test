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

CustomKeywords.'com.url_utilidades.urlutilidades.openApplicationUrl'('https://saps4-pre.abertis.com/sap/bc/ui2/flp?saml2=disabled&sap-client=100#MaintenanceObject-createFunctionalLoc')

WebUI.setText(findTestObject('Object Repository/Crear Ubicacion NEW ID/Page_Crear ubicacin tcnica Acceso/input_U_InputField'), 
    'E1-004-0012,040-TES-22')

WebUI.click(findTestObject('Object Repository/Crear Ubicacion NEW ID/Page_Crear ubicacin tcnica Acceso/input_I_InputField'))

WebUI.click(findTestObject('Object Repository/Crear Ubicacion NEW ID/Page_Crear ubicacin tcnica Acceso/span_D_ls-inputfieldhelpbutton'))

WebUI.click(findTestObject('Object Repository/Crear Ubicacion NEW ID/Page_Crear ubicacin tcnica Acceso/div_'))

WebUI.click(findTestObject('Object Repository/Crear Ubicacion NEW ID/Page_Crear ubicacin tcnica Acceso/div_OKResaltado'))

WebUI.click(findTestObject('Object Repository/Crear Ubicacion NEW ID/Page_Crear ubicacin tcnica Acceso/input_T_InputField'))

WebUI.click(findTestObject('Object Repository/Crear Ubicacion NEW ID/Page_Crear ubicacin tcnica Acceso/span_D_ls-inputfieldhelpbutton'))

WebUI.click(findTestObject('Object Repository/Crear Ubicacion NEW ID/Page_Crear ubicacin tcnica Acceso/div__1'))

WebUI.click(findTestObject('Object Repository/Crear Ubicacion NEW ID/Page_Crear ubicacin tcnica Acceso/div_OKResaltado'))

WebUI.click(findTestObject('Object Repository/Crear Ubicacion NEW ID/Page_Crear ubicacin tcnica Acceso/input_U_InputField'))

WebUI.setText(findTestObject('Object Repository/Crear Ubicacion NEW ID/Page_Crear ubicacin tcnica Acceso/input_InputField'), 
    'E1-004-0012,040-TES-22')

WebUI.setText(findTestObject('Object Repository/Crear Ubicacion NEW ID/Page_Crear ubicacin tcnica Datos maestros/input_D_InputField'), 
    'test 21')

WebUI.click(findTestObject('Object Repository/Crear Ubicacion NEW ID/Page_Crear ubicacin tcnica Datos maestros/div_GrabarResaltado'))

WebUI.click(findTestObject('Object Repository/Crear Ubicacion NEW ID/Page_Crear ubicacin tcnica Acceso/span_Se ha creado la ubicacin tcnica E1-004_254166'))

