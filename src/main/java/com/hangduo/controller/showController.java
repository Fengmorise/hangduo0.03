package com.hangduo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class showController {
    @RequestMapping("/show")
    public String show(){
        return "首页";
    }

    @RequestMapping("/faguiList")
    public String falvList(){return "法规列表";}

    @RequestMapping("/addFagui")
    public String addFagui(){
        return "新增_编辑法规";
    }

    @RequestMapping("/faguiguanli")
    public String faGuiGuanLi(){
        return "法规目录管理";
    }
    @RequestMapping("/addMuLu")
    public String addMuLu(){
        return "新增_编辑目录";
    }

    @RequestMapping("/tiaokuanList")
    public String tiaokuanList(){return "条款列表";}

    @RequestMapping("/userList")
    public String userList(){return "用户列表页";}
   @RequestMapping("/wangzhanSheZhi")
    public String wangzhanSheZhi(){
        return "网站设置";
   }

   @RequestMapping("/emailSMTP")
    public String emailSMTP(){return "邮件SMTP设置";}

   @RequestMapping("/yijianFanKui")
    public String yijianFanKui(){return "意见反馈列表";}

    @RequestMapping("/duanxinSheZhi")
    public String duanxinSheZhi(){
        return "短信设置";
    }

    @RequestMapping("/guanliyuan")
    public String guanliyuan(){return "管理员管理";}
    @RequestMapping("/zixunList")
    public String zuxunList(){return "咨询列表页";}
}


