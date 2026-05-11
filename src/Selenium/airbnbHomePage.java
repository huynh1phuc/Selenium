import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class airbnbHomePage {
    WebDriver driver;

    public airbnbHomePage(WebDriver driver) {
        this.driver = driver;
    }

    // ================= KHAI BÁO LOCATORS (BY) =================
    // 1. Cybersoft logo
    By cybersoftLogo = By.xpath("//span[contains(@class, 'text-2xl') and text()='CyberSoft']");
    // 2. home menu
    By homeMenu = By.xpath("//a[text()='Home']");
    // 3. about menu
    By aboutMenu = By.xpath("//a[text()='About']");
    // 4. user avatar
    By userAvatar = By.xpath("//img[contains(@src, '6596121.png')]");
    // 5. location
    By locationBox = By.xpath("//div[p[text()='Địa điểm']]");
    // 6. date
    By dateBox = By.xpath("//div[contains(@class, 'col-span-4') and contains(@class, 'cursor-pointer')]");
    // 7. guest
    By guestsBox = By.xpath("//div[p[text()='Thêm khách']]");
    // 8. plus button
    By plusAdultBtn = By.xpath("(//button[div[text()='+']])[1]");
    // 9. minus button
    By minusAdultBtn = By.xpath("(//button[div[text()='-']])[1]");
    // 10. Room
    By filterRoomType = By.xpath("//button[text()='Loại nơi ở']");
    // 11. Price
    By filterPrice = By.xpath("//button[text()='Giá']");
    // 12. Ho Chi Minh
    By destCardHoChiMinh = By.xpath("//div[contains(@class, 'ant-card') and .//h2[text()='Hồ Chí Minh']]");
    // 13. Can Tho
    By textTitleCanTho = By.xpath("//h2[text()='Cần Thơ']");    
    // 14. Nha Trang
    By textDriveTimeNhaTrang = By.xpath("//div[contains(@class, 'ant-card') and .//h2[text()='Nha Trang']]//p[contains(@class, 'text-gray-700')]");
    


    // ================= PHƯƠNG THỨC KHỞI TẠO =================
    public void findElements() {
    	WebElement logoEl = driver.findElement(cybersoftLogo);
        WebElement homeMenuEl = driver.findElement(homeMenu);
        WebElement aboutMenuEl = driver.findElement(aboutMenu);
        WebElement avatarEl = driver.findElement(userAvatar);
        WebElement locationEl = driver.findElement(locationBox);
        WebElement dateEl = driver.findElement(dateBox);
        WebElement guestsEl = driver.findElement(guestsBox);
        WebElement plusAdultEl = driver.findElement(plusAdultBtn);
        WebElement minusAdultEl = driver.findElement(minusAdultBtn);
        WebElement roomTypeEl = driver.findElement(filterRoomType);
        WebElement priceEl = driver.findElement(filterPrice);
        WebElement cardHcmEl = driver.findElement(destCardHoChiMinh);
        WebElement titleCanThoEl = driver.findElement(textTitleCanTho);
        WebElement timeDriveNhaTrangEl = driver.findElement(textDriveTimeNhaTrang);
        
        System.out.println("Đã khởi tạo thành công 14 elements trên trang chủ Airbnb!");
    }
}