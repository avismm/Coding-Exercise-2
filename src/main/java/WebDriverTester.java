import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTester {

    // Hierarchy:: WebDriver >> RemoteDriver >> ChromiumDriver >>ChromeDriver/ForeFoxDriver/EdgeDriver
    /*In this example, the hierarchy is: ChromeDriver/ForeFoxDriver/EdgeDriver implement the RemoteWebDriver Interface.
    The RemoteWebDriver Interface extends the WebDriver and the TakeScreenshot interfaces*/
    public static void main(String[] args) throws InterruptedException {

        //Using an array of webDriver subclasses to perform all the steps at once
        WebDriver[] arr={new ChromeDriver(), new EdgeDriver(), new FirefoxDriver()};

        for(WebDriver w:arr){
          w.manage().window().maximize();
            Thread.sleep(2000);
           w.navigate().to ("https://amazon.com");
            Thread.sleep(2000);
           System.out.println(w.getTitle());
            Thread.sleep(2000);
            w.close();
        }

    }
}
