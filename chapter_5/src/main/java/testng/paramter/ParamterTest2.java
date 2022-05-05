package testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;


/**
 * @author wq
 * @since 2022-05-04 下午9:39
 */

public class ParamterTest2 {

    @Test(dataProvider = "data")
    public void test1(String name, int age) {
        System.out.println("姓名是：" + name + "年龄是：" + age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData() {

        Object[][] object = new Object[][]{
                {"张三", 19},
                {"李四", 25},
        };
        return object;
    }


    //根据方法,传入方法,响应不同参数
    @Test(dataProvider = "methodData")
    public void test2(String name, int age) {
        System.out.println("姓名："+name +",年龄"+age);
    }

    @Test(dataProvider = "methodData")
    public void test3(String name, int age) {
        System.out.println("姓名："+name +",年龄"+age);
    }

    @DataProvider(name = "methodData")
    public Object[][] provider(Method method) {

        Object[][] result = null;
        //判断传入的方法
        if (method.getName().equals("test2")) {
            result = new Object[][]{
                    {"王五", 55},
                    {"赵六", 66}
            };
        } else if (method.getName().equals("test3")) {
            result = new Object[][]{
                    {"罗子君", 35},
                    {"贺函", 26}
            };
        }
        return result;
    }
}