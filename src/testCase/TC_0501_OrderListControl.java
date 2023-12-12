package testCase;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;

public class TC_0501_OrderListControl extends BaseDriver {
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

        WebElement MyOrders = driver.findElement(By.cssSelector("li[class='order first']>b+a"));
        MyOrders.click();

        WebElement orderMessage = driver.findElement(By.cssSelector("#user-order-info > div"));
        System.out.println(orderMessage.getText());
        Assert.assertEquals("Kayıtlı siparişiniz bulunmuyor.", orderMessage.getText());

        delayQuit();
    }
}
