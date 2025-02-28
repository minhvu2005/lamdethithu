
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Before;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class TestBai3 {
    ChromeDriver chromeDriver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
    }

//    @Test
//    public void dangky() {
//        chromeDriver.get("https://vitimex.com.vn/dang-ky.html");
//        WebElement hoten = chromeDriver.findElement(By.xpath("//input[@id='name']"));
//        hoten.sendKeys("minhvu");
//        WebElement sdt = chromeDriver.findElement(By.xpath("//input[@id='phone']"));
//        sdt.sendKeys("0987023237");
//        WebElement email = chromeDriver.findElement(By.xpath("//input[@id='email']"));
//        email.sendKeys("vu2691744@gmail.com");
//        WebElement mk = chromeDriver.findElement(By.xpath("//input[@id='pass-regis']"));
//        mk.sendKeys("vu269");
//        WebElement xnmk = chromeDriver.findElement(By.xpath("//input[@id='pass-confirm']"));
//        xnmk.sendKeys("vu269");
//        WebElement btn = chromeDriver.findElement(By.xpath("//a[@id='register-btn']"));
//        btn.click();
//    }
    @Test
    public void dangNhap() {
        chromeDriver.get("https://vitimex.com.vn/");

        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(10));
        WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='li_log']//a[@data-bs-toggle='modal']//*[name()='svg']")));
        login.click();

        WebElement hoTen = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='account']"))
        );
        hoTen.sendKeys("0987023237");

        WebElement mk = chromeDriver.findElement(By.xpath("//input[@id='pass']"));
        mk.sendKeys("vu269");

        WebElement button = chromeDriver.findElement(By.xpath("//a[@id='signin-btn']"));
        button.click();
    }
    }

