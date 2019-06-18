package com.bsb.dao;
import org.openqa.selenium.support.PageFactory;

/**
 * 初始化
 */
public class BasicPage extends Basic {

    public BasicPage(){

        PageFactory.initElements(Basic.driver,this);
    }

}
