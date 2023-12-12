package testCase;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;

public class TC_0601_MessageBoxControl extends BaseDriver {
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

        WebElement myMessages = driver.findElement(By.cssSelector("li[class='order first']>b+a+a"));
        myMessages.click();

        WebElement messageBox = driver.findElement(By.cssSelector("div[class='wbb_v8'] > p"));
        System.out.println(messageBox.getText());
        Assert.assertEquals("Listelenecek mesaj bulunamadı.", messageBox.getText());

        delayQuit();
    }
}
