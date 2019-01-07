package com.hangduo.service.impl;
import com.hangduo.dao.yy_dao_consult;
import com.hangduo.entity.Consult;
import com.hangduo.service.yy_Service_consult;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
@Service
public class yy_Service_consult_Impl implements yy_Service_consult {

    @Resource
    yy_dao_consult ydc;

    @Override
    public ArrayList<Consult> st_All_Consult() {
        System.out.print("进入impll");
        ArrayList<Consult> comimpl=ydc.select_All_Con();
        System.out.print("调用dao成功进入");
        return  comimpl;
    }

    @Override
    public ArrayList<Consult> getConsultByText(String consultText) {
        return ydc.getConsultByText(consultText);
    }

    @Override
    public Consult getConsultByPhone(String userPhone) {
        return ydc.getConsultByPhone(userPhone);
    }

    @Override
    public int DelConsultByID(int consultId) {
        return ydc.DelConsultByID(consultId);
    }
}
