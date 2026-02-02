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

CustomKeywords.'com.url_utilidades.urlutilidades.openApplicationUrl'('https://saps4-pre.abertis.com/sap/bc/ui2/flp?saml2=disabled&sap-client=100#zpurchaserequisitionlr-minorPurchasing')

WebUI.click(findTestObject('Object Repository/Compra Menor/Page_Minor Purchasing/span_Create'))

WebUI.setText(findTestObject('Object Repository/Compra Menor/Page_Solicitud de pedido/span_Supplier_application-zpurchaserequisit_8b86ae'), 
    '181720')

WebUI.setText(findTestObject('Object Repository/Compra Menor/Page_Solicitud de pedido/textarea_PurchaseContracting purpose_applic_b15c97'), 
    'TEST')

WebUI.setText(findTestObject('Object Repository/Compra Menor/Page_Solicitud de pedido/span_Cost Center_application-zpurchaserequi_f1d805'), 
    '52647')

WebUI.setText(findTestObject('Object Repository/Compra Menor/Page_Solicitud de pedido/input_Cost Center_application-zpurchaserequ_efab09'), 
    'TEST')

WebUI.setText(findTestObject('Object Repository/Compra Menor/Page_Solicitud de pedido/input_By checking this field you can break _23d1d2'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Compra Menor/Page_Solicitud de pedido/input_Value State Information_application-z_c62c1d'), 
    '01072026')

WebUI.setText(findTestObject('Object Repository/Compra Menor/Page_Solicitud de pedido/span_Value State Information_application-zp_4749fd'), 
    '7000')

WebUI.click(findTestObject('Object Repository/Compra Menor/Page_Solicitud de pedido/button_More Data'))

WebUI.setText(findTestObject('Object Repository/Compra Menor/Page_Solicitud de pedido/textarea_Comments to supplier_application-z_2489ff'), 
    'TEST')

WebUI.setText(findTestObject('Object Repository/Compra Menor/Page_Solicitud de pedido/textarea_Comments to approver_application-z_06e354'), 
    'TEST')

WebUI.click(findTestObject('Object Repository/Compra Menor/Page_Solicitud de pedido/span_Show More_application-zpurchaserequisi_460bee'))

WebUI.click(findTestObject('Object Repository/Compra Menor/Page_Solicitud de pedido/span_Check'))

WebUI.click(findTestObject('Object Repository/Compra Menor/Page_Solicitud de pedido/span_OK'))

WebUI.click(findTestObject('Object Repository/Compra Menor/Page_Solicitud de pedido/span_Save'))

WebUI.click(findTestObject('Object Repository/Compra Menor/Page_Solicitud de pedido/span_Success'))

