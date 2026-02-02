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

WebUI.click(findTestObject('Object Repository/Creación Proyecto/Page_Project Builder/div_Crear_Button'))

WebUI.click(findTestObject('Object Repository/Creación Proyecto/Page_Project Builder/span_Proy'))

def randomNumber = String.format('%04d', new Random().nextInt(10000) // 0000...9999
    )

String numProyecto = 'I.AAE.' + randomNumber.toString( // I.AAE.XXXX
    )

WebUI.setText(findTestObject('Object Repository/Creación Proyecto/Page_Project Builder/input_D_InputField'), numProyecto)

WebUI.setText(findTestObject('Object Repository/Creación Proyecto/Page_Project Builder/input_D_InputField_1'), 'TEST KAT')

WebUI.click(findTestObject('Object Repository/Creación Proyecto/Page_Project Builder/span_P_M0461412B257021-btn'))

WebUI.click(findTestObject('Object Repository/Creación Proyecto/Page_Project Builder/div_Grupo-Perfil Proyecto Inversin'))

WebUI.click(findTestObject('Object Repository/Creación Proyecto/Page_Project Builder/span_Dat.bsic'))

WebUI.setText(findTestObject('Object Repository/Creación Proyecto/Page_Project Builder/input_S_InputField'), 'CG45')

WebUI.setText(findTestObject('Object Repository/Creación Proyecto/Page_Project Builder/input_S_InputField_1'), '1116')

WebUI.click(findTestObject('Creación Proyecto/Page_Project Builder/span_Control'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Creación Proyecto/Page_Project Builder/input_R_InputField'), 
    25)

WebUI.setText(findTestObject('Object Repository/Creación Proyecto/Page_Project Builder/input_R_InputField'), '16022')

WebUI.setText(findTestObject('Object Repository/Creación Proyecto/Page_Project Builder/input_S_InputField_1_2'), '16022')

WebUI.click(findTestObject('Object Repository/Creación Proyecto/Page_Project Builder/span_TxtExpl'))

WebUI.click(findTestObject('Object Repository/Creación Proyecto/Page_Project Builder/span_Cpo.usuario'))

WebUI.click(findTestObject('Object Repository/Creación Proyecto/Page_Project Builder/input_C_InputField'))

WebUI.click(findTestObject('Object Repository/Creación Proyecto/Page_Project Builder/span_Casillas de seleccin_ls-inputfieldhelpbutton'))

WebUI.click(findTestObject('Object Repository/Creación Proyecto/Page_Project Builder/div__1'))

WebUI.click(findTestObject('Object Repository/Creación Proyecto/Page_Project Builder/div_OKResaltado'))

WebUI.click(findTestObject('Object Repository/Creación Proyecto/Page_Project Builder/div_GrabarResaltado'))

WebUI.click(findTestObject('Object Repository/Creación Proyecto/Page_Project Builder/span_Se ha creado el proyecto I.AAE.0083'))

