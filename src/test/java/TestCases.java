import org.junit.Test;

public class TestCases extends TestSteps {

    @Test
    public void desktopTests() throws InterruptedException {
        filtrele();
        select_city();
        city_search_select();
        select_town();
        //deleteAllCookies();
        kiralik();
        oda_seçimleri();
        site_secim();
        select_3rd_offer();
       // phone_numbers();
        //exit();
    }
/*
    public void exit(){
        device.quit();
    }*/

}