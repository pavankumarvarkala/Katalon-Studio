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

WebUI.setText(findTestObject('Object Repository/LogOut/input_Email_email'), 'rchadmin@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/LogOut/input_Password_password'), 'p4y+y39Ir5Pc2g9xt3QkeQ==')

WebUI.click(findTestObject('Object Repository/LogOut/button_Submit'))

WebUI.click(findTestObject('Object Repository/LogOut/img_LXMedical Admin_h-8 w-8 rounded-full'))

WebUI.click(findTestObject('Object Repository/LogOut/div_Sign Out'))

WebUI.click(findTestObject('Object Repository/LogOut/button_Confirm'))

WebUI.closeBrowser()

