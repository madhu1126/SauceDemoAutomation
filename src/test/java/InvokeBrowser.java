import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InvokeBrowser {
    public static void main(String[] args) {
        //Invoking Browser

       // Create object of Chrome browser, here Selenium Manager is taking care of invoking chromedriver.exe. To disable it and
        //handle it manually by downloading the file and providing its path via code.

        WebDriver driver = new ChromeDriver();
        //System.setProperty("webdriver.chrome.driver","give driver path with .exe extension");
       // WebDriver driver = new EdgeDriver();
        driver.get("https://rahulshettyacademy.com");
        String title=driver.getTitle();
        System.out.println(title);
        System.out.println(driver.getCurrentUrl());
        driver.close();   //closes the current window
        //driver.quit(); //closes all associated windows


    }
}
