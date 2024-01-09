package Demo_site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AC_info {
    private WebDriver driver;

    By titleButton = By.xpath("(//input[@type=\"radio\"])[1]");
    By password = By.xpath("//input[@type=\"password\"]");
    By dayDropdown = By.id("days");
    By monthDropdown = By.id("months");
    By yearDropdown = By.id("years");
    By fristname = By.xpath("//input[@data-qa=\"first_name\"]");
    By lastname = By.xpath("//input[@data-qa=\"last_name\"]");
    By company = By.xpath("//input[@data-qa=\"company\"]");
    By add1 = By.xpath("//input[@data-qa=\"address\"]");
    By add2 = By.xpath("//input[@data-qa=\"address2\"]");
    By state = By.xpath("//input[@data-qa=\"state\"]");
    By city = By.xpath("//input[@data-qa=\"city\"]");
    By zip = By.xpath("//input[@data-qa=\"zipcode\"]");
    By mob = By.xpath("//input[@data-qa=\"mobile_number\"]");
    By ac_create = By.xpath("//button[@data-qa=\"create-account\"]");
    By cont_butt = By.xpath(" //a[@data-qa=\"continue-button\"]");
    
 
    
    
    
    

    // Constructor
    public AC_info(WebDriver driver) {
        this.driver = driver;
    }

    public void selectTitle() {
        driver.findElement(titleButton).click();
    }

    public void enterPassword(String passwordText) {
        driver.findElement(password).sendKeys(passwordText);
    }

    public void selectDay(String dayValue) {
        WebElement dayDropdownElement = driver.findElement(dayDropdown);
        Select daySelect = new Select(dayDropdownElement);
        daySelect.selectByValue(dayValue);
    }

    public void selectMonth(String monthValue) {
        WebElement monthDropdownElement = driver.findElement(monthDropdown);
        Select monthSelect = new Select(monthDropdownElement);
        monthSelect.selectByVisibleText(monthValue);
    }

    public void selectYear(String yearValue) {
        WebElement yearDropdownElement = driver.findElement(yearDropdown);
        Select yearSelect = new Select(yearDropdownElement);
        yearSelect.selectByVisibleText(yearValue);
    }

	public void add_info() {
		driver.findElement(fristname).sendKeys("mourya");
		driver.findElement(lastname).sendKeys("munnangi");
		driver.findElement(company).sendKeys("charani");
		driver.findElement(add1).sendKeys("kphb");
		driver.findElement(add2).sendKeys("nizam pet");
		driver.findElement(state).sendKeys("telangana");
		driver.findElement(city).sendKeys("hyderabad");
		driver.findElement(zip).sendKeys("500018");
		driver.findElement(mob).sendKeys("9494820231");
		driver.findElement(ac_create).click();
		driver.findElement(cont_butt).click();
		
	}
		
	}

