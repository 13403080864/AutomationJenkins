package testng;

import org.testng.annotations.Test;

/**
 * @author wq
 * @since 2022-05-04 下午4:44
 * dependsOnMethods
 * 依赖方法测试，一般是想买东西，需要先登录，登录失败，购买肯定失败，购买是依赖登录成功的
 */

public class DependTest {

    //依赖，成功案例
    @Test
    public void login(){
        System.out.println("登录成功");
    }
    @Test(dependsOnMethods = "login")
    public void pay(){
        System.out.println("购买成功");
    }

    //依赖失败案例
    @Test
    public void test1(){
        System.out.println("Test1 运行了");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = "test1")
    public void test2(){
        System.out.println("test2 运行了");
    }


}
