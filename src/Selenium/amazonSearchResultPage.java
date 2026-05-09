import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amazonSearchResultPage {
    WebDriver driver;

    public amazonSearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    // --- Khai báo Locators (By) ---
    // Header & Search
    By searchBoxLocator = By.id("twotabsearchtextbox"); // Ô tìm kiếm
    By searchSubmitButtonLocator = By.id("nav-search-submit-button"); // Nút tìm kiếm
    By languageSelectorLocator = By.id("icp-nav-flyout"); // Đổi ngôn ngữ
    
    // Left Sidebar Filters (Bộ lọc)
    By genderWomenFilterLocator = By.xpath("//span[text()='Gender']/../following-sibling::ul//span[text()='Women']");
    By departmentMensActivewearLocator = By.xpath("//span[text()=\"Men's Activewear\"]");
    By brandAdidasCheckboxLocator = By.xpath("//li[@aria-label='adidas']//input[@type='checkbox']/following-sibling::i"); // Checkbox hãng adidas
    
    // Product List (Kết quả tìm kiếm)
    By firstProductTitleLocator = By.xpath("(//div[@data-component-type='s-search-result']//h2/a/span)[1]"); // Tên sản phẩm đầu tiên
    By firstProductPriceLocator = By.xpath("(//div[@data-component-type='s-search-result']//span[@class='a-price']//span[@class='a-offscreen'])[1]"); // Giá sản phẩm đầu tiên

    // --- Khai báo WebElements ---
    public void findElements() {
        WebElement searchBox = driver.findElement(searchBoxLocator);
        WebElement btnSearchSubmit = driver.findElement(searchSubmitButtonLocator);
        WebElement languageSelector = driver.findElement(languageSelectorLocator);
        
        WebElement filterBrandAdidas = driver.findElement(brandAdidasCheckboxLocator);
        WebElement firstProductTitle = driver.findElement(firstProductTitleLocator);
    }
}