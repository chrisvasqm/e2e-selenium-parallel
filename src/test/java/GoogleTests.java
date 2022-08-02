import com.google.common.truth.Truth;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTests extends BaseTests {

    @BeforeMethod
    public void startup() {
       driver.get("https://www.google.com");
    }

    @Test
    public void search_ForPuppies_ReturnsPuppiesInfo() {
        driver.findElement(By.name("q")).sendKeys("perro", Keys.ENTER);

        Truth.assertThat(driver.findElement(By.xpath("//span[text()='Perro']")).isDisplayed()).isTrue();
    }

}
