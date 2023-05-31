package mvc3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginScript {
    /**
     * @param args
     */
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver(chromeOptions);

        // Navigate to the login page
        driver.get("http://localhost:8081/mvc3/login.jsp");

        // Find the username and password input fields and submit button
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));


        // Enter the login credentials
        usernameField.sendKeys("sri");
        passwordField.sendKeys("badminton");

        // Click on the submit button
        submitButton.click();

        // Wait for the login process to complete
        // Add appropriate wait statements or assertions here as per your requirement

        // Verify if the login was successful
        if (driver.getCurrentUrl().equals("http://localhost:8081/mvc3/success.jsp")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }

        // Close the browser
        driver.quit();
    }
}
