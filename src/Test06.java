import Utils.LambdaUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName: Test06
 * @Description:
 * @author: Nan
 * @date: 2020/9/1 17:06
 * @version: V1.0
 */


/*
*@Author : Nan
*@Description : 一百盏灯问题
*@Date : 17:06 2020/9/1
*@Param :
*@return :
*@Desc :
*/
public class Test06 {
    public static void main(String[] args) {
        long star = System.currentTimeMillis();
        System.out.println(hundredlight2());
        long end = System.currentTimeMillis();
        System.out.println(end-star);
    }


    private static String hundredlight2(){
        StringBuffer sb=new StringBuffer();
        while (sb.length()!=100){ sb.append(1);}
        for(int j=2;j<=100;j++){
            int speed=1;
            int next=j;
            while (next<=100){
                if(sb.charAt(next-1)=='1'){
                    sb.replace(next-1,next,"0");
                }else{
                    sb.replace(next-1,next,"1");
                }
                next=j*++speed;
            }
        }

        StringBuffer result=new StringBuffer();

        for(int num=1;num<sb.length();num++){
            if(sb.charAt(num-1)=='1'){
                result.append(num+" ");
            };
        }
        return result.toString();
    }

    private static String hundredlight(){
        List<Boolean> lights=new ArrayList<>();
        while (lights.size()!=100){ lights.add(true); }
        for(int j=2;j<=100;j++){
            int speed=1;
            int next=j;
            while (next<=100){
                lights.set(next-1,!lights.get(next-1));
                next=j*++speed;
            }
        }

        StringBuffer sb=new StringBuffer();
        lights.forEach(LambdaUtils.consumerWithIndex((item,index)->{
            if(item){
                sb.append(index+1+" ");
            }
        }));

        return sb.toString();
    }

}
