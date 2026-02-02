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

WebUI.click(findTestObject('Object Repository/Listado ZPM_PREV_MAINT/Page_Pgina de inicio/span_'))

WebUI.setText(findTestObject('Object Repository/Listado ZPM_PREV_MAINT/Page_Pgina de inicio/input_Todo_search'), 'zpm_prev_maint')

WebUI.sendKeys(findTestObject('Object Repository/Listado ZPM_PREV_MAINT/Page_Pgina de inicio/input_Todo_search'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Listado ZPM_PREV_MAINT/Page_Bsqueda de zpm_prev_maint/div_ZPM_PREV_MAINT___content13-__clone102'))

WebUI.setText(findTestObject('Object Repository/Listado ZPM_PREV_MAINT/Page_Report mantenimiento programado/input_D_InputField'), 
    '01062025')

WebUI.setText(findTestObject('Object Repository/Listado ZPM_PREV_MAINT/Page_Report mantenimiento programado/input_A_InputField'), 
    '01062025')

WebUI.setText(findTestObject('Object Repository/Listado ZPM_PREV_MAINT/Page_Report mantenimiento programado/input_C_InputField'), 
    '3301')

WebUI.click(findTestObject('Object Repository/Listado ZPM_PREV_MAINT/Page_Report mantenimiento programado/div_De fechaATp.plan manten.aPlan mant.prev_7357d3'))

WebUI.click(findTestObject('Object Repository/Listado ZPM_PREV_MAINT/Page_Report mantenimiento programado/div_EjecutarResaltado'))

WebUI.click(findTestObject('Object Repository/Listado ZPM_PREV_MAINT/Page_Report mantenimiento programado/span_Plan mant.preventivo'))

