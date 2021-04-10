package com.testcaseinfo.testcase;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

/**
 * @Description:
 * @Author: Myles
 * @CreateDate: 2021/4/4 18:21
 * @UpdateUser:
 * @UpdateDate: 2021/4/4 18:21
 * @UpdateRemark: //更新的信息
 * @Version: 1.0    //版本号
 */

public class LoginTest {
    private static Logger log = Logger.getLogger(org.junit.Test.class.getClass());
    private static HashMap<String,Object> dataMap = new HashMap<String,Object>();
    @Test
    void loginTest(){
        dataMap.put("Login","登陆成功");
    }

    @Nested
    class PayTest{
        @Test
        void payTest(){
            if(null!=dataMap.get("Buy")){
                log.debug("正在支付，请等待");
                log.debug(dataMap.get("Buy"));
            }else{
                log.debug("你还没付款呢");
            }
        }
    }

    @Nested
    class BuyTest{
        @Test
        void buyTest(){
            if(dataMap.get("Login").equals("登陆成功")){
                log.debug("登陆成功啦");
                dataMap.put("Buy","购买了两件衣服");
            }else{
                log.debug("登录失败啦");
            }
        }
    }
}
