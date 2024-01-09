package Demo_site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class women {
    WebDriver driver;

    By plus_butt = By.xpath("(//span[@class=\"badge pull-right\"])[1]");

    // dress
    By dress = By.xpath("(//a[text()=\"Dress \"])[1]");

    // dress add to cart
    By ATC = By.xpath("(//a[@data-product-id=\"3\"])[1]");

    // view product
    By VP = By.xpath("(//a[@style=\"color: brown;\"])[1]");

    // update quantity
    By UQ = By.xpath("//input[@type=\"number\"]");

    // ADD TO CART
    By ATC2 = By.xpath("//button[@type=\"button\"]");

    // continue button
    By cont_but = By.xpath("//button[@class=\"btn btn-success close-modal btn-block\"]");

    // Tops
    By tops = By.xpath("//a[text()=\"Tops \"]");

    // Add to cart
    By ATC3 = By.xpath("(//a[@class=\"btn btn-default add-to-cart\"])[3]");

    // Sarees
    By saree = By.xpath("//a[text()=\"Saree \"]");

    // View saree product
    By vpsaree = By.xpath("(//a[@style=\"color: brown;\"])[1]");

    // saree text
    By sareetext = By.xpath("//p[text()=\" In Stock\"]");
    
    //ATC
    By ATC4 =By.xpath("//button[@type=\"button\"]");

    // Constructor
    public women(WebDriver driver) {
        this.driver = driver;
    }

    public void women_category() {
        // Dress category
        driver.findElement(plus_butt).click();
        driver.findElement(dress).click();
        driver.findElement(ATC).click();
        driver.findElement(VP).click();

        // Update quantity
        driver.findElement(UQ).clear();
        driver.findElement(UQ).sendKeys("2");
        driver.findElement(ATC2).click();
        driver.findElement(cont_but).click();

        // Tops category
        driver.findElement(plus_butt).click();
        driver.findElement(tops).click();
        driver.findElement(ATC3).click();
        driver.findElement(cont_but).click();

        // Saree category
        driver.findElement(plus_butt).click();
        driver.findElement(saree).click();
        driver.findElement(vpsaree).click();

        // Retrieve text
        String sareeProductStatus = driver.findElement(sareetext).getText();
        System.out.println(sareeProductStatus);

        // Check if the product is in stock before adding to the cart
        if (sareeProductStatus.contains("In Stock")) {
            driver.findElement(ATC4).click();
        } else {
            System.out.println("Saree is out of stock. Not adding to the cart.");
        }
        driver.findElement(cont_but).click();
    }
}
