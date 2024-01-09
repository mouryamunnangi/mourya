package Demo_site;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo_site_Main {

	WebDriver driver;
	registration signin;
	AC_info acinfo;
	login main_login;
	women main_women_category;
	men main_men_category;
	kids main_kids_category;

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://automationexercise.com/login");
		// Changed to use the driver from the outer class, not re-declaring it.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	// @Test(priority = 1)
	public void signin() {
		signin = new registration(driver);
		signin.login_details();
	}

	// @Test(priority = 2)
	public void acinfo() {
		acinfo = new AC_info(driver);
		acinfo.selectTitle();
		acinfo.enterPassword("Mourya@98");
		acinfo.selectDay("15");
		acinfo.selectMonth("May");
		acinfo.selectYear("2000");
		acinfo.add_info();
	}

	@Test(priority = 3)
	public void main_login() {
		main_login = new login(driver);
		main_login.login_det();
	}

	@Test(priority = 4)
	public void main_women_category() {
		main_women_category = new women(driver);
		main_women_category.women_category();
	}

	@Test(priority = 5)
	public void main_men_category() {
		main_men_category = new men(driver);
		main_men_category.men_category();
	}

	@Test(priority = 6)
	public void main_kids_category() {
		main_kids_category = new kids(driver);
		main_kids_category.kids_category();
	}
}
