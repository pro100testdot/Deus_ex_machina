package Addressbook;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CommonActions {

  private WebDriver driver;

  @BeforeClass(alwaysRun = true)
  public void setUp() {
    System.setProperty("webdriver.gecko.driver", "C:\\Users\\Qa_Gadrel\\Desktop\\geckodriver-v0.31.0-win64\\geckodriver.exe");
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCommonActions() throws Exception {
    driver.get("http://localhost/addressbook/");
    driver.findElement(By.name("user")).click();
    driver.findElement(By.name("user")).sendKeys("Admin");
    driver.findElement(By.name("pass")).click();
    driver.findElement(By.name("pass")).sendKeys("secret");
    driver.findElement(By.xpath("/html/body/div/div[4]/form/input[3]")).click();
    driver.findElement(By.className("all")).click();
    driver.findElement(By.name("firstname")).click();
    driver.findElement(By.name("firstname")).sendKeys("firstname");
    driver.findElement(By.name("middlename")).click();
    driver.findElement(By.name("middlename")).sendKeys("middlename");
    driver.findElement(By.name("lastname")).click();
    driver.findElement(By.name("lastname")).sendKeys("lastname");
    driver.findElement(By.name("nickname")).click();
    driver.findElement(By.name("nickname")).sendKeys("nickname");
    driver.findElement(By.name("title")).click();
    driver.findElement(By.name("title")).sendKeys("nickname");
    driver.findElement(By.name("company")).click();
    driver.findElement(By.name("company")).sendKeys("Company");
    driver.findElement(By.name("address")).click();
    driver.findElement(By.name("address")).sendKeys("Address");
    driver.findElement(By.name("home")).click();
    driver.findElement(By.name("home")).sendKeys("Home");
    driver.findElement(By.name("mobile")).click();
    driver.findElement(By.name("mobile")).sendKeys("Mobile");
    driver.findElement(By.name("work")).click();
    driver.findElement(By.name("work")).sendKeys("Work");
    driver.findElement(By.name("fax")).click();
    driver.findElement(By.name("fax")).sendKeys("Fax");
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).sendKeys("E-mail");
    driver.findElement(By.name("email2")).click();
    driver.findElement(By.name("email2")).sendKeys("E-mail2");
    driver.findElement(By.name("email3")).click();
    driver.findElement(By.name("email3")).sendKeys("E-mail3");
    driver.findElement(By.name("bday")).click();
    driver.findElement(By.xpath("//*[@id=\"content\"]/form/select[1]/option[3]")).click();
    driver.findElement(By.name("bmonth")).click();
    driver.findElement(By.xpath("//*[@id=\"content\"]/form/select[2]/option[8]")).click();
    driver.findElement(By.name("byear")).click();
    driver.findElement(By.name("byear")).sendKeys("1989");


  }
}
