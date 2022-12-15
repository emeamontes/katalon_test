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

WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Set_text/Page_ToolsQA/input_Name_firstName'), 'Miguel')

WebUI.setText(findTestObject('Set_text/Page_ToolsQA/input_Name_firstName'), 'Angel')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Set_text/Page_ToolsQA/input_Name_firstName'), 'Juan')

WebUI.clearText(findTestObject('Set_text/Page_ToolsQA/input_Name_firstName'))

WebUI.sendKeys(findTestObject('Set_text/Page_ToolsQA/input_Name_firstName'), 'Miguel')

WebUI.delay(2)

WebUI.check(findTestObject('Set_text/Page_ToolsQA/div_Male'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 250)

WebUI.check(findTestObject('Set_text/Page_ToolsQA/div_Sports'))

WebUI.delay(2)

WebUI.closeBrowser()

