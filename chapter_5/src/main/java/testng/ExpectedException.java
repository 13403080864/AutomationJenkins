package testng;

import org.testng.annotations.Test;

/**
 * @author wq
 * @since 2022-05-04 下午4:27
 */

public class ExpectedException {

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是失败的异常测试");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是失败的异常测试");
        throw new  RuntimeException();
    }


}
