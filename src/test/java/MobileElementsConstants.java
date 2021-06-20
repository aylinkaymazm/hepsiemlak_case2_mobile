import org.openqa.selenium.By;

public class MobileElementsConstants {

    public static By  btn_kiralik_icon =By.cssSelector("div[class='link-sliding'] a[href='/kiralik']");

    public static By  btn_filtrele_icon =By.cssSelector("div[class='list-basetab'] button ~ button");

    public static By btn_select_city = By.cssSelector("div[class='city'] select");
    public static By btn_city_search = By.cssSelector("option[value='ankara']");
    public static By btn_select_city_option= By.cssSelector("div[class='city'] select");

    public static By input_town = By.cssSelector("section[class='location'] section[class='select-content']");
    public static By btn_town_search = By.xpath("//span[text()=\Çankaya\]");
    public static By btn_search_2= (By.cssSelector("#dropdown-lightbox-district > button"));

    public static By btn_oda_tipi = By.cssSelector("section[class='room-type'] > section");
    public static By btn_oda_tipi_1 = By.cssSelector("section[class='room-type'] ul :nth-child(4)");

    public static By switch_site_sec = By.cssSelector("section[class='room-type'] button[class='btn btn-red filter-close']");

    public static By btn_search =By.cssSelector("button[class='btn btn-red cardShadow3 get-result']");

    public static By third_offer = By.cssSelector(By.cssSelector("div[class='reality-list'] > :nth-child(3) .inner >div.card-link");

    public static By btn_phone_number = By.xpath("//span[contains(text(),'Telefon Numarasını Göster')]/parent::button");


}