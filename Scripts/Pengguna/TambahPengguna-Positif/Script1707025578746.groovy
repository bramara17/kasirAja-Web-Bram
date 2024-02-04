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

WebUI.navigateToUrl(GlobalVariable.baseURL)

WebUI.delay(5)

WebUI.sendKeys(findTestObject('LoginPage/emailInput'), GlobalVariable.email)

WebUI.sendKeys(findTestObject('LoginPage/passInput'), GlobalVariable.pass)

WebUI.click(findTestObject('LoginPage/btnLogin'))

WebUI.delay(5)

WebUI.click(findTestObject('Dashboard/menuPengguna'))

WebUI.delay(5)

WebUI.click(findTestObject('Dashboard/Pengguna/btnTambah'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Dashboard/Pengguna/inputNama'), GlobalVariable.addNama)

WebUI.sendKeys(findTestObject('Dashboard/Pengguna/inputEmail'), GlobalVariable.addEmail)

WebUI.sendKeys(findTestObject('Dashboard/Pengguna/inputPassword'), GlobalVariable.addPswd)

WebUI.click(findTestObject('Dashboard/Pengguna/btnSimpan'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Dashboard/Pengguna/alertAddSuccess'), 0)

WebUI.closeBrowser()

