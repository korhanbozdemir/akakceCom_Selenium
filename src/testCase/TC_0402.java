package testCase;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;

public class TC_0402 extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://www.akakce.com/");

        //invalid Password

        WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"H_rl_v8\"]/a [2]"));
        loginBtn.click();
        delay(1);

        WebElement emailLogin = driver.findElement(By.xpath("//*[@id='life']"));
        emailLogin.sendKeys("korhanbozdemir@gmail.com");
        delay(1);

        WebElement passwordLogin = driver.findElement(By.xpath("//*[@id='lifp']"));
        passwordLogin.sendKeys("korhan");
        delay(1);

        WebElement submit = driver.findElement(By.xpath("//*[@id='lfb' and @value='Giriş yap']"));
        submit.click();
        delay(2);

        WebElement warningMessage = driver.findElement(By.cssSelector("div[class=\"alertX t2\"]>p"));
        Assert.assertEquals("Şifre doğru değil. Lütfen kontrol edip yeniden deneyin.", warningMessage.getText());

        delayQuit();
    }
}
