import com.google.common.truth.Truth;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTests {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang=en");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }

    @Test
    public void search_ForPuppies_ReturnsPuppiesInfo() {
        driver.findElement(By.name("q")).sendKeys("perro", Keys.ENTER);

        Truth.assertThat(driver.findElement(By.xpath("//span[text()='Perro']")).isDisplayed()).isTrue();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
