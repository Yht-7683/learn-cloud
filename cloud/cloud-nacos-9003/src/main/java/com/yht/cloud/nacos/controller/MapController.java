package com.yht.cloud.nacos.controller;

import com.yht.cloud.nacos.service.imp.Mapimp;
import com.yht.cloud.nacos.vo.MapCh;
import com.yht.cloud.nacos.vo.ResultPay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MapController {
    @Autowired
    private Mapimp mapimp;
    @PostMapping("/getall")
    public List<MapCh> getAll(){
        return mapimp.getAll();
    }
    @PostMapping("/get")
    public ResultPay getMap(){
        List<MapCh> map=mapimp.getAll();
        return new ResultPay(200,"success",map);
    }
}
