package com.testcaseinfo.testcase;
import org.apache.log4j.Logger;
import org.junit.Test;
/**
 * @Description:
 * @Author: Myles
 * @CreateDate: 2021/4/4 20:04
 * @UpdateUser:
 * @UpdateDate: 2021/4/4 20:04
 * @UpdateRemark: //更新的信息
 * @Version: 1.0    //版本号
 */

public class test {
    private static Logger log = Logger.getLogger(Test.class.getClass());
    @Test
    public void testLog(){
        log.debug("debug");
        log.error("error");
    }
}
