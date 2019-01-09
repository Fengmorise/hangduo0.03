package com.hangduo.service;

import com.hangduo.entity.Consult;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

public interface yy_Service_consult {
    //查询所有
    public ArrayList<Consult> st_All_Consult();
    //按照条件查询指定电话
    public Consult getConsultByPhone(String userPhone);
    //模糊查询包含文本的
    public ArrayList<Consult> getConsultByText(String consultText);
    //根据ID删除
       public int DelConsultByID(int consultId);
/*
一下为分页
* */
    int getPage();
    //分页首页显示---
    ArrayList<Consult> PageFirst();
    //位于首页和末页的中间页
    ArrayList<Consult> PageIndex(@Param("page")int page);


}
