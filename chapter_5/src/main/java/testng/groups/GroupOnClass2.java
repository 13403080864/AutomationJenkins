package testng.groups;

import org.testng.annotations.Test;

/**
 * @author wq
 * @since 2022-05-04 下午3:37
 */
@Test(groups = "stu")
public class GroupOnClass2 {
    public void test1(){
        System.out.println("GroupOnClass222中学生类方法111 ，运行了");
    }

    public void test2(){
        System.out.println("GroupOnClass222中学生类方法222 ，运行了");
    }
}
