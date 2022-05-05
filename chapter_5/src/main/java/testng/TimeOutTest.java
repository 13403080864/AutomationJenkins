package testng;

import org.testng.annotations.Test;

/**
 * @author wq
 * @since 2022-05-05 下午9:03
 */

public class TimeOutTest {
    @Test(timeOut = 3000)//超时时间3秒
    //测试成功
    public void testSuccess() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("测试成功");

    }

    @Test(timeOut = 3000)
    public void testFailed() throws InterruptedException {
        Thread.sleep(4000); //睡眠超过3秒了 失败
    }
}
