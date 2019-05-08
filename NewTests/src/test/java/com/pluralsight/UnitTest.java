package com.pluralsight;

import static org.junit.Assert.*;

import org.junit.*;

public class UnitTest {

    @BeforeClass
    public static void Setup(){
        Browser.driver.manage() .window().maximize();
    }

    @Test
    public void canGoToHomePage() {
        Pages.homePage().goTo();
        Assert.assertTrue(Pages.homePage().isAt());
    }

    @Test
    public void canGoToRoleIQPage(){
        Pages.rolesPage().goTo();
        Pages.rolesPage().goToJavaRoles();
        Assert.assertTrue(Pages.rolesPage().isAt());
    }

    @AfterClass
    public static void cleanUp(){
        Browser.close();
    }

}