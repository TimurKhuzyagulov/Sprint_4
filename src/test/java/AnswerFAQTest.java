import PageObject.MainPage;
import org.junit.*;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;


public class AnswerFAQTest {

    MainPage mainPage = new MainPage(MainPage.driver);

    @Before
    public void beforeFAQ() {
        System.setProperty("webdriver.chrome.driver", "D:\\WebDriver\\chromedriver.exe");
        MainPage.driver = new ChromeDriver();
        MainPage.driver.get("https://qa-scooter.praktikum-services.ru/");
        }

    @Test
    public void FAQ_1QuestionClickTest(){
         Assert.assertEquals(mainPage.getAnswerTo1Question(),"Сутки — 400 рублей. Оплата курьеру — наличными или картой.");
    }

    @Test
    public void FAQ_2QuestionClickTest(){
        Assert.assertEquals(mainPage.getAnswerTo2Question(),"Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.");
    }

    @Test
    public void FAQ_3QuestionClickTest(){
        Assert.assertEquals(mainPage.getAnswerTo3Question(),"Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.");
    }

    @Test
    public void FAQ_4QuestionClickTest(){

        Assert.assertEquals(mainPage.getAnswerTo4Question(),"Только начиная с завтрашнего дня. Но скоро станем расторопнее.");
    }

    @Test
    public void FAQ_5QuestionClickTest(){
        Assert.assertEquals(mainPage.getAnswerTo5Question(),"Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.");
    }

    @Test
    public void FAQ_6QuestionClickTest(){
        Assert.assertEquals(mainPage.getAnswerTo6Question(),"Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.");
    }

    @Test
    public void FAQ_7QuestionClickTest(){
        Assert.assertEquals(mainPage.getAnswerTo7Question(),"Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.");
    }

    @Test
    public void FAQ_8QuestionClickTest(){
        Assert.assertEquals(mainPage.getAnswerTo8Question(),"Да, обязательно. Всем самокатов! И Москве, и Московской области.");
    }

@After
public void afterFAQ(){
MainPage.driver.quit();
}
}
