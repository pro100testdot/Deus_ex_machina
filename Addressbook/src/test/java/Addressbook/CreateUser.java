package Addressbook;

import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CreateUser {

  private WebDriver driver;

  @BeforeMethod(alwaysRun = true)
  public void setUp() {
    System.setProperty("webdriver.gecko.driver", "C:\\Users\\Qa_Gadrel\\Desktop\\geckodriver-v0.31.0-win64\\geckodriver.exe");
    driver = new FirefoxDriver();
    driver.manage().window().maximize();
    Login("Admin", "secret");
  }

  @Test
  public void testCommonActions() throws Exception {
      OpenForm();
      FillInTheFields("firstname", "middlename", "lastname", "nickname", "title", "Company", "Address");
      FillInTheFieldsTelephone("Home", "Mobile", "Work", "Fax", "E-mail", "E-mail2", "E-mail3", "homepage", "1989", "1989");
      FillInTheFieldsSecondary("address2", "home2", "notes");
      Create();

  }

    private void OpenForm() {
        driver.findElement(By.className("all")).click();
    }

    private void Create() {
        driver.findElement(By.name("submit")).click();
    }

    private void FillInTheFieldsSecondary(String address2, String home2, String notes) {
        driver.findElement(By.name("address2")).click();
        driver.findElement(By.name("address2")).sendKeys(address2);
        driver.findElement(By.name("phone2")).click();
        driver.findElement(By.name("phone2")).sendKeys(home2);
        driver.findElement(By.name("notes")).click();
        driver.findElement(By.name("notes")).sendKeys(notes);

    }

    private void FillInTheFieldsTelephone(String home, String mobile, String work, String fax, String email, String email2, String email3, String homepage, String byear, String ayear) {
        driver.findElement(By.name("home")).click();
        driver.findElement(By.name("home")).sendKeys(home);
        driver.findElement(By.name("mobile")).click();
        driver.findElement(By.name("mobile")).sendKeys(mobile);
        driver.findElement(By.name("work")).click();
        driver.findElement(By.name("work")).sendKeys(work);
        driver.findElement(By.name("fax")).click();
        driver.findElement(By.name("fax")).sendKeys(fax);
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("email2")).click();
        driver.findElement(By.name("email2")).sendKeys(email2);
        driver.findElement(By.name("email3")).click();
        driver.findElement(By.name("email3")).sendKeys(email3);
        driver.findElement(By.name("homepage")).click();
        driver.findElement(By.name("homepage")).sendKeys(homepage);
        driver.findElement(By.name("bday")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/select[1]/option[3]")).click();
        driver.findElement(By.name("bmonth")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/select[2]/option[8]")).click();
        driver.findElement(By.name("byear")).click();
        driver.findElement(By.name("byear")).sendKeys(byear);
        driver.findElement(By.name("aday")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/select[3]/option[10]")).click();
        driver.findElement(By.name("amonth")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/select[4]/option[10]")).click();
        driver.findElement(By.name("ayear")).click();
        driver.findElement(By.name("ayear")).sendKeys(ayear);
    }

    private void FillInTheFields(String firstname, String middlename, String lastname, String nickname, String title, String company, String address) {
        driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).sendKeys(firstname);
        driver.findElement(By.name(middlename)).click();
        driver.findElement(By.name(middlename)).sendKeys(middlename);
        driver.findElement(By.name(lastname)).click();
        driver.findElement(By.name(lastname)).sendKeys(lastname);
        driver.findElement(By.name("nickname")).click();
        driver.findElement(By.name("nickname")).sendKeys(nickname);
        driver.findElement(By.name(title)).click();
        driver.findElement(By.name(title)).sendKeys(title);
        driver.findElement(By.name("company")).click();
        driver.findElement(By.name("company")).sendKeys(company);
        driver.findElement(By.name("address")).click();
        driver.findElement(By.name("address")).sendKeys(address);
    }

    private void Login(String Login, String password) {
        driver.get("http://localhost/addressbook/");
        driver.findElement(By.name("user")).click();
        driver.findElement(By.name("user")).sendKeys(Login);
        driver.findElement(By.name("pass")).click();
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.xpath("/html/body/div/div[4]/form/input[3]")).click();
    }
}
