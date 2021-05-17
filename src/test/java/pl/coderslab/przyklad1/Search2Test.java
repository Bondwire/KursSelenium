package pl.coderslab.przyklad1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.junit.*;

public class Search2Test {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        // Uruchom nowy egzemplarz przeglądarki Chrome
        driver = new ChromeDriver();

        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        // Przejdź do Google
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
    }
    @Test
    public void testGoogleSearch() {
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.id("first-name"));
        // Wyczyść teskst zapisany w elemencie
        element.clear();

        // Wpisz informacje do wyszukania
        element.sendKeys("Karol");

        // Prześlij formularz
        element.submit();
    }

    public void testGoogleSearch2() {
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element2 = driver.findElement(By.name("name=\"gender\""));
        // Wyczyść teskst zapisany w elemencie
        element2.clear();

        // Wpisz informacje do wyszukania
        element2.sendKeys("Karol");

        // Prześlij formularz
        element2.submit();
    }

    @After
    public void tearDown() throws Exception {
        // Zamknij przeglądarkę
      //  driver.quit();
    }
}
