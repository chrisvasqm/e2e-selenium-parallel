package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Results extends PageObject {

    public Results(WebDriver driver) {
        super(driver);
    }

    public boolean isHeaderShown(String text) {
        var header = driver.findElement(By.xpath("//span[text()='"+ text + "']"));

        return header.isDisplayed();
    }
}
