package org.example.springboot;
import com.codeborne.selenide.*;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;
import static java.lang.Thread.sleep;


public class Lecture5 {

    @BeforeClass
    void init(){
        baseUrl= "https://lichess.org";
        Configuration.browser="chrome";
        Configuration.timeout=1000;
    }
    @Test
    public void Test1() {
        Selenide.open(baseUrl);
        $(By.xpath("//*[contains(@class,'button button-metal config_friend')]"))
                .shouldHave(text("Сыграть с другом"))
                .click();
        $(By.xpath("//*[contains(@class,'button button-metal color-submits__button random')]"))
                .click();
        webdriver().shouldHave(urlContaining("https://lichess.org/"));
        Selenide.sleep(4000);

    }
    @Test
    public void Test2(){
        Selenide.open(baseUrl);
        $(By.xpath("//a[text()='Задачи']"))
                .hover();
        $(By.xpath("//a[text()='Темы задач']"))
                .shouldBe(visible)
                .click();
        webdriver().shouldHave(urlContaining("https://lichess.org/ru/training/themes"));
        Selenide.sleep(3000);
    }


}
