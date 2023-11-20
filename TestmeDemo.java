
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class TestmeDemo {
        WebDriver driver;
        @Test
        public void testLogin() {
                driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
                driver.findElement(By.linkText("SignIn")).click();
                driver.findElement(By.name("userName")).sendKeys("Taskin");
                driver.findElement(By.id("password")).sendKeys("Khan");
                driver.findElement(By.xpath("//input[@value='Login']")).click();
                Assert.assertEquals(driver.getTitle(),"Home");
                System.out.println("logged in successfully!!");
        }
        @BeforeTest
        public void beforeTest() {
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\taskin.ara.khan\\IdeaProjects\\TestNGProject\\src\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
        }

        @AfterTest
        public void afterTest() {
                driver.close();
        }

}
