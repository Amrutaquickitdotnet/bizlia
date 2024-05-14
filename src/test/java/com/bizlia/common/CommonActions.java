package com.bizlia.common;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

public class CommonActions {

	protected WebDriver driver;
	public ExtentTest logger;
	private boolean isLocalMachine = true;
	String captchaValue="03AFcWeA74VktaXJR_c8afp2iEl_S8waC1z6VklcyrOutflm-dNrIgr7O-efFEhC5ATEF_0BXkwkktZ8kxZhvlPdTtqM5uNqRdO8Csi6uxZknIGbFSxy3XtLEbIe6-2b8koNOjTgnvkdHiDBFlUVXOSxLs1GjwVvrAlTlPy4SnQvNxcgFh8uhjiWTrAEyXOssKWoorKYAvn46DVSRKI2IgPXzCgsqYqTmVNTfxCFaK3IYys0MAUuvHs16MBdJenLeKw8pI-KkNRY5ybwLteuSKmhImAc4asgFcCDB4KQoYTcq_VAz6dBnkNLH-tJnDFRIJyq2IvrYgaLTwmcjAaRQnNlbi05bhb9p09KxBZydZQMq144YLHca06jlTkce3eUfqE88YrpyUHgXeP6PJeJhvbnTR7VcksiDHyMV6aALR-_mYW9G4W-Rl-eVi2zMIDEQZ3y2Ohi7iVuR-4rjd2ldKj4agO_6i_5Ha59Ve3OoF8AVn-irlbOmP201c63fP5iWCQ0Wcc7u0z5uQLYiRDrt7OblbZJaKbjgTnxlyqjLhxnAUFmwjCu2k63yawmPImFKE6jpR4ohC4mwDQTfXydwjyEdUSP_Vkqa5fcMBDFxvysEUbagHj7X7bfeaJUV_usfP3esVSR__b6KcDgCUH4rSvja0UmIbDh8x44hq4YWUzTMnPj4uTY0PDkMFEcR28DDNd7tjfgtmaAP34zgvp7fG3_AZHjDhFahKVSSkHYMSS3BCVXaurP5OYCbDkPOKeL5UrSznHibF6vJipj7feHCOtWw2rcnHiZoejKlU8q-nQhZ-5qY78nKfVbPIhiIMP0MrEWgxcyhFFQBx5KGP8cQ4UjLC6rC9zeYO5J5IHtgK4QdosYcy7e1I1dLpeByj8UOgqGvUkClkNe-1k1XC4daiMhy-z-EhyvvJLKi54z-nafxWWYfbWB0vFLVbNqcZYAgXsjnRiuCgK3NgT0oDltwzE7CgoyCcwpNizhgJLz6vqXzr0JqRI_ypWgJ_4UEPTRv-7-z69RH96SPnu_Q6T9Zm7rkR5WIRNrMzQhM5_itJWaIrh4-n2u4pzsJbgM5CmsjK8uC5v1_6zT1wkA7aA8Rn8uAyR8NoFlYuzhNJSALpctgG3_jlXNDN8Xtyt6-MwVPyZMbVi9mYKHOC5GuD8--9pwzjaMgVLj9TqNUrvGyaQO-h8v-T0V58vTXh8sa0wbghsTrxFauc8p5vmviXArl1mUC2xpDStmfBZCaFhytPzdUPatlocJ9LnUoHRQSBlnLamp9BM2HPvvZbjkrB7HPeFIn0ZWhmpZMfkQ4EHja8eNeunj3_ywnE4uwUUEOZ3qCYMA6_kqJ7ydID57WUjZsgjTpcblX8lyzXpAmNKi_DpOuKmY-C8t8QwxLschd0SoKdWkAx6gmx5Wa701Vu_KNIi17YEr8STfHQpGCeStIyNbeLhk1UqHjC_m2FjC3ZEmiXGWWdTMj5b2cCc1tuZRKk4_EoRollXTpKtGWaDNOTl7gebNfh1X7DSoaHlOxJx4pL9fhyOwFAiErMMNkk_JsMlOCXvdD3m2V7i8AEg31yLpr9KeWFhTQVOGQqe5psi1AewtMqDVmAXuikEJPT7PvRhxUtvir00gEoNRbTRLC_SsfKvrJCk_w8oj1wbOLsPMsGvmynJaT5bPcu4F_d-gK6_tmrTFxONrT-NZ7tmkm3R8eqr1xZNCDqo8A8nKQAKAvFNRd7tTsGx3Q_anz6hRbQLQSUk2LxVrSEhg";
	

	public CommonActions(WebDriver driver, ExtentTest logger) {
		this.driver = driver;
		this.logger = logger;
	}

	public void moveSliderCondition(WebElement sliderOnCheckBox, WebElement sliderOnCheckBoxLabel, String m) {
		boolean isSelected = sliderOnCheckBox.isSelected();
		if (m == "checked") {
			if (!isSelected) {
				sliderOnCheckBoxLabel.click();
			}
		} else {
			if (isSelected) {
				sliderOnCheckBoxLabel.click();
			}
		}

	}

	
	public void setInput(WebElement elm, char data) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOf(elm));
			elm.clear();
			CharSequence[] charSequenceArray = new CharSequence[1];
			charSequenceArray[0] = String.valueOf(data);
			elm.sendKeys(charSequenceArray);
			logger.pass("<span class='label end-time'><a href=" + getScreenshot() + ">Screenshot</a></span>");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			logger.fail("Step failed due to " + e.getMessage() + "<span class='label end-time'><a href="
					+ getScreenshot() + ">Screenshot</a></span>");
		}
	}

	public void setInput(WebElement elm, char data, String msg) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOf(elm));
			elm.clear();
			CharSequence[] charSequenceArray = new CharSequence[1];
			charSequenceArray[0] = String.valueOf(data);
			elm.sendKeys(charSequenceArray);
			logger.pass(msg + "<span class='label end-time'><a href=" + getScreenshot() + ">Screenshot</a></span>");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			logger.fail("Step failed due to " + e.getMessage() + "<span class='label end-time'><a href="
					+ getScreenshot() + ">Screenshot</a></span>");
		}
	}

	public void setInput(WebElement elm, String data, String msg) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOf(elm));
			elm.clear();
			elm.sendKeys(data);
			logger.pass(msg + "<span class='label end-time'><a href=" + getScreenshot() + ">Screenshot</a></span>");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			logger.fail("Step failed due to " + e.getMessage() + "<span class='label end-time'><a href="
					+ getScreenshot() + ">Screenshot</a></span>");
		}
	}

	public void setInput(By elm, String data, String msg) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOfElementLocated(elm));
			driver.findElement(elm).clear();
			driver.findElement(elm).sendKeys(data);
			logger.pass(msg + "<span class='label end-time'><a href=" + getScreenshot() + ">Screenshot</a></span>");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			logger.fail("Step failed due to " + e.getMessage() + "<span class='label end-time'><a href="
					+ getScreenshot() + ">Screenshot</a></span>");
		}
	}

	public void setInput(String elm, String data, String msg) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(elm))));
			driver.findElement(By.xpath(elm)).clear();
			driver.findElement(By.xpath(elm)).sendKeys(data);
			logger.pass(msg + "<span class='label end-time'><a href=" + getScreenshot() + ">Screenshot</a></span>");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			logger.fail("Step failed due to " + e.getMessage() + "<span class='label end-time'><a href="
					+ getScreenshot() + ">Screenshot</a></span>");
		}
	}
	
	

	public void clickElement(WebElement elm, String msg) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(elm));
			elm.click();
			logger.pass(msg + "<span class='label end-time'><a href=" + getScreenshot() + ">Screenshot</a></span>");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			logger.fail("Step failed due to " + e.getMessage() + "<span class='label end-time'><a href="
					+ getScreenshot() + ">Screenshot</a></span>");
		}
	}

	public void clickElement(By elm, String msg) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(elm));
			driver.findElement(elm).click();
			logger.pass(msg + "<span class='label end-time'><a href=" + getScreenshot() + ">Screenshot</a></span>");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			logger.fail("Step failed due to " + e.getMessage() + "<span class='label end-time'><a href="
					+ getScreenshot() + ">Screenshot</a></span>");
		}
	}

	public void clickElement(String elm, String msg) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(elm))));
			driver.findElement(By.xpath(elm)).click();
			logger.pass(msg + "<span class='label end-time'><a href=" + getScreenshot() + ">Screenshot</a></span>");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			logger.fail("Step failed due to " + e.getMessage() + "<span class='label end-time'><a href="
					+ getScreenshot() + ">Screenshot</a></span>");
		}
	}

	public void ElementExist(WebElement elm, String msg) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOf(elm));
			elm.isDisplayed();
			logger.pass(msg + "<span class='label end-time'><a href=" + getScreenshot() + ">Screenshot</a></span>");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			logger.fail("Step failed due to " + e.getMessage() + "<span class='label end-time'><a href="
					+ getScreenshot() + ">Screenshot</a></span>");
		}
	}

	public void verifyTitle(String exp) {
		try {
			if (exp.equals(driver.getTitle()))
				logger.pass("Title matched");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			logger.fail("Step failed due to " + e.getMessage() + "<span class='label end-time'><a href="
					+ getScreenshot() + ">Screenshot</a></span>");
		}
	}

	public String getScreenshot() {

		if (isLocalMachine) {

		}

		Date d = new Date();
		DateFormat ft = new SimpleDateFormat("ddMMyyyyhhmmss");
		String fileName = ft.format(d);
		String path = System.getProperty("user.dir") + "/src/test/java/com/bizliaScreenshot" + fileName + ".png";
		TakesScreenshot ts = ((TakesScreenshot) driver);
		File SrcFile = ts.getScreenshotAs(OutputType.FILE);
		// Move image file to new destination
		File DestFile = new File(path);
		// Copy file at destination
		try {
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return path;
	}

	public void mouseHover(WebElement e) {

		Actions actions = new Actions(driver);
		actions.moveToElement(e).build().perform();
	}
	
	public void mouseHoverVersion(WebElement e) {
		Actions actions = new Actions(driver);
          
              actions.moveByOffset(-30, -30)
               .perform();
	}

	public void mouseHoverClick(WebElement e) {

		Actions actions = new Actions(driver);
		actions.moveToElement(e).click().build().perform();
	}

	public void doubleClick(WebElement e) {

		Actions actions = new Actions(driver);
		actions.doubleClick(e).perform();
	}

	public String removalofEneredText(WebElement element, String message) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOf(element));

			String text = element.getDomProperty("value");
			String[] arr = text.split("");
			for (int i = 0; i < arr.length; i++) {
				element.sendKeys(Keys.BACK_SPACE);
			}
			element.sendKeys(Keys.ENTER);
			text = element.getDomProperty("value");

			logger.pass("Text got removed");
			return text;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			logger.fail("Step failed due to " + e.getMessage() + "<span class='label end-time'><a href="
					+ getScreenshot() + ">Screenshot</a></span>");
		}

		return ".";

	}

	public String removalofEneredText(WebElement element) {

		String text = element.getDomProperty("value");
		String[] arr = text.split("");
		for (int i = 0; i < arr.length; i++) {
			element.sendKeys(Keys.BACK_SPACE);
		}
		element.sendKeys(Keys.ENTER);
		text = element.getDomProperty("value");
		return text;

	}

	public void scrollingElementRightBar(String cssSelector, String width) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector('" + cssSelector + "').scrollLeft=" + width + "", "");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}
	}
	public void scrollVertically(int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + pixels + ")");
    }

	public void scrollingvertical(String cssSelector, String startingPoint, String height) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(
				"document.querySelector('" + cssSelector + "').scrollTo(" + startingPoint + ", " + height + ")");
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}
	}

	public void scrollingup(String cssSelector, String startingPoint, String height) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(
				"document.querySelector('" + cssSelector + "').scrollTo(" + startingPoint + ", " + height + ")");
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}
	}
	public void setDropDownElementByVisibleText(WebElement dropdownEle, String text,String msg) {
		try {
		Select s = new Select(dropdownEle);
		s.selectByVisibleText(text);
		logger.pass(msg + "<span 	class='label end-time'><a href=" + getScreenshot() + ">Screenshot</a></span>");
	} catch (Exception e) {
		System.out.println(e.getMessage());
		logger.fail("Step failed due to " + e.getMessage() + "<span class='label end-time'><a href="
				+ getScreenshot() + ">Screenshot</a></span>");
	
	}
	}

	public void Selectdropdownoptions(WebElement ele, String text) throws InterruptedException {
		ele.click();
		Thread.sleep(10);
		String xpath = "//option(@value,'" + text + "')]";
		WebElement optionToSelect = driver.findElement(By.xpath(xpath));
		optionToSelect.click();
	}

	public static String capture(WebDriver driver, String screenShotName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir") + "\\ErrorScreenshots\\" + screenShotName + ".png";
		File destination = new File(dest);
		FileUtils.copyFile(source, destination);

		return dest;
	}
	
	public void checkCheckbox(WebElement checkboxElement) {
        if (!checkboxElement.isSelected()) {
            checkboxElement.click();
        }
    }
	
	public void captchaselection() {
		
		try {
		WebElement ele=	driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].outerHTML='';", ele);
		Thread.sleep(200);
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("var from=document.querySelector(\"form\");   var ele=document.createElement(\"input\");ele.setAttribute(\"type\", \"hidden\");ele.setAttribute(\"name\", \"g-recaptcha-response\");ele.setAttribute(\"id\", \"g-recaptcha-response\");ele.value='"+ captchaValue+"';from.appendChild(ele);");
			Thread.sleep(200);
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
		
		
	}
	public void clickElementJavaScriptExecutor(WebElement ele, String msg) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			//js.executeScript("arguments[0].value=arguments[1];", captchaField,captchValue);
	        js.executeScript("arguments[0].click();", ele);
	        logger.pass(msg + "<span class='label end-time'><a href=" + getScreenshot() + ">Screenshot</a></span>");
	        
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			logger.fail("Step failed due to " + ex.getMessage() + "<span class='label end-time'><a href="
					+ getScreenshot() + ">Screenshot</a></span>");
		}
	}
}
	
	