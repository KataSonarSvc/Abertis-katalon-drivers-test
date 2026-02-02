package com.utils

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.util.KeywordUtil
import org.openqa.selenium.*
import org.openqa.selenium.interactions.Actions

public class ScrollUtils {

	@Keyword
	def scrollElementToPosition(TestObject elementObj, int position) {
		WebElement element = WebUI.findWebElement(elementObj)
		JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getWebDriver()

		js.executeScript("""
			arguments[0].scrollTop = arguments[1];
		""", element, position)
	}

	/**
	 * Alternative: physically drag a draggable fake scrollbar handle
	 * Use only if the scrollbar is an actual DOM element you can click & drag
	 */
	@Keyword
	def scrollHorizontalFakeScrollbarUntilElementVisible(TestObject scrollContainer, TestObject targetElement, int step = 100, int maxLoops = 20) {
		 WebDriver driver = DriverFactory.getWebDriver()
	    JavascriptExecutor js = (JavascriptExecutor) driver
	
	    // Find elements safely
	    WebElement container = WebUI.findWebElement(scrollContainer, 3)
	    WebElement target = WebUI.findWebElement(targetElement, 3)
	
	    boolean fullyVisible = false
	
	    for (int i = 0; i < maxLoops; i++) {
	
	        // Check if fully visible within container
	        fullyVisible = (Boolean) js.executeScript("""
	            var elem = arguments[0];
	            var container = arguments[1];
	            if (!elem || !container) return false;
	
	            var rect = elem.getBoundingClientRect();
	            var containerRect = container.getBoundingClientRect();
	
	            return rect.left >= containerRect.left &&
	                   rect.right <= containerRect.right &&
	                   rect.top >= containerRect.top &&
	                   rect.bottom <= containerRect.bottom;
	        """, target, container)
	
	        if (fullyVisible) {
	            println "✅ Element is fully visible after ${i} scroll steps."
	            return true
	        }
	
	        // Scroll container horizontally
	        js.executeScript("arguments[0].scrollLeft += arguments[1];", container, step)
	        WebUI.delay(0.3)
	    }
	
	    KeywordUtil.markWarning("⚠️ Element not fully visible after scrolling ${step * maxLoops}px horizontally.")
	    return false
	}
}
