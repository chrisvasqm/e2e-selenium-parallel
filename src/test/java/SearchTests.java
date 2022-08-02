import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Search;

import static com.google.common.truth.Truth.assertThat;

public class SearchTests extends BaseTests {
    private Search search;

    @BeforeMethod
    public void startup() {
        search = new Search(driver);
        search.open();
    }

    @Test
    public void search_ForPuppies_ReturnsPuppiesInfo() {
        var results = search.find("perro");

        assertThat(results.isHeaderShown("Perro")).isTrue();
    }

}
