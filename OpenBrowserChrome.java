package Browser;

public class OpenBrowserChrome {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\ntmhuyen\\Desktop\\chromedriver.exe");
        ChromeDriver chromeDriver = new ChromeDriver();
    }
}
