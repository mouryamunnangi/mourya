package Demo_site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registration {
	WebDriver driver;
	
	By sign_in_name=By.xpath("//input[@type=\"text\"]"); 
	By sign_in_email=By.xpath("(//input[@type=\"email\"])[2]");
	By sign_in_button=By.xpath("(//button[@type=\"submit\"])[2]");


//constructor
public  registration(WebDriver driver) {
	this.driver= driver;
}

public void login_details() {
	driver.findElement(sign_in_name).sendKeys("mourya");
	driver.findElement(sign_in_email).sendKeys("mourya@gmail.com");
	driver.findElement(sign_in_button).click();
}
}	

