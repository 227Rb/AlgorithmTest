import java.util.Arrays;


public class test01 {

    public static void main(String[] args) {
        int arr[]=createArray(1000,1000);
        String max = findMax(arr);
        System.out.println(Arrays.toString(arr)+"\n"+max);
    }

    /*
    *@Author : Nan
    *@Description :生成指定长度的整形数组
    *@Date : 15:55 2020/8/7
    *@Param : [length]
    *@return : int[]
    *@Desc :
    */
    private static int[] createArray(int length,int MaxRage){
        int arr[]=new int[length];
        while (length>0){
            if(Math.random()*10>5){
                arr[length-1]=(int) (Math.random()*MaxRage);
            }else {
                arr[length-1]= -(int) (Math.random()*MaxRage);
            }
            length--;
        }
        return arr;
    }

    /*
    *@Author : Nan
    *@Description : 筛选数组最大值,并计数
    *@Date : 15:42 2020/8/7
    *@Param : [arr]
    *@return : java.lang.String
    *@Desc :
    */
    private static String findMax(int[]arr){
        final int   info[]={arr[0],1};
        Arrays.stream(arr).forEach(n ->{
            if(n>info[0]){
               info[0]=n;
               info[1]=1;
           }else if (n==info[0]){
                info[1]++;
           }
        });
     return "\n"+"最大值为:"+info[0]+",出现次数:"+info[1];
    }

}
