package Demo_site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class men {
	WebDriver driver;

	By men_plus_but = By.xpath("(//span[@class=\"badge pull-right\"])[2]");

	// t shirts
	By tshirts = By.xpath("//a[text()=\"Tshirts \"]");

	// view product
	By view_prod = By.xpath("(//a[@style=\"color: brown;\"])[1]");

	// write review
	By name = By.xpath("//input[@type=\"text\"]");
	By email = By.xpath("//input[@type=\"email\"]");
	By textarea = By.xpath("//textarea[@name=\"review\"]");
	By submit = By.xpath("(//button[@type=\"submit\"])[1]");

	// add to cart
	By ATC = By.xpath("(//button[@type=\"button\"])[1]");

	// CONT BUTT
	By cont_butt = By.xpath("//button[@class=\"btn btn-success close-modal btn-block\"]");

	// jeans
	By jeans = By.xpath("//a[text()=\"Jeans \"]");

	// add to cart
	By ATC1 = By.xpath("(//a[@data-product-id=\"33\"])[1]");

	// Constructor
	public men(WebDriver driver) {
		this.driver = driver;
	}

	public void men_category() {
       
    	// t shirt category
        driver.findElement(men_plus_but).click();
        driver.findElement(tshirts).click();
        driver.findElement(view_prod).click();
       
        //write review
        driver.findElement(name).sendKeys("mourya");
        driver.findElement(email).sendKeys("mourya@gmail.com");
        driver.findElement(textarea).sendKeys("Good colour and good fabric");
        driver.findElement(submit).click();
        
        //ADD TO CART
        driver.findElement(ATC).click();
        
        //CONT BUTT
        driver.findElement(cont_butt).click();
        
        //JEANS CATEGORY
        driver.findElement(men_plus_but).click();
        driver.findElement(jeans).click();
        driver.findElement(ATC1).click();
		
      //CONT BUTT
        driver.findElement(cont_butt).click();
}
}
