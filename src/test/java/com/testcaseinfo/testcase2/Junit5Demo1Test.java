package com.testcaseinfo.testcase2;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

/**
 * @Description:
 * @Author: Myles
 * @CreateDate: 2021/4/4 18:56
 * @UpdateUser:
 * @UpdateDate: 2021/4/4 18:56
 * @UpdateRemark: //更新的信息
 * @Version: 1.0    //版本号
 */

public class Junit5Demo1Test {
    private static Logger log = Logger.getLogger(org.junit.Test.class.getClass());
    @Test
    void eat(){
        log.debug("eating food");
    }
}
