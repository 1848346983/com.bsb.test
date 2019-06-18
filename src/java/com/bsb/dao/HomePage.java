package com.bsb.dao;
import com.bsb.dao.Basic;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.FindsById;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import io.appium.java_client.AppiumDriver;

import java.util.List;

/**
 * 首页页面功能元素值
 */
public class HomePage  extends BasicPage {

    /**
     * 元素：我的
     */
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.View[3]\n")
    public WebElement mybtn;
    /**
     * 元素：登录
     */
    @FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[@text='登录']\n")
    public WebElement loginbtn;

    /**
     * 元素：微信登录
     */
    @FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[@text='微信登录']\n")
    public WebElement wechatloginbtn;


    /**
     *
     * @return 用户名称
    // @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[@resource-id	='com.fotron.bsb:id/tv_me_nick_name']\n")
    //@AndroidFindBy(uiAutomator ="UiSelector().resourceid(\"com.fotron.bsb:id/tv_me_nick_name\")")
    // @AndroidFindBy(id = "com.fotron.bsb:id/tv_me_nick_name")
    //@FindBy(id="com.fotron.bsb:id/tv_me_nick_name")
     */
    public WebElement nickname (){
        return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[@resource-id	='com.fotron.bsb:id/tv_me_nick_name']\n");
    }

    /**
     * 抽奖icon
     */
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.TextView[@text='我的抽奖']\n")
    public  WebElement choujiang;
    /**
     * 未中奖栏
     */
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[1]/android.widget.TextView[@text='未中奖']\n")
    public WebElement weizhongjiang;

   // @AndroidFindBy(uiAutomator = "new    UiSelector().resourceid(\"com.fotron.bsb:id/tvLotteryGoodsName\")")


    /**
     *
     * @return 是否有中奖信息
     */

    public  WebElement  GoodsName()
    {
        return driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView[@resource-id='com.fotron.bsb:id/tvLotteryGoodsName']\n"));
    }

    /**
     *
     * @return 进入抽奖详情页面
     */
    public   WebElement choujiangdetail()
    {
        return driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"TODO\"])[1]");
    }




}
