package testng;

import org.testng.annotations.Test;

/**
 * @author wq
 * @since 2022-05-04 上午11:30
 */

public class IgnoreTest {

    @Test
    public void ignore1(){
        System.out.println("ignore1 运行了");
    }

    @Test
    public void ignore2(enabled = false){
        System.out.println("ignore2 运行了");
    }
}
