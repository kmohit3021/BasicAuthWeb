import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI



WebUI.openBrowser('')


WebUI.navigateToUrl('http://the-internet.herokuapp.com/basic_auth')

WebUI.maximizeWindow()

WebUI.delay(5)

Runtime.getRuntime().exec(RunConfiguration.getProjectDir()+"\\UseFile\\winauth2.exe")

WebUI.delay(5)

WebUI.closeBrowser()

