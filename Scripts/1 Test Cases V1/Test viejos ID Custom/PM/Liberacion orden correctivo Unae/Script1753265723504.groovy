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

WebUI.click(findTestObject('Object Repository/Liberacion Orden correctivo Unae/Page_Pgina de inicio/span_Pgina de inicio_sapUiIconTitle'))

WebUI.click(findTestObject('Object Repository/Liberacion Orden correctivo Unae/Page_Pgina de inicio/div_Gestin de rdenes Correctivo'))

WebUI.click(findTestObject('Object Repository/Liberacion Orden correctivo Unae/Page_Pgina de inicio/bdi_Gestin de rdenes Correctivo'))

WebUI.click(findTestObject('Object Repository/Liberacion Orden correctivo Unae/Page_Gestin de rdenes Correctivo/span_Fecha inicio extrema_application-ZPM_S_79b981'))

WebUI.click(findTestObject('Object Repository/Liberacion Orden correctivo Unae/Page_Gestin de rdenes Correctivo/div_Este ao'))

WebUI.setText(findTestObject('Object Repository/Liberacion Orden correctivo Unae/Page_Gestin de rdenes Correctivo/input_Orden_application-ZPM_SMART-GESTICKET_667dc1'), 
    '200100050740')

WebUI.click(findTestObject('Object Repository/Liberacion Orden correctivo Unae/Page_Gestin de rdenes Correctivo/span_Ir'))

WebUI.click(findTestObject('Object Repository/Liberacion Orden correctivo Unae/Page_Gestin de rdenes Correctivo/div_Pto. Trabajo Ejec___item40-__clone96-se_65b1d6'))

WebUI.click(findTestObject('Object Repository/Liberacion Orden correctivo Unae/Page_Gestin de rdenes Correctivo/span_Copiar___button56-img'))

