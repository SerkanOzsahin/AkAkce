import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SerkanSengul extends BaseDriver {
    @Test
    public void HesapDogrulamaKontrol(){
        driver.get("https://www.akakce.com/");

        WebElement HesapAc = driver.findElement(By.xpath("//div[@id='H_rl_v8']//a"));
        HesapAc.click();
        MyFunc.Wait(1);

        WebElement Name = driver.findElement(By.cssSelector("[id='rnufn']"));
        Name.sendKeys("Serkan");
        MyFunc.Wait(1);

        WebElement surname = driver.findElement(By.cssSelector("[id='rnufs']"));
        surname.sendKeys("Uza");
        MyFunc.Wait(1);

        WebElement email = driver.findElement(By.cssSelector("[id='rnufe1']"));
        email.sendKeys("TechnoStudyTeam__3_@gmail.com");
        MyFunc.Wait(1);

        WebElement againEmail = driver.findElement(By.cssSelector("[id='rnufe2']"));
        againEmail.sendKeys("TechnoStudyTeam__3_@gmail.com");
        MyFunc.Wait(1);

        WebElement password = driver.findElement(By.cssSelector("[id='rnufp1']"));
        password.sendKeys("KOBE21tmac");
        MyFunc.Wait(1);

        WebElement againpassoword = driver.findElement(By.cssSelector("[id='rnufp2']"));
        againpassoword.sendKeys("KOBE21tmac");
        MyFunc.Wait(1);

        WebElement radiobutton = driver.findElement(By.cssSelector("[id='rngf']"));
        radiobutton.click();
        MyFunc.Wait(1);

        WebElement Webday = driver.findElement(By.cssSelector("[id='bd']"));
        WebElement WebMonth = driver.findElement(By.cssSelector("[id='bm']"));
        WebElement WebYear = driver.findElement(By.cssSelector("[id='by']"));
        MyFunc.Wait(1);
        Select day = new Select(Webday);
        Select Month = new Select(WebMonth);
        Select Year = new Select(WebYear);
        MyFunc.Wait(1);
        day.selectByVisibleText("23");
        Month.selectByVisibleText("4");
        Year.selectByVisibleText("1990");
        MyFunc.Wait(1);

        WebElement btn = driver.findElement(By.cssSelector("[id='rnufpca']"));
        btn.click();
        MyFunc.Wait(1);

        WebElement btn2 = driver.findElement(By.cssSelector("[id='rnufnee']"));
        btn2.click();
        MyFunc.Wait(1);

        WebElement Confim = driver.findElement(By.cssSelector("[id='rfb']"));
        Confim.click();
        MyFunc.Wait(1);

        WebElement checkhesap1 = driver.findElement(By.cssSelector("[rel='nofollow'][href='/akakcem/']"));
        checkhesap1.click();

        WebElement checkhesap = driver.findElement(By.cssSelector("[rel='nofollow'][href='/akakcem/']"));
        Assert.assertTrue("test başarısız oldu",checkhesap.getText().contains("Serkan"));
        System.out.println("Test başarılı bir şekilde gerçekleşti");
        MyFunc.Wait(1);

        WebElement personeldetails= driver.findElement(By.cssSelector("[href='/akakcem/kullanici-bilgilerim/bilgi-guncelle/']"));
        personeldetails.click();
        MyFunc.Wait(1);

        WebElement phonenumber= driver.findElement(By.cssSelector("[id='umdcp']"));
        phonenumber.sendKeys("5555922507");
        MyFunc.Wait(1);

        WebElement uptadebutton= driver.findElement(By.cssSelector("[type='submit']"));
        uptadebutton.click();
        MyFunc.Wait(1);

        WebElement button2= driver.findElement(By.xpath("//button[@class='bt_v8 line_v8']/b"));
        button2.click();



        WaitAndQuit();

    }
}