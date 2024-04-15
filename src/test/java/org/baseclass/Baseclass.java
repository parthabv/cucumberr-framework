package org.baseclass;





	

	import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.text.SimpleDateFormat;
	import java.time.Duration;
	import java.util.Date;
	import java.util.List;
	import java.util.Set;

	import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Baseclass {
		public static WebDriver driver;

		public static void browserLaunch() {
			driver = new ChromeDriver();
		}

		public static void url(String text) {
			driver.get(text);
		}

		public static void maximize() {
			driver.manage().window().maximize();
		}

		public static void sendKeys(WebElement element, String mobilenum) {
			element.sendKeys(mobilenum);
		}

		public static void click(WebElement element) {
			element.click();
		}

		public static void alertOk() {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}

		public static void alertCancel() {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		}

		public static String getText(WebElement element) {
			String text = element.getText();
			return text;
		}

		public static String getInsertedText(WebElement element) {
			String attribute = element.getAttribute(null);
			return attribute;
		}

		public static void close() {
			driver.close();
		}

		public static  void quit() {
			driver.quit();
		}

		public static String getTitle() {
			String title = driver.getTitle();
			return title;
		}

		public static String getCurrentUrl() {
			String currentUrl = driver.getCurrentUrl();
			return currentUrl;
		}

		public static void selectOptionByText(WebElement element, String text) {
			Select select = new Select(element);
			select.selectByVisibleText(text);

		}

		public static void selectOptionByValue(WebElement element, String text) {
			Select select = new Select(element);
			select.selectByValue(text);
		}

		public static void selectOptionByIndex(WebElement element, int index) {
			Select select = new Select(element);
			select.selectByIndex(index);
		}

		public static void deselectByIndex(WebElement element, int index) {
			Select select = new Select(element);
			select.deselectByIndex(index);
		}

		public static void deselectByValue(WebElement element, String text) {
			Select select = new Select(element);
			select.deselectByValue(text);
		}

		public static void deselectByText(WebElement element, String text) {
			Select select = new Select(element);
			select.deselectByVisibleText(text);
		}

		public static void deselectByall(WebElement element) {
			Select select = new Select(element);
			select.deselectAll();
		}

		public static void inserttextByJs(String name, WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('value','" + name + "')", element);

		}

		public static void clickByJs(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", element);
		}

		public static void scrollDownByJs(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", element);

		}

		public static void scrollUpByJs(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(false)", element);

		}

		public static String parentWindow() {
			String windowHandle = driver.getWindowHandle();
			return windowHandle;
		}

		public static Set<String> childWindow(int index) {
			String parent = driver.getWindowHandle();
			Set<String> windowHandles = driver.getWindowHandles();
			for (String x : windowHandles) {
				if (!parent.equals(windowHandles))
					driver.switchTo().window(parent);
			}
			return windowHandles;
		}

		public static void frameByIndex(int index) {
			driver.switchTo().frame(index);
		}

		public static void frameById(String text) {
			driver.switchTo().frame(text);
		}

		public static WebElement locatorById(String attributeValue) {
			WebElement element = driver.findElement(By.id(attributeValue));
			return element;

		}

		public static WebElement locatorByName(String attributeValue) {
			WebElement element = driver.findElement(By.id(attributeValue));
			return element;
		}

		public static WebElement locatorbyClassName(String attributeValue) {
			WebElement element = driver.findElement(By.id(attributeValue));
			return element;
		}

		public static WebElement locatorbyXpath(String attributeValue) {
			WebElement element = driver.findElement(By.xpath(attributeValue));
			return element;
		}

		public static List<WebElement> getAlloptions(WebElement element) {
			Select select = new Select(element);
			List<WebElement> options = select.getOptions();
			return options;
		}

		public static WebElement firstSelectedOptions(WebElement element) {
			Select select = new Select(element);
			WebElement firstSelectedOption = select.getFirstSelectedOption();
			return firstSelectedOption;
		}

		public static boolean ismultiple(WebElement element) {
			Select select = new Select(element);
			boolean multiple = select.isMultiple();
			return multiple;
		}

		public static void implicitWait(int index) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(index));

		}

		public static WebElement explicitWait(int index, WebElement element) {
			WebDriverWait driverwait = new WebDriverWait(driver, Duration.ofSeconds(index));
			WebElement until = driverwait.until(ExpectedConditions.visibilityOf(element));
			return until;
		}

		public static boolean isEnabled(WebElement element) {
			boolean enabled = element.isEnabled();
			return enabled;
		}

		public static boolean isDisplayed(WebElement element) {
			boolean displayed = element.isEnabled();
			return displayed;
		}

		public static boolean isSelected(WebElement element) {
			boolean selected = element.isEnabled();
			return selected;
		}

		public static String getParentWindow() {
			String windowHandle = driver.getWindowHandle();
			return windowHandle;

		}

		public static Set<String> getAllWindows() {
			Set<String> windowHandles = driver.getWindowHandles();

			return windowHandles;
		}

		public static void clear(WebElement element) {
			element.clear();
		}

		public static void screeShot(String name) throws IOException {
			TakesScreenshot ss = (TakesScreenshot) driver;
			File temporary = ss.getScreenshotAs(OutputType.FILE);
			File file = new File(
					"C:\\Users\\Mr.Dharan Chotu\\eclipse-workspace\\eclipse\\work out\\Framework\\image\\" + name + ".png");
			FileUtils.copyFile(temporary, file);
		}

		public static void screenshotElement(WebElement element, String text) throws IOException {
			File temporary = element.getScreenshotAs(OutputType.FILE);
			File file = new File(
					"C:\\Users\\Mr.Dharan Chotu\\eclipse-workspace\\eclipse\\work out\\Framework\\image\\" + text + ".png");
			FileUtils.copyFile(temporary, file);
		}

		public static void insertValueAndEnter(WebElement element, String text) {
			element.sendKeys(text + Keys.ENTER);
			element.sendKeys(Keys.ENTER);

		}

		public static void refresh() {
			driver.navigate().refresh();
		}

		public static void mouseover(WebElement element) {
			Actions a = new Actions(driver);
			a.moveToElement(element).perform();
		}

		public static void rightClick(WebElement element) {
			Actions a = new Actions(driver);
			a.contextClick(element).perform();
		}

		public static void DoubleClick(WebElement element1) {
			Actions a = new Actions(driver);
			a.doubleClick(element1).perform();
		}

		public static void draganddrop(WebElement element1, WebElement element2) {
			Actions a = new Actions(driver);
			a.dragAndDrop(element1, element2).perform();
		}

	public static String getCellData(String sheetname, int rownum, int cellnum) throws IOException {
			String res = "";
			File file = new File(
					"C:\\Users\\Mr.Dharan Chotu\\eclipse-workspace\\eclipse\\work out\\Framework\\Excel sheet\\Book1.xlsx");
			FileInputStream fileinputStream = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(fileinputStream);
			Sheet sheet = workbook.getSheet(sheetname);
			Row row = sheet.getRow(rownum);
			Cell cell = row.getCell(cellnum);
			 CellType cellType = cell.getCellType();
			switch (cellType) {
			case STRING:
				res = cell.getStringCellValue();
		break;

			case NUMERIC:
				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat df = new SimpleDateFormat("dd-mmm-yy");
					res = df.format(dateCellValue);
				} else {
					double numericCellValue = cell.getNumericCellValue();
					long round = Math.round(numericCellValue);
					if (numericCellValue == round) {
						res = String.valueOf(round);

					} else {
						res = String.valueOf(round);
					}

				}
				break;
		default:
				break;
		}

			return res;
		}

		public static void replaceCellData(String sheetName, int rownum, int cellnum, String olddata, String newdata)
				throws IOException {
			File file = new File(
					"C:\\Users\\Mr.Dharan Chotu\\eclipse-workspace\\eclipse\\work out\\Framework\\Excel sheet\\Book1.xlsx");
			FileInputStream fileinputStream = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(fileinputStream);
			Sheet sheet = workbook.getSheet(sheetName);
			Row row = sheet.getRow(rownum);
			Cell cell = row.getCell(cellnum);
			String value = cell.getStringCellValue();
			if (value.equals(olddata)) {
				cell.setCellValue(newdata);
			}
			FileOutputStream out = new FileOutputStream(file);
			workbook.write(out);
		}

		public static void createCellValue(String sheetName, int rownum, int cellnum, String data) throws IOException {
			File file = new File(
					"C:\\Users\\Mr.Dharan Chotu\\eclipse-workspace\\eclipse\\work out\\Framework\\Excel sheet\\Book1.xlsx");
			FileInputStream fileinputStream = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(fileinputStream);
			Sheet sheet = workbook.getSheet(sheetName);
			Row row = sheet.getRow(rownum);
			Cell cell = row.createCell(cellnum);
			cell.setCellValue(data);
			FileOutputStream out = new FileOutputStream(file);
			workbook.write(out);

		}

		public static void sleep(int index) throws InterruptedException {
			Thread.sleep(index);
		}
		
		public static void sendKeysMultiplevalues(WebElement element, String[] split) {
element.sendKeys(split);

	}
		public static void enterKey() throws AWTException {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	

		public static List<WebElement> findELementsByXpath(WebElement xpath) {
			List<WebElement> elements = driver.findElements((By) xpath);
			return elements;
		}
	}



