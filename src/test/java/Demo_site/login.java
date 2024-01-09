package Demo_site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
	
	WebDriver driver;
	
	By login_email= By.xpath("(//input[@type=\"email\"])[1]");
	By login_pass= By.xpath("(//input[@type=\"password\"])[1]");
	By login_butt= By.xpath("(//button[@type=\"submit\"])[1]");
	
	//adding products to cart
	
	By add_product= By.xpath("(//a[@class=\"btn btn-default add-to-cart\"])[1]");
	
	//continue button
	
	By cont_butt= By.xpath("//button[@class=\"btn btn-success close-modal btn-block\"]");
	
	public  login(WebDriver driver) {
		this.driver= driver;
	}
	
	public void login_det() {
		driver.findElement(login_email).sendKeys("mourya@gmail.com");
		driver.findElement(login_pass).sendKeys("Mourya@98");
		driver.findElement(login_butt).click();
		driver.findElement(add_product).click();
		driver.findElement(cont_butt).click();
	}
}
