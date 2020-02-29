//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.concurrent.TimeUnit;
//
//public class ErnestHasFun {
//    private final By HOME_PAGE_ARTICLE = By.xpath(".//h1 [contains(@class, 'headline__title')]");
//    private final By ARTICLE_PAGE_TITLE = By.xpath(".//h1 [contains(@class, 'd-inline')]");
//    private static WebDriver driver;
//
//
//    @BeforeAll
//    static void beforeTest() {
//        System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
//         driver = new ChromeDriver();
//    }
//
//    @AfterAll
//    static void afterTest() {
//        driver.quit();
//    }
//
//    @Test
//    public void delfiTest () {
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.get("http://rus.delfi.lv");
//
//        // Find first article title
//        WebElement firstArticleTitle = driver.findElement(HOME_PAGE_ARTICLE);
//
//        // Get text and save it
//        String firstArticleTitleText = firstArticleTitle.getText();
//
//        // Click on first article title
//        firstArticleTitle.click();
//
//        // Find article title
//
//        //WebElement articleTitle = driver.findElement(By.xpath(".//h1 [contains(@class, 'd-inline')]"));
//        WebElement articleTitle = driver.findElement(ARTICLE_PAGE_TITLE);
//        // Get text and save it
//        String ArticleTitleText = articleTitle.getText();
//        // Compare both titles - Assertions from jUnit
//        Assertions.assertEquals(firstArticleTitleText, ArticleTitleText, "Titles are not equal!");
//    }
//}
//
////ДОМАШНЕЕ ЗАДАНИЕ
//// Проверить, что заголовки второй статьи одинаковые на главной странице, на странице самой статьи и на странице комментариев
//// Проверить совпадение количества комментариев на главной, в статье и в странице комментов