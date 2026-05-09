import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class hrmAdminPage {
    WebDriver driver;

    // Constructor để nhận driver từ test script
    public hrmAdminPage(WebDriver driver) {
        this.driver = driver;
    }

    // ================= KHAI BÁO LOCATORS =================
    // 1. Admin
    By adminMenu = By.xpath("//span[text()='Admin']/parent::a");
    // 2. PIM
    By pimMenu = By.xpath("//span[text()='PIM']/parent::a");
    // 3. Leave
    By leaveMenu = By.xpath("//span[text()='Leave']/parent::a");
    // 4. Username input
    By usernameInput = By.xpath("//label[text()='Username']/parent::div/following-sibling::div/input");
    // 5.. User Role Dropdown
    By userRoleDropdown = By.xpath("//label[text()='User Role']/parent::div/following-sibling::div//div[contains(@class, 'oxd-select-text')]");
    // 6. Role Admin
    By roleOptionAdmin = By.xpath("//div[@role='listbox']//span[text()='Admin']");
    // 7. Role ESS
    By roleOptionESS = By.xpath("//div[@role='listbox']//span[text()='ESS']");
    // 8. Employee name
    By employeeNameInput = By.xpath("//label[text()='Employee Name']/parent::div/following-sibling::div//input");
    // 9. button reset
    By btnReset = By.xpath("//button[contains(., 'Reset')]");
    // 10. button search
    By btnSearch = By.xpath("//button[@type='submit']");
    // 11. user management
    By userManagementMenu = By.xpath("//span[contains(@class, 'oxd-topbar-body-nav-tab-item') and contains(text(), 'User Management')]");
    // 12. firstRowUsername
    By firstRowUsername = By.xpath("(//div[@class='oxd-table-card']//div[@role='cell'])[2]//div");
    // 13.firstRowRole
    By firstRowRole = By.xpath("(//div[@class='oxd-table-card']//div[@role='cell'])[3]//div");
    // 14. firstRowDeleteBtn
    By firstRowDeleteBtn = By.xpath("(//div[@class='oxd-table-card']//button[.//i[contains(@class, 'bi-trash')]])[1]");
    // 15. firstRowEditBtn
    By firstRowEditBtn = By.xpath("(//div[@class='oxd-table-card']//button[.//i[contains(@class, 'bi-pencil-fill')]])[1]");
    // 16. User Role 
    By userRoleSortIcon = By.xpath("//div[@role='columnheader' and contains(., 'User Role')]//i[contains(@class, 'oxd-table-header-sort-icon')]");
    // 17. Employee Name
    By employeeNameSortIcon = By.xpath("//div[@role='columnheader' and contains(., 'Employee Name')]//i[contains(@class, 'oxd-table-header-sort-icon')]");
    // 18. TitleUserManagement
    By breadcrumbTitleUserManagement = By.xpath("//h6[text()='User Management']");
    // 19 sidebar Toggle Button
    By sidebarToggleButton = By.xpath("//button[contains(@class, 'oxd-main-menu-button')]");
    // 20. toggle Filter Button
    By toggleFilterButton = By.xpath("//button[i[contains(@class, 'bi-caret-up-fill')]]");
    // 21. button add
    By btnAdd = By.xpath("//button[contains(., 'Add')]");

    

    // ================= PHƯƠNG THỨC KHỞI TẠO ELEMENTS =================
    public void findElements() {
    	WebElement adminMenuEl = driver.findElement(adminMenu);
        WebElement pimMenuEl = driver.findElement(pimMenu);
        WebElement leaveMenuEl = driver.findElement(leaveMenu);
        WebElement toggleSideBarEl = driver.findElement(sidebarToggleButton);

        WebElement userMngMenuEl = driver.findElement(userManagementMenu);
        WebElement titleUserMngEl = driver.findElement(breadcrumbTitleUserManagement);

        WebElement userInpEl = driver.findElement(usernameInput);
        WebElement roleDrpEl = driver.findElement(userRoleDropdown);
        WebElement empInpEl = driver.findElement(employeeNameInput);
        WebElement toggleFilterBtnEl = driver.findElement(toggleFilterButton);

        WebElement resetBtnEl = driver.findElement(btnReset);
        WebElement searchBtnEl = driver.findElement(btnSearch);
        WebElement addBtnEl = driver.findElement(btnAdd);

        WebElement userRoleSortEl = driver.findElement(userRoleSortIcon);
        WebElement empNameSortEl = driver.findElement(employeeNameSortIcon);

        WebElement adminOptionEl = driver.findElement(roleOptionAdmin);
        WebElement essOptionEl = driver.findElement(roleOptionESS);
        
        WebElement specificUserEl = driver.findElement(specificUsername);
        WebElement specificRoleEl = driver.findElement(roleOfSpecificUser);
        WebElement deleteSpecificBtnEl = driver.findElement(deleteBtnOfSpecificUser);
        WebElement editSpecificBtnEl = driver.findElement(editBtnOfSpecificUser);
        
        System.out.println("Đã khởi tạo thành công các elements trên trang Admin!");
    }
}