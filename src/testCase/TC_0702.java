package testCase;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;

public class TC_0702 extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://www.akakce.com/");

        WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"H_rl_v8\"]/a [2]"));
        loginBtn.click();
        delay(1);

        WebElement emailLogin = driver.findElement(By.xpath("//*[@id='life']"));
        emailLogin.sendKeys("korhanbozdemir@gmail.com");
        delay(1);

        WebElement passwordLogin = driver.findElement(By.xpath("//*[@id='lifp']"));
        passwordLogin.sendKeys("kb.%=24");
        delay(1);

        WebElement submit = driver.findElement(By.xpath("//*[@id='lfb' and @value='Giriş yap']"));
        submit.click();
        delay(1);

        WebElement accountName = driver.findElement(By.cssSelector("[rel='nofollow'][href='/akakcem/']"));
        accountName.click();

        WebElement deleteAccountBtn = driver.findElement(By.cssSelector("[href='/akakcem/kullanici-bilgilerim/uyelik-iptali/']"));
        deleteAccountBtn.click();

        WebElement passwordInput = driver.findElement(By.cssSelector("[type='password']"));
        passwordInput.sendKeys("kb.%=24");
        delay(1);

        WebElement deleteAccountBtn2 = driver.findElement(By.cssSelector("[type='submit']"));
        deleteAccountBtn2.click();

        WebElement successMessage = driver.findElement(By.cssSelector("ul[class=\"cul\"] i"));
        Assert.assertTrue(successMessage.getText().contains("Hesabın silindi."));

        delayQuit();
    }
}
