import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.authenticate('http://the-internet.herokuapp.com/basic_auth', 'admin', 'admin', 10)


WebUI.delay(5)

WebUI.verifyElementText(findTestObject('OR Basic Auth/Page_The Internet/h3_Basic Auth'), 'Basic Auth')

WebUI.verifyElementText(findTestObject('OR Basic Auth/Page_The Internet/p_Congratulations You must have the proper credentials'), 
    'Congratulations! You must have the proper credentials.')

WebUI.delay(5)

WebUI.closeBrowser()

