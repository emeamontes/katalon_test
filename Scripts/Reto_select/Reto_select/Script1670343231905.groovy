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

WebUI.navigateToUrl('https://testsheepnz.github.io/BasicCalculator.html')

WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('Reto_select/Campo_1'), 0)

WebUI.delay(2)

WebUI.setText(findTestObject('Reto_select/Campo_1'), '5')

WebUI.delay(2)

WebUI.setText(findTestObject('Reto_select/Campo_2'), '8')

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Reto_select/Seleccionar'), 'Multiply', false)

WebUI.delay(2)

WebUI.click(findTestObject('Reto_select/Calcular'))

WebUI.delay(2)

WebUI.closeBrowser()

