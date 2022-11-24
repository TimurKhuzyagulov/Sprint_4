package PageObject;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPage {
    public static WebDriver driver;

    //Кнопка для принятия куки
    By btnCookie = By.id("rcc-confirm-button");

    //Первый вопрос в списке вопросов о важном.
    By btnFAQ1 = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[1]");
    //Раскрывающийся ответ на первый вопрос
    By FAQ1Answer = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[1]/div[2]/p");

    //Второй вопрос в списке вопросов о важном
    By btnFAQ2 = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[2]");
    //Раскрывающийся ответ на второй вопрос
    By FAQ2Answer = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[2]/div[2]/p");

    //Третий вопрос в списке вопросов о важном
    By btnFAQ3 = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[3]");
    //Раскрывающийся ответ на третий вопрос
    By FAQ3Answer = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[3]/div[2]/p");

    //Четвертый вопрос в списке вопросов о важном
    By btnFAQ4 = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[4]");
    //Раскрывающийся ответ на четвертый вопрос
    By FAQ4Answer = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[4]/div[2]/p");

    //Пятый вопрос в списке вопросов о важном
    By btnFAQ5 = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[5]");
    //Раскрывающийся ответ на пятый вопрос
    By FAQ5Answer = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[5]/div[2]/p");

    //Шестой вопрос в списке вопросов о важном
    By btnFAQ6 = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[6]");
    //Раскрывающийся ответ на шестой вопрос
    By FAQ6Answer = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[6]/div[2]/p");

    //Седьмой вопрос в списке вопросов о важном
    By btnFAQ7 = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[7]");
    //Раскрывающийся ответ на седьмой вопрос
    By FAQ7Answer = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[7]/div[2]/p");

    //Восьмой вопрос в списке вопросов о важном
    By btnFAQ8 = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[8]");
    //Раскрывающийся ответ на восьмой вопрос
    By FAQ8Answer = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[8]/div[2]/p");

//конструктор
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }



    public String getAnswerTo1Question(){
        driver.findElement(btnCookie).click();
        driver.findElement(btnFAQ1).click();
        return driver.findElement(FAQ1Answer).getText();
    }

//    public String FAQ1getText()
//    {
//        return driver.findElement(FAQ1Text).getText();
//    }

    public String getAnswerTo2Question(){
        driver.findElement(btnCookie).click();
        driver.findElement(btnFAQ2).click();
        return driver.findElement(FAQ2Answer).getText();
    }


    public String getAnswerTo3Question(){
        driver.findElement(btnCookie).click();
        driver.findElement(btnFAQ3).click();
        return driver.findElement(FAQ3Answer).getText();

    }


    public String getAnswerTo4Question(){
        driver.findElement(btnCookie).click();
        driver.findElement(btnFAQ4).click();
        return driver.findElement(FAQ4Answer).getText();
    }


    public String getAnswerTo5Question(){
        driver.findElement(btnCookie).click();
        driver.findElement(btnFAQ5).click();
        return driver.findElement(FAQ5Answer).getText();
    }


    public String getAnswerTo6Question(){
        driver.findElement(btnCookie).click();
        driver.findElement(btnFAQ6).click();
        return driver.findElement(FAQ6Answer).getText();
    }



    public String getAnswerTo7Question(){
        driver.findElement(btnCookie).click();
        driver.findElement(btnFAQ7).click();
        return driver.findElement(FAQ7Answer).getText();
    }


    public String getAnswerTo8Question(){
        driver.findElement(btnCookie).click();
        driver.findElement(btnFAQ8).click();
        return driver.findElement(FAQ8Answer).getText();
    }

}

