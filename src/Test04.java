/**
 * @ClassName: Test04
 * @Description:
 * @author: Nan
 * @date: 2020/8/24 14:27
 * @version: V1.0
 */

public class Test04 {
    public Test04(){
        System.out.println("A");
    }



}
class B extends Test04{
    public B(){
        System.out.println("B");
    }

    public static void main(String[] args) {
        B b=new B();
    }
}