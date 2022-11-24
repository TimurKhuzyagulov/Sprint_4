import PageObject.MainPage;
import org.junit.*;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

//тест для важных вопросов...
public class AnswerFAQTest {

    MainPage mainPage = new MainPage(MainPage.driver);

    @Before
    public void beforeFAQ() {
        System.setProperty("webdriver.chrome.driver", "D:\\WebDriver\\chromedriver.exe");
        MainPage.driver = new ChromeDriver();
        MainPage.driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    @Test
    public void FAQ_1QuestionClickTest() {
        Assert.assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.", mainPage.getAnswerTo1Question());
    }

    @Test
    public void FAQ_2QuestionClickTest() {
        Assert.assertEquals("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", mainPage.getAnswerTo2Question());
    }

    @Test
    public void FAQ_3QuestionClickTest() {
        Assert.assertEquals("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", mainPage.getAnswerTo3Question());
    }

    @Test
    public void FAQ_4QuestionClickTest() {

        Assert.assertEquals("Только начиная с завтрашнего дня. Но скоро станем расторопнее.", mainPage.getAnswerTo4Question());
    }

    @Test
    public void FAQ_5QuestionClickTest() {
        Assert.assertEquals("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.", mainPage.getAnswerTo5Question());
    }

    @Test
    public void FAQ_6QuestionClickTest() {
        Assert.assertEquals("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.", mainPage.getAnswerTo6Question());
    }

    @Test
    public void FAQ_7QuestionClickTest() {
        Assert.assertEquals("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.", mainPage.getAnswerTo7Question());
    }

    @Test
    public void FAQ_8QuestionClickTest() {
        Assert.assertEquals("Да, обязательно. Всем самокатов! И Москве, и Московской области.", mainPage.getAnswerTo8Question());
    }

    @After
    public void afterFAQ() {
        MainPage.driver.quit();
    }
}
