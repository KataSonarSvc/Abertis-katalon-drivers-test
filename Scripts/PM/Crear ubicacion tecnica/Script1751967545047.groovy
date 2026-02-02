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

WebUI.click(findTestObject('Object Repository/Crear ubicacion tecnica/Page_Pgina de inicio/span_'))

WebUI.setText(findTestObject('Object Repository/Crear ubicacion tecnica/Page_Pgina de inicio/input_Todo_search'), 'crear ubicacion tecnica')

WebUI.sendKeys(findTestObject('Object Repository/Crear ubicacion tecnica/Page_Pgina de inicio/input_Todo_search'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Crear ubicacion tecnica/Page_Bsqueda de crear ubicacion tecnica/span_Crear ubicacin tcnica'))

WebUI.click(findTestObject('Object Repository/Crear ubicacion tecnica/Page_Crear ubicacin tcnica Acceso/input_I_InputField'))

WebUI.click(findTestObject('Object Repository/Crear ubicacion tecnica/Page_Crear ubicacin tcnica Acceso/span_D_ls-inputfieldhelpbutton'))

WebUI.click(findTestObject('Object Repository/Crear ubicacion tecnica/Page_Crear ubicacin tcnica Acceso/div_'))

WebUI.click(findTestObject('Object Repository/Crear ubicacion tecnica/Page_Crear ubicacin tcnica Acceso/div_OKResaltado'))

WebUI.click(findTestObject('Object Repository/Crear ubicacion tecnica/Page_Crear ubicacin tcnica Acceso/input_T_InputField'))

WebUI.click(findTestObject('Object Repository/Crear ubicacion tecnica/Page_Crear ubicacin tcnica Acceso/span_D_ls-inputfieldhelpbutton'))

WebUI.click(findTestObject('Object Repository/Crear ubicacion tecnica/Page_Crear ubicacin tcnica Acceso/div_OKResaltado'))

WebUI.setText(findTestObject('Object Repository/Crear ubicacion tecnica/Page_Crear ubicacin tcnica Acceso/input_U_InputField'), 
    ubicacion_tecnica)

WebUI.sendKeys(findTestObject('Crear ubicacion tecnica/Page_Crear ubicacin tcnica Acceso/input_U_InputField'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Crear ubicacion tecnica/Page_Crear ubicacin tcnica Datos maestros/input_D_InputField'), 
    descripcion)

WebUI.click(findTestObject('Object Repository/Crear ubicacion tecnica/Page_Crear ubicacin tcnica Datos maestros/div_GrabarResaltado'))

WebUI.click(findTestObject('Object Repository/Crear ubicacion tecnica/Page_Crear ubicacin tcnica Acceso/span_Se ha creado la ubicacin tcnica E1-004_76d384'))

