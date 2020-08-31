/**
 * @ClassName: Test03
 * @Description:
 * @author: Nan
 * @date: 2020/8/23 10:07
 * @version: V1.0
 */

public class Test03 {
    public static void main(String[] args) {
        System.out.println(rabbitNumber(8));
    }

    /*  
    *@Author : Nan
    *@Description : 斐波那契数列,兔子问题
    *@Date : 10:33 2020/8/23
    *@Param : [month]
    *@return : int
    *@Desc : 
    */
    public static int rabbitNumber(int month){
        int now=0;
        if(month<3){
            return now+1;            
        }else{
            int f1=1;
            int f2=1;
            for (int i=3;i<=month;i++){
              now=f2+f1;
              f2=f1;
              f1=now;
            }
        }
        return now;
    }

}
