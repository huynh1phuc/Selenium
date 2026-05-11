import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amazonSearchResultPage {
    WebDriver driver;

    public amazonSearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    // --- Khai báo Locators (By) ---
    // 1. Third Product
    By thirdProductImage = By.xpath("//img[@data-image-index='3']");
    // 2. ở thời điểm làm bài không có nên lấy ở vị trí hàng 1 cột 5 thay vì hàng 1 cột 4
    By listPriceItem5 = By.xpath("(//div[@data-component-type='s-search-result'])[5]//span[contains(@class, 'a-text-price')]//span[@aria-hidden='true']");
    // 3.
    By sellingPriceItem5 = By.xpath("(//div[@data-component-type='s-search-result'])[5]//span[span[@class='a-price-whole']]");
    // 4. Search Box
    By searchInput = By.xpath("//input[@id='twotabsearchtextbox']");
    // 5. Icon Cart
    By cartIcon = By.xpath("//div[@id='nav-cart-count-container']");
    // 6. không có
    // 7. Giày nam size 6
    By filterMensSize6 = By.xpath("(//button[@value='6'])[1]");
    // 8. Giới thiệu ngắn
    By productTitleItem3 = By.xpath("(//div[@data-component-type='s-search-result'])[3]//h2//span");
    // 9. thời gian giao hàng
    By deliveryInfoItem2 = By.xpath("(//div[@data-component-type='s-search-result'])[2]//div[contains(@class, 'a-span12') and contains(., 'delivery')]");
    // 10. tên sản phẩm
    By brandNameItem1 = By.xpath("(//div[@data-component-type='s-search-result'])[1]//span[contains(@class, 'a-size-base-plus')]");
    // 11. không có
    // 12. Checkbox "Men"
    By filterMenCheckbox = By.xpath("//a[.//span[text()='Men']]//i[contains(@class, 'a-icon-checkbox')]");
    // 13. Dòng text số lượng kết quả (1-48 of over 20,000 results...)
    By resultCountText = By.xpath("//span[contains(text(), 'results for')]");
    // 14. không có

    // ================= PHƯƠNG THỨC KHỞI TẠO =================
    public void findElements() {
    	WebElement searchEl = driver.findElement(searchInput);
        WebElement cartEl = driver.findElement(cartIcon);
        WebElement resultTextEl = driver.findElement(resultCountText);
        WebElement menCheckboxEl = driver.findElement(filterMenCheckbox);
        WebElement mensSize6El = driver.findElement(filterMensSize6);
        WebElement brandItem1El = driver.findElement(brandNameItem1);
        WebElement deliveryItem2El = driver.findElement(deliveryInfoItem2);
        WebElement titleItem3El = driver.findElement(productTitleItem3); 
        WebElement imgItem3El = driver.findElement(thirdProductImage);
        WebElement listPriceItem5El = driver.findElement(listPriceItem5);
        WebElement sellingPriceItem5El = driver.findElement(sellingPriceItem5);
        
        System.out.println("Đã khởi tạo thành công trọn bộ 11 elements trên trang Amazon!");
    }
    }
}