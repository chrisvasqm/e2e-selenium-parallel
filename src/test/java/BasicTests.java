import org.testng.annotations.Test;

public class BasicTests {

    @Test
    public void test1() throws InterruptedException {
        Thread.sleep(3000);
        assert true;
    }

    @Test
    public void test2() throws InterruptedException {
         Thread.sleep(5000);
        assert true;
    }
}
