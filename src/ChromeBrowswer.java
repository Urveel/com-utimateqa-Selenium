import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowswer {

    public static void main(String[] args) throws InterruptedException {
        String baseurl = "https://courses.ultimateqa.com/";
        //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        driver.get(baseurl);

        driver.manage().window().maximize();

        //Print the title of the page
        System.out.println("Print the title of the page : "+ driver.getTitle());

        //Print the current URL
        System.out.println("Print the current URL : " + driver.getCurrentUrl());

        //Click on Sign in link
        WebElement signInLink = driver.findElement(By.linkText("Sign In"));
        signInLink.click();

        //Print the current URL
        System.out.println("Current URL after clicking 'Sign In': " + driver.getCurrentUrl());

        //Enter the email address
        WebElement EmailField = driver.findElement(By.id("user[email]"));
        EmailField.sendKeys("abc@gmail.com");

        //Enter the password
        WebElement PasswordField = driver.findElement(By.id("user[password]"));
        PasswordField.sendKeys("123");

        //Click on Signin button
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        Thread.sleep(5000);

        //Navigate to baseurl
        driver.navigate().to(baseurl);

        //Navigate to forward to homepage
        driver.navigate().forward();

        //Refresh the page
        driver.navigate().refresh();

        //Close the browser
        driver.close();

    }
}
