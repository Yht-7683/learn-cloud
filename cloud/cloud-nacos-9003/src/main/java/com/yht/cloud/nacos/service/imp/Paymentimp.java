package com.yht.cloud.nacos.service.imp;

import com.yht.cloud.nacos.vo.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class Paymentimp {
    public Payment getPayment(Long id ,String string){
        return new Payment(id,string);
    }
}
