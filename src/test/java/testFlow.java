import PageObject.OrderPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//положительный тест
@RunWith(Parameterized.class)
public class testFlow {

        private WebDriver driver;
        private final String name;
        private final String family;
        private final String adress;
        private final String metroStation;
        private final String telephoneNumber;
        private final String rentalDate;
        private final String comment;


        public testFlow(String name, String family, String adress, String metroStation, String telephoneNumber, String rentalDate, String comment) {
            this.name = name;
            this.family = family;
            this.adress = adress;
            this.metroStation = metroStation;
            this.telephoneNumber = telephoneNumber;
            this.rentalDate = rentalDate;
            this.comment = comment;

        }

        @Parameterized.Parameters
        public static Object[][] getCredentials() {
            return new Object[][]{
                    {"Иванов", "Иван", "улица Ленина", "Лубянка", "79190125021", "22.11.2022", "очень ждем"},
                    {"Петров", "Петр", "улица Пушкина", "Сокольники", "79122255963", "20.11.2022", "ждем ждем"},
            };

        }



    @Test
    public void orderTestBtnHead() {
        System.setProperty("webdriver.chrome.driver", "D:\\WebDriver\\chromedriver.exe");
        driver = new ChromeDriver();
//        System.setProperty("webdriver.gecko.driver", "D:\\WebDriver\\geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");



        OrderPage orderPage = new OrderPage(driver);
        orderPage.btnCookieClick();
        orderPage.btnOrderHeadClick();
        orderPage.setNameToOrder(name,family);
        orderPage.setAdressToOrder(adress);
        orderPage.setMetroStationToOrder(metroStation);
        orderPage.setTelephoneNumberToOrder(telephoneNumber);
        orderPage.btnNextClick();
        orderPage.setRentalDateToOrder(rentalDate);
        orderPage.setColorToOrder();
        orderPage.setRentalPeriod();
        orderPage.setCommentToOrder(comment);
        orderPage.setBtnOrderCreateClick();
        orderPage.setBtnYesCreateOrder();
        Assert.assertTrue(orderPage.getDisplayedSuccessOrder());
    }


    @Test
    public void orderTestBtnBody() {
        System.setProperty("webdriver.chrome.driver", "D:\\WebDriver\\chromedriver.exe");
        driver = new ChromeDriver();
//        System.setProperty("webdriver.gecko.driver", "D:\\WebDriver\\geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");



        OrderPage orderPage = new OrderPage(driver);
        orderPage.btnCookieClick();
        orderPage.btnOrderBodyClick();
        orderPage.setNameToOrder(name,family);
        orderPage.setAdressToOrder(adress);
        orderPage.setMetroStationToOrder(metroStation);
        orderPage.setTelephoneNumberToOrder(telephoneNumber);
        orderPage.btnNextClick();
        orderPage.setRentalDateToOrder(rentalDate);
        orderPage.setColorToOrder();
        orderPage.setRentalPeriod();
        orderPage.setCommentToOrder(comment);
        orderPage.setBtnOrderCreateClick();
        orderPage.setBtnYesCreateOrder();
        Assert.assertTrue(orderPage.getDisplayedSuccessOrder());
    }

    @After
    public void afterTests(){
        driver.quit();
    }


}
