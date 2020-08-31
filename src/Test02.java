/**
 * @ClassName: Test02
 * @Description:
 * @author: Nan
 * @date: 2020/8/22 22:42
 * @version: V1.0
 */

public class Test02 {

    public static void main(String[] args) {
        System.out.println(findIntListfrom(5555));

    }


    /*
    *@Author : Nan
    *@Description : 输入一个正数,返回小于该数的所有相邻且相加等于该数的数列
    *@Date : 22:50 2020/8/22
    *@Param : [i]
    *@return : java.lang.String
    *@Desc :
    */
    public  static String  findIntListfrom(int i){
        StringBuffer result = new StringBuffer();
        int m=0;
        //输入为0
       if(i<3){
           result.append("输入没有符合的数组");
       }else if(i%2!=0){
           m=i/2+1;
       }else {
           m=i/2;
       }
        //输入为奇数
          sum: for(int j=m;j>=1;j--){
               int count=0;
               int now=j;
               int trun=0;
               while (now>=1&&count<i){
                   count=count+now--;
                   if(count==i){
                       result.append(" "+(j-trun)+"~"+j);
                       if(now==1){
                           break sum;
                       }
                       break;
                   }
                   trun++;
               }
           }
        String resultStr = result.toString().isEmpty()?"输入没有符合的数组":result.toString();
        return resultStr;
    }



}
