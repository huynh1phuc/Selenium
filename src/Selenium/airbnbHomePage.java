import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class airbnbHomePage {
    WebDriver driver;

    public airbnbHomePage(WebDriver driver) {
        this.driver = driver;
    }

    // --- Khai báo Locators (By) ---
    // Search Bar Elements
    By locationInputLocator = By.xpath("//input[@data-testid='structured-search-input-field-query']"); // Ô "Địa điểm"
    By checkInDateLocator = By.xpath("//div[@data-testid='structured-search-input-field-split-dates-0']"); // Ô "Nhận phòng"
    By checkOutDateLocator = By.xpath("//div[@data-testid='structured-search-input-field-split-dates-1']"); // Ô "Trả phòng"
    By guestsLocator = By.xpath("//div[@data-testid='structured-search-input-field-guests-button']"); // Ô "Thêm khách"
    By searchButtonLocator = By.xpath("//button[@data-testid='structured-search-input-search-button']"); // Nút kính lúp tìm kiếm

    // Destination Suggestions (Các thẻ gợi ý điểm đến)
    By hoChiMinhCardLocator = By.xpath("//img[contains(@alt, 'Hồ Chí Minh')]");
    By canThoCardLocator = By.xpath("//img[contains(@alt, 'Cần Thơ')]");
    By nhaTrangCardLocator = By.xpath("//img[contains(@alt, 'Nha Trang')]");

    // --- Khai báo WebElements ---
    public void findElements() {
        WebElement locationInput = driver.findElement(locationInputLocator);
        WebElement checkInDate = driver.findElement(checkInDateLocator);
        WebElement guestsButton = driver.findElement(guestsLocator);
        WebElement btnSearch = driver.findElement(searchButtonLocator);
        
        WebElement hoChiMinhDestination = driver.findElement(hoChiMinhCardLocator);
    }
}