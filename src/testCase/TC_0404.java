package testCase;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;

public class TC_0404 extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://www.akakce.com/");

        //null email & password

        WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"H_rl_v8\"]/a [2]"));
        loginBtn.click();
        delay(1);

        WebElement emailLogin = driver.findElement(By.xpath("//*[@id='life']"));
        emailLogin.sendKeys("");
        delay(1);

        WebElement passwordLogin = driver.findElement(By.xpath("//*[@id='lifp']"));
        passwordLogin.sendKeys("");
        delay(1);

        WebElement submit = driver.findElement(By.xpath("//*[@id='lfb' and @value='Giriş yap']"));
        submit.click();
        delay(2);

        WebElement warningMessage = driver.findElement(By.cssSelector("div[class=\"alertX t2\"]>p"));
        Assert.assertEquals("Lütfen e-posta adresinizi yazın.", warningMessage.getText());

        delayQuit();
    }
}
