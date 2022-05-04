package testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * @author wq
 * @since 2022-05-04 下午3:19
 * 测试组中分组测试
 */

public class GroupsOnMethod {

    //分组，包很多测试方法分为一组
    @Test(groups = "service")
    public void test1(){
        System.out.println("这是服务端测试方法 1111");
    }

    @Test(groups = "service")
    public void test2(){
        System.out.println("这是服务端测试方法 2222");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端测试方法 3333");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端测试方法 4444");
    }

    //在service组前运行
    @BeforeGroups("service")
    public void test5(){
        System.out.println("这是服务端测试方法前运行的，，，，");
    }

    @AfterGroups("service")
    public void test6(){
        System.out.println("这是服务端测试方法后运行的，，，，");
    }

    @BeforeGroups("client")
    public void test8(){
        System.out.println("这是客户端测试方法前运行的，，，，");
    }

    @AfterGroups("client")
    public void test9(){
        System.out.println("这是客户端测试方法后运行的，，，，");
    }
}
