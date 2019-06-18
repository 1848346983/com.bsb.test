package com.bsb.dao;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * 基础配置
 */
public class Basic {
    public static AppiumDriver  driver;

    @BeforeClass
    public void setUp() throws InterruptedException, MalformedURLException{
        DesiredCapabilities capabilities =new DesiredCapabilities();
        capabilities.setCapability("deviceName","V1818A");
        capabilities.setCapability("platformName","Android");
       /* capabilities.setCapability("automationName","Appium");*/
        capabilities.setCapability("platformVersion","8.1.0");
        capabilities.setCapability("appPackage","com.fotron.bsb");
        capabilities.setCapability("appActivity",".ui.activity.MainActivity");


        driver = new AndroidDriver (new URL("http://127.0.0.1:4723/wd/hub"),capabilities );

        Thread.sleep(5000);

    }




}
