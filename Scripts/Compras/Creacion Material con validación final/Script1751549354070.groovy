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

CustomKeywords.'com.url_utilidades.urlutilidades.openApplicationUrl'('https://saps4-pre.abertis.com/sap/bc/ui2/flp?saml2=disabled&sap-client=100#Material-create')

WebUI.click(findTestObject('Object Repository/Creación Material/Page_Crear material (Acceso)/span_R_M046217-btn'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Creación Material/Page_Crear material (Acceso)/div_Abertis', [('option') : ramo_option]))

WebUI.click(findTestObject('Object Repository/Creación Material/Page_Crear material (Acceso)/span_T_M046317-btn'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Creación Material/Page_Crear material (Acceso)/div_Stock Sanef', [('option') : tipo_material_option]))

WebUI.click(findTestObject('Object Repository/Creación Material/Page_Crear material (Acceso)/div_ContinuarResaltado'))

WebUI.click(findTestObject('Object Repository/Creación Material/Page_Crear material (Acceso)/div_'))

WebUI.click(findTestObject('Object Repository/Creación Material/Page_Crear material (Acceso)/div__1'))

WebUI.click(findTestObject('Object Repository/Creación Material/Page_Crear material (Acceso)/div__1_2'))

WebUI.click(findTestObject('Object Repository/Creación Material/Page_Crear material (Acceso)/div__1_2_3'))

WebUI.click(findTestObject('Object Repository/Creación Material/Page_Crear material (Acceso)/div__1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Creación Material/Page_Crear material (Acceso)/div__1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Creación Material/Page_Crear material (Acceso)/div__1_2_3_4_5_6'))

WebUI.click(findTestObject('Object Repository/Creación Material/Page_Crear material (Acceso)/div__1_2_3_4_5_6_7'))

WebUI.setText(findTestObject('Object Repository/Creación Material/Page_Crear material (Acceso)/input_C_InputField'), centro)

WebUI.setText(findTestObject('Object Repository/Creación Material/Page_Crear material (Acceso)/input_A_InputField'), almacen)

WebUI.sendKeys(findTestObject('Creación Material/Page_Crear material (Acceso)/input_A_InputField'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Creación Material/Page_Crear material 28440 (Stock Sanef)/input_D_InputField'), 
    denomin)

WebUI.setText(findTestObject('Object Repository/Creación Material/Page_Crear material 28440 (Stock Sanef)/input_U_InputField'), 
    unidad_medida)

WebUI.setText(findTestObject('Object Repository/Creación Material/Page_Crear material 28440 (Stock Sanef)/input_G_InputField'), 
    grupo_articulos)

WebUI.click(findTestObject('Object Repository/Creación Material/Page_Crear material 28440 (Stock Sanef)/div_Unidad medida baseGrupo artculosN antig_3b8334'))

WebUI.click(findTestObject('Object Repository/Creación Material/Page_Crear material 28440 (Stock Sanef)/span_Datos base 2'))

WebUI.click(findTestObject('Object Repository/Creación Material/Page_Crear material 28440 (Stock Sanef)/span_Datos Adicionales_M0461-next'))

WebUI.click(findTestObject('Object Repository/Creación Material/Page_Crear material 28440 (Stock Sanef)/span_F_M0461-prevLeft'))

WebUI.click(findTestObject('Object Repository/Creación Material/Page_Crear material 28440 (Stock Sanef)/span_Compras'))

WebUI.click(findTestObject('Object Repository/Creación Material/Page_Crear material 28440 (Stock Sanef)/span_Datos Adicionales_M0461-next'))

WebUI.click(findTestObject('Object Repository/Creación Material/Page_Crear material 28440 (Stock Sanef)/span_Texto pedido compras'))

WebUI.setText(findTestObject('Object Repository/Creación Material/Page_Crear material 28440 (Stock Sanef)/textarea_I_texteditTEC_cnt0'), 
    texto_idiomas)

WebUI.click(findTestObject('Object Repository/Creación Material/Page_Crear material 28440 (Stock Sanef)/span_Datos Adicionales_M0461-next'))

WebUI.click(findTestObject('Object Repository/Creación Material/Page_Crear material 28440 (Stock Sanef)/span_Contabilidad 1'))

WebUI.setText(findTestObject('Object Repository/Creación Material/Page_Crear material 28440 (Stock Sanef)/input_C_InputField'), 
    cat_valoracion)

WebUI.click(findTestObject('Object Repository/Creación Material/Page_Crear material 28440 (Stock Sanef)/div_Stock totalUM baseUnidadSectorTipo valo_343906'))

WebUI.setText(findTestObject('Object Repository/Creación Material/Page_Crear material 28440 (Stock Sanef)/input_P_InputField'), 
    prec_inter_per)

WebUI.click(findTestObject('Object Repository/Creación Material/Page_Crear material 28440 (Stock Sanef)/div_Tipo monedaMoneda de la sociedadMoneda _ffde7a'))

WebUI.click(findTestObject('Object Repository/Creación Material/Page_Crear material 28440 (Stock Sanef)/div_GuardarResaltado'))

WebUI.sendKeys(findTestObject('Object Repository/Creación Material/Page_Crear material 28440 (Stock Sanef)/input_P_InputField'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Creación Material/Page_Crear material 28440 (Stock Sanef)/Boton_confirmar_ultima_pantalla'))

WebUI.delay(3)

String text = WebUI.getText(findTestObject('Object Repository/Creación Material/Page_Crear material (Acceso)/span_Se crea el material 28440'))

List<String> regexList = ['Se crea el material (\\d+) \\.', 'L\'article (\\d+) est créé', 'Material (\\d+) created', 'Material (\\d+) é criado'
    , 'Materiale (\\d+) creato']

boolean matches = regexList.any({ 
        text ==~ it
    })

assert matches

WebUI.takeFullPageScreenshot()

