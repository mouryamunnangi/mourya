package Demo_site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class kids {
	WebDriver driver;

	By kids_plus_but = By.xpath("(//span[@class=\"badge pull-right\"])[3]");
	
	// kids dress
	By kids_dress = By.xpath("(//a[text()=\"Dress \"])[2]");
	
	// add to cart
	By ATC = By.xpath("(//a[@data-product-id=\"19\"])[1]");
	
	// CONT BUTT
	By cont_butt = By.xpath("//button[@class=\"btn btn-success close-modal btn-block\"]");
	
	// Tops & Shirts
	By Tops_Shirts = By.xpath("(//a[text()=\"Tops & Shirts \"])");
	
	// add to cart
	By ATC1 = By.xpath("(//a[@data-product-id=\"12\"])[1]");
	
	// Constructor
		public kids(WebDriver driver) {
			this.driver = driver;
		}

		public void kids_category() {
	       
	    	// t shirt category
	        driver.findElement(kids_plus_but).click();
	        driver.findElement(kids_dress).click();
	        driver.findElement(ATC).click();
	        driver.findElement(cont_butt).click();
	        driver.findElement(kids_plus_but).click();
	        driver.findElement(Tops_Shirts).click();
	        driver.findElement(ATC1).click();
	        driver.findElement(cont_butt).click();
	        
}
}