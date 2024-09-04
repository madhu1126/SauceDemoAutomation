import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        // Sibling - Child to parent traverse
        //parent to child -Practice button -->//header/div/button[1]
        //parent to child -Practice button to its sibling Login--> //header/div/button[1]/following-sibling::button[1]
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
        //traverse from child to parent --> //header/div/button[1]/parent::div/button[2]
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());


    }
}
