package com.testcaseinfo.testcase1;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

/**
 * @Description:
 * @Author: Myles
 * @CreateDate: 2021/4/4 18:48
 * @UpdateUser:
 * @UpdateDate: 2021/4/4 18:48
 * @UpdateRemark: //更新的信息
 * @Version: 1.0    //版本号
 */

public class Junit5Demo1Test {
    private static Logger log = Logger.getLogger(org.junit.Test.class.getClass());
    @Test
    void demo1(){
        log.debug("demo1");
    }
}
