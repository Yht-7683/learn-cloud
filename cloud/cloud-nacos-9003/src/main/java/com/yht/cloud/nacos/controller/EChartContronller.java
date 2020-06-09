package com.yht.cloud.nacos.controller;

import com.yht.cloud.nacos.service.imp.EChartimp;
import com.yht.cloud.nacos.vo.EChart;
import com.yht.cloud.nacos.vo.ResultPay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EChartContronller {
    @Autowired
    private EChartimp eChartimp;
    @PostMapping("/getechart")
    public ResultPay getAllEChart(){
        List<EChart> eCharts=eChartimp.getAll();
        return new ResultPay(200,"success",eCharts);
    }
    @PostMapping("/getrate")
    public ResultPay getRate(){
        List list=eChartimp.getRate();
        return new ResultPay(200,"success",list);
    }
    @PostMapping("/getincrease")
    public ResultPay getIncrease(){
        List list=eChartimp.getIncrease();
        return new ResultPay(200,"success",list);
    }
}
