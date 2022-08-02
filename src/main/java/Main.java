public class Main {

    public static void main(String[] args) {
        var driver = new Driver();
        var login = new LoginPage(driver);

        var home = login.signIn("asd", "dsa");
        home.isLoggedIn();
    }

}

