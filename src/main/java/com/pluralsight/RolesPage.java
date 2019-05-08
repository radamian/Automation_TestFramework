package com.pluralsight;

import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;


public class RolesPage {

    static String url="https://www.pluralsight.com";
    static String title="Pluralsight | Role IQ | Pluralsight";

    public void goTo() {
        Browser.goTo(url);
    }

    public void goToJavaRoles(){
        Browser.ScrollToFindElement();
        Browser.driver.findElement(By.xpath( "/html/body/div[1]/div/noindex[2]/footer/div/div/div[2]/div[3]/a[2]")). click();
        System. out.println("Click RoleIQ");
        Browser.driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);


    }

    public boolean isAt() {
        return Browser.title().equals(title);

    }
}
