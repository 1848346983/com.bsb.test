package dao;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

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
        capabilities.setCapability("deviceName","MI 6");
        capabilities.setCapability("platformName","Android");
       /* capabilities.setCapability("automationName","Appium");*/
        capabilities.setCapability("platformVersion","8.0.0");
        capabilities.setCapability("appPackage","com.fotron.bsb");
        capabilities.setCapability("appActivity",".ui.activity.MainActivity");
        capabilities.setCapability("autoGrantPermissions","true");
        capabilities.setCapability("noReset","true");

        driver = new AndroidDriver (new URL("http://127.0.0.1:4723/wd/hub"),capabilities );

        Thread.sleep(8000);

    }




}
