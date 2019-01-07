package com.hangduo.controller;
import com.hangduo.entity.Consult;
import com.hangduo.service.yy_Service_consult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
@Controller
public class yy_controller_consult {
    @Resource
    yy_Service_consult ysc;
    @RequestMapping("stAllConsult")
    public String stAllConsult(Model m){
        System.out.print("进入Controller");
        try {
            ArrayList<Consult> allConsult= ysc.st_All_Consult();
            m.addAttribute("yy_allConsult",allConsult);
            System.out.print("成功！——--====");
        }catch (Exception e){
            e.printStackTrace();
            m.addAttribute("yy_allConsult",null);
            System.out.print("Controller出错了");
        }
        return "首页";
    }
    @RequestMapping("getConsultByPhone")
    public String getConsultByPhone(Model m,String userPhone){
        try {
            m.addAttribute("yy_getCByPhone",ysc.getConsultByPhone(userPhone));
            System.out.print("查手机号成功");
        }catch (Exception e){
            e.printStackTrace();
            m.addAttribute("yy_getCByPhone",null);
            System.out.print("查手机号失败");
        }
        return "首页";
    }

    @RequestMapping("getConsultByText")
    public String getConsultByText(Model m,String consultText){
        try {
            m.addAttribute("yy_getCByText",ysc.getConsultByText(consultText));
            System.out.print("查询成功");
        }catch (Exception e){
            e.printStackTrace();
            m.addAttribute("yy_getCByText",null);
            System.out.print("查询失败");
        }
        return "首页";
    }

    @RequestMapping("DelConsultByID")
    public String DelConsultByID(Model m,int consultId){
        int i=0;
        try {
            i=ysc.DelConsultByID(consultId);
            System.out.print("删除成功");
        }catch (Exception e){
            e.printStackTrace();
            System.out.print("失败");
        }
        if (i>0){
            m.addAttribute("yy_delCByID","删除成功");
        }
        return "首页";
    }
}
