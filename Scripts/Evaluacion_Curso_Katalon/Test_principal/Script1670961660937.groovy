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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.easy.cl/')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(4)

WebUI.click(findTestObject('Object Repository/DATA_FINAL/Page_Easy.cl - Renueva el amor por tu hogar/button_No, Gracias'))

WebUI.verifyElementPresent(findTestObject('DATA_FINAL/Page_Easy.cl - Renueva el amor por tu hogar/div_Categoras'), 2)

WebUI.verifyTextPresent('Categorías', false)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/DATA_FINAL/Page_Easy.cl - Renueva el amor por tu hogar/svg_Tiendas_easycl-mega-menu-0-x-triggerBut_f82560'))

WebUI.click(findTestObject('Object Repository/DATA_FINAL/Page_Easy.cl - Renueva el amor por tu hogar/div_Muebles'))

WebUI.verifyElementPresent(findTestObject('DATA_FINAL/Page_Muebles/div_Muebles Muebles'), 2)

WebUI.scrollToPosition(0, 500)

WebUI.click(findTestObject('Object Repository/DATA_FINAL/Page_Muebles/a_Ver ms'))

WebUI.takeScreenshot('C:\\Users\\Public\\Pictures\\principal_evidencia1.png')

WebUI.delay(2)

consola = WebUI.getText(findTestObject('Object Repository/DATA_FINAL/Page_Muebles/div_Muebles de Living y Sala de Estar (2630_695847'))
print (consola)

WebUI.waitForElementClickable(findTestObject('DATA_FINAL/Page_Muebles/Cajas'), 2)

WebUI.click(findTestObject('DATA_FINAL/Page_Muebles/Cajas'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 250)

WebUI.click(findTestObject('Object Repository/DATA_FINAL/Page_Easy/span_Aadir al carro'))

WebUI.takeScreenshot('C:\\Users\\Public\\Pictures\\principal_evidencia2.png')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/DATA_FINAL/Page_Easy/a_Ir al carro de compras'))

WebUI.takeScreenshot('C:\\Users\\Public\\Pictures\\principal_evidencia3.png')

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('DATA_FINAL/Page_Easy.cl - Finalizar la compra/Carrito'), 2)

WebUI.delay(2)

WebUI.verifyTextPresent('Tu carro de compras', false)

String verificarUrl = WebUI.getUrl()

if (verificarUrl == 'https://www.easy.cl/checkout/#/cart') {
    println('OK')
} else {
    println('NO OK')
}

WebUI.click(findTestObject('Object Repository/DATA_FINAL/Page_Easy.cl - Finalizar la compra/a_Finalizar compra'))

WebUI.delay(2)

WebUI.navigateToUrl('https://www.easy.cl/checkout/#/cart')

WebUI.delay(2)

WebUI.closeBrowser()

