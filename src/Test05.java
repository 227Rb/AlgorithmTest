/**
 * @ClassName: Test05
 * @Description:
 * @author: Nan
 * @date: 2020/8/31 18:56
 * @version: V1.0=4e
 */

public class Test05 {
    public static void main(String[] args) {
        System.out.println(findPrimeList(101,200));
    }


    /*
    *@Author : Nan
    *@Description : 给定任意范围判定该范围内所有素数
    *@Date : 10:53 2020/9/1
    *@Param : [star, end]
    *@return : java.lang.String
    *@Desc :
    */
    public static String findPrimeList(int star,int end){
        StringBuffer sb=new StringBuffer();
        while (star<=end){
            if(isPrime(star)){
                sb.append(star+",");
            };
            star++;
        }
        return sb.toString();
    }

    /*
    *@Author : Nan
    *@Description :判断一个数为素数
    *@Date : 10:58 2020/9/1
    *@Param : [num]
    *@return : boolean
    *@Desc :
    */
    public static boolean isPrime(int num){
        for (int i=2;i<Math.sqrt(num);i++){
            if (num%i==0){
               return false;
            }
        }
        return true;
    }

}
