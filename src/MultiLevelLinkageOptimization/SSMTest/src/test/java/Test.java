import Jlu.nan.dao.TestDao;
import Jlu.nan.domain.FirstL;
import Jlu.nan.domain.FouthL;
import Jlu.nan.domain.SecondL;
import Jlu.nan.domain.ThirdL;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigInteger;

/**
 * @ClassName: Test
 * @Description:
 * @author: Nan
 * @date: 2020/9/2 22:28
 * @version: V1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:ApplicationContext.xml")
public class Test {

    long start;
    long end;
    int rount=10000;
    int count=0;

    @Autowired
    private TestDao dao;

    @Before
    public void starTime(){
        count=0;
        start=System.currentTimeMillis();
    }

    @After
    public void endTime(){
        end=System.currentTimeMillis();
        System.out.println("耗时:"+(end-start)+"  执行次数:"+count);
    }

    /*
    *@Author : Nan
    *@Description : 逐级查询
    *@Date : 15:58 2020/9/7
    *@Param : []
    *@return : void
    *@Desc :
    */
    @org.junit.Test
    public void test01(){
//        while (rount>0){
//            FouthL fouth = dao.findFouth(1);
//            ThirdL third = dao.findThird(fouth.getThird_id());
//            SecondL second = dao.findsecond(third.getSec_id());
//            FirstL first = dao.findFirst(second.getFir_id());
//          first.getFir_data();
//            count++;
//            rount--;
//        }


    }

    /*
    *@Author : Nan
    *@Description :查询父级id字段
    *@Date : 15:58 2020/9/7
    *@Param : []
    *@return : void
    *@Desc :
    */
//    @org.junit.Test
//    public void test02(){
//        while (rount>=0){
//            FouthL fouth = dao.findFouth(1);
//            FirstL first = dao.findFirst(fouth.getFir_id());
//            first.getFir_data();
//            count++;
//            rount--;
//        }
//
//
//    }



    @org.junit.Test
    public void test03(){

        while (rount>0) {
            FouthL fouth = dao.findFouth(2);
            BigInteger parentId = fouth.getParent_ids();
            int fir_Id = parentId.divide(new BigInteger("10000")).intValue();
            int sec_Id = parentId.divide(new BigInteger("100")).mod(new BigInteger("100")).intValue();
            int third_Id = parentId.mod(new BigInteger("100")).intValue();
            FirstL first = dao.findFirst(fir_Id);
//            System.out.println(fir_Id+" "+sec_Id+" "+third_Id+" ");
           first.getFir_data();
            count++;
            rount--;
        }
    }


}
