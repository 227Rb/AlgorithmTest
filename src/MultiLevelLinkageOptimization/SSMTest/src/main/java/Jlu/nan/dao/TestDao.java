package Jlu.nan.dao;

import Jlu.nan.domain.FirstL;
import Jlu.nan.domain.FouthL;
import Jlu.nan.domain.SecondL;
import Jlu.nan.domain.ThirdL;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface TestDao {

    //搜索第一次数据
    @Select("select * from first_table where id=#{id}")
    FirstL findFirst(int id);

    //搜索第二次数据
    @Select("select * from second_table where id=#{id}")
    SecondL findsecond(int id);

    //搜索第三次数据
    @Select("select * from third_table where id=#{id}")
    ThirdL findThird(int id);

    //搜索第四层数据
    @Select("select * from fourth_table where id=#{id}")
    FouthL findFouth(int id);




}
