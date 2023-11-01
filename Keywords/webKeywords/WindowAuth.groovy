package webKeywords


import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import java.awt.Robot
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection
import java.awt.event.KeyEvent


public class WindowAuth {

	@Keyword(keywordObject='WebCustomKeyword')
	def handlePopupAuthenticate(String username, String password) {

		Robot robot = new Robot();

		robot.setAutoDelay(1000);

		StringSelection ss = new StringSelection(username);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		robot.keyPress(KeyEvent.VK_CONTROL);

		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);

		robot.keyPress(KeyEvent.VK_TAB);

		robot.keyRelease(KeyEvent.VK_TAB);

		ss = new StringSelection(password);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		robot.keyPress(KeyEvent.VK_CONTROL);

		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);

		robot.keyPress(KeyEvent.VK_TAB);

		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_ENTER);

		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}


