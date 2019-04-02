package AdressBookTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;


public class GroupCreationTests {
    private WebDriver driver;
    //private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\node_modules\\appium\\node_modules\\appium-chromedriver\\chromedriver\\win\\chromedriver.exe");
        driver = new ChromeDriver();
        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://localhost/addressbook/group.php");
        login("admin", "secret");
    }

    private void login(String username, String password) {
        driver.findElement(By.name("user")).sendKeys(username);//рефактор для входа различных юзеров
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.xpath("//input[@value='LOGIN']")).click();// До этого использовалось Xpath выражение (.//*[normalize-space(text()) and normalize-space(.)='PASSWORD:'])[1]/following::input[2]
       //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testGroupCreationTests() throws Exception {

        gotoGroupePage();
        initGroupCreation();
        fillGroupForm(new GroupData("Test111", "Test111", "Test111"));
        submitGroupCreation();
        returnGroupPage();
    }

    private void returnGroupPage() {
        driver.findElement(By.xpath("//a[contains(text(),'group page')]")).click();
    }

    private void submitGroupCreation() {
        driver.findElement(By.xpath("//input[@value='Enter information']")).click();
    }

    private void fillGroupForm(GroupData groupData) {
        driver.findElement(By.xpath(" //input[@name='group_name']")).sendKeys(groupData.getName());
        driver.findElement(By.xpath("//textarea[@name='group_header']")).sendKeys(groupData.getHeader());
        driver.findElement(By.xpath("//textarea[@name='group_footer']")).sendKeys(groupData.getFooter());
    }

    private void initGroupCreation() {
        driver.findElement(By.xpath("//input[@value='NEW_GROUP']")).click();
    }

    private void gotoGroupePage() {
        driver.findElement(By.xpath("//a[contains(text(),'GROUPS')]")).click();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
