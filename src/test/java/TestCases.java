import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TestCases extends BaseMethods {

    JavascriptExecutor jse = (JavascriptExecutor)driver;
    public void btn_kiralik_icon () {
        driver.findElement(By.cssSelector("div[class='link-sliding'] a[href='/kiralik']")).click();
    }

    public void btn_filtrele_icon () {
        driver.findElement(By.cssSelector("div[class='list-basetab'] button ~ button")).click();
    }

    public void btn_select_city () {

        driver.findElement(By.cssSelector("div[class='city'] select")).click();
    }

    public void btn_city_search() {
        driver.findElement(By.cssSelector("option[value='ankara']")).click();
        driver.findElement(By.cssSelector("div[class='city'] select")).click();

    }

    public void input_town (){
        driver.findElement(By.cssSelector("section[class='location'] section[class='select-content']")).click();
    }

    public void btn_town_search (){
        driver.findElement(By.xpath("//span[text()=\"Çankaya\"]")).click();
    }

    public void btn_search_2(){
        driver.findElement(By.cssSelector("#dropdown-lightbox-district > button")).click();
    }

    public void btn_oda_tipi(){
        jse.executeScript("window.scrollBy(0,400)");
        WebElement flag =  driver.findElement(By.cssSelector("section[class='room-type'] > section"));

    }

    public void btn_oda_tipi_1(){
        driver.findElement(By.cssSelector("section[class='room-type'] ul :nth-child(4)")).click();
    }

    public void btn_search_3(){
        driver.findElement(By.cssSelector("section[class='room-type'] button[class='btn btn-red filter-close']")).click();
    }

    public void btn_search_4() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement flag =  driver.findElement(By.cssSelector("section[class='within-site d-flex']"));

        jse.executeScript("window.scrollBy(0,600)");
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(By.cssSelector("section[class='within-site d-flex'] label")).click();
    }

    public void btn_search(){
        driver.findElement(By.cssSelector("button[class='btn btn-red cardShadow3 get-result']")).click();
    }

    public void third_offer() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,300)");
        WebElement flag =  driver.findElement(By.cssSelector("div[class='reality-list'] > :nth-child(3) .inner >div.card-link"));

        TimeUnit.SECONDS.sleep(1);
        flag.click();
    }


}
