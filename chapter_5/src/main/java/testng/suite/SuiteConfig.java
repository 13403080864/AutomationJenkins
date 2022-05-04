package testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * @author wq
 * @since 2022-05-04 上午10:49
 */

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite 运行啦");
    }

   @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite 运行啦");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest 运行，包裹每个方法,就是根据testng配置的包裹方法");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("afterTest 运行，包裹每个方法");
    }
}
