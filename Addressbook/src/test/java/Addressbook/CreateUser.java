package Addressbook;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CreateUser {

  private WebDriver driver;

  @BeforeClass(alwaysRun = true)
  public void setUp() {
    System.setProperty("webdriver.gecko.driver", "C:\\Users\\Qa_Gadrel\\Desktop\\geckodriver-v0.31.0-win64\\geckodriver.exe");
    driver = new FirefoxDriver();
    driver.manage().window().maximize();
  }

  @Test
  public void testCommonActions() throws Exception {
    //login
    driver.get("http://localhost/addressbook/");
    driver.findElement(By.name("user")).click();
    driver.findElement(By.name("user")).sendKeys("Admin");
    driver.findElement(By.name("pass")).click();
    driver.findElement(By.name("pass")).sendKeys("secret");
    //add address book entry
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
    // Telephone
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
    driver.findElement(By.name("homepage")).click();
    driver.findElement(By.name("homepage")).sendKeys("homepage");
    driver.findElement(By.name("bday")).click();
    driver.findElement(By.xpath("//*[@id=\"content\"]/form/select[1]/option[3]")).click();
    driver.findElement(By.name("bmonth")).click();
    driver.findElement(By.xpath("//*[@id=\"content\"]/form/select[2]/option[8]")).click();
    driver.findElement(By.name("byear")).click();
    driver.findElement(By.name("byear")).sendKeys("1989");
    driver.findElement(By.name("aday")).click();
    driver.findElement(By.xpath("//*[@id=\"content\"]/form/select[3]/option[10]")).click();
    driver.findElement(By.name("amonth")).click();
    driver.findElement(By.xpath("//*[@id=\"content\"]/form/select[4]/option[10]")).click();
    driver.findElement(By.name("ayear")).click();
    driver.findElement(By.name("ayear")).sendKeys("1989");
    //Secondary
    driver.findElement(By.name("address2")).click();
    driver.findElement(By.name("address2")).sendKeys("address2");
    driver.findElement(By.name("phone2")).click();
    driver.findElement(By.name("phone2")).sendKeys("home2");
    driver.findElement(By.name("notes")).click();
    driver.findElement(By.name("notes")).sendKeys("notes");
    driver.findElement(By.name("submit")).click();
    
  }
}
