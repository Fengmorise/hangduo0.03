package com.hangduo.dao;
import com.hangduo.entity.Consult;
import org.apache.ibatis.annotations.Param;
import java.util.ArrayList;
public interface yy_dao_consult {
    //查询全部
  public  ArrayList<Consult> select_All_Con();
    //根据电话查询单人
   public  Consult getConsultByPhone(@Param("userPhone") String userPhone);
    //根据文本模糊查询
  public   ArrayList<Consult> getConsultByText(@Param("consultText") String consultText);
   //根据ID删除单个用户
  public  int DelConsultByID(@Param("consultId")int consultId);
    /*以下代码均为分页服务
    * */
    //分页获取总条数----
   public int getPage();
    //分页首页显示---
   public ArrayList<Consult> PageFirst();
    //位于首页和末页的中间页
   public ArrayList<Consult> PageIndex(@Param("page")int page);

}
