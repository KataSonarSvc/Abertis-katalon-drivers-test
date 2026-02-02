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

WebUI.setText(findTestObject('Object Repository/Listado documentos medicion/Page_Entrada al sistema/input_Usuario_sap-user'), 
    'MA_MTOROFRI')

WebUI.setEncryptedText(findTestObject('Object Repository/Listado documentos medicion/Page_Entrada al sistema/input_Clave de acceso_sap-password'), 
    'smf9zuhvlFgeXrP12++MuEc4gFyQHvEt')

WebUI.click(findTestObject('Object Repository/Listado documentos medicion/Page_Entrada al sistema/button_Acceder al sistema'))

WebUI.click(findTestObject('Object Repository/Listado documentos medicion/Page_Pgina de inicio/span_'))

WebUI.setText(findTestObject('Object Repository/Listado documentos medicion/Page_Pgina de inicio/input_Todo_search'), 'listado de documentos d medicion')

WebUI.sendKeys(findTestObject('Object Repository/Listado documentos medicion/Page_Pgina de inicio/input_Todo_search'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Listado documentos medicion/Page_Bsqueda de listado de documentos d medicion/span_Listado de Documentos de Medicin'))

WebUI.click(findTestObject('Object Repository/Listado documentos medicion/Page_Listado documentos de medicin/span_Creado el_application-ZPM_SMART-ListMe_8a11d1'))

WebUI.click(findTestObject('Object Repository/Listado documentos medicion/Page_Listado documentos de medicin/span_Este ao'))

WebUI.click(findTestObject('Object Repository/Listado documentos medicion/Page_Listado documentos de medicin/span_Ir'))

WebUI.click(findTestObject('Object Repository/Listado documentos medicion/Page_Listado documentos de medicin/span_Todos___filter2-icon'))

WebUI.click(findTestObject('Object Repository/Listado documentos medicion/Page_Listado documentos de medicin/span_Contador___filter3-icon'))

WebUI.click(findTestObject('Object Repository/Listado documentos medicion/Page_Listado documentos de medicin/span_No Contador___filter4-icon'))

WebUI.click(findTestObject('Object Repository/Listado documentos medicion/Page_Listado documentos de medicin/span_Fecha medicin___filter1-icon'))

