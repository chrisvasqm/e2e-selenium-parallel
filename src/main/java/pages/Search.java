package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search extends PageObject {

    @FindBy(name = "q")
    private WebElement searchBar;

    public Search(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://www.google.com");
    }

    public Results find(String query) {
        searchBar.sendKeys(query, Keys.ENTER);

        return new Results(driver);
    }

}
