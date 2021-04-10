package com.testcaseinfo.testcase;


import org.apache.log4j.Logger;
import org.junit.jupiter.api.*;

/**
 * @Description:
 * @Author: Myles
 * @CreateDate: 2021/4/4 17:44
 * @UpdateUser:
 * @UpdateDate: 2021/4/4 17:44
 * @UpdateRemark: //更新的信息
 * @Version: 1.0    //版本号
 */
@DisplayName("Junit5演示类")
public class Junit5Demo1Test {
    private static Logger log = Logger.getLogger(org.junit.Test.class.getClass());
    @BeforeAll
    public static void BeforeAll(){
        log.debug("BeforeAll");
    }
    @BeforeEach
    public void BeforeEach(){
        log.debug("BeforeEach");
    }

    @Test
    @DisplayName("fun1 测试方法")
    @Tag("testdemo1")
    void fun1(){
        log.debug("fun1");
    }
    @Test
    @DisplayName("fun2 测试方法")
    @Tag("testdemo2")
    void fun2(){
        log.debug("fun2");
    }
    @Test
    @DisplayName("fun3 测试方法")
    @Tag("testdemo3")
    void fun3(){
        log.debug("fun3");
    }
    @AfterEach
    public void AfterEach(){
        log.debug("AfterEach");
    }
    @AfterAll
    public static void AfterAll(){
        log.debug("AfterAll");
    }
}
