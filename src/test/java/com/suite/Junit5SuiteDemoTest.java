package com.suite;

import com.testcaseinfo.testcase.Junit5Demo1Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

/**
 * @Description:
 * @Author: Myles
 * @CreateDate: 2021/4/4 18:50
 * @UpdateUser:
 * @UpdateDate: 2021/4/4 18:50
 * @UpdateRemark: //更新的信息
 * @Version: 1.0    //版本号
 */
@RunWith(JUnitPlatform.class)
//@SelectPackages({
//        "com.testcaseinfo"
//})
//@IncludePackages({
//        "com.testcaseinfo.testcase1",
//        "com.testcaseinfo.testcase2"
//})
@SelectClasses({
    Junit5Demo1Test.class
})
@IncludeTags({
    "testdemo1"
})
public class Junit5SuiteDemoTest {
    souyt
}
