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

WebUI.navigateToUrl('https://qa.rch.build-release.com/admin')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Login/input_Email_email'), 'rchadmin@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/input_Password_password'), 'p4y+y39Ir5Pc2g9xt3QkeQ==')

WebUI.click(findTestObject('Object Repository/Login/button_Submit'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa.rch.build-release.com/admin')

WebUI.setText(findTestObject('Object Repository/Page_LX Medical/input_Email_email'), 'pawan@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_LX Medical/input_Password_password'), 'p4y+y39Ir5Pc2g9xt3QkeQ==')

WebUI.click(findTestObject('Object Repository/Page_LX Medical/button_Submit'))

WebUI.switchToWindowTitle('YOPmail - Disposable Email Address - Anonymous and temporary inbox')

WebUI.setText(findTestObject('Object Repository/Page_YOPmail - Disposable Email Address - A_32619f/input_Type the Email name of your choice_login'), 
    'pawan')

WebUI.click(findTestObject('Object Repository/Page_YOPmail - Disposable Email Address - A_32619f/i_'))

WebUI.switchToWindowTitle('LX Medical')

WebUI.setText(findTestObject('Object Repository/Page_LX Medical/input'), '6')

WebUI.click(findTestObject('Object Repository/Page_LX Medical/button_Submit'))

WebUI.closeBrowser()

