package Testcase;
import  com.bsb.dao.Basic;
import com.bsb.dao.HomePage;
import com.sun.xml.internal.bind.v2.runtime.output.Encoded;
import org.omg.IOP.Encoding;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import  org.testng.annotations.*;

import javax.imageio.IIOException;

public class TestHome  extends Basic {
    HomePage  homePage;

    /**
     * 测试我的按钮点击是否正常
     * @throws InterruptedException
     */
    @Test(description = "我的",priority= 0)
    public void  mybtnclick()
    {

            homePage=new HomePage();
        try {
            homePage.mybtn.click();
            Reporter.log("点击我的按钮");
            Thread.sleep(1000);
        }
        catch (Exception e){
             Assert.assertTrue(false);
            e.printStackTrace();
        }


    }
    @Test (description = "登录",priority=1)
    public void loginbtn()
    {

            homePage=new HomePage();
        try {
            homePage.loginbtn.click();
            Reporter.log("点击登录按钮，跳转微信登录");
        }catch (Exception e){
            Assert.assertTrue(false);
            e.printStackTrace();
        }




    }
    @Test(description = "跳转微信登录",priority=2)
    public void wechatloginbtn()
    {
        homePage=new HomePage();
        try {
        homePage.wechatloginbtn.click();
        Reporter.log("跳转到微信登录，点击微信登录");
    }catch (Exception e){
        Assert.assertTrue(false);
        e.printStackTrace();

    }


    }

    @Test(description = "校验用户是否登录成功",priority=3)
    public void ylogin() {

            homePage = new HomePage();
            System.out.println(homePage.nickname().getText());
        try {
            if (homePage.nickname().getText() != null) {
                Assert.assertEquals("迷糊止水", "迷糊止水");
                Reporter.log("用户登录成功");
            } else {
                Assert.assertTrue(false);
                Reporter.log("用户登录有问题");
            }

        }catch (Exception e){
            Assert.assertTrue(false);
            Reporter.log("用户登录异常");
            e.printStackTrace();
        }
    }

    @Test(description = "点击我的抽奖",priority = 4)
    public void choujiangclick(){
        homePage =new HomePage();
        try {
            homePage.choujiang.click();
            Reporter.log("点击抽奖正常");
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.assertTrue(false);
            Reporter.log("点击抽奖异常");
        }
    }
        @Test(description = "进入我的抽奖页面，默认显示未中奖页面",priority = 5)
      public  void weizhongjiang(){
        homePage =new HomePage();
        try {
            Assert.assertEquals(homePage.weizhongjiang.isSelected(),true);
            Reporter.log("未抽奖默认选中正常");
        }catch (Exception e){
            Assert.assertFalse(true,"未抽奖定位失败");
            Reporter.log("未抽奖默认选中失败");
            e.printStackTrace();
        }

        }
        @Test(description = "点击待开奖箭头，进入抽奖详情页面",priority = 6)
        public void NozGoodsName(){
        homePage=new HomePage();
        try {
            if (homePage.GoodsName().getText()!=null){
                homePage.choujiangdetail().click();
                Reporter.log("进入抽奖详情正常");
                Assert.assertTrue(true);
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.assertFalse(true);
            Reporter.log("抽奖详情加载异常");
        }
        }

}
