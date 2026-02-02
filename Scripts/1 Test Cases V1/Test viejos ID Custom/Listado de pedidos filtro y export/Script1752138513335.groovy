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

WebUI.click(findTestObject('Object Repository/Listado pedidos filtro y export/Page_Pgina de inicio/span_Lista de pedidos'))

WebUI.click(findTestObject('Object Repository/Listado pedidos filtro y export/Page_Lista de pedidos/span_Grupo'))

WebUI.setText(findTestObject('Object Repository/Listado pedidos filtro y export/Page_Lista de pedidos/input_Proveedor_com.abertis.mm.zpurchaseord_5ab44c'), 
    '177806')

WebUI.click(findTestObject('Object Repository/Listado pedidos filtro y export/Page_Lista de pedidos/span_Ir'))

WebUI.click(findTestObject('Object Repository/Listado pedidos filtro y export/Page_Lista de pedidos/span_Opciones_com.abertis.mm.zpurchaseorder_bf60f8'))

