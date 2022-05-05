package testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author wq
 * @since 2022-05-04 下午4:59
 */

public class ParamterTest {

    @Test
    @Parameters({"name","age"})
    public void paramters(String name,int age){
        System.out.println("姓名为："+name + ",年龄为："+age);
    }
}
