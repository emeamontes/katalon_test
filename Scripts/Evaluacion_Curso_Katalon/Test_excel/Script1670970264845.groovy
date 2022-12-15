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

WebUI.navigateToUrl('https://demoqa.com/text-box')

WebUI.maximizeWindow()

WebUI.scrollToPosition(0, 200)

WebUI.setText(findTestObject('Object Repository/DATA_FINAL/Excel/Page_ToolsQA/input_Full Name_userName'), FullName)

WebUI.setText(findTestObject('Object Repository/DATA_FINAL/Excel/Page_ToolsQA/input_Email_userEmail'), Email)

WebUI.setText(findTestObject('Object Repository/DATA_FINAL/Excel/Page_ToolsQA/textarea_Current Address_currentAddress'), CurrentAddress)

WebUI.setText(findTestObject('Object Repository/DATA_FINAL/Excel/Page_ToolsQA/textarea_Permanent Address_permanentAddress'), 
    PermanentAddress)

WebUI.takeScreenshot('C:\\Users\\Public\\Pictures\\excel_evidencia1.png')

nombre = findTestData("Data Files/Test_final/Excel").getValue(1, 1)

if(nombre  == FullName ) {
	println('El nombre que se muestra es correcto: '+nombre)
}else {
	println('Error el dato no coincide')
}

WebUI.delay(2)

WebUI.closeBrowser()

