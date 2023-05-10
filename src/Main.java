import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.lang.Thread;

/*
Test plan:
1.Open chrome browser
2.Go to URL - https://google.com
3.Maximize window
4.Decline cookies privacy in popUp Window
5.Move to URL - https://magento.softwaretestingboard.com/
6.Move back to -  https://google.com
7. Move forward to- https://magento.softwaretestingboard.com/
8.Enter string  "Shirts" into search tab
9. Click to search
10."Hover" over Men tab - to open drop down menu
11."Hover" over Tops tab - to open drop down menu
12.Click on Jackets
13.Enter the "Proteus Fitness Jackshirt"
14.Change image to the right
15.Again change image to the right
16.Change image to the left
17.Select M size of jacket
18.Selecy blue color
19.Add to cart
20.Click on cart icon
21.Click to view and edit cart link
22.Delete added jacket(click on trash icon)
23.Enter "bag" into search bar and click to search for bag
24."Hoover" over bag
25.Add bag to cart
26.Click on cart icon
27.Click to view and edit cart link
28.Change qunatity to 3 and update shopping cart
29.Delete added bags(click on trash icon)
30.Go to "sign in" tab
31.Wrtie valid information in email and password input fields
32.Cleat already written valid information from email and password input fields
33.Wrtie valid information in email and password input fields
34.Click button "Sign in"
*/
public class Main {
    public static void main(String[] args) {

        try{
            System.setProperty("webrdiver.chrome.driver","HERE PUT YOUR PATH TO FOLDER TAHT CONTAINS DRIVERS ");
            WebDriver driver = new ChromeDriver();

            driver.get("https://google.com");
            driver.manage().window().maximize();

            Thread.sleep(1000);
            WebElement cookiesPopUp = driver.findElement(By.id("uMousc"));
            cookiesPopUp.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/span/div/div/div/div[3]/div[1]/button[1]/div")).click();

            driver.navigate().to("https://magento.softwaretestingboard.com/");
            Thread.sleep(1000);
            driver.navigate().back();

            Thread.sleep(1000);
            driver.navigate().forward();

            Thread.sleep(1000);
            driver.findElement(By.id("search")).sendKeys("Shirts");
            driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[2]/div[2]/form/div[2]/button")).click();

            Thread.sleep(1000);
            Actions action = new Actions(driver);
            WebElement dropDownMenu = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/nav/ul/li[3]/a/span[1]"));

            Thread.sleep(1000);
            action.moveToElement(dropDownMenu).build().perform();
            WebElement topsFromDropMenu = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/nav/ul/li[3]/ul/li[1]/a/span[2]"));

            Thread.sleep(1000);
            action.moveToElement(topsFromDropMenu).build().perform();

            Thread.sleep(1000);
            driver.findElement(By.id("ui-id-19")).click();

            Thread.sleep(1000);
            driver.findElement(By.linkText("Proteus Fitness Jackshirt")).click();

            Thread.sleep(2000); //waiting for images to load

            WebElement divWithImages = driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[3]"));
            action.moveToElement(divWithImages).build().perform();
            driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div")).click();

            Thread.sleep(2000);
            action.moveToElement(divWithImages).build().perform();
            driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div")).click();

            Thread.sleep(2000);
            action.moveToElement(divWithImages).build().perform();
            driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div")).click();

            Thread.sleep(2000);
            driver.findElement(By.id("option-label-size-143-item-168")).click();

            Thread.sleep(2000);
            driver.findElement(By.id("option-label-color-93-item-50")).click();

            Thread.sleep(2000);
            driver.findElement(By.id("product-addtocart-button")).click();

            Thread.sleep(5000);
            driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/a")).click();

            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/div/div/div/div[2]/div[5]/div/a")).click();

            Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div[2]/form/div[1]/table/tbody/tr[2]/td/div/a[2]")).click();

            Thread.sleep(1000);
            driver.findElement(By.id("search")).sendKeys("bag");
            driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[2]/div[2]/form/div[2]/button")).click();

            Thread.sleep(1000);
            WebElement bagHover = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div[2]/div[2]/ol/li[1]/div"));
            action.moveToElement(bagHover).build().perform();

            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div[2]/div[2]/ol/li[1]/div/div/div[3]/div/div[1]/form/button")).click();

            Thread.sleep(5000);
            driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/a")).click();

            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/div/div/div/div[2]/div[5]/div/a")).click();

            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div[2]/form/div[1]/table/tbody/tr[1]/td[3]/div/div/label/input")).clear();
            driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div[2]/form/div[1]/table/tbody/tr[1]/td[3]/div/div/label/input")).sendKeys("3");
            driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div[2]/form/div[2]/button[2]")).click();

            Thread.sleep(7000);
            driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div[2]/form/div[1]/table/tbody/tr[2]/td/div/a[2]")).click();

            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a")).click();
            driver.findElement(By.id("email")).sendKeys("roni_cost@example.com");
            driver.findElement(By.id("pass")).sendKeys("roni_cost3@example.com");

            Thread.sleep(3000);
            driver.findElement(By.id("email")).clear();
            driver.findElement(By.id("pass")).clear();

            Thread.sleep(2000);
            driver.findElement(By.id("email")).sendKeys("roni_cost@example.com");

            Thread.sleep(2000);
            driver.findElement(By.id("pass")).sendKeys("roni_cost3@example.com");

            Thread.sleep(2000);
            driver.findElement(By.id("send2")).click();

            Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/a/img")).click();

            Thread.sleep(2000);
            driver.quit();


        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
