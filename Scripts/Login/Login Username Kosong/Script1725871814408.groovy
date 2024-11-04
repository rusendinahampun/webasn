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

//Membuka Browser
WebUI.openBrowser('')

//Membuka Link Url Aplikasi
WebUI.navigateToUrl('https://portal.bisacpns.com/auth/login')

//Membuka maximal window browser
WebUI.maximizeWindow()

//Menginput username pada objcet Login Page/Username Form
//Save capture testing ke folder yang dituju (nama file harus format .png)
WebUI.setText(findTestObject('Login Page/Username Form'), '')
WebUI.takeScreenshot('C:/Program Files (x86)/Katalon_Studio_Free_Windows_64-9.7.1/Capture/Login/Login Username Kosong/usernamekosong.png')

//Menginput password pada object Login Page/Password Form
//Save capture testing ke folder yang dituju (nama file harus format .png)
WebUI.setEncryptedText(findTestObject('Login Page/Password Form'), '+mNPBEwwCkTV75gYoKBmDQ==')
WebUI.takeScreenshot('C:/Program Files (x86)/Katalon_Studio_Free_Windows_64-9.7.1/Capture/Login/Login Username Kosong/password.png')

//Klik button Masuk
WebUI.click(findTestObject('Login Page/Masuk Button'))
WebUI.takeScreenshot('C:/Program Files (x86)/Katalon_Studio_Free_Windows_64-9.7.1/Capture/Login/Login Username Kosong/warning message.png')


//Klik close pada browser
WebUI.closeBrowser()


