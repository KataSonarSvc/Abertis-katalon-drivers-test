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

CustomKeywords.'com.url_utilidades.urlutilidades.openApplicationUrl'('https://saps4-pre.abertis.com/sap/bc/ui2/flp?saml2=disabled&sap-client=100&sap-ushell-config=lean#zpurchaserequisitionlr-minorPurchasing')

WebUI.click(findTestObject('Object Repository/Compra Menor AMS New New/Page_Minor Purchasing/bdi_Positions of Purchase Requisitions (16)_ee2e51'))

WebUI.setText(findTestObject('Object Repository/Compra Menor AMS New New/Page_Solicitud de pedido/textarea_PurchaseContracting purpose_applic_b15c97'), 
    purchase)

WebUI.setText(findTestObject('Object Repository/Compra Menor AMS New New/Page_Solicitud de pedido/input_Supplier_application-zpurchaserequisi_6cb826'), 
    supplier)

WebUI.setText(findTestObject('Object Repository/Compra Menor Capex Sanef New/Page_Solicitud de pedido/input_Centre de cots_application-zpurchaser_6e4540'), 
    plant)

WebUI.setText(findTestObject('Object Repository/Compra Menor AMS New New/Page_Solicitud de pedido/input_Cost Center_application-zpurchaserequ_5ee79b'), 
    acc_type)

WebUI.setText(findTestObject('Object Repository/Compra Menor AMS New New/Page_Solicitud de pedido/input_Cost Center_application-zpurchaserequ_a9f86c'), 
    material)

WebUI.setText(findTestObject('Object Repository/Compra Menor AMS New New/Page_Solicitud de pedido/input_Cost Center_application-zpurchaserequ_7f29f4'), 
    short_text)

WebUI.setText(findTestObject('Object Repository/Compra Menor AMS New New/Page_Solicitud de pedido/input_By checking this field you can break _484092'), 
    quality_requested)

WebUI.setText(findTestObject('Object Repository/Compra Menor AMS New New/Page_Solicitud de pedido/input_Value State Information_application-z_f5e223'), 
    delivery_date)

WebUI.setText(findTestObject('Compra Menor AMS New New/Page_Solicitud de pedido/input_elemento_pep'), wbs_element)

WebUI.click(findTestObject('Object Repository/Compra Menor AMS New New/Page_Solicitud de pedido/bdi_Items_application-zpurchaserequisition-_7d39a0'))

WebUI.setText(findTestObject('Object Repository/Compra Menor AMS New New/Page_Solicitud de pedido/input_WBS element_application-zpurchaserequ_24dfc7'), 
    wbs_element)

WebUI.click(findTestObject('Object Repository/Compra Menor AMS New New/Page_Solicitud de pedido/span_Show More_application-zpurchaserequisi_1c6b7f'))

WebUI.click(findTestObject('Object Repository/Compra Menor AMS New New/Page_Solicitud de pedido/bdi_Check_application-zpurchaserequisition-_58ef94'))

WebUI.setText(findTestObject('Object Repository/Compra Menor AMS New New/Page_Solicitud de pedido/textarea_Comments to supplier_application-z_2489ff'), 
    comments_to_supplier)

WebUI.click(findTestObject('Object Repository/Compra Menor AMS New New/Page_Solicitud de pedido/span_Show More_application-zpurchaserequisi_0bb51d'))

WebUI.click(findTestObject('Object Repository/Compra Menor/Page_Solicitud de pedido/span_Check'))

WebUI.click(findTestObject('Object Repository/Compra Menor/Page_Solicitud de pedido/span_OK'))

WebUI.click(findTestObject('Object Repository/Compra Menor/Page_Solicitud de pedido/span_Save'))

WebUI.click(findTestObject('Object Repository/Compra Menor/Page_Solicitud de pedido/span_Success'))

WebUI.takeFullPageScreenshot()

