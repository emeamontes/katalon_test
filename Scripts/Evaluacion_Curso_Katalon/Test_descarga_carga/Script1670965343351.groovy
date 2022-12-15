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
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import com.kms.katalon.core.annotation.Keyword as Keyword

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demre.cl/publicaciones/modelos-resoluciones-pruebas')

WebUI.maximizeWindow()

WebUI.scrollToPosition(0, 400)

WebUI.click(findTestObject('Object Repository/DATA_FINAL/Carga_descarga/Page_Modelos de Pruebas - DEMRE/span_Modelo de Prueba Comprensin Lectora'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/DATA_FINAL/Carga_descarga/Page_Modelo de Prueba de Comprensin Lectora_f2d623/span_PDF (2,67Mb)'))

WebUI.delay(2)

WebUI.navigateToUrl('https://demoqa.com/upload-download')

WebUI.maximizeWindow()

WebUI.click(findTestObject('DATA_FINAL/Carga_descarga/Page_ToolsQA/Page_ToolsQA/Page_ToolsQA/label_Select a file'))

Robot robot = new Robot()

robot.keyPress(KeyEvent.VK_TAB)

robot.keyRelease(KeyEvent.VK_TAB)

WebUI.delay(2)

robot.keyPress(KeyEvent.VK_TAB)

robot.keyRelease(KeyEvent.VK_TAB)

WebUI.delay(2)

robot.keyPress(KeyEvent.VK_TAB)

robot.keyRelease(KeyEvent.VK_TAB)

WebUI.delay(2)

robot.keyPress(KeyEvent.VK_TAB)

robot.keyRelease(KeyEvent.VK_TAB)

WebUI.delay(2)

robot.keyPress(KeyEvent.VK_TAB)

robot.keyRelease(KeyEvent.VK_TAB)

WebUI.delay(2)

robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)

WebUI.delay(2)

robot.keyPress(KeyEvent.VK_D)

robot.keyRelease(KeyEvent.VK_D)

robot.keyPress(KeyEvent.VK_E)

robot.keyRelease(KeyEvent.VK_E)

robot.keyPress(KeyEvent.VK_S)

robot.keyRelease(KeyEvent.VK_S)

robot.keyPress(KeyEvent.VK_C)

robot.keyRelease(KeyEvent.VK_C)

robot.keyPress(KeyEvent.VK_A)

robot.keyRelease(KeyEvent.VK_A)

robot.keyPress(KeyEvent.VK_R)

robot.keyRelease(KeyEvent.VK_R)

robot.keyPress(KeyEvent.VK_G)

robot.keyRelease(KeyEvent.VK_G)

robot.keyPress(KeyEvent.VK_A)

robot.keyRelease(KeyEvent.VK_A)

robot.keyPress(KeyEvent.VK_S)

robot.keyRelease(KeyEvent.VK_S)

WebUI.delay(2)

robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)

WebUI.delay(2)

robot.keyPress(KeyEvent.VK_TAB)

robot.keyRelease(KeyEvent.VK_TAB)

WebUI.delay(2)

robot.keyPress(KeyEvent.VK_TAB)

robot.keyRelease(KeyEvent.VK_TAB)

WebUI.delay(2)

robot.keyPress(KeyEvent.VK_TAB)

robot.keyRelease(KeyEvent.VK_TAB)

WebUI.delay(2)

robot.keyPress(KeyEvent.VK_TAB)

robot.keyRelease(KeyEvent.VK_TAB)

WebUI.delay(2)

robot.keyPress(KeyEvent.VK_DOWN)

robot.keyRelease(KeyEvent.VK_DOWN)

WebUI.delay(2)

robot.keyPress(KeyEvent.VK_UP)

robot.keyRelease(KeyEvent.VK_UP)

WebUI.delay(2)

robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)

WebUI.takeScreenshot('C:\\Users\\Public\\Pictures\\carga_evidencia1.png')

WebUI.delay(4)

subido = WebUI.verifyElementVisible(findTestObject('DATA_FINAL/Carga_descarga/Page_ToolsQA/Page_ToolsQA/Page_ToolsQA/Cargado'), 
    FailureHandling.STOP_ON_FAILURE)

if (subido == true) {
    print('Elemento subido correctamente \n')
} else {
    print('Elemento no cargado \n')
}

WebUI.delay(4)

WebUI.closeBrowser()

