package com.hangduo.controller;
import com.hangduo.entity.Consult;
import com.hangduo.service.yy_Service_consult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Map;

@Controller
public class yy_controller_consult {
    @Resource
  private   yy_Service_consult ysc;
    //查询所有
    @RequestMapping("show")
    public String show(){
        return "stAllConsult";
    }

    @RequestMapping("stAllConsult")
    public String stAllConsult(Map<String,Object> map){
        //getpage 获取的是总数量
        Integer page=0;
        int tpage=ysc.getPage();
        if (tpage>7){
            if (tpage%7==0){
                page=tpage/7;
            }else {
                page=tpage/7+1;
            }
        }else {
            page=1;
        }
        map.put("yy_IndexPage",page);
        try {
            ArrayList<Consult> allConsult=ysc.PageFirst();
//            ArrayList<Consult> allConsult= ysc.st_All_Consult();
            map.put("yy_allConsult",allConsult);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "index";
    }
    //根据电话查询
    @RequestMapping("getConsultByPhone")
    public String getConsultByPhone(Map<String,Object> map,String userPhone){
        try {
//            m.addAttribute("yy_allConsult",ysc.getConsultByPhone(userPhone));
            Consult consult=ysc.getConsultByPhone(userPhone);
            map.put("mapComsult",consult);
        }catch (Exception e){
            e.printStackTrace();
//            m.addAttribute("yy_allConsult",null);
        }
        return "b";
    }
//根据文本模糊查询
    @RequestMapping("getConsultByText")
    public String getConsultByText(Map<String,Object> map,String consultText){
        try {
           ArrayList<Consult> allConsult= ysc.getConsultByText(consultText);
            map.put("yy_allConsult",allConsult);
        }catch (Exception e){
            e.printStackTrace();
//            m.addAttribute("yy_allConsult",null);
        }
        return "index";
    }
//根据ID定点删除
    @RequestMapping("DelConsultByID")
    public String DelConsultByID(Map<String,Object> map,int consultId){
        int i=0;
        try {
            i=ysc.DelConsultByID(consultId);
        }catch (Exception e){
            e.printStackTrace();
        }
        if (i>0){
            map.put("DelYN","删除成功");
//            m.addAttribute("yy_delCByID","删除成功");
        }else{
            map.put("DelYN","删除失败");
//            m.addAttribute("yy_delCByID","删除成功");
        }
        return "index";
    }

    //这个controller处理分页功能



    public int pageUtil(){
        //获取数据长度
        int page=ysc.getPage();
        int pageIndex;
        pageIndex=page-7;
//        m.addAttribute("getpageIndex",pageIndex);
        return pageIndex;
    }

    @RequestMapping("conGetPage")//用来处理中间页
    public String conGetPage(Map<String,Object> map,int page){
        System.out.println(page);
        ArrayList<Consult> yy_allConsult=ysc.PageIndex(page);
        map.put("yy_allConsult",yy_allConsult);
        return "index";
    }

    @RequestMapping("endPage")
    public String endPage(Map<String,Object> map){
        int page=pageUtil();
        ArrayList<Consult> endlist=ysc.PageIndex(page);
        map.put("yy_allConsult",endlist);
        return "index";
    }




}
