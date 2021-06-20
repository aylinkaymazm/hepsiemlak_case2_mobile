import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TestSteps extends BaseMethods {

    JavascriptExecutor jse = (JavascriptExecutor)driver;

    public void kiralik() throws InterruptedException {
        findElement(MobileElementsConstants.btn_kiralik_icon);
        Thread.sleep(2000);
    }

    public void filtrele() throws InterruptedException {
        findElement(MobileElementsConstants.btn_filtrele_icon);
        Thread.sleep(2000);
    }

    public void select_city() throws InterruptedException {
        findElement(MobileElementsConstants.btn_select_city);
        Thread.sleep(2000);
    }

    public void city_search_select() throws InterruptedException {
        findElement(MobileElementsConstants.btn_city_search);
        findElement(MobileElementsConstants.btn_select_city_option);
        Thread.sleep(2000);
    }

    public void select_town() throws InterruptedException {
        findElement(MobileElementsConstants.input_town);
        findElement(MobileElementsConstants.btn_town_search);
        findElement(MobileElementsConstants.btn_search_2);
        Thread.sleep(2000);
    }

    public void oda_seçimleri(){
        jse.executeScript("window.scrollBy(0,400)");
        clickToElement(MobileElementsConstants.btn_oda_tipi);
        clickToElement(MobileElementsConstants.btn_oda_tipi_1);
        jse.executeScript("window.scrollBy(0,400)");
    }


    public void site_secim()throws InterruptedException{
        clickToElement(MobileElementsConstants.switch_site_sec);
        Thread.sleep(1000);
        clickToElement(MobileElementsConstants.btn_search);
    }

    public void select_3rd_offer()  throws InterruptedException{
        jse.executeScript("window.scrollBy(0,300)");
        clickToElement(MobileElementsConstants.third_offer);
        String detailPageUrl = "https://www.hepsiemlak.com/ankara-cankaya-isci-bloklari-kiralik/daire/33002-6678";
        String detailPageC = getUrl();

        if(detailPageC.equals(detailPageUrl)){
            logger.info("Detay sayfadasınız");
        }else{
            logger.info("Sayfa geçişi başarısız oldu.");
        }
        Thread.sleep(2000);
    }

    public void phone_numbers() throws InterruptedException {
        Thread.sleep(1000);
        jse.executeScript("window.scrollBy(0,200)");
        Thread.sleep(1000);
        findElement(MobileElementsConstants.btn_phone_number).click();
        Thread.sleep(1000);
    }

    public void deleteAllCookies() throws InterruptedException{
        driver.manage().deleteAllCookies(); //delete all cookies
        Thread.sleep(7000); //wait 7 seconds to clear cookies.
    }

}
