package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPage {
    public static WebDriver driver;

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    //Кнопка для принятия куки...
    private By btnCookie = By.id("rcc-confirm-button");

    //Кнопка "Заказать" расположенная в заголовке сайта
    private By btnOrderHead = By.xpath("/html/body/div/div/div/div[1]/div[2]/button[1]");
    //Кнопка "Заказать" расположенная в теле сайта
    private By btnOrderBody = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[2]/div[5]/button");

    //Элементы на странице заказа "Для кого самокат"
    private By inputName = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/input"); //Имя
    private By inputFamily = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/input"); //Фамилия
    private By inputAdress = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/input"); //Адрес
    private By inputMetroStation = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div/div/input"); //Станция метро

    private By inputTelephoneNumber = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[5]/input"); //номер телефона

    //Кнопка "Далее" на странице заказа "Для кого самокат"
    private By btnNext = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/button");

    //Элементы на странице заказа "Про аренду"
    private By inputRentalDate = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/input"); //Когда привезти самокат
    private By inputRentalPeriod = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div"); //Срок аренды
    private By inputColorBlack = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/label[1]"); //Черный цвет
    private By inputColorGray = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/label[2]"); //Серый цвет
    private By inputComment = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/input"); // Комментарий для курьера

    //Кнопка "Заказать" на странице "Про аренду"
    private By btnOrderCreate = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/button[2]");

    //Кнопка "Да" в окне потдверждения создания Заказа
    private By btnYesCreateOrder = By.xpath("//*[@id=\"root\"]/div/div[2]/div[5]/div[2]/button[2]");

    //Заголовок окна-уведомления об успешном создании заказа
    private By textSuccessOrder = By.xpath("//*[@id=\"root\"]/div/div[2]/div[5]/div[1]");

    public void btnCookieClick() {
        driver.findElement(btnCookie).click();
    }

    public void btnOrderHeadClick() {
        driver.findElement(btnOrderHead).click();
    }

    public void btnOrderBodyClick() {
        driver.findElement(btnOrderBody).click();
    }

    public void setNameToOrder(String name, String family) {
        driver.findElement(inputName).sendKeys(name);
        driver.findElement(inputFamily).sendKeys(family);
    }

    public void setAdressToOrder(String adress) {
        driver.findElement(inputAdress).sendKeys(adress);
    }

    public void setMetroStationToOrder(String metroStation) {

        driver.findElement(inputMetroStation).sendKeys(metroStation);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div/div[2]")).click();
    }

    public void setTelephoneNumberToOrder(String telephoneNumber) {
        driver.findElement(inputTelephoneNumber).sendKeys(telephoneNumber);
    }

    public void btnNextClick() {
        driver.findElement(btnNext).click();
    }

    public void setRentalDateToOrder(String rentalDate) {
        driver.findElement(inputRentalDate).sendKeys(rentalDate);
    }

    public void setColorToOrder() {
        driver.findElement(inputColorBlack).click();
    }

    public void setRentalPeriod() {
        driver.findElement(inputRentalPeriod).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[2]")).click();
    }

    public void setCommentToOrder(String comment) {
        driver.findElement(inputComment).sendKeys(comment);
    }

    public void setBtnOrderCreateClick() {
        driver.findElement(btnOrderCreate).click();
    }

    public void setBtnYesCreateOrder() {
        driver.findElement(btnYesCreateOrder).click();
    }

    public boolean getDisplayedSuccessOrder() {
        return driver.findElement(textSuccessOrder).isDisplayed();
    }
}
