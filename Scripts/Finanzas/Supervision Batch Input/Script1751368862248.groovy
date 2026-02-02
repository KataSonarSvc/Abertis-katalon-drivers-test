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

CustomKeywords.'com.url_utilidades.urlutilidades.openApplicationUrl'('https://saps4-pre.abertis.com/sap/bc/ui2/flp?saml2=disabled&sap-client=100#zgui_sm35-processBatchInputSession')

WebUI.setText(findTestObject('Object Repository/Supervision Batch Input/Page_Batch input Resumen de juegos de datos/input_J_InputField'), 
    'BI_PWGLI04')

String lsdata = WebUI.getAttribute(findTestObject('Object Repository/Supervision Batch Input/Page_Batch input Resumen de juegos de datos/span_Elem_Nvo'), 
    'lsdata')

WebUI.click(findTestObject('Supervision Batch Input/Page_Batch input Resumen de juegos de datos/div_Elem_tabla_Estado_Nvo'))

WebUI.click(findTestObject('Supervision Batch Input/Page_Batch input Resumen de juegos de datos/div_Liberar'))

WebUI.click(findTestObject('Object Repository/Supervision Batch Input/Page_Batch input Resumen de juegos de datos/div_Ejecutar'))

WebUI.click(findTestObject('Object Repository/Supervision Batch Input/Page_Batch input Resumen de juegos de datos/div_Ejecutar_1'))

WebUI.click(findTestObject('Object Repository/Supervision Batch Input/Page_SAP/div_Resumen juego datos'))

WebUI.click(findTestObject('Object Repository/Supervision Batch Input/Page_Batch input Resumen de juegos de datos/div_Elem_tabla_Estado_Nvo'))

WebUI.click(findTestObject('Object Repository/Supervision Batch Input/Page_Batch input Resumen de juegos de datos/div_Log'))

WebUI.click(findTestObject('Object Repository/Supervision Batch Input/Page_Batch input Resumen de log/div_Visualizar'))

WebUI.click(findTestObject('Object Repository/Supervision Batch Input/Page_Log BI para nombre juego datos BI_PWGLI04/span_Doc.5500000004 se contabiliz en sociedad 1375'))

WebUI.click(findTestObject('Object Repository/Supervision Batch Input/Page_Log BI para nombre juego datos BI_PWGLI04/span_Doc.5500000004 se contabiliz en sociedad 1375'))

WebUI.click(findTestObject('Object Repository/Supervision Batch Input/Page_Log BI para nombre juego datos BI_PWGLI04/span_Doc.5500000004 se contabiliz en sociedad 1375'))

WebUI.doubleClick(findTestObject('Object Repository/Supervision Batch Input/Page_Log BI para nombre juego datos BI_PWGLI04/span_Doc.5500000004 se contabiliz en sociedad 1375'))

String getRowFromLsdata(String lsdata) {
    if ((lsdata == null) || lsdata.trim().isEmpty()) {
        throw new IllegalArgumentException('lsdata is null or empty')
    }
    
    String unescaped

    try {
        unescaped = org.apache.commons.text.StringEscapeUtils.unescapeHtml4(lsdata)
    }
    catch (Throwable t) {
    } 
    
    def m = unescaped =~ '\\[(\\d+)\\s*,\\s*\\d+\\]'

    if (m.find()) {
        return m.group(1)
    }
    
    throw new IllegalStateException('Row index not found in lsdata')
}

