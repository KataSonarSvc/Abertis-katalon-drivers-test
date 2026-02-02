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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import org.apache.poi.ss.usermodel.*
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

String excel = "DATA PM CREACION ORDEN AUDITORIA ITAL.xlsx"
String filePath = RunConfiguration.getProjectDir() + "/Data Files/Excel/PM/O Auditoria/" + excel

WebUI.callTestCase(findTestCase('Acceso/Login'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.url_utilidades.urlutilidades.openApplicationUrl'('https://saps4-pre.abertis.com/sap/bc/ui2/flp?saml2=disabled&sap-client=100#MaintenanceOrder-create')

WebUI.click(findTestObject('Object Repository/Creación Orden Preventivo IT new ID/Page_Creare Ordine videata iniziale/input_T_InputField'))

WebUI.setText(findTestObject('Creación Orden Preventivo IT new ID/Page_Creare Ordine videata iniziale/input_T_InputField'), 
    ci_orden+Keys.ENTER)
WebUI.delay(5)


WebUI.setText(findTestObject('Object Repository/Creación Orden Preventivo IT new ID/Page_Creare Ordine videata iniziale/input_D_InputField'), 
    ce_planif+Keys.ENTER)


WebUI.setText(findTestObject('Object Repository/Creación Orden Preventivo IT new ID/Page_Creare Manut. Programmata  testata centrale/input_O_InputField'), 
    texto_orden)

WebUI.setText(findTestObject('Object Repository/Creación Orden Preventivo IT new ID/Page_Creare Manut. Programmata  testata centrale/input_C_InputField'), 
    rs_pto_tr)

WebUI.setText(findTestObject('Object Repository/Creación Orden Preventivo IT new ID/Page_Creare Manut. Programmata  testata centrale/input_S_InputField'), 
    ubic_tecn)


WebUI.click(findTestObject('Object Repository/Creación Orden Preventivo IT new ID/Page_Creare Manut. Programmata  testata centrale/div_SalvareEvidenziato'))

WebUI.click(findTestObject('Object Repository/Creación Orden Preventivo IT new ID/Page_Creare Manut. Programmata  testata centrale/div_'))

String fullText = WebUI.getText(findTestObject('Object Repository/Creación Orden Preventivo IT new ID/Page_Creare Manut. Programmata videata iniziale/span_Salvato ordine 200400013402 con avviso_6801a6'))

def matcher = fullText =~ 'Salvato ordine (\\d+) con avviso (\\d+)$'

WebUI.takeScreenshot()

if (matcher.find()) {
    GlobalVariable.DYNAMIC_PEDIDO = matcher.group(1)
	GlobalVariable.DYNAMIC_PEDIDO = matcher.group(1)
	
		println(GlobalVariable.DYNAMIC_PEDIDO)
		
		// Abrir archivo
		FileInputStream fis = new FileInputStream(filePath)
		XSSFWorkbook workbook = new XSSFWorkbook(fis)
		Sheet sheet = workbook.getSheet("Sheet1")
		
		// Buscar índice de columna por nombre ("ORDEN")
		Row headerRow = sheet.getRow(0)
		int targetColumn = -1
		
		for (Cell cell : headerRow) {
			if (cell.getStringCellValue().trim().equalsIgnoreCase("ORDEN")) {
				targetColumn = cell.getColumnIndex()
				break
			}
		}
		
		if (targetColumn == -1) {
			throw new Exception("No se encontró la columna 'ORDEN' en el Excel")
		}
		
		// Escribir en fila 2 (índice 1)
		int rowIndex = 1
		Row row = sheet.getRow(rowIndex)
		if (row == null) row = sheet.createRow(rowIndex)
		
		Cell cell = row.getCell(targetColumn)
		if (cell == null) cell = row.createCell(targetColumn)
		
		cell.setCellValue(GlobalVariable.DYNAMIC_PEDIDO)
		
		// Guardar cambios
		fis.close()
		FileOutputStream fos = new FileOutputStream(filePath)
		workbook.write(fos)
		fos.close()
		workbook.close()
    println(GlobalVariable.DYNAMIC_PEDIDO)
} else {
    KeywordUtil.markFailed('No se ha encontrado el mensaje')
}

WebUI.closeBrowser()

