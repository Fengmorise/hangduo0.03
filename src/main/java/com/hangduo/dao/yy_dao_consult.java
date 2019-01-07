package com.hangduo.dao;
import com.hangduo.entity.Consult;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
public interface yy_dao_consult {
    //查询全部
    ArrayList<Consult> select_All_Con();
    //根据电话查询单人
    Consult getConsultByPhone(@Param("userPhone") String userPhone);
    //根据文本模糊查询
    ArrayList<Consult> getConsultByText(@Param("consultText") String consultText);
    int DelConsultByID(@Param("consultId")int consultId);

}
